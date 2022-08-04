package entities;

public class Programa {
    public static void main(String[] args) {
        CheckMail verificaMail = new CheckMail();

        verificaMail.verificar(
          new Mail("email.email.com", "tecnica@dh.com.br", "Aulas")
        );
        verificaMail.verificar(
                new Mail("email.email.com", "gerencia@dh.com.br", "Gerencia")
        );

        verificaMail.verificar(
                new Mail("email.email.com", "gerencia@dh.com.br", "Comercial")
        );

        verificaMail.verificar(
                new Mail("email.email.com", "dh@dh.com.br", "Técnica")
        );
    }
}
