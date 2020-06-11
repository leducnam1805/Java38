package bai1;

import java.util.Scanner;

public class TinhChiaHet345 {
	static Scanner input = new Scanner(System.in);

	public static int inputData() {
		int n = 0;
		boolean cont = true;
		do {
			try {
				System.out.print("Nhập giá trị N (10 -> 100) : ");
				n = Integer.parseInt(input.nextLine());
				if (n > 100 || n < 10) {
					throw new NumberException("Vui lòng nhập giá trị n trong khoảng 10 -> 100.!");
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("N chỉ nhận giá trị là số.!");
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			}
		} while (cont);
		return n;
	}

	public static void ChiaHetCho5(int n) {
		int chiacho5 = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 5 == 0) {
				chiacho5++;
			}
		}
		System.out.println("Có "+chiacho5+" số chia hết co 5 trong khoảng từ 0 -> "+n);
	}
	public static void ChiaHetCho3(int n) {
		int chiacho3 = 0;
		for (int i = 0; i < n; i++) {
			if(i%3==0) {
				chiacho3++;
			}
		}
		System.out.println("Có "+chiacho3+" số chia hết co 3 trong khoảng từ 0 -> "+n);
	}
}
