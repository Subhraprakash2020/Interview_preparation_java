// Java does not have built-in copy constructot like C++, but we can create copy constructor.
// Used to copy values from one object to another.
package constructor;

class StudentCopy{
    int id;
    String name;

    StudentCopy(int id, String name){
        this.id = id;
        this.name = name;
    }

    StudentCopy(StudentCopy s){
        this.id = s.id;
        this.name = s.name;
    }

    void display(){
        System.out.println(id + " " + name);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        StudentCopy scopy = new StudentCopy(100, "Subhra");
        StudentCopy scopy2 = new StudentCopy(scopy);
        scopy2.display();
    }
}


// Why do we need copy constructor?
// 1. To create a separate object with same data.
// 2. To avoid referance copy

// A copy constructor is used to create a new object by copying values from another object.
// It is useful when we want two separate objects with same data but different memory locations to avoid reference sharing problems.

// Real-Time Use Cases

// ✔ 1. Cloning Object Safely
// When you want same data but separate memory.

// ✔ 2. Immutable Class Design
// Used to safely copy object values.

// ✔ 3. Prevent Side Effects
// If object is modified somewhere, original object should not change.

// ✔ 4. Deep Copy Implementation
// If object contains other objects, copy constructor helps create deep copy.