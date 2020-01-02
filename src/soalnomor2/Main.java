package soalnomor2;

public class Main {

    public static void main(String[] args) {
        int[][] arrayKu = {
            {2,3,4,5},
            {1,2,3,7},
            {9,3,2,1}
        };
        Geser geser = new Geser(arrayKu);
        geser.cetakArray();   
        System.out.println("");
        geser.geser(1,2,Arah.atas, 1);
        geser.cetakArray();
        System.out.println("");
        geser.geser(0,3,Arah.bawah, 2);
        geser.cetakArray();
        System.out.println("");
        geser.geser(2,3,Arah.kanan, 1);
        geser.cetakArray();
    }
}
