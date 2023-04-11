package com.java.learning;

class Operation2{  
 int data=50;  
  
 void change(Operation2 op){  
 op.data=op.data+100;//changes will be in the instance variable  
 }  
 
	void change(int data) {
		data = data + 100; // Local varibale , hence it will not be changed
	}
     
    
 public static void main(String args[]){  
   Operation2 op=new Operation2();  
  
   System.out.println("before change "+op.data);  
   op.change(op);//passing object  
   System.out.println("after change "+op.data);  
   op.change(200);
   System.out.println("after change "+op.data); 
  
 }  
}  