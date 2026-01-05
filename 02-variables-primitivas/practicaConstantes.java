package constantes;

public class PracticaConstantes {
    static void main() {
        final int max_user=20;
        //max_user =10; //me sale error porque es una constante
        final double tax_rate = 0.10;
        int gross_salary = 3000;
        double netSalary = gross_salary * (1-tax_rate);
        System.out.println("netsalary: "+ netSalary);
    }
}
