package gamebai;

import java.util.ArrayList;
import java.util.Scanner;

public class ListQuanBai {
	static Scanner ip = new Scanner(System.in);

	public static ArrayList<QuanBai> inputInfor() {
		ArrayList<QuanBai> list = new ArrayList<QuanBai>();
		boolean cont = true;
		int n = 0;
		do {
			try {
				System.out.println("Nhập thông tin quân bài: ");
				n = Integer.parseInt(ip.nextLine());
				if (n > 52 || n < 0) {
					throw new NumberException("Vui lòng nhập giá trị trong khoản 0 ->52");
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập giá trị là số:");
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			}
		} while (cont);
		for (int i = 0; i < n; i++) {
			System.out.println("Thông tin quân bài thứ "+(i+1)+" là: ");
			System.out.println("Tên quân Bài: ");
			String name = ip.nextLine();
			// điểm quân bài
			int diem = 0;
			int heso = 0;
			do {
				try {
					System.out.println("Điểm Quân Bài: ");
					diem = Integer.parseInt(ip.nextLine());
					if (diem > 4 || diem < 1) {
						throw new NumberException("Nhập điểm trong khoảng từ 1->4");
					}
					cont = false;
				} catch (NumberFormatException e) {
					System.out.println("Điểm Quân Bài Phải là số.! ");
				} catch (NumberException e) {
					System.out.println(e.getMessage());
				}
			} while (cont);
			// Hệ số quân bài
			do {
				try {
					System.out.println("Hệ Số Quân Bài: ");
					heso = Integer.parseInt(ip.nextLine());
					if (heso > 13 || heso < 1) {
						throw new NumberException("Nhập hệ số trong khoảng từ 1->13");
					}
					cont = true;
				} catch (NumberFormatException e) {
					System.out.println("Hệ Số Quân Bài Phải là số.! ");
				} catch (NumberException e) {
					System.out.println(e.getMessage());
				}
			} while (!cont);
			QuanBai listArr = new QuanBai(name, diem, heso);
			list.add(listArr);
		}
		return list;
	}
	public static void DisplayData(ArrayList<QuanBai> list) {
		if(list.size()>0) {
			for (QuanBai quanBai : list) {
				System.out.println(quanBai);
			}
		}else {
			System.out.println("Mảng rỗng..!");
		}
	}
}
