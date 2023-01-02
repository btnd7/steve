public class Main {
    public static void main(String[] args) {
        int [] array = {55, 10, 15, 20, 25, 30, 35, 40, 45, 50, 5, 60, 65, 70, 75, 80, 85, 90, 95, 100};

        System.out.println(getMinValue(array));
        System.out.println(evenNumbers(array));
    }

    public static int getMinValue(int[] numbers){
        int minValue = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
        }
        return minValue;
    }

    public static int evenNumbers(int [] nums) {
        int ctr_even = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                ctr_even++;
            }
        }
        return ctr_even;
    }
}
