import java.util.Scanner;

public class Henkilokunta extends Henkilo
{
    private String tyontekijanumero;
    private String toimipaikka;
    private String titteli;

    public Henkilokunta() {
    }
    public Henkilokunta(String tyontekijanumero, String toimipaikka, String titteli) {
        this.tyontekijanumero = tyontekijanumero;
        this.toimipaikka = toimipaikka;
        this.titteli = titteli;
    }

    public Henkilokunta(String nimi, String osoite, String syntymaaika, String tyontekijanumero, String toimipaikka, String titteli) {
        super(nimi, osoite, syntymaaika);
        this.tyontekijanumero = tyontekijanumero;
        this.toimipaikka = toimipaikka;
        this.titteli = titteli;
    }

    public String getTyontekijanumero() {
        return tyontekijanumero;
    }

    public void setTyontekijanumero(String tyontekijanumero) {
        this.tyontekijanumero = tyontekijanumero;
    }

    public String getToimipaikka() {
        return toimipaikka;
    }

    public void setToimipaikka(String toimipaikka) {
        this.toimipaikka = toimipaikka;
    }

    public String getTitteli() {
        return titteli;
    }

    public void setTitteli(String titteli) {
        this.titteli = titteli;
    }

    public void tulostaHenkilokunta(Henkilo henkilo)
    {
        System.out.println(getHenkilonTiedot() + " " + this.toimipaikka
                + " " + this.toimipaikka + " " + this.titteli);

    }

    @Override
    public String toString() {
        return "Henkilokunta\n" + super.toString() +
                " tyontekijanumero= " + tyontekijanumero +
                ", toimipaikka= " + toimipaikka +
                ", titteli= " + titteli;

    }
    public void kysyTiedot()
    {
        Scanner input = new Scanner(System.in);
        super.kysyTiedot();
        System.out.print("Annan työntekijanumero: ");
        setTyontekijanumero(input.nextLine());
        System.out.print("Annan toimipaikka: ");
        setToimipaikka(input.nextLine());
        System.out.print("Anna titteli: ");
        setTitteli(input.nextLine());
    }


}
