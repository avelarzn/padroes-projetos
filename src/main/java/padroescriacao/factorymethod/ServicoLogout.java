package padroescriacao.factorymethod;

public class ServicoLogout implements IServico{
    public String executar() {
        return "Logout efetivado";
    }

    public String cancelar(){
        return "Logout cancelado";
    }
}
