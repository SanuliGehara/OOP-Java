# Pass-By-Value And Pass-By-Reference

There is only call by value in java, not call by reference. If we call a method passing a value, it is known as call by value. The changes being done in the called method, is not affected in the calling method.


But this might get tricky, when working with objects. Because, objects contains a memory address as the value. So when we passing ann object into a method, it pass the memory address/reference to that object in the memory


Which means the copied object is also pointing to the same reference. Therefore, changing the copied object will change the original object. But STILL JAVA IS NOT PASS-BY-REFERENCE

**Here is an Example for how object passing works in Java**
```
class Operation2{  
 int data=50;  
  
 void change(Operation2 op){  
 op.data=op.data+100;//changes will be in the instance variable  
 }  
     
    
 public static void main(String args[]){  
   Operation2 op=new Operation2();  
  
   System.out.println("before change "+op.data);  
   op.change(op);//passing object  
   System.out.println("after change "+op.data);  
  
 }  
}
```

**Output:**

```
before change 50
after change 150

```