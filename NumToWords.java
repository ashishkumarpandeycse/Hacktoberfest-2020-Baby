/* print each digit in words */
class NumWords
{
   public static void main (int n)
   {
     String s= "" +n;
     int ln =s.length();
     String word ={"zero","one","two","three","four","five","six","seven","eight","nine"};
     for (int i=0; i<n; i++)
      {
        char ch = s.charAt(i);
        System.out.print(word(ch-48)+" ");
       }
      }
   }
   // Input: 349
   // Output: three four nine
