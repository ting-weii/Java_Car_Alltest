package test;

public class test {

	public static void main(String[] args) {		
		System.out.println("宣告car1");
		Car.sum();
		Car car1 = new Car();
		car1.setNumGas(1111, 11.1);
		car1.show();
		
		System.out.println("--------------------------");
		System.out.println("宣告car2");
		Car.sum();
		Car car2 = new Car();
		car2.setNumGas(2222, 22.2);
		
		System.out.println("--------------------------");
		int number = car1.getNum();
		double gasoline = car1.getGas();
		System.out.println("調查結果:1.車號="+number+"，2.汽油量=" +gasoline);
		
		System.out.println("--------------------------");
		System.out.println("變更car1的數據");
		car1.setNum(9999);
		car1.show();
		car1.setGas(99.9);
		car1.show();
		
		System.out.println("--------------------------");
		System.out.println("將car1的值指定給car2");
		car2 = car1;
		System.out.println("car2車的數據:");
		car2.show();
		
		System.out.println("--------------------------");
		System.out.println("幫1號車取綽號");
		String str1 = "我的寶貝愛車-神龍飛舞";
		car1.setName(str1);
		car1.showName();
		
		System.out.println("--------------------------");
		Car[] car3 = new Car[3];
		for(int i=0 ; i<car3.length ; i++)
		{
			car3[i] = new Car();
		}
		
		car3[0].setNumGas(3333,33.3);
		car3[1].setNumGas(4444,44.4);
		car3[2].setNumGas(5555,55.5);
		
		for(int i=0 ; i<car3.length ; i++)
		{
			car3[i].show();
		}
	}
}

class Car
{
	private int num;
	private double gas;
	private String name = "沒有名子";
	public static int sum = 0;
	
	public static void sum()
	{
		System.out.println("**第" +sum+ "台車子**");
	}
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("生產了車子");
	}
	
	public void setNum(int n)
	{
		num = n;
		System.out.println("只變更車號");
	}
	
	public void setGas(double g)
	{
		gas = g;
		System.out.println("只變更汽油量");
	}
	
	public void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		if(g>0 && g<300)
		{
			System.out.println("生產了車號為" +num+ "，生產了汽油量為" +gas);
		}
		else
		{
			System.out.println("您輸入的汽油量不太正確");
		}
		//this.show();
	}
	
	int getNum()
	{
		System.out.println("調查車號(car1車的)");
		return num;
	}
	
	double getGas()
	{
		System.out.println("調查汽油量(car1車的)");
		return gas;
	}
	
	public void show()
	{
		System.out.println("車號是:" +num);
		System.out.println("汽油量是:" +gas);
	}
	
	public void setName(String nm)
	{
		name = nm;
		System.out.println("將車名改為" +name);
	}
	
	public void showName()
	{
		System.out.println("car1的車名:" +name);
	}
}
