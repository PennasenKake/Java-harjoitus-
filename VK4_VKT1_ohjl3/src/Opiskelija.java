import java.util.Scanner;

public class Opiskelija extends Henkilo
{
    private int opiskelijanumero = 0;
    private String aloituspaiva;
    public Opiskelija() {
    }

    public Opiskelija(int opiskelijanumero, String aloituspaiva) {
        this.opiskelijanumero = opiskelijanumero;
        this.aloituspaiva = aloituspaiva;
    }

    public Opiskelija(String nimi, String osoite, String syntymaaika, int opiskelijanumero, String aloituspaiva) {
        super(nimi, osoite, syntymaaika);
        this.opiskelijanumero = opiskelijanumero;
        this.aloituspaiva = aloituspaiva;
    }

    public int getOpiskelijanumero() {
        return opiskelijanumero;
    }

    public void setOpiskelijanumero(int opiskelijanumero) {
        this.opiskelijanumero = opiskelijanumero;
    }

    public String getAloituspaiva() {
        return aloituspaiva;
    }

    public void setAloituspaiva(String aloituspaiva) {
        this.aloituspaiva = aloituspaiva;
    }

    public void tulostaOpiskelija(Henkilo henkilo)
    {
        System.out.println(getHenkilonTiedot()
        + " " + this.opiskelijanumero + " " + this.aloituspaiva);

    }

    @Override
    public String toString() {
        return "Opiskelija\n" + super.toString() +
                " opiskelijanumero= " + opiskelijanumero +
                ", aloituspaiva= " + aloituspaiva;
    }

    public void kysyTiedot()
    {
        Scanner input = new Scanner(System.in);
        super.kysyTiedot();
        System.out.print("Annan opiskelijanumero: ");
        setOpiskelijanumero(input.nextInt());
        input.nextLine();
        System.out.print("Annan aloituspäivä: ");
        setAloituspaiva(input.nextLine());
    }
}
