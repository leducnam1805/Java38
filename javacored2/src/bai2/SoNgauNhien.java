package bai2;

import java.util.Random;
import java.util.Scanner;

public class SoNgauNhien {
	static Scanner input = new Scanner(System.in);
	static Random rd = new Random();

	public static int SNN() {
		return rd.nextInt(11) + 8;
	}

	public static int nhap() {
		System.out.print("Nhập n: ");
		return input.nextInt();
	}

	public static void SoSanh(int number1, int number2) {
		if (number1 > number2) {
			System.out.println("Số " + number1 + " lớn hơn " + number2+"( - Số bạn nhập lớn hơn số ngẫu nhiên)");
		} else if (number1 == number2) {
			System.out.println("Số " + number1 + " bằng " + number2+" - Số bạn nhập bằng số ngẫu nhiên");
		} else {
			System.out.println("Số " + number2 + " lớn hơn " + number1+" - Số ngẫu nhiên lớn hơn số bạn nhập");
		}
	}
}
