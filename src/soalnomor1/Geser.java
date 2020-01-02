package soalnomor1;

public class Geser {

    private int[] myArray = null;

    public Geser(int[] myArray) {
        this.myArray = myArray;
    }

    public void cetakArray() {
        if (myArray != null) {
            System.out.print("[");
            for (int i = 0; i < myArray.length; i++) {
                if (i > 0) {
                    System.out.print(" |");
                }
                System.out.print(" " + myArray[i]);
            }
            System.out.println(" ]");
        }
    }

    public void geser(Arah arah, int nGeser) {
        if (myArray != null) {
            if (arah == Arah.kanan) {
                int[] newArray = new int[myArray.length];
                for (int i = 0; i < myArray.length; i++) {
                    int index = (i + nGeser) % myArray.length;
                    newArray[index] = myArray[i];
                }
                myArray = newArray;
            } else if (arah == Arah.kiri) {
                int[] newArray = new int[myArray.length];
                for (int i = 0; i < myArray.length; i++) {
                    int index = (i - nGeser) % myArray.length;
                    if (index < 0) {
                        index = myArray.length + index;
                    }
                    newArray[index] = myArray[i];
                }
                myArray = newArray;
            }
        }
    }

}
