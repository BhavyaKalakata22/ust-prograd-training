public class CurrencyConverter {
    //double sum = 0;
    double walletBalance;
    public double rupeesToDollar(double currencyValueInRupees) {
        return currencyValueInRupees / 74.85;
    }

    public double dollarToRupees(double currencyValueInDollar) {
        return currencyValueInDollar * 74.85;
    }
    public void addRupeesToWallet(double currencyValueInRupees){
        walletBalance+=currencyValueInRupees;

    }
    public void addDollarsToWallet(double currencyValueInDollars ){
        walletBalance+=dollarToRupees(currencyValueInDollars);
    }
    public void withdrawRupeesFromWallet(double currencyValueInRupees){
        walletBalance-=currencyValueInRupees;
    }
    public void withdrawDollarsFromWallet(double currencyValueInDollars){
        walletBalance-=dollarToRupees(currencyValueInDollars);
    }

    public double getWalletBalance(String prefCurrency) {
            if (prefCurrency == "Rs") {
                return walletBalance;
            }
            else if(prefCurrency=="$")
                return rupeesToDollar(walletBalance);
            else
                throw new IllegalArgumentException("Not a valid currency");

        }
    }
    //
//    public double withdrawCurrencyInRupees(double rupees) {
//        return sum - rupees;
//    }
//
//    public double withdrawCurrencyInDollars(double dollars) {
//        return sum - dollars;
//    }
//}

