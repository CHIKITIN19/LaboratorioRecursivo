/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Horse;

import AjedrezRecursivo.Pieza;
import AjedrezRecursivo.Tablero;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Horse extends Pieza {
    private static final int tamanho = 8;
    private static final int[] moviX = {2, 1, -1, -2, -2, -1, 1, 2}; 
    private static final int[] moviY = {1, 2, 2, 1, -1, -2, -2, -1};
    private Tablero tablero;
    private int casillasVisitadas; 
    private boolean recorridoCompleto;
    private Ajedrez inteface; //Para El JFRAME de ajedrez

        public Horse(Tablero tablero, Ajedrez inteface, int coordenadaX, int coordenadaY) {
            super(coordenadaX, coordenadaY);
            this.tablero = tablero;
            this.recorridoCompleto  = false;
            this.casillasVisitadas = 0;
            this.inteface = inteface;
        }

        public Horse(int coordenadaX, int coordenadaY) {
            super(coordenadaX,coordenadaY);
        }

        public void move(int nX, int nY){
            this.coordenadaX = nX;
            this.coordenadaY = nY;
        }
        public void Recorrido(int x, int y, int paso) {
            if (casillasVisitadas == tamanho * tamanho) { 
                recorridoCompleto = true;
                return;
            }

            if (!tablero.MovimientoValidoRango(x, y)) { 
                return;
            }
            tablero.Posicion(x, y, paso);
            casillasVisitadas++;

            //Actualiza la casilla con hilo
            inteface.actualizarCasilla(x, y, paso);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            boolean movimientoValido = false;
            for (int i = 0; i < tamanho; i++) {
                int siguienteX = x + moviX[i];
                int siguienteY = y + moviY[i];
                  if (tablero.MovimientoValidoRango(siguienteX, siguienteY)) {
                  movimientoValido = true;
                  Recorrido(siguienteX, siguienteY, paso + 1); 
                  break;
            }
        }

        if (!movimientoValido) {
        recorridoCompleto = false; 
        }
    }

    public void IniciarRecorrido(int x, int y) {
        if (!tablero.MovimientoValidoRango(x, y)) {
        return;
        }
        Recorrido(x, y, 0);
        if (recorridoCompleto) {
           JOptionPane.showMessageDialog(inteface, "EL RECORRIDO SE COMPLETO CORRECTAMENTE");
        } else {
           JOptionPane.showMessageDialog(inteface, "EL RECORRIDO NO SE COMPLETO CORRECTAMENTE");
        }
    }

    public void MostrarResultado() {
        tablero.MostrarTablero();

    }
    
}
