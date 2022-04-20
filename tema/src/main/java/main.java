public class main {
    public static void main(String[] args) {

        Model m1 = new Model(1, "Iphone", 2020);
        Model m2 = new Model(2, "Lenovo", 2021);


        Dispozitive dispozitive1 = new Dispozitive(3099.99f, "Xs", m1 );
        Dispozitive dispozitive2 = new Dispozitive(4099.99f, " Legion", m2);


        Telefon iph = new Telefon("OLED", 1125, 4, 64, dispozitive1);
        Laptop laptop_lenovo = new Laptop("i5 8300H", "NVIDIA 1050 Ti", 8, 256,144, dispozitive2 );

        System.out.println(iph);
        System.out.println(laptop_lenovo);



    }
}
