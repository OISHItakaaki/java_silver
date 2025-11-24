// インターフェースを実装するクラス
class Dog implements Animal {
    public void speak() {
        System.out.println("ワンワン！");
    }
}

class Cat implements Animal {
    public void speak() {
        System.out.println("ニャー！");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.speak();  // ワンワン！
        cat.speak();  // ニャー！
    }
}


