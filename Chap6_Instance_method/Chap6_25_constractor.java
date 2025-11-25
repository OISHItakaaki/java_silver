public class Chap6_25_constractor {
    public Chap6_25_constractor() {
        this("B");  // 最初に呼ぶ
        System.out.println("A");
    }

    public Chap6_25_constractor(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        new Chap6_25_constractor();
    }
}

