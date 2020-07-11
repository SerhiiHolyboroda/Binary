import java.util.HashSet;

public class Binary {
    
    public static void main(final String[] args) {
// Оголошуємо змінні
        String Text = "SPD-University".toUpperCase() ;
         HashSet<Integer> Even  = new HashSet<Integer>(); 
        HashSet<Integer> Odd = new HashSet<Integer>();  
  //  

// Додаємо в залежності від парності/непарності бінарний код в list який не дозволяє додавати однакові елементи 
        for ( int i = 0 ;    Text.length() > 0; i++ ){
          System.out.println( Text.length() );

          if(  Integer.parseInt(Integer.toBinaryString(Text.charAt(0))) % 10 == 0  ){
            Even.add(   Integer.parseInt(Integer.toBinaryString(Text.charAt(0))) );
           
            Text =   Text.substring(1);
             
            System.out.println( Text );
           }
      
            if(  Integer.parseInt(Integer.toBinaryString(Text.charAt(0))) % 10 == 1  ){

             Odd.add(   Integer.parseInt(Integer.toBinaryString(Text.charAt(0))) );
            
             Text =   Text.substring(1);
             System.out.println( Text );
            }
         

}
 

//  Отримуємо різницю між кількістю парних/непарних елементів
 
System.out.println("Кількість парних :" + Even.size());
System.out.println("Кількість непарних :" + Odd.size());

 
int size =  Odd.size() - Even.size() ;
System.out.println(size);
// System.out.println(Integer.toBinaryString(size));
System.out.println(Integer.parseInt(Integer.toBinaryString(size), 2));
 
      
 

    }
      
 
    

}