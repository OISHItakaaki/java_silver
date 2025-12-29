
public class Main implements A,B {
	public static void main(String [] args){
		new Main().test();
	}
	@Override
	public void test(){
		A.super.test();
	}
}

