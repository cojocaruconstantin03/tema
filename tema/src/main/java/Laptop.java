public class Laptop extends Dispozitive{

    private String procesor;
    private String placa_video;
    private int stocare;
    private int rezolutie;
    private int ram;



    public Laptop(){

    }

    @Override
    public float getPret()
    {
        return super.getPret();
    }

    @Override
    public Model getModel()
    {
        return super.getModel();
    }

    @Override
    public String getNume()
    {
        return super.getNume();
    }
    @Override
    public void setModel(Model model)
    {
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


    public Laptop(String procesor, String placa_video, int ram, int stocare, int rezolutie, Dispozitive Dispozitive) {

        this.procesor = procesor;
        this.placa_video = placa_video;
        this.ram = ram;
        this.stocare = stocare;
        this.rezolutie = rezolutie;
        this.setPret(Dispozitive.getPret());
        this.setNume(Dispozitive.getNume());
        this.setModel(Dispozitive.getModel());


    }

    @Override
    public String toString() {
        return
                "Laptop:"+
                "procesor='" + procesor + '\'' +
                ", placa_video='" + placa_video + '\'' +
                ", ram=" + ram +
                ", stocare=" + stocare +
                ", rezolutie=" + rezolutie+ "p"+ ", "+
                super.toString()
                ;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getPlaca_video() {
        return placa_video;
    }

    public void setPlaca_video(String placa_video) {
        this.placa_video = placa_video;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStocare() {
        return stocare;
    }

    public void setStocare(int stocare) {
        this.stocare = stocare;
    }

    public int getRezolutie() {
        return rezolutie;
    }

    public void setRezolutie(int rezolutie) {
        this.rezolutie = rezolutie;
    }
}
