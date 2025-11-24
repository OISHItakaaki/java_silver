public class Chap6_30_Main{
	public static void main(String [] args) {
		Chap6_30 s = new Chap6_30(10);
		modify(s);
		System.out.println(s.num);
	}
	private static void modify(Chap6_30 s){
		s.num *= 2;
	}
}
