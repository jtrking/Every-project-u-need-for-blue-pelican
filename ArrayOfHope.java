public class ArrayOfHope { 
    public static void main(String[] args) { 
        char ch[] = new char[26]; 
        for(int i=65,j=0;i<=90;i++,j++)
        { 
            ch[j]=(char)i; 
        } 
        for(int i=0;i<=25;i++)
        { 
            if(i<24){ 
                System.out.print(ch[i] + ","); 
            } else if(i== 25){ 
                System.out.println(ch[25]); 
            } 
        } 
    } 
}
