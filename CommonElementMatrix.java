/* 
write a code to find common elements between 2 matrix
*/
import java.util.*;

public class CommonElementMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                a[i][j] = sc.nextInt();

        int r2 = sc.nextInt(), c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                b[i][j] = sc.nextInt();

        Set<Integer> setA = new HashSet<>();
        for (int[] row : a) for (int val : row) setA.add(val);

        Set<Integer> common = new HashSet<>();
        for (int[] row : b) for (int val : row)
            if (setA.contains(val)) common.add(val);

        if (common.isEmpty()) System.out.println("No common elements.");
        else common.forEach(v -> System.out.print(v + " "));

        sc.close();
    }
}
