package by.epam.tr.dao;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import by.epam.tr.beans.Devices;

public class JAXBReader {
  public Devices unmarshall() throws JAXBException {
    final String filepath = "src/main/resources/Devices.xml";
    File file = new File(filepath);

    JAXBContext context = JAXBContext.newInstance(Devices.class);
    Unmarshaller unmarshaller = context.createUnmarshaller();

    Devices devices = (Devices) unmarshaller.unmarshal(file);

    return devices;
  }
}
