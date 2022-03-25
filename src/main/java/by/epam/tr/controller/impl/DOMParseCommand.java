package by.epam.tr.controller.impl;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import by.epam.tr.controller.Command;
import by.epam.tr.service.DOMService;

public class DOMParseCommand implements Command {

  public String execute(String[] requestParts) {
    DOMService domService = new DOMService();

    String response = null;
    try {
      response = domService.viewDOMObjects();
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
