/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymania;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class ArrayMania {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float[]A = new float[50];
        float[]B = new float[20];
        
        for (int i = 0; i < 50; i++) {
            Arrays.fill(A, i, i+1, (float)Math.random()*100);
        }
        System.out.println(Arrays.toString(A));
        Arrays.sort(A);
        
        for (int i = 0; i < 10; i++) {
            Arrays.fill(B, i, i+1, A[i]);
        }
        Arrays.fill(B, 10, 20, (float)0.5);
        
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        
        
    }
    
}
