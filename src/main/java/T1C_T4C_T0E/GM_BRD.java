package T1C_T4C_T0E;

public class GM_BRD {
    private char[][] brd;       //Tabula matrix

    public GM_BRD() {           //Crearem novam tabulam
        brd = new char[3][3];
        initBRD();
    }

    private void initBRD(){               //Satus tabula
        for (int rw = 0; rw < 3; rw++){
            for (int cl = 0; cl < 3; cl++){
                brd[rw][cl] = '-';
            }
        }
    }

    public void prntBRD(){                //Tabula trahere
        System.out.println("------------------");
        for (int rw = 0; rw < 3; rw++) {
            System.out.print("| ");
            for (int cl = 0; cl < 3; cl++) {
                System.out.print(brd[rw][cl] + " | ");
            }
            System.out.println("\n------------------");
        }
    }

    public void mkMv(int rw, int cl, char plr){
        brd[rw][cl] = plr;
    }

    public char getMrk(int rw, int cl) {
        return brd[rw][cl];
    }

    public boolean BrdFll(){
        for (int rw = 0; rw < 3; rw++){
            for (int cl = 0; cl < 3; cl++){
                if (brd[rw][cl] == '-'){
                    return false;
                }
            }
        }
        return true;
    }
}
