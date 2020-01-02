package soalnomor1;

public class Main {

    public static void main(String[] args) {
        int[] arrayKu = {3, 2, 5, 6, 4, 3};
        Geser geser = new Geser(arrayKu);
        geser.cetakArray();
        geser.geser(Arah.kiri, 2);
        geser.cetakArray();
    }
}
