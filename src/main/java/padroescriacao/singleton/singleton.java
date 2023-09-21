package padroescriacao.singleton;

public class singleton {

    private singleton() {};
    private static singleton instance = new singleton();
    public static singleton getInstance() {
        return instance;
    }

    private String EmailService;
    private String usuarioLogado;

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public String getEmailService() {
        return EmailService;
    }

    public void setEmailService(String emailService) {
        EmailService = emailService;
    }
}
