package Builder;

class Apartamento {
    private String edificio;
    private int qtdDormitorios;
    private int qtdSuites;
    private int qtdVagas;
    private float area;

    public void setQtdDormitorios(int qtdDormitorios) {
        this.qtdDormitorios = qtdDormitorios;
    }

    public void setQtdSuites(int qtdSuites) {
        this.qtdSuites = qtdSuites;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public int getQtdDormitorios() {
        return qtdDormitorios;
    }

    public int getQtdSuites() {
        return qtdSuites;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public float getArea() {
        return area;
    }

    public String getEdificio() {
        return edificio;
    }
}

class ApartamentoConvencional extends Apartamento {
    private boolean temSalaVaranda;

    public void setTemSalaVaranda(boolean temSalaVaranda) {
        this.temSalaVaranda = temSalaVaranda;
    }

    public boolean getTemSalaVaranda() {
        return temSalaVaranda;
    }
}

class ApartamentoGarden extends Apartamento {
    private boolean temVarandaGarden;

    public void setTemVarandaGarden(boolean temVarandaGarden) {
        this.temVarandaGarden = temVarandaGarden;
    }

    public boolean getTemVarandaGarden() {
        return temVarandaGarden;
    }
}

interface ApartamentoBuilder {
    void setEdificio(String edificio);
    void setQtdDormitorios(int qtdDormitorios);
    void setQtdSuites(int qtdSuites);
    void setQtdVagas(int qtdVagas);
    void setArea(float area);
    Apartamento getApartamento();
}

class ApartamentoConvencionalBuilder implements ApartamentoBuilder {
    private ApartamentoConvencional apartamento;

    public ApartamentoConvencionalBuilder() {
        this.apartamento = new ApartamentoConvencional();
    }

    public void setTemSalaVaranda(boolean temSalaVaranda) {
        apartamento.setTemSalaVaranda(temSalaVaranda);
    }

    @Override
    public void setEdificio(String edificio) {
        apartamento.setEdificio(edificio);
    }

    @Override
    public void setQtdDormitorios(int qtdDormitorios) {
        apartamento.setQtdDormitorios(qtdDormitorios);
    }

    @Override
    public void setQtdSuites(int qtdSuites) {
        apartamento.setQtdSuites(qtdSuites);
    }

    @Override
    public void setQtdVagas(int qtdVagas) {
        apartamento.setQtdVagas(qtdVagas);
    }

    @Override
    public void setArea(float area) {
        apartamento.setArea(area);
    }

    @Override
    public Apartamento getApartamento() {
        return apartamento;
    }
}

class ApartamentoGardenBuilder implements ApartamentoBuilder {
    private ApartamentoGarden apartamento;

    public ApartamentoGardenBuilder() {
        this.apartamento = new ApartamentoGarden();
    }

    public void setTemSalaVaranda(boolean temVarandaGarden) {
        apartamento.setTemVarandaGarden(temVarandaGarden);
    }

    @Override
    public void setEdificio(String edificio) {
        apartamento.setEdificio(edificio);
    }

    @Override
    public void setQtdDormitorios(int qtdDormitorios) {
        apartamento.setQtdDormitorios(qtdDormitorios);
    }

    @Override
    public void setQtdSuites(int qtdSuites) {
        apartamento.setQtdSuites(qtdSuites);
    }

    @Override
    public void setQtdVagas(int qtdVagas) {
        apartamento.setQtdVagas(qtdVagas);
    }

    @Override
    public void setArea(float area) {
        apartamento.setArea(area);
    }

    @Override
    public Apartamento getApartamento() {
        return apartamento;
    }
}

class ApartamentoDirector {
    private ApartamentoBuilder apartamentoBuilder;

    public ApartamentoDirector(ApartamentoBuilder apartamentoBuilder) {
        this.apartamentoBuilder = apartamentoBuilder;
    }

    public void construirApartamentoConvencional(String edificio, int qtdDormitorios, int qtdSuites, int qtdVagas, float area, boolean temSalaVaranda) {
        apartamentoBuilder.setEdificio(edificio);
        apartamentoBuilder.setQtdDormitorios(qtdDormitorios);
        apartamentoBuilder.setQtdSuites(qtdSuites);
        apartamentoBuilder.setQtdVagas(qtdVagas);
        apartamentoBuilder.setArea(area);
        ((ApartamentoConvencionalBuilder) apartamentoBuilder).setTemSalaVaranda(temSalaVaranda);
    }

    public void construirApartamentoGarden(String edificio, int qtdDormitorios, int qtdSuites, int qtdVagas, float area, boolean temVarandaGarden) {
        apartamentoBuilder.setEdificio(edificio);
        apartamentoBuilder.setQtdDormitorios(qtdDormitorios);
        apartamentoBuilder.setQtdSuites(qtdSuites);
        apartamentoBuilder.setQtdVagas(qtdVagas);
        apartamentoBuilder.setArea(area);
        ((ApartamentoGardenBuilder) apartamentoBuilder).setTemSalaVaranda(temVarandaGarden);
    }
}