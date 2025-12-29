

public class Main{
	public static void main(String[] args){
		Child child = new Child();
		child.name = "sample";
		System.out.println(child.getName());
		//ここで呼び出しているgetNameメソッドは
		//親クラスのthis.nameになるので
		//子クラスの"sample"を参照していない
	}
}

