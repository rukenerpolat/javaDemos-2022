public class Main {
    public static void main(String[] args) {

        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':   // B ve C aynı durumu yazsın istersek, bu şekilde yazabiliriz.
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersizdir.");
        }
    }
}
