package soalnomor2;

public class Geser {

    int[][] myArray = null;

    public Geser(int[][] myArray) {
        this.myArray = myArray;
    }

    public void cetakArray() {
        if (myArray != null) {
            for (int i = 0; i < myArray.length; i++) {
                System.out.print("[");
                for (int j = 0; j < myArray[i].length; j++) {
                    if (j > 0) {
                        System.out.print(" |");
                    }
                    System.out.print(" " + myArray[i][j]);
                }
                System.out.println(" ]");
            }
        }
    }

    public void geser(int baris, int kolom, Arah arah, int nGeser) {
        if (myArray != null) {
            if (arah == Arah.kanan && baris < myArray.length && baris >= 0) {
                int[][] newArray = new int[myArray.length][myArray[0].length];
                for (int i = 0; i < myArray.length; i++) {
                    if (i == baris) {
                        for (int j = 0; j < myArray[i].length; j++) {
                            int index = (j + nGeser) % myArray[i].length;
                            newArray[i][index] = myArray[i][j];
                        }
                    } else {
                        for (int j = 0; j < myArray[i].length; j++) {
                            newArray[i][j] = myArray[i][j];
                        }
                    }
                }
                myArray = newArray;
            } else if (arah == Arah.kiri && baris < myArray.length && baris >= 0) {
                int[][] newArray = new int[myArray.length][myArray[0].length];
                for (int i = 0; i < myArray.length; i++) {
                    if (i == baris) {
                        for (int j = 0; j < myArray[i].length; j++) {
                            int index = (j - nGeser) % myArray[i].length;
                            if (index < 0) {
                                index = myArray[i].length + index;
                            }
                            newArray[i][index] = myArray[i][j];
                        }
                    } else {
                        for (int j = 0; j < myArray[i].length; j++) {
                            newArray[i][j] = myArray[i][j];
                        }
                    }
                }
                myArray = newArray;
            } else if (arah == Arah.atas) {
                int[][] newArray = new int[myArray.length][myArray[0].length];
                for (int j = 0; j < myArray[0].length; j++) {
                    if (j == kolom) {
                        for (int i = 0; i < myArray.length; i++) {
                            int index = (i - nGeser) % myArray.length;
                            if (index < 0) {
                                index = myArray.length + index;
                            }
                            newArray[index][j] = myArray[i][j];
                        }
                    } else {
                        for (int i = 0; i < myArray.length; i++) {
                            newArray[i][j] = myArray[i][j];
                        }
                    }
                }
                myArray = newArray;
            } else if (arah == Arah.bawah) {
                int[][] newArray = new int[myArray.length][myArray[0].length];
                for (int j = 0; j < myArray[0].length; j++) {
                    if (j == kolom) {
                        for (int i = 0; i < myArray.length; i++) {
                            int index = (i + nGeser) % myArray.length;
                            newArray[index][j] = myArray[i][j];
                        }
                    } else {
                        for (int i = 0; i < myArray.length; i++) {
                            newArray[i][j] = myArray[i][j];
                        }
                    }
                }
                myArray = newArray;
            }
        }
    }

}
