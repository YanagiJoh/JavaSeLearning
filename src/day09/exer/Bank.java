package day09.exer;

public class Bank {

    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];
    }

    public void addCustomer(String firstname, String lastname) {

        Customer cust = new Customer(firstname, lastname);
        customers[numberOfCustomers] = cust;
        numberOfCustomers++;
        //もしくは
        //customers[numberOfCustomers++] = cust;

    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }

        return null;
    }


}
