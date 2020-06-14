package bai3;

import java.util.ArrayList;
import java.util.Scanner;

import bai2.NumberException;

public class ListTuDien {
	static Scanner input = new Scanner(System.in);

	// nhap
	public static ArrayList<TuDien> inputData() {
		ArrayList<TuDien> list = new ArrayList<TuDien>();
		int n = 0;
		String tu, nghiaTV, phienAm;
		boolean cont = true;
		do {
			try {
				System.out.print("Bạn Muốn Nhập Bao Nhiêu Dữ Liệu: ");
				n = Integer.parseInt(input.nextLine());
				if (n < 0) {
					throw new NumberException("Dữ liệu từ điển phải lớn hơn số 0.!");
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập dữ liệu là số.!");
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			}
		} while (cont);
		for (int i = 0; i < n; i++) {
			System.out.println("Từ thứ " + (i + 1) + ".!");
			System.out.print("Nhập Từ: ");
			tu = input.nextLine();
			System.out.print("Nghĩa Tiếng Việt: ");
			nghiaTV = input.nextLine();
			System.out.print("Phiên Âm: ");
			phienAm = input.nextLine();
			TuDien ArTD = new TuDien(tu, nghiaTV, phienAm);
			list.add(ArTD);
		}
		return list;
	}

	// xuat
	public static void DisplayData(ArrayList<TuDien> list) {
		if (list.size() > 0) {
			System.out.println("Kết quả sau khi đọc.");
			for (TuDien tuDien : list) {
				System.out.println(tuDien);
			}
		} else {
			System.out.println("Danh sách từ điển trống.!");
		}
	}

	// search
	public static void search(ArrayList<TuDien> list) {
		System.out.print("Nhập từ cần tìm: ");
		String nhap = input.nextLine();
		int dem = 0;
		for (TuDien tuDien : list) {
			if (tuDien.getTu().equals(nhap)) {
				dem++;
			}
		}
		if (dem > 0) {
			System.out.println("Kết quả sau khi tìm từ: ");
			System.out.println(list);
		} else {
			System.out.println("Không tìm thấy.!");
		}
	}

	public void chon() {
		System.out.println("== TỪ ĐIỂN ANH VIỆT – BÀI TẬP VINAENTER EDU ==");
		System.out.println("-- 1. Nhập dữ liệu");
		System.out.println("-- 2. Xuất dữ liệu");
		System.out.println("-- 3. Dịch từ");
		System.out.println("-- 4. Thoát");
//		ListTuDien objTD = new ListTuDien();
//		ArrayList<TuDien> list = new ArrayList<TuDien>();
		ListTuDien obj = new ListTuDien();
		ArrayList<TuDien> list = new ArrayList<TuDien>();
		boolean cont = true;
		int choose = 0;
		while(true) {
			do {
				try {
					System.out.print("Nhập 1->4 để thực hiện: ");
					choose = Integer.parseInt(input.nextLine());
					if (choose < 1 || choose > 4) {
						throw new NumberException("Vui lòng chọn giá trị từ 1 -> 4.!");
					}
					cont = false;
				} catch (NumberFormatException e) {
					System.out.println("Nhập sai định dạng.!");
				} catch (NumberException e) {
					System.out.println(e.getMessage());
				}
			} while (cont);
			if (choose == 1) {
				list = obj.inputData();
			} else if (choose == 2) {
				obj.DisplayData(list);
			} else if (choose == 3) {
				obj.search(list);
			} else {
				System.out.println("Cảm ơn đã sử dụng từ điển!");
				input.close();
			}
		}
	}
}
