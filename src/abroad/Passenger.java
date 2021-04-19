package abroad;

import java.util.Scanner;
class PoliticException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("You Have a Political Ban...");

    }

}
class VizeException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Gideceğiniz Vizeniz Bulunmamaktadır...");
    }


}
class HarcException extends Exception {

    @Override
    public void printStackTrace() {

        System.out.println("Lütfen yurtdışı harcını tam yatırın...");
    }



}








public class Passenger {
    private int tax;
    private boolean politicalBan;
    private boolean visaStatus;

    public Passenger() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("We Deposit Fees Cost: ");
        this.tax = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Are there any you ban political(Yes or No) ? ");

        String cevap = scanner.nextLine();

        if (cevap.equals("Yes")) {

            this.politicalBan = true;
        }
        else {
            this.politicalBan = false;
        }
        System.out.print("Do you have a visa ? (Yes or No)");

        String cevap2 = scanner.nextLine();

        if (cevap2.equals("Yes") ){
            this.visaStatus= true;

        }
        else {
            this.visaStatus = false;
        }





    }


    public void overseasFeeControl() throws HarcException {
        if (this.tax < 15) {

            throw new HarcException();

        }
        else {
            System.out.println("Foreign fee transaction is complete!");

        }
    }


    public void politicalProhibitionCheck() throws PoliticException{

        if (this.politicalBan == true) {
            throw new PoliticException ();


        }
        else {
            System.out.println("You have no political ban...");

        }
    }


    public void visaStatCheckl() throws VizeException {
        if (this.visaStatus == true) {
            System.out.println("Visa processing complete!");

        }
        else {
            throw new VizeException();


        }

    }


}
