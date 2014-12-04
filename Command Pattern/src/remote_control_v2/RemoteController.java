package remote_control_v2;

import java.util.*;

public class RemoteController {
	private List<Command> cmds = new ArrayList<>();
	
	public void setCommand(Command cmd){
		cmds.add(cmd);
	}
	
	public void doCommand(int index){
		cmds.get(index).execute();
	}
}
