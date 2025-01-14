package ReferenceVariable;

public class CallByValue1 {

    int data=50;

    void change(int data){
        data=data+100;//changes will be in the local variable only
    }

    public static void main(String args[]){
        CallByValue1 op=new CallByValue1();

        System.out.println("before change "+op.data);
        op.change(500);     // won't change anything..
        System.out.println("after change "+op.data);    //output is same : 50

    }
}