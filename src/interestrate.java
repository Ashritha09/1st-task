/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashritha
 */
import java.util.Scanner;
public class interestrate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int p=s.nextInt();
        double r=s.nextDouble();
        int t=s.nextInt();
        double g=r*t;
        System.out.println("si:"+p+g);
        //int n=s.nextInt();
        double ci=p*(Math.pow((1+r/100),t));
        System.out.println("ci:"+ci);
        // TODO code application logic here
    }
    
}
