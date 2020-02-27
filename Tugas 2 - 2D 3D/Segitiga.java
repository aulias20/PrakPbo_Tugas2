package DuaDimensi;

public class Segitiga {
    private String namaSegitiga;

    public Segitiga(String nama){

        this.namaSegitiga = nama;
    }
    public String getNamaSegitiga() {

        return namaSegitiga;
    }

    private double tinggiSegigita = 4;
    private double alasSegitiga = 6;
    private double miringSegitiga = 5;

    public void Tinggi(int tinggi){

        this.tinggiSegigita = tinggi;
    }
    public void Alas(int alas){

        this.alasSegitiga = alas;
    }
    public void Miring(int miring){

        this.miringSegitiga = miring;
    }
    public double getTinggiSegigita(){

        return tinggiSegigita;
    }
    public double getAlasSegitiga(){
        return alasSegitiga;
    }
    public double getMiringSegitiga(){
        return miringSegitiga;
    }
    private double luasSegitiga = (alasSegitiga*tinggiSegigita)/2;

    public void Luas(int luas) {
        this.luasSegitiga = luas;
    }
    public double getLuasSegitiga(){
        return luasSegitiga;
    }
    private double kelilingSegitiga = alasSegitiga+miringSegitiga+miringSegitiga;
    public void KelilingSegitiga(int keliling){
        this.kelilingSegitiga = keliling;
    }
    public double getKelilingSegitiga(){
        return kelilingSegitiga;
    }
    public void viewOutput(){
        System.out.println("");
        System.out.println("Bangun " + namaSegitiga + " memiliki sisi alas " + alasSegitiga + " cm, " +
                "sisi tinggi " + tinggiSegigita + ", dan sisi miring " + miringSegitiga + " cm, serta" +
                " memiliki luas permukaan " + luasSegitiga + " cm dan keliling " + kelilingSegitiga + " cm.");
    }
}
