public class Main {
    public static void main(String[] args) {
        int[] array = {55, 10, 15, 20, 25, 30, 35, 40, 45, 50, 5, 60, 65, 70, 75, 80, 85, 90, 95, 100};

        System.out.println(getMinValue(array));
        System.out.println(evenNumbers(array));
        System.out.println(max(array));
        System.out.println(paratlan(array));
        System.out.println(oddNumbers(array));
    }

    public static int getMinValue(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }

    public static int evenNumbers(int[] nums) {
        int ctr_even = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ctr_even++;
            }
        }
        return ctr_even;
    }

    public static int max (int[] tomb){
        int max = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] > max){
                max = tomb[i];
            }
        }
        return max;
    }

    public static int paratlan (int[] tomb){
        int count = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }

    public static int oddNumbers(int[] nums) {
        int ctr_odd = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                ctr_odd++;
            }
        }
        return ctr_odd;
    }

    public static int sumOfParos(int[] tomb){
        int sum = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 2 == 0){
                sum += tomb[i];
            }
        }
        return sum;
    }
}