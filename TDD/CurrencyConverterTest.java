import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CurrencyConverterTest {
    CurrencyConverter converter = new CurrencyConverter();

    @Nested
    public class  RupeesToDollar {

        @Test
        public void checkIfSeventyFourPointEightFiveRupeesIsEqualToOneDollar() {
            double actualMoney = converter.rupeesToDollar(74.85);
            double expectedMoney = 1;
            assertEquals(expectedMoney, actualMoney);

        }

    }

    @Nested
    public class AddMoneyToWallet {
        @Test
        public void checkIfAdditionOfFiftyRupeesAndOneDollarIsEqualToOneHundredAndTwentyFourPointEightFiveRupees() {
            converter.addRupeesToWallet(50);
            converter.addDollarsToWallet(1);
            assertEquals(124.85, converter.getWalletBalance("Rs"));
        }

        @Test
        public void checkIfAdditionOfSeventyFourPointEightFiveRupeesAndOneDollarAndOneHundredAndFortyNinePointSevenRupeesGivesFourDollars() {
            converter.addRupeesToWallet(74.85);
            converter.addDollarsToWallet(1);
            converter.addRupeesToWallet(149.7);
            assertEquals(4, converter.getWalletBalance("$"));
        }
    }


    //@Nested
    //public class preferredCurrency{
       // @Test
       // public void sumOfMoneyInWalletIsFourDollars(){
            //double actualMoney= converter.rupeeToDollar(299.4);
            //double expectedMoney= 4;
            //assertEquals(expectedMoney,actualMoney);
       // }
   // }
    @Nested
    public class WithdrawMoneyFromWalletTest {
        @Test
        public void checkIfWithdrawalOfOneDollarFromOneHundredAndTwentyFourPointEightFiveRupeesGivesFiftyRupees() {
            converter.addRupeesToWallet(50);
            converter.addDollarsToWallet(1);
            converter.withdrawDollarsFromWallet(1);
            assertEquals(50, converter.getWalletBalance("Rs"));
        }
        @Test
        public void checkIfWithdrawalOfOneHundredAndFortyNinePointSevenRupeesFromFourDollarsGivesTwoDollars() {
            converter.addRupeesToWallet(74.85);
            converter.addDollarsToWallet(1);
            converter.addRupeesToWallet(149.7);
            converter.withdrawRupeesFromWallet(149.7);
            assertEquals(2, converter.getWalletBalance("$"));
        }


    }

}




//As a wallet owner, I would like to be able to know that 74.85 rupees is equal to 1 dollar.
//As a wallet owner I would like to be able to put money into my wallet so that I can take it out later.
//As a wallet owner, I want to know the total money my wallet has for the preferred currency. When Rs.50 & $1 added to my wallet,
// Then the sum of money in the wallet is Rs.124.85, (Given preferred currency is Rs.)

//As a wallet owner, I want to know the total money my wallet has for the preferred currency.
// When Rs.74.85, $1, Rs.149.7 added to my wallet, Then sum of money in the wallet is $4, (Given preferred currency is $)
// As a wallet owner I would like to be able to take a specified amount of money out of the wallet.