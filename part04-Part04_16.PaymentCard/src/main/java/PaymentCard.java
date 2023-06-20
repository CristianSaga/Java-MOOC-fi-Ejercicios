
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        double affordably = 2.60;
        if (this.balance >= affordably) {
            this.balance -= affordably;
        }

    }

    public void eatHeartily() {
        double heartily = 4.60;
        if (this.balance >= heartily) {
            this.balance -= heartily;
        }
    }

    public void addMoney(double amount) {
        
        int limit = 150;
        if (amount > 0) {
            this.balance += amount;
        }
        
        
        if (this.balance >= limit) {
            this.balance = limit;
        }
        
        
    }
}
