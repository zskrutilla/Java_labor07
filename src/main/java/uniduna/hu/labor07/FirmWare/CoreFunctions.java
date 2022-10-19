/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uniduna.hu.labor07.FirmWare;

import uniduna.hu.labor07.Beallitas;
//Git komment miatt vagy mi..
/**
 *
 * @author KRUTILLAZS
 */
public class CoreFunctions {

    public static void kilep() {
        System.exit(0);
    }

    public static void beallitasFrame() {
        new Beallitas().setVisible(true);
    }
}
