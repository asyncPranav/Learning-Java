package practical;

public class _07_Constructor {
    private String name;

    //non-parameterized constructor
    public _07_Constructor(){
        name = "Pranav";
    }

    //parameterized constructor
    public _07_Constructor(String name){
        this.name = name;
    }

    //copy constructor
    public _07_Constructor(_07_Constructor c){
        name = c.name;
    }

    public static void main(String[] args) {
        _07_Constructor obj1 = new _07_Constructor();
        System.out.println(obj1.name);

        _07_Constructor obj2 = new _07_Constructor("Pranav singh chandel");
        System.out.println(obj2.name);

        _07_Constructor obj3 = new _07_Constructor(obj1);
        System.out.println(obj3.name);
    }

}
