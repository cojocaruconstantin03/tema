public class Dispozitive {

    private float pret;
    private String nume;
    private Model model;

    public Dispozitive(float pret, String nume, Model model) {
        this.pret = pret;
        this.nume = nume;
        this.model = model;
    }

    public Dispozitive() {

    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return
                "pret=" + pret +" lei"+
                ", nume='" + nume + '\'' +
                 model ;
    }
}
