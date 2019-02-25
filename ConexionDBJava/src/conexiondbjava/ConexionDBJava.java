package conexiondbjava;

public class ConexionDBJava {

    public static void main(String[] args) {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch(Exception ex){
            System.err.println(ex.getMessage());
        }
        
        
        
        
    }
}
