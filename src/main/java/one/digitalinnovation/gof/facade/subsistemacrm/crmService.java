package one.digitalinnovation.gof.facade.subsistemacrm;

public class crmService {

    private crmService(){
        super();
    }
    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no sistema: ");
        System.out.println(nome);
        System.out.println(cidade);
        System.out.println(estado);
        System.out.println(cep);

    }
}
