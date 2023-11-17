public class Main {

    public static void main(String[] args)
    {                                        
        SalariedEmployee salariedEmployee=new SalariedEmployee("John","Smith","111-11-1111", 800.00 );
        HourlyEmployee hourlyEmployee =new HourlyEmployee("Karen","Price","222-22-2222", 16.75, 40 );
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Sue","Jones","333-33-3333", 600.00 );
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee("Bob","Lewis","444-44-4444", 10.00, 43 );
                
        System.out.println( "Employees processed individually:\n");
        System.out.printf( "%s\n%s: $%,.2f\n\n",salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf( "%s\n%s: $%,.2f\n\n",hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf( "%s\n%s: $%,.2f\n\n",salariedEmployee2, "earned", salariedEmployee2.earnings());
        System.out.printf( "%s\n%s: $%,.2f\n\n", hourlyEmployee2,"earned", hourlyEmployee2.earnings());

        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;          
        employees[1] = hourlyEmployee;            
        employees[2] = salariedEmployee;        
        employees[3] = hourlyEmployee;

        System.out.println( "Employees processed polymorphically:\n");
        System.out.printf( "%s\n%s: $%,.2f\n\n",salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf( "%s\n%s: $%,.2f\n\n",hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf( "%s\n%s: $%,.2f\n\n",salariedEmployee2, "earned", salariedEmployee2.earnings());
        System.out.printf( "%s\n%s: $%,.2f\n\n", hourlyEmployee2,"earned", hourlyEmployee2.earnings());
    }
    
}
