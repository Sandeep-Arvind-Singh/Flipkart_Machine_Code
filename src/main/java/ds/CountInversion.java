package ds;

public class CountInversion {
    public static void main(String[] args) {
        int[] data = new int[]{2, 4, 1, 3, 5};
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
