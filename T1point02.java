
package t1point02;


public class T1point02 {

   
    public static void main(String[] args) {
       String [][]data= new String[][]{
           {"Adi",  "127647", "Teknik Informatika"},
           {"Mika", "129883", "Sistem Komputer"},
           {"Budi", "120495",  "Teknik Informatika"},
           {"Bunga","123489",  "Sistem Komputer"},
       };       
      
       for (int n=0; n<data.length; n++){
            for (int s=0; s<data[n].length; s++){
               
                System.out.print(data[n][s]+"\t ");
            }
           
            System.out.println(""); 
             
       }
    }
}
