package chainscfresponsibility;

public class LogInfoHandler extends AbstractHandler{

	@Override
	protected String process(String request) {
		System.out.println("LogInfoHandle - Tentanto tratar requisi��o");
		String result = null;
		
		if(request=="info") {
			result = "Requisi��o aceita:Tratando requisi��o de log de INFO.";
			
		}
		return result;
	}

}
