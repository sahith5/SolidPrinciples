package viloates;

import com.follows.CardPayment;
import com.follows.OnlinePayment;
import com.follows.Paytm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {






        Scanner input=new Scanner(System.in);
        String type=input.nextLine();

        if(type.equals("OnlinePayment"))
        {
            com.follows.OnlinePayment newpayment=new OnlinePayment();
            newpayment.SendOtp("accno");
            if(newpayment.Authenticate("entered otp"))
                newpayment.pay("Accno");
            else
            {
                System.out.println("oncorrect Otp");
            }
        }


        else if(type.equals("Paytm"))
        {
            Boolean fromwallet;

            fromwallet=input.nextBoolean();


            com.follows.Paytm newpayment=new Paytm();

            if(fromwallet==true)
            {
                newpayment.paywithWallet("accno");

            }
            else{
                newpayment.pay("accno");
            }
        }


        else if(type.equals("Cardpayment"))
        {
            CardPayment newpayment=new CardPayment();
            newpayment.pay("Acco");
            Boolean printreciept;
            printreciept=input.nextBoolean();
            if(printreciept==true)
            {
                newpayment.PrintReciept("accno");
            }
        }




    }
}
