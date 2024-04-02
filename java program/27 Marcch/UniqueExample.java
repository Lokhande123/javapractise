import java.util.HashMap;   

class Example{   
      
    public static void main(String args[])   
    {   
        
    int arrayWithDuplicates[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };  
  
          HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();   
               for (int j = 0; j < arrayWithDuplicates.length; j++) {   
            hashmap.put(arrayWithDuplicates[j], j);   
        }   
        System.out.println(hashmap.keySet());   
    }
    }   