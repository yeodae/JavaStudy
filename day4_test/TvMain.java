package day4_test;

public class TvMain {
	public static void main(String[] args) {
		   ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty();
		   
		   
		   IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		   iptv.printProperty();
		}
}
//결과 : 32인치 1024컬러
