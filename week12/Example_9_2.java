public class Example_9_2 {
    private boolean x;
    public static void main(String[] args){
        Example_9_2 object1 = new Example_9_2();
        System.out.println(object1.x);
        System.out.println(object1.convert());
    }
    private int convert(){
        return x?1:-1;
    }
}
