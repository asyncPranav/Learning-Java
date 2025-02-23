//using construction chaining to initialise uninitialised value to their default
//--> null or empty value issue rather than providing string "N/A"

package $08_Methods;

class Product1{

    //properties
    private String itemNo;
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    //property-methods (getter)
    public String getItemNo() {
        return itemNo;
    }
    public String getItemName() {
        return itemName;
    }
    public double getItemPrice() {
        return itemPrice;
    }
    public int getItemQuantity() {
        return itemQuantity;
    }

    //property-methods (setter)

    /* ---> these all must be read only

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    */
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    //parameterized-constructor (non-parameterized constructor is not possible because at least product id must be there)
    public Product1(String itemNo){
        this(itemNo, "N/A", 0, 0);
    }
    public Product1(String itemNo, String itemName){
        this(itemNo, itemName, 0, 0);
    }
    public Product1(String itemNo, String itemName, double itemPrice, int itemQuantity){
        this.itemNo = itemNo;
        this.itemName = itemName;

        //method-01
        //this.itemPrice = itemPrice;
        //this.itemQuantity = itemQuantity;

        //method-02
        setItemPrice(itemPrice);
        setItemQuantity(itemQuantity);
    }

    //instance method
    public void displayProduct(){
        System.out.println("\nItem ID : "+itemNo);
        System.out.println("Item Name : "+itemName);
        System.out.println("Item Price : "+itemPrice);
        System.out.println("Item Quantity : "+itemQuantity);
    }

}

class Customer1{

    //properties
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String customerPhone;

    //property-methods (getter)
    public String getCustomerId() {
        return customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }

    //property-methods (setter)

    /* ------> these all must be read only

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

     */

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    //parameterized-constructor (non-parameterized constructor is not possible because customer must have their customer id)
    public Customer1(String customerId){
        this(customerId, "N/A", "N/A", "N/A");
    }
    public Customer1(String customerId, String customerName){
        this(customerId, customerName, "N/A", "N/A");
    }
    public Customer1(String customerId, String customerName, String customerAddress, String customerPhone){
        this.customerId = customerId;
        this.customerName = customerName;

        //method-01
        //this.customerAddress = customerAddress;
        //this.customerPhone = customerPhone;

        //method-02
        setCustomerAddress(customerAddress);
        setCustomerPhone(customerPhone);
    }

    //instance method
    public void displayCustomer(){
        System.out.println("\nCustomer ID : "+customerId);
        System.out.println("Customer Name : "+customerName);
        System.out.println("Customer Address : "+customerAddress);
        System.out.println("Customer Phone no : "+customerPhone);
    }


}
public class _32_Product_and_customer {
    public static void main(String[] args) {

        // Creating Product objects using different constructors
        Product1 p1 = new Product1("P001");
        Product1 p2 = new Product1("P002", "Laptop");
        Product1 p3 = new Product1("P003", "Mobile", 21999, 2);

        //display all products
        System.out.println("\n<<=================PRODUCT DETAILS=================>>");
        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();

        // Creating customer objects using different constructors
        Customer1 c1 = new Customer1("C001");
        Customer1 c2 = new Customer1("C002", "Pranav");
        Customer1 c3 = new Customer1("C003", "Atul", "Hardoi", "+91955581xxxxx");

        //display customer details
        System.out.println("\n<<=================CUSTOMER DETAILS=================>>");
        c1.displayCustomer();
        c2.displayCustomer();
        c3.displayCustomer();
    }
}
