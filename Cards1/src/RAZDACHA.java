import java.util.Arrays;
import java.util.Random;

class RAZDACHA
{
    private static String[] MASSKOLODA;
    private static String[] Player1;
    private static String[] Player2;
    private static String[] Player3;
    private static String[] Player4;

    public static String[] shuffle(String[] in){
        Random r = new Random();
        int index = 0;
        String temp = "";
        for (int i = 0; i < in.length; i++) {
            index = r.nextInt(in.length);
            temp = in[index];
            in[index] = in[i];
            in[i] = temp;
        }
        return in;
    }
    public static String[][] getColoda(){
        return new String[][] {MASSKOLODA, Player1, Player2, Player3, Player4};
    }
    public RAZDACHA() {
        MASSKOLODA  = new String[32];
        String[] master= new String[] {"WINNY","BOOBY","KRESTY","CHERVY"};
        String[] typer= new String[]{"6","7","8","9","10","VALET","DAMA","KOROL","TOOZ"};
        int mast = 0;
        int type = 0;
        for (int i = 0; i <32; i++) {
            MASSKOLODA[i] = (typer[type]+"."+master[mast]);
            mast++;
            if(mast==4){mast = 0;}
            System.out.print("\t \t"+MASSKOLODA[i]+"\t");
            if(i==3|i==7|i==11|i==15|i==19|i==23|i==27|i==31){ System.out.println();type++;if(type==9){type=0;}}
        }

        Player1 = new String[20];
        Player2 = new String[20];
        Player3 = new String[20];
        Player4 = new String[20];

        MASSKOLODA = shuffle(MASSKOLODA);
        System.out.print(Arrays.toString(MASSKOLODA));
        int activeCard =0;
        Random r = new Random();

        System.out.println();


        for (int i = 0; i <6; i++) {Player1[i] = MASSKOLODA[activeCard+i];MASSKOLODA[activeCard+i] = "null";System.out.println(Player1[i]);}
        activeCard=activeCard+6;
        System.out.print("Player 1"+Arrays.toString(Player1));
        System.out.println("\n".repeat(3));
        System.out.print(Arrays.toString(MASSKOLODA));
        System.out.println("\n ".repeat(3));

        for (int i = 0; i <6; i++) {Player2[i] = MASSKOLODA[activeCard+i];MASSKOLODA[activeCard+i] = "null";System.out.println(Player2[i]);}
        activeCard=activeCard+6;
        System.out.print("Player 2"+Arrays.toString(Player2));
        System.out.println("\n".repeat(3));
        System.out.print(Arrays.toString(MASSKOLODA));
        System.out.println("\n ".repeat(3));

        for (int i = 0; i <6; i++) {Player3[i] = MASSKOLODA[activeCard+i];MASSKOLODA[activeCard+i] = "null";System.out.println(Player3[i]);}
        activeCard=activeCard+6;
        System.out.print("Player 3"+Arrays.toString(Player3));
        System.out.println("\n".repeat(3));
        System.out.print(Arrays.toString(MASSKOLODA));
        System.out.println("\n ".repeat(3));

        for (int i = 0; i <6; i++) {Player4[i] = MASSKOLODA[activeCard+i];MASSKOLODA[activeCard+i] = "null";System.out.println(Player4[i]);}
        activeCard=activeCard+6;
        System.out.print("Player 4"+Arrays.toString(Player4));
        System.out.println("\n".repeat(3));
        System.out.print(Arrays.toString(MASSKOLODA));
        System.out.println("\n ".repeat(3));
    }
}