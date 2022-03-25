package by.epam.tr.controller.impl;

import java.io.FileNotFoundException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;
import by.epam.tr.controller.Command;
import by.epam.tr.service.StAXService;

public class StAXParseCommand implements Command {

  public String execute(String[] requestParts) {
    StAXService staxService = new StAXService();
    String response = null;

    try {
      response = staxService.viewStAXObjects();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (XMLStreamException e) {
      e.printStackTrace();
    } catch (FactoryConfigurationError e) {
      e.printStackTrace();
    }

    return response;
  }

}
