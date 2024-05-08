public class printNto1 {
    public static void main(String[] args) {
        int num = 5;
        func(num);
        System.out.println("****Rev****");
        funRev(num);
    }
    public static void func(int num){

        if(num == 0){
            return;
        }
        System.out.println(num);
        func(num -1);
    }

    public static void funRev(int num){
        if(num == 0){
            return;
        }
        funRev(num-1);
        System.out.println(num);
    }


}
