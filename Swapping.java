// Wap to swapping two number using by third variable(temp).

//public class Swapping {
//    public static void main(String[] args) {
//        int a = 10, b = 20;
//        int temp;
//        System.out.println("a="+a+","+" b="+b);
//
//        temp=a;
//        a=b;
//        b=temp;
//        System.out.println("Value a="+a+","+" Value b="+b);
//    }
//}


// Wap to swapping two number without temp;

public class Swapping {
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println("a="+a+","+" b="+b);
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("Value a= "+a+","+"b="+b);
    }
}
