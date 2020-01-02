package soalnomor4;

public class Acak {
    
    private int[]value = null;
    private int n = -1;

    public Acak(int n) {
        this.n = n;
        generateUniqueRandom();
    }
    
    public void cetakValue(){
        if(n>0&&this.value!=null){
            System.out.print("[");
            for (int i = 0; i < this.value.length; i++) {
                if (i > 0) {
                    System.out.print(" |");
                }
                System.out.print(" " + this.value[i]);
            }
            System.out.println(" ]");
        }
    }
    
    public void generateUniqueRandom(){
        if(n>0){
            this.value = new int[n];
            for(int i=0;i<n;i++){
                int r = getRandomNumberInRange(1, n);
                boolean next = true;
                while(next){
                    boolean sudahAda = false;
                    for(int j=0;j<i;j++){
                        if(r==this.value[j]){
                            r = getRandomNumberInRange(1, n);
                            sudahAda = true;
                            break;
                        }
                    }
                    if(sudahAda==false){
                        this.value[i] = r;
                        next = false;
                        break;
                    }
                }
                
            }
        }
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min > max) {
            int temp = max;
            max = min;
            min = temp;
        }
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

}
