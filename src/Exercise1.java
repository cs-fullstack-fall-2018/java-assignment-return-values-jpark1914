public class Exercise1 {

    public static void main(String[] args) {
	System.out.println("The largest number is: " + largestNumber());
    }
    public static int largestNumber(){
        int number1 = 3;
        int number2 = 6;
        if(number1 > number2){
            System.out.println(number1);
            return number1;
        } else{
            System.out.println(number2);
            return number2;
        }
    }
}
