package runamountdue;

//author @sollano_jhaynefe

class AmountDue {
    
    final double taxRate = 0.12;
    
    double computeAmountDue(double itemPrice){
        double itemTax = itemPrice * taxRate;
        double totalDue = itemPrice + itemTax;
        return totalDue;
    }
    
    double computeAmountDue(double itemPrice, int itemQuantity){
        double itemTax = itemPrice * taxRate;
        double totalItems = itemPrice * itemQuantity;
        double totalDue = totalItems + itemTax;
        return totalDue;
    }
    
    double computeAmountDue(double itemPrice, int itemQuantity, double itemDiscount){
        double itemTax = itemPrice * taxRate;
        double totalItems = itemPrice * itemQuantity;
        double discountedDue = totalItems - itemDiscount;
        double totalDue = discountedDue + itemTax;
        return totalDue;
    }
    
}
