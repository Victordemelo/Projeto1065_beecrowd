/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author victo
 */import java.util.Scanner;
public class Projeto1065 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int par = 0;
        
        for(int i = 0; i < 5; i++){
            int X = leitor.nextInt();
            
            if (X % 2 ==0){
                par++;
            }
        }
        
        System.out.println(par + " valores pares");
    }
}
