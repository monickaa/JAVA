// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        List<Character>l1=new ArrayList<>();
        List<Character>l2=new ArrayList<>();
        
        Scanner io=new Scanner(System.in);
        System.out.println("Enter boy name: ");
        String b=io.next();
        System.out.println("Enter girl name: ");
        String g=io.next();
        
        for(char ch:b.toCharArray()){
            l1.add(ch);
        }
        for(char ch:g.toCharArray()){
            l2.add(ch);
        }
        int len1=l1.size();
        int len2=l2.size();
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(l1.get(i).equals(l2.get(j))){
                    l1.set(i,'2');
                    l2.set(j,'2');
                }
            }
        }
        // System.out.println(l1);
        // System.out.println(l2);
        int count=0;
        for(char ch: l1){
            if(ch!='2'){
                count++;
            }
        }
        for(char ch: l2){
            if(ch!='2'){
                count++;
            }
        }
        System.out.println(count);
        List<Character>f=new ArrayList<>(Arrays.asList('F','L','A','M','E','S'));
        int index=0;
        while(f.size()>1){
            index=(index+(count-1))%f.size();
            f.remove(index);
        }
        System.out.println(f);
    }
    
}
