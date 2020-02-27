package DuaDimensi;

public class Balok extends PersegiPanjang{
    public Balok(String nama){
        super(nama);
    }
    private double tinggi = 3;
    private double luasBalok = 2*(super.getLuasPersegiP()+(super.getPanjangPersegiP()*tinggi)+(super.getLebarPersegiP()*tinggi));
    public double getLuasBalok(){
        return luasBalok;
    }
    private double kelilingBalok = 2*getKelilingPersegiP()+4*tinggi;
    public double getKelilingBalok(){
        return kelilingBalok;
    }
    public void viewOutput(){
        System.out.println("Bangun " + super.getNamaPersegiP() + " memiliki panjang sisi " + super.getPanjangPersegiP() +
                " cm dan lebar sisi " + super.getLebarPersegiP() + " cm dan tinggi " + tinggi + " cm " +
                "memiliki luas permukaan " + luasBalok + " cm dan keliling " + kelilingBalok + " cm.");
    }
}
