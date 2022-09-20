public class Main {
    public static void main(String[] args) {

        char harf = 'Ö';

        switch (harf) {
            case 'A':
            case 'I':
            case 'E':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }
    }
}