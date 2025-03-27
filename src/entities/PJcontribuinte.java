package entities;

import entities.enums.TiposContribuintes;

public class PJcontribuinte extends Contribuinte{

    private Integer numeroFuncionarios;

    public PJcontribuinte(TiposContribuintes tiposContribuintes, String name, Double rendaAnual, Integer numeroFuncionarios) {
        super(tiposContribuintes, name, rendaAnual);
       this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double imposto() {
        if(numeroFuncionarios > 10){
            return getRendaAnual() * 0.14;
        } else{
            return getRendaAnual() * 0.16;
        }
    }


}
