import java.util.*;

public class Main {
    public static void main(String[] args)
    {

//        Opiskelija opiskelija = new Opiskelija( "Pekka", "tie2", "kesä 98",1234, "08/22" );
//        System.out.println(opiskelija);
//
//        Henkilokunta henkilokunta = new Henkilokunta("Raisa","Katu3","kesä 82","888","koulu myllerrys", "Mestari§" );
//        System.out.println(henkilokunta);

        ArrayList<Henkilo> henkilot = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        boolean jee = true;

        while (jee)
        {
            String sTemp;
            System.out.println("Lisätäänkö uuden henkilön tiedot (k/e) ");
            sTemp = sc.nextLine();
            if(Objects.equals(sTemp,"k"))
            {
                jee = true;
                System.out.println("Onko henlikö (opiskelija) vai (henkilökunta)a?");
                String vastaus = sc.nextLine();

                if (vastaus.equalsIgnoreCase("opiskelija") )
                {
                    Opiskelija o = new Opiskelija();
                    o.kysyTiedot();
                    henkilot.add(o);
                }
                if (vastaus.equalsIgnoreCase("henkilokunta"))
                {
                    Henkilokunta h = new Henkilokunta();
                    h.kysyTiedot();
                    henkilot.add(h);
                }
                else
                {
                    System.out.println("Virheellinen syöte!");
                }
            }
            else
                jee = false;
        }


        System.out.println();


       for (Object o: henkilot)
       {
           // tunnistetaan opiskelija
           if (o instanceof Opiskelija)
           {
                final Opiskelija op = (Opiskelija) o;
                System.out.println(op.getNimi());
                System.out.println(op.getOsoite());
                System.out.println(op.getSyntymaaika());
                System.out.println(op.getOpiskelijanumero());
                System.out.println(op.getAloituspaiva());
           }
       }

       System.out.println();

        for (Object o: henkilot)
        {
            // tunnistetaan opiskelija
            if (o instanceof Henkilokunta)
            {
                final Henkilokunta hk = (Henkilokunta) o;
                System.out.println(hk.getNimi());
                System.out.println(hk.getOsoite());
                System.out.println(hk.getSyntymaaika());
                System.out.println(hk.getTyontekijanumero());
                System.out.println(hk.getToimipaikka());
                System.out.println(hk.getTitteli());

            }
        }
    }
}