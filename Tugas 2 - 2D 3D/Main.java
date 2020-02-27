package DuaDimensi;

public class Main {
    public static void main(String[] args){
        Persegi persegi = new Persegi("Persegi");
        persegi.viewOutput();
        Persegi persegi1 = new Kubus("Kubus");
        persegi1.viewOutput();
        Persegi persegi2 = new LimasPersegi("Limas Persegi");
        persegi2.viewOutput();

        PersegiPanjang persegiP = new PersegiPanjang("Persegi Panjang");
        persegiP.viewOutput();
        PersegiPanjang persegiP1 = new Balok("Balok");
        persegiP1.viewOutput();
        PersegiPanjang persegiP2 = new LimasPersegiP("Limas Persegi Panjang");
        persegiP2.viewOutput();

        Segitiga segitiga = new Segitiga("Segitiga");
        segitiga.viewOutput();
        Segitiga segitiga1 = new LimasSegitiga("Limas Segitiga");
        segitiga1.viewOutput();
        Segitiga segitiga2 = new PrismaSegitiga("Prisma Segitiga");
        segitiga2.viewOutput();

    }
}
