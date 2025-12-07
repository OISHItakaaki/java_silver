public class Main {
	public static void main (String[] args){
		String val = "A";
		Function f = (x) -> {
			System.out.println(val);
		};
		f.test("B");
		System.out.println(val);
	}
}
interface Function {
	void test(String val);
}
