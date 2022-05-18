/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundaclase;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;


public class SegundaClase {

    public static void main(String[] args) {
        int inicio;
        int a = 0;
        int intentos;
        do{
            inicio = parseInt(JOptionPane.showInputDialog("Bienvenidos al juego clase #2\n"
                 +"\n"
                 +"El juego consiste en adivinar un numero entero entre el 1 y el 100\n"
                 +"\n"
                 +"Tienes 10 intentos\n"
                 +"\n"
                 +"Digite 0 para iniciar"
                 +"\n"
            )
            );
        }while(inicio!=0);
        if(inicio==0){
            do{
                int n = (int)((Math.random()*100)*1);
                intentos = 10;
                a = parseInt(JOptionPane.showInputDialog("Tienes 10 intentos. \nDigite un numero del 1 al 100"));
                for(int i=0;i<=9;i++){
                intentos = intentos - 1;
                if (a==n){
                    inicio = parseInt(JOptionPane.showInputDialog("¡ADIVINASTE! "+a+" es el numero random\n0 - para volver a jugar 1 - para salir"));
                    break;
                }
                else if(i==9){
                    inicio = parseInt(JOptionPane.showInputDialog("Perdiste, el numero era: "+n+"0 - para reintentar 1 - para salir"));
                    break;
                }
                else if(a>n){
                    a = parseInt(JOptionPane.showInputDialog("Tienes "+intentos+" intentos.\nEl numero random es MENOR que "+a));
                }
                else if(a<n){
                    a = parseInt(JOptionPane.showInputDialog("Tienes "+intentos+" intentos.\nEl numero random es MAYOR que "+a));
                }
                if(intentos == 1){
                    a = parseInt(JOptionPane.showInputDialog("Te regalamos una bonus\nPista: El numero random esta entre "+(n-4)+" y "+(n+3)));
                }
                    
                }
                
            }while(inicio==0);
        }
    }
    
}
