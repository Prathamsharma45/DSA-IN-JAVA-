import java.util.ArrayList;
import java.util.Collections    ;
import java.lang.Comparable;

class student implements Comparable<student>{
    String name;
    int roll;
    student(String name,int roll){  
        this.name=name;
        this.roll=roll;
    }
   
    
    public int compareTo(student obj){
       //return obj.roll-this.roll;
       return this.name.compareTo(obj.name);


    }
   
    
    public String toString(){
        return this.name+" "+this.roll; 
    }

}

public class dijkstra {
public static void main(String[] args) {
    ArrayList<student>list=new ArrayList<>();
   list.add(new student("Alice", 3));
   list.add(new student("Bob", 2));
    Collections.sort(list);
    for(student s:list){
        System.out.println(s.toString());
    }
   
}
    
    
}
