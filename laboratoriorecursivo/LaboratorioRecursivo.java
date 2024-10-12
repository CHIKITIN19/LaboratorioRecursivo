/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratoriorecursivo;

import Queen.EightQueens;

public class LaboratorioRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EightQueens eightQueens = new EightQueens();
        if (eightQueens.solve(0)) {
            eightQueens.printBoard();
        } else {
            System.out.println("No se han encontrado soluciones.");
        }
    }
    
}
