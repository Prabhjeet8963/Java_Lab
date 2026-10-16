class bStudent {
    String name;
    int Sapid;
    int batch;
    

void show() {
    System.out.println("Name: " + name + "\nSAP ID: " + Sapid + "\nBatch: " + batch);
}
public static void main(String[] args) {

    bStudent s1 = new bStudent();  //creating object of class bStudent

    //bstudent is a class name
    //student is an object name
    //new is a keyword used to create new objects
    //bStudent() is a constructor that initializes the object
    
    System.out.println(s1);
    //by default, when we print an object, it will print the reference of the object in memory
    System.out.println(s1.batch);
    
    s1.name = "Prabhujeet";
    s1.Sapid = 590013286;
    s1.batch = 10;
    s1.show();

    //difference between static and nonstatic variables
    //static variables are shared among all instances of a class
    //non-static variables are unique to each instance of a class

    /*schoolName → static
    All students study in the same school.
    rollNumber → non-static
    Every student has a different roll number.
     */
    }
}



