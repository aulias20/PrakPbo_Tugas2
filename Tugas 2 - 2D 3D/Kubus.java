package DuaDimensi;

public class Kubus extends Persegi {
    public Kubus(String nama){
        super(nama);
    }
    private double luasKubus = 6*super.getLuasPersegi();
    public double getLuasKubus(){
        return luasKubus;
    }
    private double kelilingKubus = 6*super.getKelilingPersegi();
    public double getKelilingKubus(){
        return kelilingKubus;
    }
    public void viewOutput(){
        System.out.println("Bangun " + super.getNamaPersegi() + " memiliki sisi " + super.getSisiPersegi() + " cm dan memiliki luas permukaan " + getLuasKubus() + " cm dan keliling " + kelilingKubus + " cm.");
    }
}
