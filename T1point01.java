
package t1point01;

/**
 *
 * @author ASUS
 */
public class T1point01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String[]nama = new String[5];
        nama[0]=" Ni Luh Putu Intan Afsari";
        nama[1]=" Ni Luh Putu Kristina Dewi";
        nama[2]=" I Made Angga Ariawan ";
        nama[3]=" I Wayan Arta Gunarsa";
        nama[4]=" Ni Kadek Dwi Lestari ";
        
        
        //untuk pemanggilan array 1d
       for(int i = 0; i<nama.length;  i++)
       {
        System.out.println("Nama Mahasiswa :"+(nama[i]));}
    }
    
}
