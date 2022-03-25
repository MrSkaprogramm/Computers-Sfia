package by.epam.tr.controller.impl;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import by.epam.tr.controller.Command;
import by.epam.tr.service.SAXService;

public class SAXParseCommand implements Command {

  public String execute(String[] requestParts) {
    SAXService saxService = new SAXService();
    String response = null;

    try {
      response = saxService.viewSAXObjects();
    } catch (ParserConfigurationException e) {
      e.printStackTrace();
    } catch (SAXException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return response;
  }

}
