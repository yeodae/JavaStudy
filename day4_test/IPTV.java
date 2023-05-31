package day4_test;

public class IPTV extends ColorTV {
	private String ip;

	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip=ip;
	}
	protected String getIp(){
		return ip;
	}
	public void printProperty(){
		System.out.println("나의 IPTV는 "+getIp()+" 주소의 "+getSize()+"인치"+getColor()+"컬러 TV");
	}
}
//결과 : 나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러