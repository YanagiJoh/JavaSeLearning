package CustomerInfoDemo;

public class CustomerList {

    private Customer[] customers;
    private int total;//きぞんの顧客の数

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer) {

        if (total >= customers.length) {
            return false;
        }

        customers[total++] = customer;
        return true;

    }

    public boolean replaceCustomer(int index, Customer cust) {

        if (index < 0 || index >= total) {
            return false;
        }

        customers[index] = cust;
        return true;
    }

    public  boolean deleteCustomer(int index){

        if (index < 0 || index >= total) {
            return false;
        }

        for (int i = index; i < total - 1 ; i++) {
            customers[i] = customers[i+1];
        }

        customers[total-1] = null;
        total--;
        return true;

    }

    public Customer[] getAllCustomers(){

        Customer[] custs = new Customer[total];

        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }

        return  custs;
    }

    public Customer getCustomer(int index){

        if (index < 0 || index >= total) {
            return null;
        }

        return customers[index];

    }

    public  int getTotal(){
        return  total;
    }
}
