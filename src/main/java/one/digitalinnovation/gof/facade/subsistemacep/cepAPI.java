package one.digitalinnovation.gof.facade.subsistemacep;


public class cepAPI {
    private static cepAPI instancia = new cepAPI();

    private cepAPI() {
        super();
    }

    public static cepAPI getInstancia() {
        return instancia;
    }

    public String recuperaCidade(String cep) {
        return "São Paulo";
    }

    public String recuperaEstado(String cidade) {
        return "SP";
    }
}

