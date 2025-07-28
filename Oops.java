// public class Oops {
//     public static void main(String[] args) {
        
//         public class Oops_inheritance { 
//             public class Oops extends Oops_inheritance
//             void display(){
//                 System.out.println("This is a inheritance class");
//             }
//         } interface Oops_interface {
//             void display();
//         } public class Oops_interface_impl implements Oops_interface {
//             public void display() {
//                 System.out.println("This is an interface implementation");
//             }
//         }
//     } 
    
// }
// Demonstration of inheritance and interface in Java

// Demonstration of inheritance and interface in Java

// Inheritance example
class Oops_inheritance {
    void display() {
        System.out.println("This is an inheritance class");
    }
}

class OopsChild extends Oops_inheritance {
    // Inherits display() from Oops_inheritance
}

// Interface example
interface Oops_interface {
    void display();
}

class Oops_interface_impl implements Oops_interface {
    public void display() {
        System.out.println("This is an interface implementation");
    }
}

public class Oops {
    public static void main(String[] args) {
        // Inheritance demonstration
        Oops_inheritance obj1 = new OopsChild();
        obj1.display();

        // Interface demonstration
        Oops_interface obj2 = new Oops_interface_impl();
        obj2.display();
    }
}  