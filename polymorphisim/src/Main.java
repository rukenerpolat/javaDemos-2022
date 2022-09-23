public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();


        // BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new EmailLogger(), new FileLogger(), new ConsoleLogger()};
        // for (BaseLogger logger:loggers){
        //      logger.log("Log mesajı.");
        //     }

        /*
             Yazdırınca sonuç:
             Logged to database : Log mesajı.
             Logged to email : Log mesajı.
             Logged to file : Log mesajı.
             Logged to console : Log mesajı.
        */


        /*
        EmailLogger logger = new EmailLogger();
        logger.log("Log mesajı");

        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log("Log mesajı");

        FileLogger fileLogger = new FileLogger();
        fileLogger.log("Log mesajı");
        --------------------------------------------
        Bunu yazdırınca sonuç:
        Logged to email : Log mesajı
        Logged to database : Log mesajı
        Logged to file : Log mesajı

        overriding:
        yani BaseLogger'daki methot ile başka class'larda
        overriding ederek class'a özel işlemlerimizi de yapabiliyoruz.
        Methodu BaseLogger'da 1 kez yazılyoruz fakat class'larda
        methodu özelleştirebiliyoruz.
         */
    }
}