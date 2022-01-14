package chainscfresponsibility;

public class LogInfoHandler extends AbstractHandler{

	@Override
	protected String process(String request) {
		System.out.println("LogInfoHandle - Tentanto tratar requisição");
		String result = null;
		
		if(request=="info") {
			result = "Requisição aceita:Tratando requisição de log de INFO.";
			
		}
		return result;
	}

}
