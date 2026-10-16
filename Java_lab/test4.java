class Demo {

    <T> void display(T data) { //generic method

        System.out.println(data);
    }

    public static void main(String[] args) {

        Demo d = new Demo();

        d.display(100);

        d.display("Java");

        d.display(5.6);
    }
}

