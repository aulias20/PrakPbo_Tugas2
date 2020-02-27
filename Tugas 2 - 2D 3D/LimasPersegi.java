package DuaDimensi;

public class LimasPersegi extends Persegi {
    public LimasPersegi(String nama) {
        super(nama);
    }
    private double tinggi = 3;
    private double alas = 4;
    private double miring = 5;
    private double luasSegitiga = (tinggi*alas)/2;
    public double getLuasSegitiga(){
        return luasSegitiga;
    }
    private double luasLimas = super.getLuasPersegi() + 4*getLuasSegitiga();
    public double getLuasLimas(){
        return luasLimas;
    }
    private double kelilingLimas = super.getKelilingPersegi() + 4*(alas+miring+miring);
    public double getKelilingLimas(){
        return kelilingLimas;
    }
    public void viewOutput(){
        System.out.println("Bangun " + super.getNamaPersegi() + " memiliki sisi persegi " + super.getSisiPersegi() + " cm," +
                "sisi segitiga tinggi " + tinggi + " cm, alas " + alas + " cm, miring " + miring + " cm," +
                " dan memiliki luas permukaan " + luasLimas + " cm dan keliling " + kelilingLimas + " cm.");
    }
}
