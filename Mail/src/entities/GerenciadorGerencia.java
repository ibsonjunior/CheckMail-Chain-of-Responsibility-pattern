package entities;

public class GerenciadorGerencia extends Gerenciador{

    @Override
    public void verificar(Mail email) {
        if ((email.getDestino().equalsIgnoreCase("gerencia@colmeia.com")) ||
                (email.getAssunto().equalsIgnoreCase("Gerencial"))) {

            System.out.println("Email enviado para o departamento Gerencial");

        } else {
            if (this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(email);
            }
        }
    }
}