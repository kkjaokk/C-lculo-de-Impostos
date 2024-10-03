/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caulatetaxes;

/**
 *
 * @author João Henrique
 */
public class CaulateTaxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double productValue = 200.00;
    double freightValue = 15.00;
    double insuranceValue = 10.00;
    double CONST_IPI = 0.0015;
    double costsProduction = 100.00;
   
    
    double baseCalculation = productValue + freightValue + insuranceValue;
    
    double profitMargin = (productValue - costsProduction) / costsProduction;
    
    Taxes taxesObj = new Taxes();
    
    System.out.println("-------------- Calculate final product value --------------");
    System.out.println("\n");
    
    double icms = taxesObj.calculateICMS(costsProduction, "RJ>SP");
    double ipi = taxesObj.calculateIPI(baseCalculation, CONST_IPI);
    
    double result = costsProduction + (icms + ipi) + profitMargin;
    
    System.out.println("The final price is: "+ result);
    System.out.println("\n");
    }
    
}
