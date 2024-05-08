public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        //ptr++;
        data[++ptr] = item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty can't pop");
        }
        int removed = data[ptr];
        ptr--;
        return data[ptr--];
    }
    public int peak() throws Exception{
        if(isEmpty()) {
            throw new Exception("Stack is empty can't peek");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr == data.length -1;
    }
    private boolean isEmpty(){
        return ptr == -1;
    }


    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

    }

}

