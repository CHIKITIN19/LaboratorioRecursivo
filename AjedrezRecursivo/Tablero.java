/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AjedrezRecursivo;

/**
 *
 * @author 9567
 */
public class Tablero {
    private int [][] tablero;
    private static final int tamano = 8;
    
    public Tablero(){
        tablero = new int [tamano][tamano];
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                tablero[i][j] = -1;
            }
        }
    }
    public boolean MovimientoValido(int x, int y ){
        return (x>=0 && x < tamano && y>= 0 && y< tamano && tablero[x][y] == -1);
    }
    public void Posicion(int x, int y, int paso){
        tablero[x][y] = paso;
    }
    public void MostrarTablero(){
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (tablero[i][j] == -1) {
                    System.out.println("X"); //Marca las casillas con X
                }else{
                    System.out.printf(" %2d ", tablero[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
