package other;
import ex26.Parent;

public class Child extends Parent {
    public static void main(String[] args) {
        Child c = new Child();        // Child（= Parentの子）オブジェクトを作る
        System.out.println(c.num);    // インスタンス変数にアクセス
    }
}


