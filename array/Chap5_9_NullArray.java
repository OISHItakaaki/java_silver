public class Chap5_9_NullArray{
	public static void main(String[] args){
		String[][] array = { {"A","B"},{"F"},{"C","D"}};
		int total =0;
		for (String[] tmp : array){
			total += tmp.length;
		}
		System.out.println(total);
	}
}
