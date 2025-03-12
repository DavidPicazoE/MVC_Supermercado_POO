/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author alfredo
 */
public class UtilP {

    public static boolean validaLongitud(String txt, int lon) {

        return txt.length() > lon;
    }

    public static boolean validaInteger(String txt) {
        boolean esInt = true;
        try {
            int ib = Integer.parseInt(txt);
        } catch (Exception e) {
            esInt = false;
        }

        return esInt;
    }
}
