package chainscfresponsibility;

public class LogWarningHandler extends AbstractHandler{

	@Override
	protected String process(String request) {
		System.out.println("LogInfoHandle - Tentanto tratar requisi��o");
		String result = null;
		
		if(request=="warning") {
			result = "Requisi��o aceita:Tratando requisi��o de log de WARNING.";
			
		}
		return result;
	}

}
