package cn.tedu.eluosifangkuai;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Timer;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TetrisPanel extends JPanel implements KeyListener{

	TetrisPanel(){
		newBlock();
		newMap();
		drawWall();//调用画围墙方法
//		Timer timer = new Timer(1000,new TimeListener());
//		timer.start();
		
	}
	
	Random random = new Random();
	
	private int score = 0;
	private int delLineNum = 0;
	
	//定义方块的初始坐标
	private int x;
	private int y;
	
	private int blockType;//方块的类型 = random.nextInt(7)
	private int turnState;//方块的旋转状态 = random.nextInt(4)
	
	private int preBlockType = random.nextInt(7);
	private int preTurnState = random.nextInt(4);
	
	//定义方块的大小
	private int blockSize = 10;
	
	//定义地图大小
	private int mapSizeX = 17;
	private int mapSizeY = 28;
	
	//定义地图
	int[][] map = new int[mapSizeX][mapSizeY];
	
	int i;
	int j;
	//地图中的值0；没有；1绘制形状 2；绘制围墙
	//定义形状
		private final static int shapes[][][] = new int[][][]{
			//|型
			{
				{0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0},
				{0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0},
				{0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0},
				{0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0}
			},
			//s型
			{
				{0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0},
				{1,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0},
				{0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0},
				{1,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0}
			},
			//Z
			{
				{1,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0},
				{0,1,0,0,1,1,0,0,1,0,0,0,0,0,0,0},
				{1,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0},
				{0,1,0,0,1,1,0,0,1,0,0,0,0,0,0,0}
			},
			//j
			{
				{0,1,0,0,0,1,0,0,1,1,0,0,0,0,0,0},
				{1,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
				{1,1,0,0,1,0,0,0,1,0,0,0,0,0,0,0},
				{1,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0}
			},
			//O
			{
				{1,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0},
				{1,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0},
				{1,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0},
				{1,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0}
			},
			//L
			{
				{1,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0},
				{1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0},
				{1,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0},
				{0,0,1,0,1,1,1,0,0,0,0,0,0,0,0,0}
			},
			//T
			{
				{1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0},
				{0,1,0,0,1,1,0,0,0,1,0,0,0,0,0,0},
				{0,1,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
				{1,0,0,0,1,1,0,0,1,0,0,0,0,0,0,0}
			},
		};
		
		/*
		 * 产生新的形状
		 */
		public void newBlock(){
			//当前形状用预览形状代替
			blockType = preBlockType;
			turnState = preTurnState;
			
			//第三个
			preBlockType = random.nextInt(7);
			preTurnState = random.nextInt(4);
			
			//初始化xy坐标（方块出现的位置）
			x = 6;
			y = 0;
			
			if(gameOver(x,y) == 0){
				newMap();
				drawWall();
				JOptionPane.showMessageDialog(null, "GAME OVER!");
			}
		}
		
		/*
		 * 填充围墙
		 * 
		 * 
		 */
		public void drawWall(){
			for(i = 0;i < mapSizeX - 1;i++){
				map[i][mapSizeY - 2] = 2;//绘制右边的围墙
			}
			
			for(j = 0;j < mapSizeY - 1;j++){
				map[0][j] = 2;//绘制左边的围墙
				map[mapSizeX - 2][j] = 2;//绘制底下的围墙
			}
		}
		
		/*
		 * 初始化地图
		 * (non-Javadoc)
		 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
		 */
			
		public void newMap(){
			for(i = 0;i < mapSizeX - 1;i++){
				for(j = 0;j < mapSizeY - 1;j++){
					map[i][j] = 0;
				}
			}
		}
		
		/*改变方向
		 * (non-Javadoc)
		 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
		 */
		public void turn(){
			int tempTurnState = turnState;
			//产生新的方向代码
			turnState = (turnState + 1) % 4;
			if(check (x,y,blockType,turnState) == 0){
				turnState = tempTurnState;
			}
			repaint();
		}
		
		//左移
		public void left(){
			if(check(x - 1,y,blockType,turnState) == 1){
				x = x-1;
			}
			repaint();
		}
		
		//右移
		public void right(){
			if(check(x + 1,y,blockType,turnState) == 1){
				x = x+1;
			}
			repaint();
		}
		
		//下降
		public void down(){
			delLineNum = 0;
			if(check(x,y + 1,blockType,turnState) == 1){
				y = y+1;
				delLine();
			}
		
			//制定分数
			switch(delLineNum){
			case 1:score += 10;break;
			case 2:score += 50;break;
			case 3:score += 100;break;
			case 4:score += 200;break;
			}
			repaint();
		}
		
		/**
		 * 添加一个形状
		 * @param x
		 * @param y
		 * @param blockType
		 * @param turnState
		 */
		public void add(int x,int y,int blockType,int turnState){
			int j = 0;
			for(int outer = 0;outer < 4;outer++){
				for(int inner = 0;inner < 4;inner++){
					if(map[x + inner + 1][y + outer] == 0){
						map[x + inner + 1][y + outer] = shapes[blockType][turnState][j];
					}
					j++;
				}
			}
		}
		
		//消行
		public void delLine(){
			int flag = 0;
			for(int y = 0;y<mapSizeY - 1;y++){
				for(int x = 0;x<mapSizeX - 1;x++){
					if(map[x][y] == 1)
					flag = flag + 1;
					//判断是否填充满一行
					if(flag == mapSizeX - 3){
						delLineNum++;
						for(int d = y;d>0;d--){
							for(int e = 0;e<mapSizeX - 2;e++){
								map[e][d] = map[e][d-1];
							}
						}
					}
				}
				flag = 0;
			}
		}
		
		/**
		 * 判断是不是游戏结束
		 * @param x
		 * @param y
		 * @return
		 */
		public int gameOver(int x,int y){
			if(check(x,y,blockType,turnState) == 0){
				return 0;
			}
			return 1;
		}
		
		/**
		 * 检查操作是否有效
		 * @param x
		 * @param y
		 * @param blockType
		 * @param turnState
		 * @return 
		 */
		public int check(int  x,int y,int blockType,int turnState){
			
			for (int outer = 0; outer < 4; outer++) {
				for (int inner = 0; inner < 4; inner++) {
					boolean flag1 = shapes[blockType][turnState][outer * 4 + inner] == 1;
					boolean flag2 = map[x + inner + 1][y + outer] == 1;
					boolean flag3 = map[x + inner + 1][y + outer] == 2;
					if ((flag1 && flag2) || (flag1 && flag3)) {
						return 0;//碰到一起    无效
					}
				}
			}
			return 1;//有效

		}
		
		/**
		 * 真正绘制
		 */
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			//画形状
			for(j = 0;j < 16;j++){
				if (shapes[blockType][turnState][j] == 1){
					int x1 = (j % 4 + x + 1) * blockSize;
					int y1 = (j / 4 + y) * blockSize;
					g.fillRect(x1, y1, blockSize, blockSize);
				}
			}
		
		
		//固定方块
		for (j = 0; j < mapSizeY - 1; j++){
			for (i = 0; i < mapSizeX - 1; i++){
				//已固定的方块
				if (map[i][j] == 1){
					g.setColor(Color.BLACK);//设置一个颜色（黑色）
					g.fillRect(i * blockSize, j * blockSize, blockSize, blockSize);//填充
				}
				
				if(map[i][j] == 2){
					g.drawRect(i * blockSize, j * blockSize, blockSize, blockSize);//画线
				}
			}								
		}
		
		//画预览图
		for (j = 0; j < 16; j++){
			if (shapes[preBlockType][preTurnState][j] == 1){
				int x1 = (j % 4 + 20) * blockSize;
				int y1 = (j / 4 + 1) * blockSize;
				g.fillRect(x1, y1, blockSize, blockSize);
			}
		}
		
		g.setColor(Color.BLUE);
		g.setFont(new Font ("宋体", Font.BOLD, 16));
		
		g.drawString("得分：" + score, 170, 80);
		g.drawString("软件IT学院", 170, 110);
		g.drawString("2016级1班", 170, 140);
		g.drawString("默默雨[著]", 170, 170);
		g.drawString("[版权所有]", 170, 200);
		g.drawString("代号:12580", 170, 230);

		}

		
		
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int KeyCode = e.getKeyCode();
		switch (KeyCode) {
		case KeyEvent.VK_DOWN:
			//执行下降
			down();
			break;
		case KeyEvent.VK_UP:
			//执行变形
			turn();
			break;
		case KeyEvent.VK_RIGHT:
			//右移
			right();
			break;
		case KeyEvent.VK_LEFT:
			//左移
			left();
			break;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 定时器    自动下降
	 * @author LXT
	 *
	 */
	class TimeListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//repaint();				
			down();
		}
		
	}

	

}
