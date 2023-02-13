/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.table;

/**
 *
 * @author inaquout
 */
public class Table {
    public static void main(String[] args) {
        System.out.println("N\t10*N\t100*N\t1000*N");

        for (int n = 1; n <= 5; n++) {
            System.out.printf("%d\t%d\t%d\t%d\n", n, 10 * n, 100 * n, 1000 * n);
        }
    }
}
