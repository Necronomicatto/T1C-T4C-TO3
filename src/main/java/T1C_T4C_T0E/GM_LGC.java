package T1C_T4C_T0E;

import java.util.Scanner;

public class GM_LGC {
    private GM_BRD brd;
    private char crrntPlayer;

    public GM_LGC(){
        brd = new GM_BRD();
        crrntPlayer = 'X';
    }

    public void plyGM() {
        Scanner scnnr = new Scanner(System.in);
        boolean GmRnnng = true;

        while (GmRnnng) {     //actual game running
            System.out.println("Player " + crrntPlayer + ", enter your move (row [1-3] column [1-3]):");
            int rw = scnnr.nextInt() - 1;
            int cl = scnnr.nextInt() - 1;

            if (VldMv(rw, cl)) {     //make a move
                brd.mkMv(rw, cl, crrntPlayer);
                brd.prntBRD();

                if (chckWn()) {     //check if theres a winner
                    System.out.println("Player " + crrntPlayer + " wins!");
                    GmRnnng = false;
                } else if (brd.BrdFll()) {
                    System.out.println("TIE!");
                    GmRnnng = false;
                } else {
                    crrntPlayer = (crrntPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move.");
            }
        }
        scnnr.close();
    }

    private boolean VldMv(int rw, int cl){   //checks if the move is valid
    if (rw < 0 || rw >= 3 || cl < 0 || cl>=3){
        return false;
    }
    return brd.getMrk(rw, cl) == '-';
    }

    private boolean chckWn(){     //check if there's a win
        for (int rw = 0; rw < 3; rw++){
            if (brd.getMrk(rw, 0) == crrntPlayer &&
                    brd.getMrk(rw, 1) == crrntPlayer &&
                    brd.getMrk(rw, 2) == crrntPlayer){
                return true;
            }
        }

        for(int cl = 0; cl < 3; cl++){
            if(brd.getMrk(0, cl) == crrntPlayer &&
                    brd.getMrk(1, cl) == crrntPlayer &&
                    brd.getMrk(2, cl) == crrntPlayer){
                return true;
            }
        }

        if((brd.getMrk(0, 0) == crrntPlayer &&
            brd.getMrk(1, 1) == crrntPlayer &&
            brd.getMrk(2, 2) == crrntPlayer)||(brd.getMrk(0, 2) == crrntPlayer &&
                brd.getMrk(1, 1) == crrntPlayer &&
                brd.getMrk(2, 0) == crrntPlayer)){
            return true;
        }

    return false;
    }
}

