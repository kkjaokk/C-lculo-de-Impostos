/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caulatetaxes;

/**
 *
 * @author João Henrique
 */
public class Taxes {
        public double calculateIPI(double baseCalculation, double CONST) {

        double result = baseCalculation * CONST;

        return result;
    }

    public double calculateICMS(double valueProduct, String state) {

        double tax = 0;

        if ("RJ>SP".equals(state)) {

            tax = 0.12;

        } else if ("SP>DF".equals(state)) {
            tax = 0.07;
        }

        return tax;

    }
}
