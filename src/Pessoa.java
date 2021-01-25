public class Pessoa {
    private String name;
    //private double amount;
    private double value;
    private Bank bank;

    public Pessoa(String name, double value, Bank bank){
        this.name = name;
        this.value = value;
        this.bank = bank;
    }
    public String getName(){
        return name;
    }

    public void works(double value){
        bank.saveMoney(value);
        msg();
    }

    public void vende(double value){
        bank.saveMoney(value);
        msg();
    }

    public void compra(double value){
        bank.giveMoney(value);
        msg();
    }

    public void viaja(double value){
        bank.giveMoney(value);
        msg();
    }

    private void msg(){
            System.out.println("Agora voce tem "+bank.getAmount());
    }
}
