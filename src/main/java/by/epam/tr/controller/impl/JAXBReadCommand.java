package by.epam.tr.controller.impl;

import javax.xml.bind.JAXBException;
import by.epam.tr.controller.Command;
import by.epam.tr.service.JAXBService;

public class JAXBReadCommand implements Command {

  public String execute(String[] requestParts) {
    JAXBService jaxbReader = new JAXBService();
    String response = null;

    try {
      response = jaxbReader.viewJAXBObjects();
    } catch (JAXBException e) {
      e.printStackTrace();
    }
    return response;
  }

}
