package quanLyNhanVien;

public class LapTrinhVien extends NhanVien {
	public LapTrinhVien() {
		super();
	}
	private float overTime;
	public float getOverTime() {
		return overTime;
	}
	public void setOverTime(float overTime) {
		this.overTime = overTime;
	}
	public LapTrinhVien(String maNV, String name, String email, int age, int phone, double luongCoBan, double luong,
			float overTime) {
		super(maNV, name, email, age, phone, luongCoBan, luong);
		this.overTime = overTime;
	}
	public LapTrinhVien(String maNV, String name, String email, int age, int phone, double luongCoBan, double luong) {
		super(maNV, name, email, age, phone, luongCoBan, luong);
	}
	@Override
	public String toString() {
		return super.toString()+" Số giờ làm Thêm" + this.overTime;
	}
	public double luongLTV() {
		return (double)this.luongCoBan + this.overTime*200;
	}
	
	
}
