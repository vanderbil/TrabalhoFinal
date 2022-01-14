package chainscfresponsibility;

public class LogWarningHandler extends AbstractHandler{

	@Override
	protected String process(String request) {
		System.out.println("LogInfoHandle - Tentanto tratar requisição");
		String result = null;
		
		if(request=="warning") {
			result = "Requisição aceita:Tratando requisição de log de WARNING.";
			
		}
		return result;
	}

}
