public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        Opiskelija o = new Opiskelija();
        o.kysyTiedot();
        OpiskelijaUtils.tarkastaTiedot(o);

        System.out.println();
        System.out.println(o);
    }
}