package bai2;

public class SoNgauNhienDemo {

	public static void main(String[] args) {
		SoNgauNhien objSNN = new SoNgauNhien();
		int n = objSNN.nhap();
		int number = objSNN.SNN();
		System.out.println("Số Ngẫu Nhiên là: "+number);
		System.out.println("Kết quả là: ");
		objSNN.SoSanh(n, number);
	}

}
