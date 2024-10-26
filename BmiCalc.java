package jp.learningdesign.javastudy;


import java.util.Scanner;
public class BmiCalc {
	/*
	 *  BMI 計算程序
	 */
	public static void main(String[] args) {
		double weight,height,bmi;


		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("体重はkg：");
		weight = stdIn.nextDouble();
		System.out.println("身長はcm：");
		height = stdIn.nextDouble();
		height /= 100;
		bmi = weight / (height * height);
		
		System.out.println("BMI:" + bmi);
	}

}
