import java.util.Arrays;

public class SMArray{
    public static void main(String[] args) {
        int[] single = new int[5];
        single[0] = 1;
        
        System.out.println(single);
        System.out.println(Arrays.toString(single));

        int[] s = {1,3, 2,4,5};
        System.out.println(s.length);
        System.out.println(Arrays.toString(s));

        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

        int[][] multi = new int[2][3];
        multi[0][0] = 15;
        System.out.println(Arrays.toString(multi));
        System.out.println(Arrays.deepToString(multi));

        int[][] m = { {1, 5, 6}, {8, 9, 3} };
        System.out.println(Arrays.deepToString(m));
    }
}