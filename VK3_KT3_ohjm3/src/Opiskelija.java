import java.util.Scanner;

public class Opiskelija
{

    private String enimi;
    private String snimi;
    private int onumero;
    private String osoite;

    public Opiskelija() {
    }

    public Opiskelija(String enimi, String snimi, int onumero, String osoite) {
        this.enimi = enimi;
        this.snimi = snimi;
        this.onumero = onumero;
        this.osoite = osoite;
    }

    public String getEnimi() {
        return enimi;
    }

    public void setEnimi(String enimi) {
        this.enimi = enimi;
    }

    public String getSnimi() {
        return snimi;
    }

    public void setSnimi(String snimi) {
        this.snimi = snimi;
    }

    public int getOnumero() {
        return onumero;
    }

    public void setOnumero(int onumero) {
        this.onumero = onumero;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    @Override
    public String toString() {
        return "Opiskelija\n" +
                "Etunimi= " + enimi + ", Sukunimi= " + snimi +
                ", Opiskelijanumero= " + onumero + ", osoite= " + osoite ;
    }


    Scanner input = new Scanner(System.in);
    public  void kysyTiedot()
    {
        System.out.print("Anna etunimi: ");
        this.enimi = input.nextLine();
        System.out.print("Anna sukunimi: ");
        this.snimi = input.nextLine();
        System.out.print("Anna opiskelijanumero: ");
        this.onumero = input.nextInt();
        input.nextLine();
        System.out.print("Anna osoite: ");
        this.osoite = input.nextLine();

    }
}
