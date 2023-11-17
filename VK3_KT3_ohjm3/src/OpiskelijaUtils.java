public class OpiskelijaUtils
{

    public static Opiskelija tarkastaTiedot(Opiskelija opiskelija) {
        if (opiskelija.getEnimi() == null || opiskelija.getEnimi().isEmpty())
        {
            System.out.println("Etunimi puuttuu");
            return null;
        }
        if (opiskelija.getSnimi() == null || opiskelija.getSnimi().isEmpty())
        {
            System.out.println("Sukunimi puuttuu");
            return null;
        }

        if (!opiskelija.getEnimi().matches("[A-Z][a-z]+"))
        {
            System.out.println("Etunimi ei ole oikeassa muodossa");
            return null;
        }

        if (!opiskelija.getSnimi().matches("[A-Z][a-z]+"))
        {
            System.out.println("Sukunimi ei ole oikeassa muodossa");
            return null;
        }

        if (!String.valueOf(opiskelija.getOnumero()).matches("\\d+"))
        {
            System.out.println("Opiskelijanumero ei sisällä pelkästään numeroita");
            return null;
        }

        if (opiskelija.getOsoite() == null || opiskelija.getOsoite().isEmpty())
        {
            System.out.println("Osoite puuttuu");
            return null;
        }


        return opiskelija;
    }

}


