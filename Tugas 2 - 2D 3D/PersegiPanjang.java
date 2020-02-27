package DuaDimensi;

public class PersegiPanjang {
    private String namaPersegiP;

    public PersegiPanjang(String nama){

        this.namaPersegiP = nama;
    }
    public String getNamaPersegiP() {

        return namaPersegiP;
    }

    private double panjangPersegiP = 10;
    private double lebarPersegiP = 5;

    public void Panjang(int panjang){

        this.panjangPersegiP = panjang;
    }
    public void Lebar(int lebar){

        this.lebarPersegiP = lebar;
    }
    public double getPanjangPersegiP(){

        return panjangPersegiP;
    }
    public double getLebarPersegiP(){
        return lebarPersegiP;
    }
    private double luasPersegiP = panjangPersegiP*lebarPersegiP;

    public void Luas(int luas) {
        this.luasPersegiP = luas;
    }
    public double getLuasPersegiP(){
        return luasPersegiP;
    }
    private double kelilingPersegiP = 2*panjangPersegiP+2*lebarPersegiP;
    public void Keliling(int keliling){
        this.kelilingPersegiP = keliling;
    }
    public double getKelilingPersegiP(){
        return kelilingPersegiP;
    }
    public void viewOutput(){
        System.out.println("");
        System.out.println("Bangun " + namaPersegiP + " memiliki panjang sisi " + panjangPersegiP + " cm dan " +
                "lebar sisi " + lebarPersegiP + " memiliki luas permukaan " + luasPersegiP + " cm dan keliling " + kelilingPersegiP + " cm.");
    }
}
