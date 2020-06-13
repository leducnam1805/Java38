package quanLyNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVien {
	private String maNV, name, email;
	private int age, phone;
	protected double luongCoBan, luong;

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public NhanVien(String maNV, String name, String email, int age, int phone, double luongCoBan, double luong) {
		super();
		this.maNV = maNV;
		this.name = name;
		this.email = email;
		this.age = age;
		this.phone = phone;
		this.luongCoBan = luongCoBan;
		this.luong = luong;
	}

	public NhanVien() {
		super();
	}

	@Override
	public String toString() {
		return "Mã Nhân Viên" + this.maNV + " - Tên:" + this.name + "\nEmail" + email + " - Tuổi:" + this.age
				+ "\nSố Điện Thoại: " + this.phone + " - Lương Cơ Bản: " + this.luongCoBan;
	}

	public double luongNV() {
		return 0;
	}

	public ArrayList<NhanVien> inputData() {
		ArrayList<NhanVien> list = new ArrayList<NhanVien>();
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập Mã Nhân Viên: ");
		maNV = input.nextLine();
		System.out.print("Họ Tên: ");
		name = input.nextLine();
		System.out.print("Email: ");
		email = input.nextLine();
		boolean cont = true;
		do {
			try {
				System.out.print("Nhập Tuổi: ");
				age = Integer.parseInt(input.nextLine());
				if (age < 0 || age > 65) {
					throw new NumberException("Tuổi phải là số nguyên và lớn hơn 0.!");
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Tuổi phải là số..!");
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			}
		} while (cont);
		do {
			try {
				System.out.print("Nhập SĐT: ");
				phone = Integer.parseInt(input.nextLine());
				if (phone < 0) {
					throw new NumberException("Số điện thoại phải là 10 số.!");
				}
				cont = true;
			} catch (NumberFormatException e) {
				System.out.println("Số Điện Thọai Không đúng định dạng");
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			}
		} while (!cont);
		System.out.print("Nhập lương cơ bản: ");
		luongCoBan = Double.parseDouble(input.nextLine());
		NhanVien arLNhanVien = new NhanVien(maNV, name, email, age, phone, luongCoBan,luong);
		return list;
	}

}
