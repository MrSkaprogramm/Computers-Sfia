package by.epam.tr.controller;

import java.util.HashMap;
import java.util.Map;
import by.epam.tr.controller.impl.DOMParseCommand;
import by.epam.tr.controller.impl.JAXBReadCommand;
import by.epam.tr.controller.impl.SAXParseCommand;
import by.epam.tr.controller.impl.StAXParseCommand;

public class CommandProvider {
  private Map<String, Command> commands = new HashMap<String, Command>();

  public CommandProvider() {
    commands.put("DOMParse", new DOMParseCommand());
    commands.put("SAXParse", new SAXParseCommand());
    commands.put("StAXParse", new StAXParseCommand());
    commands.put("JAXBRead", new JAXBReadCommand());
  }

  public Command getCommand(String commandName) {
    Command command = commands.get(commandName);

    return command;
  }
}
