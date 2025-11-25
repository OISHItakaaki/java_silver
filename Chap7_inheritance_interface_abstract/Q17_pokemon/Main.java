

public class Main{
	public static void main(String[] args){
		pokemon monster1 = new pokemon();  //中身は普通のポケモン
		pikachu p        = (pikachu) monster1;   // ここでさっき生成したインスタンス”monster1”をピカチューだと決めつけて取り出している→エラー	
		p.makesound();

	}
}


