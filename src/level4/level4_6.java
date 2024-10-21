package level4;

public class level4_6 {
    public static void main(String[] args) {
        String input = "TOM:90|JERRY:100|TONY:80";

        // 拆分字符串
        String[] entries = input.split("\\|");

        // 输出格式
        for (String entry : entries) {
            String[] parts = entry.split(":");
            String name = parts[0];
            String score = parts[1];

            // 输出结果
            System.out.printf("%s -> %s%n", name, score);
            System.out.println("202020211111时锐nb");
        }
    }
}
