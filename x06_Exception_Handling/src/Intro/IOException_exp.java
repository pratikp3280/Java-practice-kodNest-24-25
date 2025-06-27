package Intro;

import java.io.*;

public class IOException_exp {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			System.out.println();
			System.out.println("Please Enter The Roll");
			int roll = Integer.parseInt(br.readLine());
			
			System.out.println("Please Enter The Name");
			String name = br.readLine();
			
			System.out.println("Roll:" + roll);
			System.out.println("Name:" + name);
			
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
