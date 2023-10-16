
/**
 * Write a description of class Ruleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ruleta
{
    Croupier croupier;
    private int numero;
    
    Ruleta (){
       this.numero =  (int) (Math.random() * 36);
    }
    
    int getNum(){
       return numero;
    }
    
    
    public void giro(){
        
        for(int i = 0; i < 10; i++){
            System.out.println( (int) (Math.random() * 36));
        }
        
        
        
    }
}
