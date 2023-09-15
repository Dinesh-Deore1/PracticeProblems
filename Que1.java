//program to count no. of charcters in string

public class Main {
    public final int z=0;
    public static void main(String[] args) {
        String sc = "Din  esh";
        int count=0;
        for(int i=0;i<sc.length();i++){
            if(sc.charAt(i) == ' '){
                continue;
            }
            else count++;

        }
        System.out.println("no. of characters are: "+count);
        System.out.println();


    }
}
