package Builder;


public class Main {
    public static void main(String[] args) {
        ApartamentoConvencionalBuilder apartamentoConvencionalBuilder = new ApartamentoConvencionalBuilder();
        ApartamentoDirector apartamentoDirector = new ApartamentoDirector(apartamentoConvencionalBuilder);
        apartamentoDirector.construirApartamentoConvencional(
            "Edifício Espanha",
            3,
            1,
            2,
            68,
            true
        );
        Apartamento apartamento = apartamentoConvencionalBuilder.getApartamento();
        System.out.println("Apartamento convencional (" + apartamento.getEdificio() + "): " + apartamento.getQtdDormitorios() + " dormitórios, " + apartamento.getQtdVagas() + " vagas e " + apartamento.getArea() + " m²");

        ApartamentoGardenBuilder apartamentoGardenBuilder = new ApartamentoGardenBuilder();
        apartamentoDirector = new ApartamentoDirector(apartamentoGardenBuilder);
        apartamentoDirector.construirApartamentoGarden(
            "Edifício Gracias",
            3,
            1,
            2,
            127,
            true
        );
        apartamento = apartamentoGardenBuilder.getApartamento();
        System.out.println("Apartamento garden (" + apartamento.getEdificio() + "): " + apartamento.getQtdDormitorios() + " dormitórios, " + apartamento.getQtdVagas() + " vagas e " + apartamento.getArea() + " m²");
    }
}