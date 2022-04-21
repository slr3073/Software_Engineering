package light;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Invoker
public class LightManager {
    private final HashMap<String, Command> commandMap = new HashMap<>();
    private final List<Command> history = new ArrayList<Command>(); // optional

    public void register(String commandName, Command command) {
        commandMap.put(commandName, command);
    }

    public void execute(String cmdName) {
        Command command = commandMap.get(cmdName);
        if (command == null) {
            throw new IllegalStateException("No command registered for " + cmdName);
        }
        this.history.add(command); // optional
        command.execute();
    }


}
