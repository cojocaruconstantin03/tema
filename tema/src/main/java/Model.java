public class Model {

    private int numar;
    private String brand;
    private int an;

    public Model() {
    }

    public int getNumar()
    {
        return numar;
    }

    @Override
    public String toString() {
        return
                "numar=" + numar +
                        ", brand='" + brand + '\'' +
                        ", an=" + an
                ;
    }
    public Model(int numar, String brand, int an) {
        this.numar = numar;
        this.brand = brand;
        this.an = an;
    }



    public void setNumar(int numar)
    {
        this.numar = numar;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public int getAn()
    {
        return an;
    }

    public void setAn(int an)
    {
        this.an = an;
    }
}
