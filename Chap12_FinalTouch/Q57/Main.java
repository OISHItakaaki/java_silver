
public class Main {

	public static void main(String[]  args){
		try {
			throw new Exception();
		} catch (Exception e) {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			System.out.println("A");
		} finally {
			System.out.println("B");
		}
	}
}




