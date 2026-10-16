public  class bcollege {

    String collegeName = "ABC";
    int id;

    static void show(bcollege obj) {
        System.out.println("College Name: " + obj.collegeName + "\nID: " + obj.id);
    }

    public static void main(String[] args) {

        bcollege s1 = new bcollege();
        s1.id = 101;
        show(s1);

        bcollege s2 = new bcollege();
        s2.collegeName = "DEF";
        s2.id = 102;
        show(s2);

        show(s1);  
    }
}