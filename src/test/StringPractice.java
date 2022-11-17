package test;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StringPractice {

	public static void main(String[] args) throws IOException{
		System.out.println("請輸入一字串");
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		
		char ch1 = str1.charAt(0);
		char ch2 = str1.charAt(1);
		int num = str1.length();
		
		System.out.println(str1+ "的第一個字元是" +ch1);
		System.out.println(str1+ "的第二個字元是" +ch2);
		System.out.println(str1+ "的字串長度是" +num);
		
		System.out.println("--------------------------");
		String strU = str1.toUpperCase();
		String strL = str1.toLowerCase();
		
		System.out.println("將輸入的字串轉換大小寫:");
		System.out.println("轉換為大寫=" +strU);
		System.out.println("轉換為小寫=" +strL);
		
		System.out.println("--------------------------");
		System.out.println("請輸入要檢索的文字");
		BufferedReader brfind = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String strfind = brfind.readLine();
		char chfind = strfind.charAt(0);
		int numfind = str1.indexOf(chfind);
				
		if(num != -1)
		{
			System.out.println(str1+ "的第" +(numfind+1)+ "個字就是「" +chfind+ "」");
		}
		else
		{
			System.out.println("沒有你想搜尋的文字唷!!");
		}
		
		System.out.println("--------------------------");
		System.out.println("請輸入想新增的字串");
		BufferedReader br2 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str2 = br2.readLine();
		StringBuffer strall = new StringBuffer(str1);
		strall.append(str2);
				
		System.out.println("在「" +str1+ "」後新增「" +str2+ "」");
		System.out.println("結果為「" +strall+ "」");
		
		System.out.println("--------------------------");
		System.out.println("!來比大小囉!");
		System.out.println("請輸入兩個整數");
		BufferedReader brnum1 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(brnum1.readLine());
		int num2 = Integer.parseInt(brnum1.readLine());
		
		int ans = Math.max(num1,num2);
		System.out.println(num1+ "與" +num2+"中比較大的是" +ans);
	}
}
