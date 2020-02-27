package DuaDimensi;

public class LimasPersegiP extends PersegiPanjang {
    public LimasPersegiP(String nama) {
        super(nama);
    }
    private double tinggi1 = 3;
    private double alas1 = 6;
    private double miring1 = 5;

    private double tinggi2 = 3;
    private double alas2 = 10;
    private double miring2 = 10;

    private double luasSegitiga1 = (tinggi1*alas1)/2;
    private double luasSegitiga2 = (tinggi2*alas2)/2;
    public double getLuasSegitiga1(){
        return luasSegitiga1;
    }
    public double getLuasSegitiga2(){
        return luasSegitiga2;
    }
    private double luasLimasP = super.getLuasPersegiP() + 2*getLuasSegitiga1() + 2*getLuasSegitiga2();
    public double getLuasLimasP(){
        return luasLimasP;
    }
    private double kelilingLimasP = super.getKelilingPersegiP() + 2*(alas1+miring1+miring1) + 2*(tinggi2+alas2+miring2+miring2);
    public double getKelilingLimasP(){
        return kelilingLimasP;
    }
    public void viewOutput(){
        System.out.println("Bangun " + super.getNamaPersegiP() + " memiliki sisi persegi " + super.getPanjangPersegiP() + " cm," +
                "sisi segitiga pertama tinggi " + tinggi1 + " cm, alas " + alas1 + " cm, miring " + miring1 + " cm," +
                " sisi segitiga kedua tinggi " + tinggi1 + " cm, alas " + alas1 + " cm, miring " + miring1 + " cm," +
                " dan memiliki luas permukaan " + luasLimasP + " cm dan keliling " + kelilingLimasP + " cm.");
    }
}
