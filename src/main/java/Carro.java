import jdk.internal.jshell.tool.StopDetectingInputStream;
import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Carro {
   public int passageiros= 0;
   public int combustivel = 0;
   public int quilometragem = 0;
    public int getPassageiros() {
      
        return passageiros;
    }

    public int getCombustivel() {
      
        return combustivel;
    }

    public int getQuilometragem() {
        
        return quilometragem;
    }

    public boolean embarcar() {
       if(passageiros >= 2 ){
        return false;

       }else{

        passageiros += 1;
        return true;
    }
       
    }

    public boolean desembarcar() {
        if(passageiros == 0){
            return false;

        }else{

            passageiros -= 1;
            return true;
        }
        
    }

    public boolean dirigir(int distancia) {
        
        if (combustivel == 0) {
            return false;
            
        }
        if (passageiros >= 0 && combustivel >= 1 ) {
            
           
            if (distancia >= combustivel){

                quilometragem += combustivel;
                distancia = distancia - combustivel;
                combustivel = 0;
                return false;
            }

            if (distancia<combustivel) {
                
                quilometragem += distancia;
                combustivel = combustivel - distancia;
                distancia = 0;
                return true;
            }


        }
    
    
    
        return false;
    }

    public boolean abastecer(int quantidade) {
       
       if (quantidade <= 0) {
           return false;
       }
       
       
        if (quantidade >=100) {
            combustivel = 100;
            return true;
        }else{
            combustivel += quantidade;
            return true;
        }
       
    }

    @Override
    public String toString() {
        return "Carro{" +
                "passageiros=" + getPassageiros() +
                ", combustivel=" + getCombustivel() +
                ", quilometragem=" + getQuilometragem()+
                '}';
    }
}
