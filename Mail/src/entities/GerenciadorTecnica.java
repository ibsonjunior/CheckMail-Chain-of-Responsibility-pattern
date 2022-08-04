package entities;

public class GerenciadorTecnica extends Gerenciador{

    @Override
    public void verificar(Mail email) {
        if ((email.getDestino().equalsIgnoreCase("tecnica@colmeia.com")) ||
                (email.getAssunto().equalsIgnoreCase("Técnica"))) {

            System.out.println("Email enviado para o departamento técnico");

        } else {
            if (this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(email);
            }
        }
    }
}