/*Write the method max() takes a reference to the first node in a linked list as argument
and returns the value of the maximum key in the list. 0 is returned if the list is empty */
import java.util.LinkedList;
import java.io.*;
public class linkedlistmax {
    
    private static int max(LinkedList<Integer> list){
        
    int maximum;
        if(list.size()!=0)
        {        
    maximum=list.get(0);
    for(int i=0;i<list.size();i++)
    {if(list.get(i)>maximum)
        maximum=list.get(i);
    } }
    else maximum=0;
    
    return maximum;
    }
    public static void main(String[] args) {
    
        LinkedList list1=new LinkedList();
      list1.add(2324);
      list1.add(34345);
      list1.add(34);
      
        
  
    System.out.println(max(list1));
    
    
    
    }
    
}
