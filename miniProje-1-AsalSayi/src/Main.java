public class Main {
    public static void main(String[] args) {
        int number = 34;
        int remainder = number % 2;
        //System.out.println(remainder);

        boolean isPrime = true;

        // number = 1 olduğunda bug olduğu için yazılan kod:
        if(number==1) {
            System.out.println("Sayı asal değildir.");
            return;
        }
        if(number<1) {
            System.out.println("Geçersiz sayı.");
            return;
        }

        for(int i =2 ; i<number;i++) {
            if(number % i==0) {
                isPrime = false;
            }
        }

        if(isPrime==true) {
            System.out.println("Sayı asaldır.");
        }else {
            System.out.println("Sayı asal değildir.");
        }
    }
}