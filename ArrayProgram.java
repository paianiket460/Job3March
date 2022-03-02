import java.util.*;  
public class ArrayProgram{  
public static int getLargest(Integer[] a, int total){  
List<Integer> list=Arrays.asList(a);  
Collections.sort(list);  
int element=list.get(total-1);  
return element;  
}  
public static void main(String args[]){   
Integer a[]={42,62,68,75,31,27,65,69,100,9};  
System.out.println("Largest: "+getLargest(a,10));  
}}