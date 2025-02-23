package $08_Methods;

class Product{

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
    public Product(String itemNo){
        this.itemNo = itemNo;
    }
    public Product(String itemNo, String itemName){
        this.itemNo = itemNo;
        this.itemName = itemName;
    }
    public Product(String itemNo, String itemName, double itemPrice, int itemQuantity){
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

class Customer{

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
    public Customer(String customerId){
        this.customerId = customerId;
    }
    public Customer(String customerId, String customerName){
        this.customerId = customerId;
        this.customerName = customerName;
    }
    public Customer(String customerId, String customerName, String customerAddress, String customerPhone){
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
public class _31_Product_and_customer {
    public static void main(String[] args) {

        // Creating Product objects using different constructors
        Product p1 = new Product("P001");
        Product p2 = new Product("P002", "Laptop");
        Product p3 = new Product("P003", "Mobile", 21999, 2);

        //setting additional property for product whose details are not completely initialised
        p1.setItemPrice(100);
        p1.setItemQuantity(4);
        p2.setItemPrice(56500);
        p2.setItemQuantity(1);

        //display all products
        System.out.println("\n<<=================PRODUCT DETAILS=================>>");
        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();

        // Creating customer objects using different constructors
        Customer c1 = new Customer("C001");
        Customer c2 = new Customer("C002", "Pranav");
        Customer c3 = new Customer("C003", "Atul", "Hardoi", "+91955581xxxxx");

        //setting additional property for customer whose details are not completely initialised
        c1.setCustomerAddress("Lucknow");
        c1.setCustomerPhone("+91800478xxxx");
        c2.setCustomerAddress("Ahirori");
        c2.setCustomerPhone("+9189890xxxxx");

        //display customer details
        System.out.println("\n<<=================CUSTOMER DETAILS=================>>");
        c1.displayCustomer();
        c2.displayCustomer();
        c3.displayCustomer();

        /*
            --> 🔍 Validation in Setter Methods:
                1. for quantity >=0
                2. for phone no using regex

            --> 🔍 Default Values for Optional Fields:
                public Product(String itemNo) {
                    this(itemNo, "N/A", 0.0, 0); // Using constructor chaining
                }
                This ensures that even if only the itemNo is provided, other fields have sensible default values.


         */


    }
}
