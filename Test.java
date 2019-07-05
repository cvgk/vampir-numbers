
package ocp;
import java.util.*;
//vampir numbers.
public class Test {
    
    public static void main(String[] args)  
    {
      HashSet<Integer> set = new HashSet<>();
      for(int i=10;i<100;i++)
      {
          for(int j=10;j<100;j++)
          {
              int x = i*j;
              String s = String.valueOf(x);
              if(x>1000){
                  String s1 = String.valueOf(i);
                  String s2 = String.valueOf(j);
                  String possibility1 = s1.concat(s2);
                  String possibility2 = s1.substring(0, 2).
                          concat(s2.substring(1, 2)).concat(s2.substring(0, 1));
                  String possibility3 = s1.substring(0, 1).concat
                   (s2.substring(0, 1)).concat(s1.substring(1, 2)).
                          concat(s2.substring(1, 2));
                  String possibility4 = s1.substring(0, 1).concat
                    (s2.substring(0, 2)).concat(s1.substring(1, 2));
                  String possibility5 = s1.substring(0, 1).
                          concat(s2.substring(1, 2)).concat(s1.substring(1, 2))
                          .concat(s2.substring(0, 1));
                 String possibility6 = s1.substring(0, 1).concat
                       (s2.substring(1, 2)).concat(s2.substring(0, 1)).
                         concat(s1.substring(1, 2));
                 String possibility7 = s1.substring(1, 2).
                         concat(s1.substring(0, 1)).concat(s2);
                 String possibility8 = s1.substring(1, 2).
                         concat(s1.substring(0, 1)).concat(s2.substring(1, 2)).
                         concat(s2.substring(0, 1));
                 String possibility9 = s1.substring(1, 2).
                         concat(s2.substring(0, 1)).concat(s1.substring(0, 1)).
                         concat(s2.substring(1, 2));
                 String possibility10 = s1.substring(1, 2).
                         concat(s2.substring(0, 1)).concat(s2.substring(1, 2)).
                         concat(s1.substring(0, 1));
                 String possibility11 = s1.substring(1, 2).
                         concat(s2.substring(1, 2)).concat(s1.substring(0, 1)).
                         concat(s2.substring(0, 1));
                 String possibility12 = s1.substring(1, 2).concat
                      (s2.substring(1, 2)).concat(s2.substring(0, 1)).
                         concat(s1.substring(0, 1));
                 String possibility13 = s2.substring(0, 1).
                         concat(s1.substring(0, 2)).concat(s2.substring(1, 2));
                 String possibility14 = s2.substring(0, 1).
                         concat(s1.substring(0, 1)).concat(s2.substring(1, 2)).
                         concat(s1.substring(1, 2));
                 String possibility15 = s2.substring(0, 1).concat(s1.
                         substring(1, 2)).concat(s1.substring(0, 1)).
                         concat(s2.substring(1, 2));
                 String possibility16 = s2.substring(0, 1).concat(s1.
                         substring(1, 2)).concat(s2.substring(1, 2)).
                         concat(s1.substring(0, 1));
                 String possibility17 = s2.substring(0, 1).
                         concat(s2.substring(1, 2)).concat(s1.substring(0, 2));
                 String possibility18 = s2.substring(0, 1).concat
                        (s2.substring(1, 2)).concat(s1.substring(1, 2)).
                         concat(s1.substring(0, 1));
                 String possibility19 = s2.substring(1, 2).
                         concat(s1.substring(0, 2)).concat(s2.substring(0, 1));
                 String possibility20 = s2.substring(1, 2).concat(s1.
                         substring(0, 1)).concat(s2.substring(0, 1)).
                         concat(s1.substring(1, 2));
                 String possibility21 = s2.substring(1, 2).
                         concat(s1.substring(1, 2)).concat(s1.substring(0, 1)).
                         concat(s2.substring(0, 1));
                 String possibility22 = s2.substring(1, 2).
                         concat(s1.substring(1, 2)).concat(s2.substring(0, 1)).
                         concat(s1.substring(0, 1));
                 String possibility23 = s2.substring(1, 2).
                         concat(s2.substring(0, 1)).concat(s1.substring(0, 2));
                 String possibility24 = s2.substring(1, 2).concat
                        (s2.substring(0, 1)).concat(s1.substring(1, 2)).
                         concat(s1.substring(0, 1));
                if(s.equals(possibility1)||s.equals(possibility2)||
                        s.equals(possibility3)||s.equals(possibility4)||
                        s.equals(possibility5)||s.equals(possibility6)
                     ||s.equals(possibility7)||s.equals(possibility8)||
                        s.equals(possibility9)||s.equals(possibility10)
                        ||s.equals(possibility11)||s.equals(possibility12)
                    ||s.equals(possibility13)||s.equals(possibility14)
                        ||s.equals(possibility15)||s.equals(possibility16)
                        ||s.equals(possibility17)||s.equals(possibility18)
                        ||s.equals(possibility19)||s.equals(possibility20)
                        ||s.equals(possibility21)||s.equals(possibility22)
                        ||s.equals(possibility23)||s.equals(possibility24))
                {
                    set.add(x);
                }
              }
          }
      }
      System.out.println(set);
    }
}
      
   
   
       

     
    
   



