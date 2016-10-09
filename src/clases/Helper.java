/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Helper {
     public static int mensaje(Component ventana, String info, String titulo, int tipo) {
        int retorno = -1;
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                retorno = JOptionPane.showConfirmDialog(ventana, info, titulo, JOptionPane.YES_NO_OPTION);
                break;
        }
        return retorno;
    }

    public static String recibirDatos(Component ventana, String info) {
        String aux;
        aux = JOptionPane.showInputDialog(ventana, info);
        return aux;
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }
    }

    public static void limpiarTabla(JTable tabla) {
        int nf, nc;
        nf = tabla.getRowCount();
        nc = tabla.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla.setValueAt("", i, j);
            }
        }
    }

    public static void tablaPorDefecto(JTable tabla) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);

    }
    
    
     public static String recorridoHaciaArriba(int m[][], int j) {
        String aux = "";
        int nf = m.length;
        for (int i = (nf - 1); i >= 0; i--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;
    }

    public static String recorridoHaciaArriba(int m[][], int j, int in, int fin) {
        String aux = "";
        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;
    }

    public static String recorridoHaciaAbajo(int m[][], int j) {
        String aux = "";
        int nf = m.length;
        for (int i = 0; i < nf; i++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;
    }

        public static int[][] pasarDatosMatriz(JTable tabla1) {
        int nf, nc;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        int m[][] = new int[nf][nc];

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) tabla1.getValueAt(i, j);
            }
        }
        return m;
    }
    
    
    public static String recorridoHaciaAbajo(int m[][], int j, int in, int fin) {
        String aux = "";
        for (int i = in; i < fin; i++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;
    }
    

     public static String recorridoDiagonalSecundariaAbajo(int[][] m) {
        String aux = "";
        int nf = m.length;
        int nc = m[0].length;
         for (int i = 0; i <nf; i++) {
             aux = aux + m[i][nc-1-i] + ", ";
         }
        return aux;
    }
     
      public static String recorridoDiagonalSecundariaArriba(int[][] m) {
        String aux = "";
        int nf = m.length;
        int nc = m[0].length;
         for (int i = nf-1; i >=0; i--) {
             aux = aux + m[i][nc-1-i] + ", ";
         }
        return aux;
    }
      
      public static String recorridoDiagonalSecundariaArriba(int[][] m,int in, int fin) {
        String aux = "";
        int nf = m.length;
        int nc = m[0].length;
         for (int i = in; i >=fin; i--) {
             aux = aux + m[i][nc-1-i] + ", ";
         }
        return aux;
    }
     
      public static String recorridoDiagonalSecundariaAbajo(int[][] m, int in, int fin) {
        String aux = "";
         int nc = m[0].length;
         for (int i = in; i <=fin; i++) {
              aux = aux + m[i][nc-1-i] + ", ";
         }
        return aux;
    }
    
    public static String recorridoDiagonalPrincipalAbajo(int[][] m) {
        String aux = "";
        int nf = m.length;
        for (int i = 0; i < nf; i++) {
            aux = aux + m[i][i] + ", ";
        }
        return aux;
    }
    
    public static String recorridoDiagonalPrincipalArriba(int[][] m) {
        String aux = "";
        int nf = m.length;
        for (int i = (nf-1); i >= 0; i--) {
            aux = aux + m[i][i] + ", ";
        }
        return aux;
    }
    
     public static String recorridoDiagonalPrincipalArriba(int[][] m, int in, int fin) {
        String aux = "";
        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][i] + ", ";
        }
        return aux;
    }

    public static String recorridoDiagonalPrincipalAbajo(int[][] m, int in, int fin) {
        String aux = "";
        for (int i = in; i <= fin; i++) {
            aux = aux + m[i][i] + ", ";
        }
        return aux;
    }
    
    public static String recorridoHaciaIzquierda(int[][] m, int i) {
        String aux = "";
        int nc = m[0].length;

        for (int j = (nc - 1); j >= 0; j--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;
    }

    public static String recorridoHaciaIzquierda(int[][] m, int i, int in, int fin) {
        String aux = "";

        for (int j = in; j >= fin; j--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;
    }

    public static String recorridoHaciaDerecha(int[][] m, int i) {
        String aux = "";
        int nc = m[0].length;

        for (int j = 0; j < nc; j++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;
    }

    public static String recorridoHaciaDerecha(int[][] m, int i, int in, int fin) {
        String aux = "";

        for (int j = in; j <= fin; j++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;
    }

    
    public static String recorrido1(JTable tabla1){
    int m[][],nf,nc;
        m = pasarDatosMatriz(tabla1);
        String aux = "";
        nf = m.length;
        nc = m[0].length;
        aux = aux + Helper.recorridoHaciaDerecha(m, 0, 0, nc-2);
        aux = aux + Helper.recorridoHaciaAbajo(m, nc-1, 0, nf/2);
        aux = aux + Helper.recorridoHaciaIzquierda(m, nf/2, nc-1, 1);
        aux = aux + Helper.recorridoHaciaAbajo(m, 0, nf/2, nf-2);
        aux = aux + Helper.recorridoHaciaDerecha(m, nf-1, 0, nc-1);
    return aux;
    }
    
    public static String recorrido4(JTable tabla1){
    int m[][],nf,nc;
        m = pasarDatosMatriz(tabla1);
        String aux = "";
        nf = m.length;
        nc = m[0].length;
        aux = aux + Helper.recorridoHaciaDerecha(m, 0, 0, nc-2);
        aux = aux + Helper.recorridoDiagonalSecundariaAbajo(m, 0, nf-2);
        aux = aux + Helper.recorridoHaciaDerecha(m, nf-1, 0, nc-1);
    return aux;
    }
    
    
    public static String recorrido5(JTable tabla1){
    int m[][],nf,nc;
        m = pasarDatosMatriz(tabla1);
        String aux = "";
        nf = m.length;
        nc = m[0].length;
        aux = aux + Helper.recorridoHaciaArriba(m, 0, nf-1, 0);
        aux = aux + Helper.recorridoDiagonalPrincipalAbajo(m, 1, nf/2);
        aux = aux + Helper.recorridoDiagonalSecundariaArriba(m, nc/2, nc-1);
    return aux;
    }
    
    
    public static String recorrido2(JTable tabla1){
    int m[][],nf,nc;
        m = pasarDatosMatriz(tabla1);
        String aux = "";
        nf = m.length;
        nc = m[0].length;
        aux = aux + Helper.recorridoHaciaArriba(m, 0, nf-1, 0);
        aux = aux + Helper.recorridoHaciaDerecha(m, 0, 1, nc/2);
        aux = aux + Helper.recorridoHaciaAbajo(m, nc/2, nc/2-1, nf/2-1);
        
        return aux;
    }
   
    
}
