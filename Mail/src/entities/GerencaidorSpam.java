package entities;

public class GerencaidorSpam extends Gerenciador{


    @Override
    public void verificar(Mail email) {
        System.out.println("É spam");
    }
}
