package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class singletonTest {
    @Test
    public void deveRetornarEmailParaRecuperarSenha() {
        singleton.getInstance().setEmailService("leoavelar333@gmail.com");
        assertEquals("leoavelar333@gmail.com", singleton.getInstance().getEmailService());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        singleton.getInstance().setUsuarioLogado("Usuario 1");
        assertEquals("Usuario 1", singleton.getInstance().getUsuarioLogado());
    }
}