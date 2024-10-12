/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Horse;

import AjedrezRecursivo.Pieza;
import AjedrezRecursivo.Tablero;

/**
 *
 * @author sebas
 */
public class Horse extends Pieza {
    
    public Horse(int coordenadaX, int coordenadaY) {
        super(coordenadaX,coordenadaY);
    }
    
    public void move(int nX, int nY){
        this.coordenadaX = nX;
        this.coordenadaY = nY;
    }
    
}
