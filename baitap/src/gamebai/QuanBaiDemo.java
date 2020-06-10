package gamebai;

import java.util.ArrayList;

public class QuanBaiDemo {

	public static void main(String[] args) {
		ArrayList<QuanBai> list = ListQuanBai.inputInfor();
		System.out.println("Thông tin quân bài của bạn là:");
		ListQuanBai.DisplayData(list);
	}

}
