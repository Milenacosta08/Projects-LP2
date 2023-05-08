public class Main {
    public static void main(String[] args) {
        ApartamentoConvencionalBuilder apartamentoConvencionalBuilder = new ApartamentoConvencionalBuilder();
        ApartamentoDirector apartamentoDirector = new ApartamentoDirector(apartamentoConvencionalBuilder);
        apartamentoDirector.construirApartamentoConvencional();
        Apartamento apartamento = apartamentoConvencionalBuilder.getApartamento();
        System.out.println("Apartamento convencional: " + apartamento.getNumDormitorios() + " dormitórios, "
                + apartamento.getNumVagas() + " vagas e " + apartamento.getMetragem() + " m²");

        ApartamentoGardenBuilder apartamentoGardenBuilder = new ApartamentoGardenBuilder();
        apartamentoDirector = new ApartamentoDirector(apartamentoGardenBuilder);
        apartamentoDirector.construirApartamentoGarden();
        apartamento = apartamentoGardenBuilder.getApartamento();
        System.out.println("Apartamento garden: " + apartamento.getNumDormitorios() + " dormitórios, "
                + apartamento.getNumVagas() + " vagas e " + apartamento.getMetragem() + " m²");
    }
}