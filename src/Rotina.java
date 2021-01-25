public class Rotina {
    public static void main(String[] args){

        Bank bank = new Bank();
        Pessoa pessoa = new Pessoa("Isadora",0, bank);

        System.out.println("Olá, "+pessoa.getName());
        
        pessoa.works(100);
        pessoa.compra(10);
        pessoa.vende(90);
        pessoa.viaja(13);

    }
}
