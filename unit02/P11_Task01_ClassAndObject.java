package unit02;

class TelCall
{
    static final private int RENTAL_CHARGE = 100;
    long phno;
    String sname;
    int n;
    double amt;
    TelCall(long phno, String sname, int n)
    {
        this.phno = phno;
        this.sname = sname;
        this.n = n;
        this.amt = 0.0;
    }
    void compute()
    {
        int calls = this.n;
		double total_cost = 0;
		
		if (calls >= 1 && calls <= 100) {
            total_cost = RENTAL_CHARGE;
        } else if (calls >= 101 && calls <= 200) {
            total_cost = (calls - 100) + RENTAL_CHARGE;
        } else if (calls >= 201 && calls <= 300) {
            total_cost = (calls - 200) * 1.20 + (100 * 1.00) + RENTAL_CHARGE;
        } else {
            total_cost = (calls - 300) * 1.50 + (100 * 1.00) + (100 * 1.20) + RENTAL_CHARGE;
        }

		this.amt = total_cost;
    }
    void display()
    {
        System.out.println("Phone number is: " + this.phno);
        System.out.println("Subscriber name is: " + this.sname);
        System.out.println("Number of calls is: " + this.n);
        System.out.println("Rental charge is : " + RENTAL_CHARGE);
        System.out.println("Amount is : " + this.amt);
    }
}

public class P11_Task01_ClassAndObject
{
//     A class Telcall calculates the monthly phone bill of a consumer. Some of the members of the class are given below:
// Class name: Telcall
// Data members/instance variable:
//     phno(phone Number)
//     sname(subscriber Name 
//     n(number of calls made)
//     amt (bill amount)
// Member function/methods:
//     TelCall() : Parameterized constructor to assign values to data members.    
//     Void compute( ) : to calculate the phone bill amount base on the slabs given below.
//     Void display( ) : to display the details in the specified format.
// Number of calls Rate
// 1 – 100                 Rs. 500/- rental charge only
// 101 – 200                 Rs 1.00 per call + rental charge
// 201-300                 Rs. 1.20 per call + rental charge
// Above 300                 Rs. 1.50 per call + rental charge
    public static void main(String args[])
    {
        TelCall ob[] = new TelCall[5];
        for(int i=0;i<5;i++)
        {
            ob[i] = new TelCall(1234567890, "joe", 202);
            ob[i].compute();
        }
        for(int i=0;i<5;i++)
        {
            ob[i].display();
        }
    }
}