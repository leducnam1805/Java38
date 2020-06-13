package bai2;

import java.util.ArrayList;

public class ThiSinhDemo {

	public static void main(String[] args) {
		ListThiSinh objTS = new ListThiSinh();
		ArrayList<ThiSinh> list = objTS.inputData();
		objTS.DisplayData(list);
		objTS.DSTSTrungTuyen(list);
	}

}
