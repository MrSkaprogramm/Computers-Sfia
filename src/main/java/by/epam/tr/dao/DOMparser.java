package by.epam.tr.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import by.epam.tr.beans.CPU;
import by.epam.tr.beans.DataStorage;
import by.epam.tr.beans.Devices;
import by.epam.tr.beans.HeatSink;
import by.epam.tr.beans.Keyboard;
import by.epam.tr.beans.Motherboard;
import by.epam.tr.beans.Mouse;
import by.epam.tr.beans.PowerSupply;
import by.epam.tr.beans.RAM;
import by.epam.tr.beans.Screen;
import by.epam.tr.beans.Speaker;
import by.epam.tr.beans.Type;
import by.epam.tr.utils.builders.CPUBuilder;
import by.epam.tr.utils.builders.DataStorageBuilder;
import by.epam.tr.utils.builders.HeatSinkBuilder;
import by.epam.tr.utils.builders.KeyboardBuilder;
import by.epam.tr.utils.builders.MotherboardBuilder;
import by.epam.tr.utils.builders.MouseBuilder;
import by.epam.tr.utils.builders.PowerSupplyBuilder;
import by.epam.tr.utils.builders.RAMBuilder;
import by.epam.tr.utils.builders.ScreenBuilder;
import by.epam.tr.utils.builders.SpeakersBuilder;

public class DOMparser {
  public Devices parse() throws ParserConfigurationException, SAXException, IOException {
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

    DocumentBuilder dbuilder = dbFactory.newDocumentBuilder();
    File file = new File("src/main/resources/Devices.xml");
    Document doc = dbuilder.parse(file);
    NodeList nodeList;
    
    Devices devices = new Devices();

    ArrayList<CPU> cpuList = new ArrayList<CPU>();
    ArrayList<DataStorage> dataStorageList = new ArrayList<DataStorage>();
    ArrayList<HeatSink> heatSinkList = new ArrayList<HeatSink>();
    ArrayList<Keyboard> keyboardList = new ArrayList<Keyboard>();
    ArrayList<Motherboard> motherboardList = new ArrayList<Motherboard>();
    ArrayList<Mouse> mouseList = new ArrayList<Mouse>();
    ArrayList<PowerSupply> powerSupplyList = new ArrayList<PowerSupply>();
    ArrayList<RAM> RAMList = new ArrayList<RAM>();
    ArrayList<Screen> screenList = new ArrayList<Screen>();
    ArrayList<Speaker> speakerList = new ArrayList<Speaker>();

    CPUBuilder cpuBuilder = new CPUBuilder();
    DataStorageBuilder dataStorageBuilder = new DataStorageBuilder();
    HeatSinkBuilder heatSinkBuilder = new HeatSinkBuilder();
    KeyboardBuilder keyboardBuilder = new KeyboardBuilder();
    MotherboardBuilder motherboardBuilder = new MotherboardBuilder();
    MouseBuilder mouseBuilder = new MouseBuilder();
    PowerSupplyBuilder powerSupplyBuilder = new PowerSupplyBuilder();
    RAMBuilder ramBuilder = new RAMBuilder();
    ScreenBuilder screenBuilder = new ScreenBuilder();
    SpeakersBuilder speakersBuilder = new SpeakersBuilder();

    nodeList = doc.getElementsByTagName("cpu");
    
    for (int i = 0; i < nodeList.getLength(); i++) {
      Node node = nodeList.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        Element element = (Element) node;

        String origin = element.getElementsByTagName("origin").item(0).getTextContent();
        Double price = Double.valueOf(element.getElementsByTagName("price").item(0).getTextContent());
        Integer energyConsumption = Integer.valueOf(element.getElementsByTagName("energyConsumption").item(0).getTextContent());
        Boolean critical = Boolean.valueOf(element.getElementsByTagName("critical").item(0).getTextContent());
        Double clockRate =
            Double.valueOf(element.getElementsByTagName("clockRate").item(0).getTextContent());
        
        cpuBuilder.setOrigin(origin);
        cpuBuilder.setPrice(price);
        cpuBuilder.setEnergyConsumption(energyConsumption);
        cpuBuilder.setCritical(critical);
        cpuBuilder.setClockRate(clockRate);
        
        String cpuType = element.getElementsByTagName("type").item(0).getTextContent();
        if (cpuType.equalsIgnoreCase("MAIN")) {
          cpuBuilder.setType(Type.MAIN);
        } else if (cpuType.equalsIgnoreCase("MEMORY")) {
          cpuBuilder.setType(Type.MEMORY);
        } else if (cpuType.equalsIgnoreCase("PERIPHERAL")) {
          cpuBuilder.setType(Type.PERIPHERAL);
        }

        CPU cpu = cpuBuilder.buildCPU();
        cpuList.add(cpu);
      }
    }
    devices.setCpuList(cpuList);
    
