// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static boolean ispalin(String str){
        int [] arr=new int[26];
        int index;
        int count=0;
        for(char ch:str.toCharArray()){
            if(Character.isLetter(ch)){
                index=(Character.toLowerCase(ch))-'a';
                arr[index]++;
                if(arr[index]%2==1){
                    count++;
                }
                else{
                    count--;
                }
            }
        }
        return count<=1;
    }
    public static void main(String[] args) {
        String str="car";
        if(ispalin(str)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}
