package state;


public class TVRemoteBasic {
private String state =" ";
	
	public void setState(String state){
		this.state=state;
	}
	
	public void doAction(){
		if(state.equalsIgnoreCase("ON")){
			System.out.println("TV est� ligada");
		}else if(state.equalsIgnoreCase("OFF")){
			System.out.println("TV est� desligada");
		}
	}

	public TVRemoteBasic() {                                                  
		TVRemoteBasic remote = new TVRemoteBasic();
		
		remote.setState("ON");
		remote.doAction();
		
		remote.setState("OFF");
		remote.doAction();
	} 

}




