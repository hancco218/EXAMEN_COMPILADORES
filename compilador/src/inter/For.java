package inter; // Archivo For.java

import symbols.*;

public class For extends Instr {

    Expr expr;
    Instr instr;

    public For() {
        expr = null;
        instr = null;
    }
    
    
    public void inic(Expr x, Expr x1, Expr s1, Instr s2) {   // for(i=0; i<10; i = i+1){}{}
        expr = x;
        instr = s2;
        if (expr.tipo != Tipo.Bool) {
            expr.error("error xd");
        }
    }
       
        // aqui se hace  el bucle 
    public void gen(int b, int a) {
        despues = a; // guarda la etiqueta a
        expr.salto(0, a);
        int etiqueta = nuevaEtiqueta(); // etiqueta para instr
        emitirEtiqueta(etiqueta);
        instr.gen(etiqueta, b);
        emitir("for" + b);
    }
}
