class Apartamento {
    private int numDormitorios;
    private int numVagas;
    private float metragem;

    public int getNumDormitorios() {
        return numDormitorios;
    }

    public void setNumDormitorios(int numDormitorios) {
        this.numDormitorios = numDormitorios;
    }

    public int getNumVagas() {
        return numVagas;
    }

    public void setNumVagas(int numVagas) {
        this.numVagas = numVagas;
    }

    public float getMetragem() {
        return metragem;
    }

    public void setMetragem(float metragem) {
        this.metragem = metragem;
    }
}

interface Builder {
    void setNumDormitorios(int numDormitorios);

    void setNumVagas(int numVagas);

    void setMetragem(float metragem);

    Apartamento getApartamento();
}

class ApartamentoConvencionalBuilder implements Builder {
    private Apartamento apartamento;
    private boolean temVaranda;
    private boolean temSuite;

    public ApartamentoConvencionalBuilder() {
        apartamento = new Apartamento();
        temVaranda = true;
        temSuite = true;
    }

    @Override
    public void setNumDormitorios(int numDormitorios) {
        apartamento.setNumDormitorios(numDormitorios);
    }

    @Override
    public void setNumVagas(int numVagas) {
        apartamento.setNumVagas(numVagas);
    }

    @Override
    public void setMetragem(float metragem) {
        apartamento.setMetragem(metragem);
    }

    @Override
    public Apartamento getApartamento() {
        return apartamento;
    }
}

class ApartamentoGardenBuilder implements Builder {
    private Apartamento apartamento;
    private boolean temVarandaGarden;
    private boolean temSuite;

    public ApartamentoGardenBuilder() {
        apartamento = new Apartamento();
    }

    @Override
    public void setNumDormitorios(int numDormitorios) {
        apartamento.setNumDormitorios(numDormitorios);
    }

    @Override
    public void setNumVagas(int numVagas) {
        apartamento.setNumVagas(numVagas);
    }

    @Override
    public void setMetragem(float metragem) {
        apartamento.setMetragem(metragem);
    }

    @Override
    public Apartamento getApartamento() {
        return apartamento;
    }
}

// Path: Builder\ApartamentoDirector.java
class ApartamentoDirector {
    private Builder builder;

    public ApartamentoDirector(Builder builder) {
        this.builder = builder;
    }

    public void construirApartamentoConvencional() {
        builder.setNumDormitorios(3);
        builder.setNumVagas(2);
        builder.setMetragem(68);
    }

    public void construirApartamentoGarden() {
        builder.setNumDormitorios(3);
        builder.setNumVagas(2);
        builder.setMetragem(127);
    }
}
