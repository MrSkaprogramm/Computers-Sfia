package by.epam.tr.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXparser {
  final String filepath = "src/main/resources/Devices.xml";
  private StringBuffer SAXParserString = new StringBuffer();

  public String parse() throws ParserConfigurationException, SAXException, IOException {
    SAXParserFactory factory = SAXParserFactory.newInstance();
    SAXParser saxParser = factory.newSAXParser();

    DefaultHandler handler = new DefaultHandler() {
      private boolean origin = false;
      private boolean price = false;
      private boolean energyConsumption = false;
      private boolean type = false;
      private boolean critical = false;
      private boolean clockRate = false;
      private boolean capacity = false;
      private boolean coolingType = false;
      private boolean lights = false;
      private boolean formFactor = false;
      private boolean numOfButtons = false;
      private boolean powerRating = false;
      private boolean RAMType = false;
      private boolean size = false;
      private boolean soundPower = false;

      @Override
      public void startElement(String uri, String localName, String qName, Attributes attributes)
          throws SAXException {
        SAXParserString.append("Element " + qName + "\n" + uri);
        if (qName.equalsIgnoreCase("origin")) {
          origin = true;
        }
        if (qName.equalsIgnoreCase("price")) {
          price = true;
        }
        if (qName.equalsIgnoreCase("energyConsumption")) {
          energyConsumption = true;
        }
        if (qName.equalsIgnoreCase("type")) {
          type = true;
        }
        if (qName.equalsIgnoreCase("critical")) {
          critical = true;
        }
        if (qName.equalsIgnoreCase("clockRate")) {
          clockRate = true;
        }
        if (qName.equalsIgnoreCase("capacity")) {
          capacity = true;
        }
        if (qName.equalsIgnoreCase("coolingType")) {
          coolingType = true;
        }
        if (qName.equalsIgnoreCase("lights")) {
          lights = true;
        }
        if (qName.equalsIgnoreCase("formFactor")) {
          formFactor = true;
        }
        if (qName.equalsIgnoreCase("numOfButtons")) {
          numOfButtons = true;
        }
        if (qName.equalsIgnoreCase("powerRating")) {
          powerRating = true;
        }
        if (qName.equalsIgnoreCase("RAMType")) {
          RAMType = true;
        }
        if (qName.equalsIgnoreCase("size")) {
          size = true;
        }
        if (qName.equalsIgnoreCase("soundPower")) {
          soundPower = true;
        }
      }

      @Override
      public void characters(char ch[], int start, int length) throws SAXException {
        if (origin) {
          SAXParserString.append(
              "----------------------------" + "\n" + "origin " + new String(ch, start, length)
                  + "\n");
          origin = false;
        }
        if (price) {
          SAXParserString.append("price " + new String(ch, start, length) + "\n");
          price = false;
        }
        if (energyConsumption) {
          SAXParserString.append("energyConsumption " + new String(ch, start, length) + "\n");
          energyConsumption = false;
        }
        if (type) {
          SAXParserString.append("type " + new String(ch, start, length) + "\n");
          type = false;
        }
        if (critical) {
          SAXParserString.append("critical " + new String(ch, start, length) + "\n");
          critical = false;
        }
        if (clockRate) {
          SAXParserString.append("clockRate " + new String(ch, start, length) + "\n");
          clockRate = false;
        }
        if (capacity) {
          SAXParserString.append("capacity " + new String(ch, start, length) + "\n");
          capacity = false;
        }
        if (coolingType) {
          SAXParserString.append("coolingType " + new String(ch, start, length) + "\n");
          coolingType = false;
        }
        if (lights) {
          SAXParserString.append("lights " + new String(ch, start, length) + "\n");
          lights = false;
        }
        if (formFactor) {
          SAXParserString.append("formFactor " + new String(ch, start, length) + "\n");
          formFactor = false;
        }
        if (numOfButtons) {
          SAXParserString.append("numOfButtons " + new String(ch, start, length) + "\n");
          numOfButtons = false;
        }
        if (powerRating) {
          SAXParserString.append("powerRating " + new String(ch, start, length) + "\n");
          powerRating = false;
        }
        if (RAMType) {
          SAXParserString.append("RAMType " + new String(ch, start, length) + "\n");
          RAMType = false;
        }
        if (size) {
          SAXParserString.append("size " + new String(ch, start, length) + "\n");
          size = false;
        }
        if (soundPower) {
          SAXParserString.append("soundPower " + new String(ch, start, length) + "\n");
          soundPower = false;
        }
      }

      @Override
      public void endDocument() throws SAXException {
        super.endDocument();
        // System.out.println("End read document");
      }
    };

    InputStream devicesData = new FileInputStream(filepath);

    saxParser.parse(devicesData, handler);
    return SAXParserString.toString();
  }
}
