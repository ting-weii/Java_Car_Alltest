package test;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StringPractice {

	public static void main(String[] args) throws IOException{
		System.out.println("�п�J�@�r��");
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		
		char ch1 = str1.charAt(0);
		char ch2 = str1.charAt(1);
		int num = str1.length();
		
		System.out.println(str1+ "���Ĥ@�Ӧr���O" +ch1);
		System.out.println(str1+ "���ĤG�Ӧr���O" +ch2);
		System.out.println(str1+ "���r����׬O" +num);
		
		System.out.println("--------------------------");
		String strU = str1.toUpperCase();
		String strL = str1.toLowerCase();
		
		System.out.println("�N��J���r���ഫ�j�p�g:");
		System.out.println("�ഫ���j�g=" +strU);
		System.out.println("�ഫ���p�g=" +strL);
		
		System.out.println("--------------------------");
		System.out.println("�п�J�n�˯�����r");
		BufferedReader brfind = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String strfind = brfind.readLine();
		char chfind = strfind.charAt(0);
		int numfind = str1.indexOf(chfind);
				
		if(num != -1)
		{
			System.out.println(str1+ "����" +(numfind+1)+ "�Ӧr�N�O�u" +chfind+ "�v");
		}
		else
		{
			System.out.println("�S���A�Q�j�M����r��!!");
		}
		
		System.out.println("--------------------------");
		System.out.println("�п�J�Q�s�W���r��");
		BufferedReader br2 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str2 = br2.readLine();
		StringBuffer strall = new StringBuffer(str1);
		strall.append(str2);
				
		System.out.println("�b�u" +str1+ "�v��s�W�u" +str2+ "�v");
		System.out.println("���G���u" +strall+ "�v");
		
		System.out.println("--------------------------");
		System.out.println("!�Ӥ�j�p�o!");
		System.out.println("�п�J��Ӿ��");
		BufferedReader brnum1 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(brnum1.readLine());
		int num2 = Integer.parseInt(brnum1.readLine());
		
		int ans = Math.max(num1,num2);
		System.out.println(num1+ "�P" +num2+"������j���O" +ans);
	}
}
