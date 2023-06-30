package T1C_T4C_T0E;

import java.util.Scanner;

public class GM_LGC {
    private GM_BRD brd;
    private char crrntPlayer;

    public GM_LGC(){
        brd = new GM_BRD();
        crrntPlayer = 'X';
    }

    public void plyGM(){
        Scanner scnnr = new Scanner(System.in);
        boolean GmRnnng = true;

        while (GmRnnng){
            System.out.println("Player "+crrntPlayer+", enter your move (row [1-3] column [1-3]):");
            int rw = scnnr.nextInt() - 1;
            int cl = scnnr.nextInt() - 1;

        }
    }
}
