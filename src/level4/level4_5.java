package level4;

public class level4_5 {
        public static void main(String[] args) {
            int rows = 10; // 杨辉三角的行数
            int[][] triangle = new int[rows][];

            // 生成杨辉三角
            for (int i = 0; i < rows; i++) {
                triangle[i] = new int[i + 1];
                triangle[i][0] = 1; // 每行的第一个元素为1
                triangle[i][i] = 1; // 每行的最后一个元素为1

                // 计算中间的值
                for (int j = 1; j < i; j++) {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }

            // 打印杨辉三角
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < triangle[i].length; j++) {
                    System.out.print(triangle[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("202020211111时锐");
        }


}
