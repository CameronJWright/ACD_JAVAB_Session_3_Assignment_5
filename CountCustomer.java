package Customer;

import java.util.Scanner;

class Customer {
	private int custNo;
	private String custName;
	private static int custCount;

	static {
		custCount = 0;
	}

	Customer() {
		custCount++;
	}

	Customer(int custNo, String custName) {
		this();
		this.custNo = custNo;
		this.custName = custName;

	}

	public int getCustNo() {
		return custNo;
	}

	public String getCustName() {
		return custName;
	}

	public static int getCustCount() {
		return custCount;
	}

}

public class CountCustomer {

	public static void main(String[] args) {

		System.out.println("Customer Count is " + Customer.getCustCount());
		Scanner scan = new Scanner(System.in);
		Customer[] customers = new Customer[3];
		String custName;
		int custNo;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the customer number for customer " + (i+1));
			custNo = scan.nextInt();
			System.out.println("Enter the customer name for customer " + (i+1));
			custName = scan.next();
			customers[i] = new Customer(custNo, custName);
			System.out.println("Customer Count is " + Customer.getCustCount());
		}

	}

}
