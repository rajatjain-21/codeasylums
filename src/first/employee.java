package first;

import java.util.Scanner;

//first class
class tax {						
int  getTaxpercent(int salary)
{
	int taxpercent=0;
	if(salary<200000)taxpercent=0;
	else if(salary>=200000&&salary<500000)taxpercent=10;
	else if(salary>=500000&&salary<1000000)taxpercent=20;
	else if(salary>=1000000)taxpercent=30;
	return taxpercent;
}
long getActualTax(int salary){
	long act;
	act=(getTaxpercent(salary)*salary)/100;
	return act;
}

}

//second class
class employee{
	String name;
	int impid;
	int salary;
	public static void main(String k[])
	{
		while(true){
		System.out.println("enter the name,id and salary : ");
		Scanner s=new Scanner(System.in);
		employee e=new employee();
		String p=e.name=s.nextLine();
		int q=e.impid=s.nextInt();
		int r=e.salary=s.nextInt();
		//object creation
		tax a=new tax();
		int per=a.getTaxpercent(e.salary);
		long act=a.getActualTax(e.salary);
		
		//final output generation
		System.out.println("name of the employee: "+p+"\nsalary: "+q+"\ntaxpercent: "+per+"\nactual tax: "+act+"\n");
	}
	}
}
