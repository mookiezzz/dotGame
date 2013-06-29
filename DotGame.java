package dotCome;

public class DotGame {
  int state;  	//判断游戏是否结束
	int position;	//判断当前位置
	int time;		//判断猜测的次数
	
	public int startGame(int array[]){
		//数字猜测为0~50
		if(state<3){
			//产生三个随机数
			int num[] = null;
			for(int i=0;i<3;i++){
				num[i] = (int)(Math.random()*30);
				for(int j=0;j<3;j++){
					if(array[j]==num[i]){ 
						System.out.println("kill");
						break;}
				}
			}
			
			switch(state){
			case 1:
				System.out.println();break;
			case 2:
				System.out.println();break;
			}
			time++;
		}
		return 0;
	}
}
