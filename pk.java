import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
class Paap{
public static void main(String[] args){
Paap suv=new Suv();
}
}
class Pk extends Paap{
public  Pk(){
System.out.println("Hello");
String voice="Array";
System.out.println("Class Pk");
HashMap<Integer,String> nep = new HashMap<Integer,String>(10,10);
nep.put(1,"pk");
System.out.println(nep);
System.out.println("Division by 0");
try{
int div=7/0;
System.out.println(div);
}catch(Exception e){
System.out.println("Can't Divide by 0");
}
}
}
class Suv extends Pk{
public Suv(){
ArrayList <Integer> arr= new ArrayList<Integer>(10);
arr.add(29);
arr.add(5);
arr.add(6);
System.out.println(arr);
Collections.sort(arr);
System.out.println(arr);
System.out.println("Sum of all digit");
int sum=0;
Iterator<Integer> it=arr.iterator();
while(it.hasNext()){
sum=sum+it.next();
}
System.out.println(sum);
}
}
	

