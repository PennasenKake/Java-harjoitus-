import java.util.Scanner;

public class Henkilo
{
    protected String Nimi;
    protected String Osoite;
    protected String Syntymaaika;

    public Henkilo() {
    }

    public Henkilo(String nimi, String osoite, String syntymaaika) {
        Nimi = nimi;
        Osoite = osoite;
        Syntymaaika = syntymaaika;
    }

    public String getNimi() {
        return Nimi;
    }

    public void setNimi(String nimi) {
        Nimi = nimi;
    }

    public String getOsoite() {
        return Osoite;
    }

    public void setOsoite(String osoite) {
        Osoite = osoite;
    }

    public String getSyntymaaika() {
        return Syntymaaika;
    }

    public void setSyntymaaika(String syntymaaika) {
        Syntymaaika = syntymaaika;
    }

    protected String getHenkilonTiedot()
    {
        return this.Nimi + ", " + this.Osoite + ", " + this.Syntymaaika;
    }

    @Override
    public String toString() {
        return "Henkilo\n" +
                "Nimi= " + Nimi + ", Osoite= " + Osoite +
                ", Syntymaaika= " + Syntymaaika;
    }

    public void kysyTiedot()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Annan nimi: ");
        setNimi(input.nextLine());
        System.out.print("Annan osoite: ");
        setOsoite(input.nextLine());
        System.out.print("Anna syntymäaika: ");
        setOsoite(input.nextLine());
    }

}
