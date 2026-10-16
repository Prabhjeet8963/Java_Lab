@FunctionalInterface
interface test5 {
    void meth1(int a);
}
class test5Impl implements test5 {

    public static void main(String[] args) {
        test5 obj = (a) -> System.out.println("This is a lambda expression "+ a);
        obj.meth1(6);
    }

}