    nodeList = doc.getElementsByTagName("datastorage");

    for (int i = 0; i < nodeList.getLength(); i++) {
      Node node = nodeList.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        Element element = (Element) node;

        String origin = element.getElementsByTagName("origin").item(0).getTextContent();
        Double price =
            Double.valueOf(element.getElementsByTagName("price").item(0).getTextContent());
        Integer energyConsumption = Integer
            .valueOf(element.getElementsByTagName("energyConsumption").item(0).getTextContent());
        Boolean critical =
            Boolean.valueOf(element.getElementsByTagName("critical").item(0).getTextContent());
        Integer capacity =
            Integer.valueOf(element.getElementsByTagName("capacity").item(0).getTextContent());

        dataStorageBuilder.setOrigin(origin);
        dataStorageBuilder.setPrice(price);
        dataStorageBuilder.setEnergyConsumption(energyConsumption);
        dataStorageBuilder.setCritical(critical);
        dataStorageBuilder.setCapacity(capacity);

        String dataStorageType = element.getElementsByTagName("type").item(0).getTextContent();
        if (dataStorageType.equalsIgnoreCase("MAIN")) {
          cpuBuilder.setType(Type.MAIN);
        } else if (dataStorageType.equalsIgnoreCase("MEMORY")) {
          cpuBuilder.setType(Type.MEMORY);
        } else if (dataStorageType.equalsIgnoreCase("PERIPHERAL")) {
          cpuBuilder.setType(Type.PERIPHERAL);
        }

        DataStorage dataStorage = dataStorageBuilder.buildDataStorage();
        dataStorageList.add(dataStorage);
      }
    }
    devices.setDataStorageList(dataStorageList);

    nodeList = doc.getElementsByTagName("heatsink");

    for (int i = 0; i < nodeList.getLength(); i++) {
      Node node = nodeList.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        Element element = (Element) node;

        String origin = element.getElementsByTagName("origin").item(0).getTextContent();
        Double price =
            Double.valueOf(element.getElementsByTagName("price").item(0).getTextContent());
        Integer energyConsumption = Integer
            .valueOf(element.getElementsByTagName("energyConsumption").item(0).getTextContent());
        Boolean critical =
            Boolean.valueOf(element.getElementsByTagName("critical").item(0).getTextContent());
        String coolingType = element.getElementsByTagName("coolingType").item(0).getTextContent();

        heatSinkBuilder.setOrigin(origin);
        heatSinkBuilder.setPrice(price);
        heatSinkBuilder.setEnergyConsumption(energyConsumption);
        heatSinkBuilder.setCritical(critical);
        heatSinkBuilder.setCoolingType(coolingType);

        String heatSinkType = element.getElementsByTagName("type").item(0).getTextContent();
        if (heatSinkType.equalsIgnoreCase("MAIN")) {
          cpuBuilder.setType(Type.MAIN);
        } else if (heatSinkType.equalsIgnoreCase("MEMORY")) {
          cpuBuilder.setType(Type.MEMORY);
        } else if (heatSinkType.equalsIgnoreCase("PERIPHERAL")) {
          cpuBuilder.setType(Type.PERIPHERAL);
        }

        HeatSink heatSink = heatSinkBuilder.buildHeatSink();
        heatSinkList.add(heatSink);
      }
    }
    devices.setHeatSinkList(heatSinkList);

    nodeList = doc.getElementsByTagName("keyboard");

    for (int i = 0; i < nodeList.getLength(); i++) {
      Node node = nodeList.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        Element element = (Element) node;

        String origin = element.getElementsByTagName("origin").item(0).getTextContent();
        Double price =
            Double.valueOf(element.getElementsByTagName("price").item(0).getTextContent());
        Integer energyConsumption = Integer
            .valueOf(element.getElementsByTagName("energyConsumption").item(0).getTextContent());
        Boolean critical =
            Boolean.valueOf(element.getElementsByTagName("critical").item(0).getTextContent());
        Boolean lights =
            Boolean.valueOf(element.getElementsByTagName("lights").item(0).getTextContent());

        keyboardBuilder.setOrigin(origin);
        keyboardBuilder.setPrice(price);
        keyboardBuilder.setEnergyConsumption(energyConsumption);
        keyboardBuilder.setCritical(critical);
        keyboardBuilder.setLights(lights);

        String keyboardType = element.getElementsByTagName("type").item(0).getTextContent();
        if (keyboardType.equalsIgnoreCase("MAIN")) {
          cpuBuilder.setType(Type.MAIN);
        } else if (keyboardType.equalsIgnoreCase("MEMORY")) {
          cpuBuilder.setType(Type.MEMORY);
        } else if (keyboardType.equalsIgnoreCase("PERIPHERAL")) {
          cpuBuilder.setType(Type.PERIPHERAL);
        }

        Keyboard keyboard = keyboardBuilder.buildKeyboard();
        keyboardList.add(keyboard);
      }
    }
    devices.setKeyboardList(keyboardList);

    nodeList = doc.getElementsByTagName("motherboard");

    for (int i = 0; i < nodeList.getLength(); i++) {
      Node node = nodeList.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        Element element = (Element) node;

        String origin = element.getElementsByTagName("origin").item(0).getTextContent();
        Double price =
            Double.valueOf(element.getElementsByTagName("price").item(0).getTextContent());
        Integer energyConsumption = Integer
            .valueOf(element.getElementsByTagName("energyConsumption").item(0).getTextContent());
        Boolean critical =
            Boolean.valueOf(element.getElementsByTagName("critical").item(0).getTextContent());
        String formFactor = element.getElementsByTagName("formFactor").item(0).getTextContent();

        motherboardBuilder.setOrigin(origin);
        motherboardBuilder.setPrice(price);
        motherboardBuilder.setEnergyConsumption(energyConsumption);
        motherboardBuilder.setCritical(critical);
        motherboardBuilder.setFormFactor(formFactor);

        String motherboardType = element.getElementsByTagName("type").item(0).getTextContent();
        if (motherboardType.equalsIgnoreCase("MAIN")) {
          cpuBuilder.setType(Type.MAIN);
        } else if (motherboardType.equalsIgnoreCase("MEMORY")) {
          cpuBuilder.setType(Type.MEMORY);
        } else if (motherboardType.equalsIgnoreCase("PERIPHERAL")) {
          cpuBuilder.setType(Type.PERIPHERAL);
        }

        Motherboard motherboard = motherboardBuilder.buildMotherboard();
        motherboardList.add(motherboard);
      }
    }
    devices.setMotherboardList(motherboardList);

    nodeList = doc.getElementsByTagName("mouse");

    for (int i = 0; i < nodeList.getLength(); i++) {
      Node node = nodeList.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        Element element = (Element) node;

        String origin = element.getElementsByTagName("origin").item(0).getTextContent();
        Double price =
            Double.valueOf(element.getElementsByTagName("price").item(0).getTextContent());
        Integer energyConsumption = Integer
            .valueOf(element.getElementsByTagName("energyConsumption").item(0).getTextContent());
        Boolean critical =
            Boolean.valueOf(element.getElementsByTagName("critical").item(0).getTextContent());
        Integer numOfButtons =
            Integer.valueOf(element.getElementsByTagName("numOfButtons").item(0).getTextContent());

        mouseBuilder.setOrigin(origin);
        mouseBuilder.setPrice(price);
        mouseBuilder.setEnergyConsumption(energyConsumption);
        mouseBuilder.setCritical(critical);
        mouseBuilder.setNumOfButtons(numOfButtons);

        String mouseType = element.getElementsByTagName("type").item(0).getTextContent();
        if (mouseType.equalsIgnoreCase("MAIN")) {
          cpuBuilder.setType(Type.MAIN);
        } else if (mouseType.equalsIgnoreCase("MEMORY")) {
          cpuBuilder.setType(Type.MEMORY);
        } else if (mouseType.equalsIgnoreCase("PERIPHERAL")) {
          cpuBuilder.setType(Type.PERIPHERAL);
        }

        Mouse mouse = mouseBuilder.buildMouse();
        mouseList.add(mouse);
      }
    }
    devices.setMouseList(mouseList);

    nodeList = doc.getElementsByTagName("powersupply");

    for (int i = 0; i < nodeList.getLength(); i++) {
      Node node = nodeList.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        Element element = (Element) node;

        String origin = element.getElementsByTagName("origin").item(0).getTextContent();
        Double price =
            Double.valueOf(element.getElementsByTagName("price").item(0).getTextContent());
        Integer energyConsumption = Integer
            .valueOf(element.getElementsByTagName("energyConsumption").item(0).getTextContent());
        Boolean critical =
            Boolean.valueOf(element.getElementsByTagName("critical").item(0).getTextContent());
        Integer powerRating =
            Integer.valueOf(element.getElementsByTagName("powerRating").item(0).getTextContent());

        powerSupplyBuilder.setOrigin(origin);
        powerSupplyBuilder.setPrice(price);
        powerSupplyBuilder.setEnergyConsumption(energyConsumption);
        powerSupplyBuilder.setCritical(critical);
        powerSupplyBuilder.setPowerRating(powerRating);

        String powerSupplyType = element.getElementsByTagName("type").item(0).getTextContent();
        if (powerSupplyType.equalsIgnoreCase("MAIN")) {
          cpuBuilder.setType(Type.MAIN);
        } else if (powerSupplyType.equalsIgnoreCase("MEMORY")) {
          cpuBuilder.setType(Type.MEMORY);
        } else if (powerSupplyType.equalsIgnoreCase("PERIPHERAL")) {
          cpuBuilder.setType(Type.PERIPHERAL);
        }

        PowerSupply powerSupply = powerSupplyBuilder.buildPowerSupply();
        powerSupplyList.add(powerSupply);
      }
    }
    devices.setPowerSupplyList(powerSupplyList);

    nodeList = doc.getElementsByTagName("ram");

    for (int i = 0; i < nodeList.getLength(); i++) {
      Node node = nodeList.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        Element element = (Element) node;

        String origin = element.getElementsByTagName("origin").item(0).getTextContent();
        Double price =
            Double.valueOf(element.getElementsByTagName("price").item(0).getTextContent());
        Integer energyConsumption = Integer
            .valueOf(element.getElementsByTagName("energyConsumption").item(0).getTextContent());
        Boolean critical =
            Boolean.valueOf(element.getElementsByTagName("critical").item(0).getTextContent());
        String ramType = element.getElementsByTagName("RAMType").item(0).getTextContent();

        ramBuilder.setOrigin(origin);
        ramBuilder.setPrice(price);
        ramBuilder.setEnergyConsumption(energyConsumption);
        ramBuilder.setCritical(critical);
        ramBuilder.setRAMType(ramType);

        String RAMType = element.getElementsByTagName("type").item(0).getTextContent();
        if (RAMType.equalsIgnoreCase("MAIN")) {
          cpuBuilder.setType(Type.MAIN);
        } else if (RAMType.equalsIgnoreCase("MEMORY")) {
          cpuBuilder.setType(Type.MEMORY);
        } else if (RAMType.equalsIgnoreCase("PERIPHERAL")) {
          cpuBuilder.setType(Type.PERIPHERAL);
        }

        RAM ram = ramBuilder.buildRAM();
        RAMList.add(ram);
      }
    }
    devices.setRAMList(RAMList);

    nodeList = doc.getElementsByTagName("screen");

    for (int i = 0; i < nodeList.getLength(); i++) {
      Node node = nodeList.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        Element element = (Element) node;

        String origin = element.getElementsByTagName("origin").item(0).getTextContent();
        Double price =
            Double.valueOf(element.getElementsByTagName("price").item(0).getTextContent());
        Integer energyConsumption = Integer
            .valueOf(element.getElementsByTagName("energyConsumption").item(0).getTextContent());
        Boolean critical =
            Boolean.valueOf(element.getElementsByTagName("critical").item(0).getTextContent());
        Integer size =
            Integer.valueOf(element.getElementsByTagName("size").item(0).getTextContent());

        screenBuilder.setOrigin(origin);
        screenBuilder.setPrice(price);
        screenBuilder.setEnergyConsumption(energyConsumption);
        screenBuilder.setCritical(critical);
        screenBuilder.setSize(size);

        String screenType = element.getElementsByTagName("type").item(0).getTextContent();
        if (screenType.equalsIgnoreCase("MAIN")) {
          cpuBuilder.setType(Type.MAIN);
        } else if (screenType.equalsIgnoreCase("MEMORY")) {
          cpuBuilder.setType(Type.MEMORY);
        } else if (screenType.equalsIgnoreCase("PERIPHERAL")) {
          cpuBuilder.setType(Type.PERIPHERAL);
        }

        Screen screen = screenBuilder.buildScreen();
        screenList.add(screen);
      }
    }
    devices.setScreenList(screenList);

    nodeList = doc.getElementsByTagName("speaker");

    for (int i = 0; i < nodeList.getLength(); i++) {
      Node node = nodeList.item(i);
      if (node.getNodeType() == Node.ELEMENT_NODE) {
        Element element = (Element) node;

        String origin = element.getElementsByTagName("origin").item(0).getTextContent();
        Double price =
            Double.valueOf(element.getElementsByTagName("price").item(0).getTextContent());
        Integer energyConsumption = Integer
            .valueOf(element.getElementsByTagName("energyConsumption").item(0).getTextContent());
        Boolean critical =
            Boolean.valueOf(element.getElementsByTagName("critical").item(0).getTextContent());
        Integer soundPower =
            Integer.valueOf(element.getElementsByTagName("soundPower").item(0).getTextContent());

        speakersBuilder.setOrigin(origin);
        speakersBuilder.setPrice(price);
        speakersBuilder.setEnergyConsumption(energyConsumption);
        speakersBuilder.setCritical(critical);
        speakersBuilder.setSoundPower(soundPower);

        String speakerType = element.getElementsByTagName("type").item(0).getTextContent();
        if (speakerType.equalsIgnoreCase("MAIN")) {
          cpuBuilder.setType(Type.MAIN);
        } else if (speakerType.equalsIgnoreCase("MEMORY")) {
          cpuBuilder.setType(Type.MEMORY);
        } else if (speakerType.equalsIgnoreCase("PERIPHERAL")) {
          cpuBuilder.setType(Type.PERIPHERAL);
        }

        Speaker speaker = speakersBuilder.buildSpeaker();
        speakerList.add(speaker);
      }
    }
    devices.setSpeakerList(speakerList);

    return devices;
  }
}
