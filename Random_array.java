public class Random_array {
    public static double[] arr = new double[100];

    public static double[] create_array(){
        for(int i = 0; i < arr.length; i++){
            arr[i] = Math.random();
        }
        return arr;
    }
    public static double max_number(){
        double max = arr[0];
        for (double i : arr) {
            if (i > max) {
                i = max;
            }
        }
        System.out.println("Max number = " + max);
        return max;
    }

    public static double min_number(){
        double min = arr[0];
        for (double i : arr) {
            if (i > min) {
                i = min;
            }
        }
        System.out.println("Min number = " + min);
        return min;
    }

    public static double avg(){
        double avg =0;
        for(double i : arr){
            avg += i;
            }
        avg /=100;
        System.out.println("Average of numbers = " + avg);
        return avg;
        }
    public static void main(String[] args) {
        max_number();
        min_number();
        avg();
    }
}

