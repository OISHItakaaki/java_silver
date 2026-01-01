
public class Sample {
	private int num;
	public Sample(int num) {
		this.num = num;
	}
	public boolean equals (Object obj){
		if(obj == null){
			return false;
		}
		if (obj instanceof Sample){
			Sample s = (Sample) obj;
			return s.num == this.num;
		}
	}
}

