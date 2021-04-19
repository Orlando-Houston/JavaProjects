package abroad;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome to Sabiha Gökçen Airport....");

        String conditions = "Go abroad rules..\n"
                +"You should not have any political ban...\n"
                +"You have to pay the full fee of 15 TL....\n"
                +"you must have a visa to your destination countryr...";
        String message = "You need to provide all of the foreign conditions";


        while(true) {
            System.out.println("*******************************************");
            System.out.println(conditions);
            System.out.println("*******************************************");


            Passenger passenger = new Passenger ();

            System.out.println("Tax Fee Checked...");

            Thread.sleep(3000);

            try {
                passenger.overseasFeeControl();
            } catch (HarcException ex) {
                ex.printStackTrace();
                continue;


            }


            System.out.println("Political Prohibition Controlled...");
            Thread.sleep(3000);

            try {
                passenger. politicalProhibitionCheck();
            } catch (PoliticException ex) {
                ex.printStackTrace();
                continue;

            }


            System.out.println("Checking Visa Status...");
            Thread.sleep(3000);

            try {
                passenger.visaStatCheckl();
            } catch (VizeException ex) {
                ex.printStackTrace();
                continue;
            }

            System.out.println("Your transactions are OK! You can go abroad...");
            break;


        }


    }
}
