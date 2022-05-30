package inter; // Archivo cometario.java

import symbols.*;

public class Comen extends Instr {

    Expr expr;
    Instr instr;

    public Comen() {
        expr = null;
        instr = null;
    }

    public void inic(Instr s) {
        //expr = x;
        instr = s;
    }
}
