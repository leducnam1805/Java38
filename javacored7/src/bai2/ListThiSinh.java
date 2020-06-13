package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class ListThiSinh {
	public ArrayList<ThiSinh> inputData() {
		ArrayList<ThiSinh> list = new ArrayList<ThiSinh>();
		Scanner input = new Scanner(System.in);
		int n = 0;
		String name = "";
		float toan = 0, ly = 0, hoa = 0, tongDiem = 0;
		boolean cont = true;
		do {
			try {
				System.out.print("Bạn muốn nhập bao nhiêu thí sinh: ");
				n = Integer.parseInt(input.nextLine());
				if (n <= 0) {
					throw new NumberException("Vui lòng nhập số lượng thí sinh lớn hơn 0");
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập giá trị là số");
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			}
		} while (cont);
		// Nhập thông tin thí sinh
		for (int i = 0; i < n; i++) {
			System.out.println("Thí Sinh Thứ " + (i + 1) + " .");
			System.out.print("Họ Tên: ");
			name = input.nextLine();
			// diemtoan
			do {
				try {
					System.out.print("Điểm Toán: ");
					toan = Float.parseFloat(input.nextLine());
					if (toan > 10 || toan < 0) {
						throw new NumberException("Vui lòng nhập điểm từ 0 -> 10");
					}
					cont = true;
				} catch (NumberFormatException e) {
					System.out.println("Điểm phải là số.!");
				} catch (NumberException e) {
					System.out.println(e.getMessage());
				}

			} while (!cont);
			// điểm lý
			do {
				try {
					System.out.print("Điểm Lý: ");
					ly = Float.parseFloat(input.nextLine());
					if (ly > 10 || ly < 0) {
						throw new NumberException("Vui lòng nhập điểm từ 0 -> 10");
					}
					cont = false;
				} catch (NumberFormatException e) {
					System.out.println("Điểm phải là số.!");
				} catch (NumberException e) {
					System.out.println(e.getMessage());
				}
			} while (cont);
			// Điểm hóa
			do {
				try {
					System.out.print("Điểm Hóa: ");
					hoa = Float.parseFloat(input.nextLine());
					if (hoa > 10 || hoa < 0) {
						throw new NumberException("Vui lòng nhập điểm từ 0 -> 10");
					}
					cont = true;
				} catch (NumberFormatException e) {
					System.out.println("Điểm phải là số.!");
				} catch (NumberException e) {
					System.out.println(e.getMessage());
				}
			} while (!cont);
			ThiSinh arTS = new ThiSinh(name, toan, ly, hoa, tongDiem);
			list.add(arTS);
		}
		return list;
	}

	public static void DisplayData(ArrayList<ThiSinh> list) {
		if (list.size() > 0) {
			System.out.println("===Danh Sách Thí Sinh ====");
			for (ThiSinh thiSinh : list) {
				System.out.println(thiSinh);
			}
		} else {
			System.out.println("Mảng Rỗng.!");
		}
	}

	public static void DSTSTrungTuyen(ArrayList<ThiSinh> list) {
		if (list.size() > 0) {
			int dem = 0;
			for (ThiSinh thiSinh : list) {
				if (thiSinh.tongDiem() >= 17) {
					dem++;
				}
			}
			if (dem > 0) {
				for (ThiSinh thiSinh : list) {
					if(thiSinh.tongDiem()>=17) {
						System.out.println("Danh Sach Thi Sinh Trúng Tuyển");
						System.out.println(thiSinh);
						System.out.println("=========");
					}
				}
			}else {
				System.out.println("Không có thí sinh trúng tuyển");
			}
		} else {
			System.out.println("Không có thí sinh");
		}
	}
}
