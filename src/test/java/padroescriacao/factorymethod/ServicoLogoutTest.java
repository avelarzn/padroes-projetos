package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoLogoutTest {
    @Test
    void deveExecutarLogout() {
        IServico servico = ServicoFactory.obterServico("Logout");
        assertEquals("Logout efetivado", servico.executar());
    }
}