//To display a number is armstrong or not

class armstrong{  
	public static void main(String args[]){  
   		 int c=0,a,temp;  
   		 int n=153; 
    		 temp=n;  
    		 while(n>0){  
   			 a=n%10;  
   			 n=n/10;  
    			 c=c+(a*a*a);  
    			}  
   		 if(temp==c)  
    			System.out.println(temp+ " is an armstrong number");   
   		 else  
       			 System.out.println(temp+ " not an armstrong number");   
  	 }  
}  

/*OUTPUT 
153 is an armstrong number */