package first;

import java.util.*;

//first class
class TaxCalculator {		
int  getTaxPercent(int salary)
{
	NavigableMap<Integer,Integer> mp = new TreeMap<Integer, Integer>();
	if(salary<200000){
		mp.put(0, 0);
	}
	else if(salary<500000){
		mp.put(200000, 10);
	}
	else if(salary>=500000&&salary<1000000){
		mp.put(500000, 20);
	}
	else mp.put(1000000, 30);
	return mp.get(mp.floorKey(salary));
}
long getActualTax(int salary){
	return (getTaxPercent(salary)*salary)/100;
}

}

class Employee{
	String name;
	int id;
	int salary;
	Employee(String name, int id, int salary )
	{
		this.salary=salary;
		this.id=id;
		this.name=name;
	}
}

class Driver{
	public static void main(String k[])
	{
		int t;
		System.out.println("Enter the number of employees :");
		Scanner s1=new Scanner(System.in);
		t=s1.nextInt();
		ArrayList<employee>data=new ArrayList<employee>();
		while(t>0){
		System.out.println("enter the name,id and salary : ");
		Scanner s=new Scanner(System.in);
		String p=s.nextLine();
		int q=s.nextInt();
		int r=s.nextInt();
		employee e=new employee(p,q,r);
		data.add(e);
		t--;
		}
		NavigableMap<Integer,Integer> map = new TreeMap<Integer, Integer>();
		map.put(0, 0);
		map.put(200000, 0);
		map.put(500000, 0);
		map.put(1000000, 0);
		tax a=new tax();
		for(int i=0;i<data.size();i++)
		{
		int per=a.getTaxPercent(data.get(i).salary);
		long act=a.getActualTax(data.get(i).salary);
		if(data.get(i).salary>0)map.put(0, map.get(0)+1);
		if(data.get(i).salary>=200000)map.put(200000, map.get(200000)+1);
		if(data.get(i).salary>=500000)map.put(500000, map.get(500000)+1);
		if(data.get(i).salary>=1000000)map.put(1000000, map.get(1000000)+1);
		//final output generation
		System.out.println("name of the employee: "+data.get(i).name+"\nsalary: "+data.get(i).salary+"\nTaxPercent: "+per+"\nactual tax: "+act+"\n");
		}
		
		
	}
}
