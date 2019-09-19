/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discrete;

import java.util.Scanner;
public class Discrete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=0;
        Scanner key=new Scanner(System.in);
        int N=key.nextInt();
        for (int i=1;i<=N ; i++){
            for (int j=1;j<= N; i++){
                x=x+j;
            
            }
        }
    System.out.println(x);
    }
    
    
}
