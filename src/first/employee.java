package first;

import java.util.Scanner;

//first class
class tax {						
int  getTaxPercent(int salary)
{
	int TaxPercent;
	if(salary<200000){
		TaxPercent=0;
	}
	else if(salary<500000){
		TaxPercent=10;
	}
	else if(salary>=500000&&salary<1000000){
		TaxPercent=20;
	}
	else TaxPercent=30;
	return TaxPercent;
}
long getActualTax(int salary){
	return (getTaxPercent(salary)*salary)/100;
}

}

//second class
//main ke liye alag driver class bna skta hai
class employee{
	String name;
	int id;
	int salary;
	employee(String name, int id, int salary )
	{
		this.salary=salary;
		this.id=id;
		this.name=name;
	}
}

class Driver{
	public static void main(String k[])
	{
		while(true){
		System.out.println("enter the name,id and salary : ");
		Scanner s=new Scanner(System.in);
		String p=s.nextLine();
		int q=s.nextInt();
		int r=s.nextInt();
		employee e=new employee(p,q,r);
		//object creation
		tax a=new tax();
		int per=a.getTaxPercent(r);
		long act=a.getActualTax(r);
		
		//final output generation
		System.out.println("name of the employee: "+p+"\nsalary: "+q+"\nTaxPercent: "+per+"\nactual tax: "+act+"\n");
	   }
     }
}
