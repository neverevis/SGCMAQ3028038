package aulas.xml;
import logtrack
public class Teste {
    public static void main(String[] args) {
        ExceptionLogTrack.getInstance().addLog(new Exception("teste"));
    }
}
