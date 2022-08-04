package entities;

public class GerenciadorComercial extends Gerenciador{

    @Override
    public void verificar(Mail email) {
        if ((email.getDestino().equalsIgnoreCase("comercial@colmeia.com")) ||
                (email.getAssunto().equalsIgnoreCase("Comercial"))) {

            System.out.println("Email enviado para o departamento Comercial");

        } else {
            if (this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(email);
            }
        }
    }
}