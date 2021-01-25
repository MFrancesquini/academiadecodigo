public class Bank {
    private double amount;
    
    public void saveMoney(double value){
        this.amount += value;
    }

    public void giveMoney(double value){
        this.amount -= value;
    }
    
    public double getAmount(){
        return amount;
    }
}
