package com.example.jdgomes.desfrute.formulario;


public class GastosFormulario {

    private String[] itensDespesaMock;


    public GastosFormulario() {
        this.loadData();
    }


    private void loadData() {

        this.setItensDespesaMock(new String[] {
                "Itens 1", "Itens 2", "Itens 3", "Itens 4"
        });
    }


    public String[] getItensDespesaMock() {
        return itensDespesaMock;
    }

    public void setItensDespesaMock(String[] itensDespesaMock) {
        this.itensDespesaMock = itensDespesaMock;
    }
}
