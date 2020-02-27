package DuaDimensi;

public class Persegi {
    private String namaPersegi;

    public Persegi(String nama){

        this.namaPersegi = nama;
    }
    public String getNamaPersegi() {

        return namaPersegi;
    }

    private double sisiPersegi = 5;

    public void Sisi(int sisi){

        this.sisiPersegi = sisi;
    }
    public double getSisiPersegi(){

        return sisiPersegi;
    }
    private double luasPersegi = sisiPersegi*sisiPersegi;

    public void Luas(int luas) {
        this.luasPersegi = luas;
    }
    public double getLuasPersegi(){
        return luasPersegi;
    }
    private double kelilingPersegi = 4*sisiPersegi;
    public void Keliling(int keliling){
        this.kelilingPersegi = keliling;
    }
    public double getKelilingPersegi(){
        return kelilingPersegi;
    }
    public void viewOutput(){
        System.out.println("Bangun " + namaPersegi + " memiliki sisi " + sisiPersegi + " cm dan memiliki luas permukaan " + luasPersegi + " cm dan keliling " + kelilingPersegi + " cm.");
    }
}
