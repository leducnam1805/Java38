package quanLyNhanVien;

public class KiemChungVien extends NhanVien{
	public KiemChungVien() {
		super();
	}
	private int soLoiPhatHien;
	public int getSoLoiPhatHien() {
		return soLoiPhatHien;
	}
	public void setSoLoiPhatHien(int soLoiPhatHien) {
		this.soLoiPhatHien = soLoiPhatHien;
	}
	public KiemChungVien(String maNV, String name, String email, int age, int phone, double luongCoBan, double luong,
			int soLoiPhatHien) {
		super(maNV, name, email, age, phone, luongCoBan, luong);
		this.soLoiPhatHien = soLoiPhatHien;
	}
	public KiemChungVien(String maNV, String name, String email, int age, int phone, double luongCoBan, double luong) {
		super(maNV, name, email, age, phone, luongCoBan, luong);
	}
	@Override
	public String toString() {
		return super.toString()+" - Số Lỗi Phát Hiện: " + this.soLoiPhatHien;
	}
	public double luongKCV() {
		return (double)this.luongCoBan + this.soLoiPhatHien * 50;
	}
	
}
