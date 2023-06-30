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
            System.out.println("| ");
            for (int cl = 0; cl < 3; cl++) {
                System.out.println(brd[rw][cl]+" | ");
            }
            System.out.println("\n------------------");
        }
    }
}
