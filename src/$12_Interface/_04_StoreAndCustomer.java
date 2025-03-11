package $12_Interface;

interface Member{
    void callback();
}
class Store{
    Member[] members = new Member[100];
    int count = 0;

    public void register(Member m){
        members[count++] = m;
    }

    public void inviteForSale(){
        // for(int i=0; i<count; i++){
        //     members[i].callback();
        // }
        for(Member x : members){
            x.callback();
        }
    }
}
class Customer implements Member{
    String name;
    public Customer(String name){
        this.name = name;
    }
    public void callback(){
        System.out.println(name+" : ok, I will visit sale");
    }
}
public class _04_StoreAndCustomer {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("Pranav");
        Customer c2 = new Customer("Atul");

        s.register(c1);
        s.register(c2);

        s.inviteForSale();
    }
}
