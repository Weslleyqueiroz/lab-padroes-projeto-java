package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.facade.subsistemacep.cepAPI;
import one.digitalinnovation.gof.facade.subsistemacrm.crmService;

public class Facade {
    public void transferirCliente(String nome, String cep){
        String cidade = cepAPI.getInstancia().recuperaCidade(cep);
        String estado = cepAPI.getInstancia().recuperaEstado(cep);



        crmService.gravarCliente(nome,cep,cidade,estado);
    }
}
