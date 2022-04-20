public class Telefon extends Dispozitive{

    private int rezolutie;

    private String display;

    private int stocare;

    private int ram;


    public Telefon(String display, int rezolutie, int ram, int stocare, Dispozitive electronice) {

        this.display = display;
        this.rezolutie = rezolutie;
        this.ram = ram;
        this.stocare = stocare;
        this.setPret(electronice.getPret());
        this.setNume(electronice.getNume());
        this.setModel(electronice.getModel());


    }
    @Override
    public float getPret() {
        return super.getPret();
    }

    @Override
    public Model getModel() {
        return super.getModel();
    }

    @Override
    public String getNume() {
        return super.getNume();
    }

    @Override
    public void setModel(Model model) {
        super.setModel(model);
    }

    @Override
    public void setNume(String nume) {
        super.setNume(nume);
    }

    @Override
    public void setPret(float pret) {
        super.setPret(pret);
    }

    @Override
    public String toString() {
        return "Telefon:" +
                "display='" + display + '\'' +
                ", rezolutie=" + rezolutie + "p"+
                ", ram=" + ram +
                ", stocare=" + stocare + ", "+
                super.toString();
    }

    public String getDisplay()
    {
        return display;
    }

    public void setDisplay(String display)
    {
        this.display = display;
    }

    public int getRezolutie()
    {
        return rezolutie;
    }

    public void setRezolutie(int rezolutie)
    {
        this.rezolutie = rezolutie;
    }

    public int getRam()
    {
        return ram;
    }

    public void setRam(int ram)
    {
        this.ram = ram;
    }

    public int getStocare()
    {
        return stocare;
    }

    public void setStocare(int stocare)
    {
        this.stocare = stocare;
    }
}
