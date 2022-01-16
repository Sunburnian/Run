package run;

public class RunCmd {
    
    public void comando(){
        try {
            String comando = "cmd /C start chrome /incognito www.youtube.com";
            Runtime.getRuntime().exec( comando );
            
        }
        catch(Exception e){
            System.out.println("deu não meu rei");
        }
    }
}
