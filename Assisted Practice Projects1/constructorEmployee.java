package training;

public class constructorEmployee {
	int id;  
    String name;  
    // creating default constructor
      constructorEmployee()
   {
   }


    //creating a parameterized constructor  
    constructorEmployee(int i,String n){  
    id = i;  
    name = n;  
  }  
    
    public static void main(String args[]){  
    //creating objects and passing values  
    constructorEmployee e1 = new constructorEmployee();  
    constructorEmployee e2 = new constructorEmployee(20,"raju"); 
    System.out.println(e2.id);
    System.out.println(e2.name);
    
   
   }  
}

