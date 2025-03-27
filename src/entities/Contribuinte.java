package entities;

import entities.enums.TiposContribuintes;
public abstract class Contribuinte {

    private TiposContribuintes tiposContribuintes;
    private String name;
    private Double rendaAnual;

    
    public Contribuinte(TiposContribuintes tiposContribuintes, String name, Double rendaAnual) {
        this.tiposContribuintes = tiposContribuintes;
        this.name = name;
        this.rendaAnual = rendaAnual;
    }

    public TiposContribuintes getTiposContribuintes() {
        return tiposContribuintes;
    }
    public void setTiposContribuintes(TiposContribuintes tiposContribuintes) {
        this.tiposContribuintes = tiposContribuintes;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getRendaAnual() {
        return rendaAnual;
    }
    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract Double imposto();

    @Override
    public String toString() {
        return name + ": $ " + imposto();
    }

    
}

    



