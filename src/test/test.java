package test;

public class test {

	public static void main(String[] args) {		
		System.out.println("�ŧicar1");
		Car.sum();
		Car car1 = new Car();
		car1.setNumGas(1111, 11.1);
		car1.show();
		
		System.out.println("--------------------------");
		System.out.println("�ŧicar2");
		Car.sum();
		Car car2 = new Car();
		car2.setNumGas(2222, 22.2);
		
		System.out.println("--------------------------");
		int number = car1.getNum();
		double gasoline = car1.getGas();
		System.out.println("�լd���G:1.����="+number+"�A2.�T�o�q=" +gasoline);
		
		System.out.println("--------------------------");
		System.out.println("�ܧ�car1���ƾ�");
		car1.setNum(9999);
		car1.show();
		car1.setGas(99.9);
		car1.show();
		
		System.out.println("--------------------------");
		System.out.println("�Ncar1���ȫ��w��car2");
		car2 = car1;
		System.out.println("car2�����ƾ�:");
		car2.show();
		
		System.out.println("--------------------------");
		System.out.println("��1�������︹");
		String str1 = "�ڪ��_���R��-���s���R";
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
	private String name = "�S���W�l";
	public static int sum = 0;
	
	public static void sum()
	{
		System.out.println("**��" +sum+ "�x���l**");
	}
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setNum(int n)
	{
		num = n;
		System.out.println("�u�ܧ󨮸�");
	}
	
	public void setGas(double g)
	{
		gas = g;
		System.out.println("�u�ܧ�T�o�q");
	}
	
	public void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		if(g>0 && g<300)
		{
			System.out.println("�Ͳ��F������" +num+ "�A�Ͳ��F�T�o�q��" +gas);
		}
		else
		{
			System.out.println("�z��J���T�o�q���ӥ��T");
		}
		//this.show();
	}
	
	int getNum()
	{
		System.out.println("�լd����(car1����)");
		return num;
	}
	
	double getGas()
	{
		System.out.println("�լd�T�o�q(car1����)");
		return gas;
	}
	
	public void show()
	{
		System.out.println("�����O:" +num);
		System.out.println("�T�o�q�O:" +gas);
	}
	
	public void setName(String nm)
	{
		name = nm;
		System.out.println("�N���W�אּ" +name);
	}
	
	public void showName()
	{
		System.out.println("car1�����W:" +name);
	}
}
