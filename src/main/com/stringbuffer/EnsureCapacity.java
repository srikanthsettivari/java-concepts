package main.com.stringbuffer;

public class EnsureCapacity
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer();  
        System.out.println(sb.capacity());  
        sb.append("DataFlair");  
        System.out.println(sb.capacity());
        sb.append("DataFlair is company that teaches programming!!!");  
        System.out.println(sb.capacity()); 
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());  
        sb.ensureCapacity(50);
        System.out.println(sb.capacity()); 
    }  
}  