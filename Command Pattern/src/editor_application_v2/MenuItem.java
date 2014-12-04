package editor_application_v2;

import java.util.*;

public abstract class MenuItem {
	private Set<Command> cmds = new HashSet<>();
	public abstract void clicked();
}
