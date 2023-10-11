package Main;

public class Maths {
    public int addTwoNumbers(int one,int two){
        return one + two;
    }
    public boolean checkPrime(int num){
        boolean isPrime = true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isPrime=false;
            }
            else {
                isPrime=true;
            }
        }
        return isPrime;

    }
}
