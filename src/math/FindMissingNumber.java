package math;

public class FindMissingNumber {

        public static void main(String[] args) {

            int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

            int expectedValue = expectation(10);
            findMissingNum(array,expectedValue);

        }

        public static int findMissingNum (int [] array, int expectedValue) {
            int missingNum;
            int sum = 0;
            for (int n : array) {
                sum += n;
            }
            missingNum= expectedValue-sum;
            System.out.println("The missing number is: " + missingNum);
            return missingNum;
        }
        public static int expectation (int n ){
            int sum = 0;
            int [] array = new int [n]; // create an array of size
            for (int i = 0; i <array.length; i++){
                array[i] = i +1;
            }

            for (int s :array ){
                sum +=s;
            }

            return sum;
        }
    }