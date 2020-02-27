package DuaDimensi;

public class LimasSegitiga extends Segitiga {
    public LimasSegitiga (String nama){
        super(nama);
    }
    private double tinggiLimas = 8;
    private double miringLimas = 10;
    private double luasLimas1 = (super.getMiringSegitiga()*tinggiLimas)/2;
    public double getLuasLimas1(){
        return luasLimas1;
    }
    private double luasLimas2 = (super.getAlasSegitiga()*tinggiLimas)/2;
    public double getLuasLimas2(){
        return luasLimas2;
    }
    private double luasLimas3 = 2*luasLimas1+luasLimas2+super.getLuasSegitiga();
    public double getLuasLimas3(){
        return luasLimas3;
    }
    private double kelilingLimas3 = super.getKelilingSegitiga()+3*miringLimas;
    public double getKelilingLimas3(){
        return kelilingLimas3;
    }
    public void viewOutput(){
        System.out.println("Bangun " + super.getNamaSegitiga() + " memiliki sisi alas " + super.getAlasSegitiga() + " cm, " +
                "sisi tinggi " + super.getTinggiSegigita() + ", sisi miring " + super.getMiringSegitiga() + " cm, dan sisi tinggi limas " +
                + tinggiLimas + " cm, serta memiliki luas permukaan seluruhnya " + luasLimas3 + " cm dan keliling " +
                kelilingLimas3 + " cm.");
    }
}
