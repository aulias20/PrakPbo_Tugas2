package DuaDimensi;

public class PrismaSegitiga extends Segitiga {
    public PrismaSegitiga(String nama){
        super(nama);
    }
    private double tinggiPrisma = 10;
    private double luasSegiempat = getMiringSegitiga()*tinggiPrisma;
    private double luasPrisma = 2*super.getLuasSegitiga()+2*luasSegiempat;
    public double getLuasPrisma(){
        return luasPrisma;
    }

    private double kelilingPrisma = 2*getKelilingSegitiga() + 3*tinggiPrisma;
    public double getKelilingPrisma(){
        return kelilingPrisma;
    }
    public void viewOutput(){
        System.out.println("Bangun " + super.getNamaSegitiga() + " memiliki sisi alas " + super.getAlasSegitiga() + " cm, " +
                "sisi tinggi " + super.getTinggiSegigita() + ", sisi miring " + super.getMiringSegitiga() + " cm, dan tinggi " +
                "prisma " + tinggiPrisma + " cm, serta memiliki luas permukaan " + luasPrisma + " cm dan keliling " +
                kelilingPrisma + " cm.");
    }
}
