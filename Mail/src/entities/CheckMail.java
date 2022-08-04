package entities;

public class CheckMail {
    Gerenciador inicial;

    public CheckMail() {
        this.inicial = new GerenciadorGerencia();
        Gerenciador tecnica = new GerenciadorTecnica();
        Gerenciador comercial = new GerenciadorComercial();
        Gerenciador spam = new GerencaidorSpam();

        inicial.setGerenciadorSeguinte(comercial);
        comercial.setGerenciadorSeguinte(tecnica);
        tecnica.setGerenciadorSeguinte(spam);
    }

    public void verificar(Mail email){
        inicial.verificar(email);
    }
}
