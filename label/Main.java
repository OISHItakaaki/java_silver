public class Main {
    public static void main(String[] args) {
        String[][] data = {
            {"A1", "A2", "A3"},
            {"B1", "B2", "B3"},
            {"C1", "C2", "C3"}
        };

        outer: // ←ラベルを付ける
        for (String[] row : data) {
            for (String item : row) {
                if ("B2".equals(item)) {
                    System.out.println("B2 を見つけたのでループ終了！");
                    break outer; // 外側ループごと終了
                }
                System.out.println(item);
            }
        }
        System.out.println("完了");
    }
}

