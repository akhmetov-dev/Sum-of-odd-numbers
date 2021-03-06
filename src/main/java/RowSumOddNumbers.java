public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int count = 0;
        int maxValue = 0;
        int sum = 0;

        for (int i = n; i > 0; i--) {
            count += i;
        }
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            if (i == 0) maxValue = 1;
            else maxValue += 2;
            if (i >= count - n) {
                sum = sum + maxValue;
            }
        }
        return sum;
    }
}
