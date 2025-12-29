public class enhanced_for_loop{
	public static void main(String[]args){
		int[] scores = {80,90,70};
		int sum = 0;
		for (int score : scores){
			sum += score;
		}
	double avg = (double)sum / scores.length;
	System.out.println("平均点：" + avg);
	}
}
