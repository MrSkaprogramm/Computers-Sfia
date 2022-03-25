package by.epam.tr.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
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

public class StAXparser {
  final String filepath = "src/main/resources/Devices.xml";
  private boolean cpuElement = false;
  private boolean dataStorageElement = false;
  private boolean heatSinkElement = false;
  private boolean keyboardElement = false;
  private boolean motherboardElement = false;
  private boolean mouseElement = false;
  private boolean powerSupplyElement = false;
  private boolean ramElement = false;
  private boolean screenElement = false;
  private boolean speakerElement = false;

  private boolean originElement = false;
  private boolean priceElement = false;
  private boolean energyConsumptionElement = false;
  private boolean typeElement = false;
  private boolean criticalElement = false;
  private boolean clockRateElement = false;
  private boolean capacityElement = false;
  private boolean coolingTypeElement = false;
  private boolean lightsElement = false;
  private boolean formFactorElement = false;
  private boolean numOfButtonsElement = false;
  private boolean powerRatingElement = false;
  private boolean RAMTypeElement = false;
  private boolean sizeElement = false;
  private boolean soundPowerElement = false;

  public Devices parse()
      throws FileNotFoundException, XMLStreamException, FactoryConfigurationError {
    XMLStreamReader xmlReader = XMLInputFactory.newInstance().createXMLStreamReader(filepath,
        new FileInputStream(filepath));

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

    StringBuffer StAXParserString = new StringBuffer();

    while (xmlReader.hasNext()) {
      xmlReader.next();
      if (xmlReader.isStartElement()) {
        if (xmlReader.getLocalName().equalsIgnoreCase("cpu")) {
          cpuElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("datastorage")) {
          cpuElement = false;
          dataStorageElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("heatsink")) {
          dataStorageElement = false;
          heatSinkElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("keyboard")) {
          heatSinkElement = false;
          keyboardElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("motherboard")) {
          keyboardElement = false;
          motherboardElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("mouse")) {
          motherboardElement = false;
          mouseElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("powersupply")) {
          mouseElement = false;
          powerSupplyElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("ram")) {
          powerSupplyElement = false;
          ramElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("screen")) {
          ramElement = false;
          screenElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("speaker")) {
          screenElement = false;
          speakerElement = true;



        } else if (xmlReader.getLocalName().equalsIgnoreCase("origin")) {
          originElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("price")) {
          originElement = false;
          priceElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("energyConsumption")) {
          priceElement = false;
          energyConsumptionElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("type")) {
          energyConsumptionElement = false;
          typeElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("critical")) {
          typeElement = false;
          criticalElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("clockRate")) {
          criticalElement = false;
          clockRateElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("capacity")) {
          capacityElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("coolingType")) {
          coolingTypeElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("lights")) {
          lightsElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("formFactor")) {
          formFactorElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("numOfButtons")) {
          numOfButtonsElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("powerRating")) {
          powerRatingElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("RAMType")) {
          RAMTypeElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("size")) {
          sizeElement = true;
        } else if (xmlReader.getLocalName().equalsIgnoreCase("soundPower")) {
          soundPowerElement = true;
        }
        StAXParserString.append("Category " + xmlReader.getLocalName() + ":\n");
      } else if (xmlReader.hasText() && xmlReader.getText().trim().length() > 0) {
        StAXParserString.append("Text " + xmlReader.getText() + "\n");
        if (cpuElement && originElement) {
          StAXParserString.append("JAVA BABY");
          cpuBuilder.setOrigin(xmlReader.getText());
        } else if (cpuElement && priceElement) {
          Double price = Double.valueOf(xmlReader.getText());
          cpuBuilder.setPrice(price);
        } else if (cpuElement && energyConsumptionElement) {
          Integer energyConsumption = Integer.valueOf(xmlReader.getText());
          cpuBuilder.setEnergyConsumption(energyConsumption);
        } else if (cpuElement && typeElement) {
          String cpuType = xmlReader.getText();
          if (cpuType.equalsIgnoreCase("MAIN")) {
            cpuBuilder.setType(Type.MAIN);
          } else if (cpuType.equalsIgnoreCase("MEMORY")) {
            cpuBuilder.setType(Type.MEMORY);
          } else if (cpuType.equalsIgnoreCase("PERIPHERAL")) {
            cpuBuilder.setType(Type.PERIPHERAL);
          }
        } else if (cpuElement && criticalElement) {
          Boolean critical = Boolean.valueOf(xmlReader.getText());
          cpuBuilder.setCritical(critical);
        } else if (cpuElement && clockRateElement) {
          Double clockRate = Double.valueOf(xmlReader.getText());
          cpuBuilder.setClockRate(clockRate);

          CPU cpu = cpuBuilder.buildCPU();
          cpuList.add(cpu);
          devices.setCpuList(cpuList);

        } else if (dataStorageElement && originElement) {
          dataStorageBuilder.setOrigin(xmlReader.getText());
        } else if (dataStorageElement && priceElement) {
          Double price = Double.valueOf(xmlReader.getText());
          dataStorageBuilder.setPrice(price);
        } else if (dataStorageElement && energyConsumptionElement) {
          Integer energyConsumption = Integer.valueOf(xmlReader.getText());
          dataStorageBuilder.setEnergyConsumption(energyConsumption);
        } else if (dataStorageElement && typeElement) {
          String dataStorageType = xmlReader.getText();
          if (dataStorageType.equalsIgnoreCase("MAIN")) {
            cpuBuilder.setType(Type.MAIN);
          } else if (dataStorageType.equalsIgnoreCase("MEMORY")) {
            cpuBuilder.setType(Type.MEMORY);
          } else if (dataStorageType.equalsIgnoreCase("PERIPHERAL")) {
            cpuBuilder.setType(Type.PERIPHERAL);
          }
        } else if (dataStorageElement && criticalElement) {
          Boolean critical = Boolean.valueOf(xmlReader.getText());
          dataStorageBuilder.setCritical(critical);
        } else if (dataStorageElement && capacityElement) {
          Integer capacity = Integer.valueOf(xmlReader.getText());
          dataStorageBuilder.setCapacity(capacity);

          DataStorage dataStorage = dataStorageBuilder.buildDataStorage();
          dataStorageList.add(dataStorage);
          devices.setDataStorageList(dataStorageList);

        } else if (heatSinkElement && originElement) {
          heatSinkBuilder.setOrigin(xmlReader.getText());
        } else if (heatSinkElement && priceElement) {
          Double price = Double.valueOf(xmlReader.getText());
          heatSinkBuilder.setPrice(price);
        } else if (heatSinkElement && energyConsumptionElement) {
          Integer energyConsumption = Integer.valueOf(xmlReader.getText());
          heatSinkBuilder.setEnergyConsumption(energyConsumption);
        } else if (heatSinkElement && typeElement) {
          String heatSinkType = xmlReader.getText();
          if (heatSinkType.equalsIgnoreCase("MAIN")) {
            heatSinkBuilder.setType(Type.MAIN);
          } else if (heatSinkType.equalsIgnoreCase("MEMORY")) {
            heatSinkBuilder.setType(Type.MEMORY);
          } else if (heatSinkType.equalsIgnoreCase("PERIPHERAL")) {
            heatSinkBuilder.setType(Type.PERIPHERAL);
          }
        } else if (heatSinkElement && criticalElement) {
          Boolean critical = Boolean.valueOf(xmlReader.getText());
          heatSinkBuilder.setCritical(critical);
        } else if (heatSinkElement && coolingTypeElement) {
          String coolingType = xmlReader.getText();
          heatSinkBuilder.setCoolingType(coolingType);

          HeatSink heatSink = heatSinkBuilder.buildHeatSink();
          heatSinkList.add(heatSink);
          devices.setDataStorageList(dataStorageList);
        } else if (keyboardElement && originElement) {
          keyboardBuilder.setOrigin(xmlReader.getText());
        } else if (keyboardElement && priceElement) {
          Double price = Double.valueOf(xmlReader.getText());
          keyboardBuilder.setPrice(price);
        } else if (keyboardElement && energyConsumptionElement) {
          Integer energyConsumption = Integer.valueOf(xmlReader.getText());
          keyboardBuilder.setEnergyConsumption(energyConsumption);
        } else if (keyboardElement && typeElement) {
          String keyboardType = xmlReader.getText();
          if (keyboardType.equalsIgnoreCase("MAIN")) {
            keyboardBuilder.setType(Type.MAIN);
          } else if (keyboardType.equalsIgnoreCase("MEMORY")) {
            keyboardBuilder.setType(Type.MEMORY);
          } else if (keyboardType.equalsIgnoreCase("PERIPHERAL")) {
            keyboardBuilder.setType(Type.PERIPHERAL);
          }
        } else if (keyboardElement && criticalElement) {
          Boolean critical = Boolean.valueOf(xmlReader.getText());
          keyboardBuilder.setCritical(critical);
        } else if (keyboardElement && lightsElement) {
          Boolean lights = Boolean.valueOf(xmlReader.getText());
          keyboardBuilder.setLights(lights);

          Keyboard keyboard = keyboardBuilder.buildKeyboard();
          keyboardList.add(keyboard);
          devices.setKeyboardList(keyboardList);
        } else if (motherboardElement && originElement) {
          motherboardBuilder.setOrigin(xmlReader.getText());
        } else if (motherboardElement && priceElement) {
          Double price = Double.valueOf(xmlReader.getText());
          motherboardBuilder.setPrice(price);
        } else if (motherboardElement && energyConsumptionElement) {
          Integer energyConsumption = Integer.valueOf(xmlReader.getText());
          motherboardBuilder.setEnergyConsumption(energyConsumption);
        } else if (motherboardElement && typeElement) {
          String motherboardType = xmlReader.getText();
          if (motherboardType.equalsIgnoreCase("MAIN")) {
            motherboardBuilder.setType(Type.MAIN);
          } else if (motherboardType.equalsIgnoreCase("MEMORY")) {
            motherboardBuilder.setType(Type.MEMORY);
          } else if (motherboardType.equalsIgnoreCase("PERIPHERAL")) {
            motherboardBuilder.setType(Type.PERIPHERAL);
          }
        } else if (motherboardElement && criticalElement) {
          Boolean critical = Boolean.valueOf(xmlReader.getText());
          motherboardBuilder.setCritical(critical);
        } else if (motherboardElement && formFactorElement) {
          String formFactor = xmlReader.getText();
          motherboardBuilder.setFormFactor(formFactor);

          Motherboard motherboard = motherboardBuilder.buildMotherboard();
          motherboardList.add(motherboard);
          devices.setMotherboardList(motherboardList);
        } else if (mouseElement && originElement) {
          mouseBuilder.setOrigin(xmlReader.getText());
        } else if (mouseElement && priceElement) {
          Double price = Double.valueOf(xmlReader.getText());
          mouseBuilder.setPrice(price);
        } else if (mouseElement && energyConsumptionElement) {
          Integer energyConsumption = Integer.valueOf(xmlReader.getText());
          mouseBuilder.setEnergyConsumption(energyConsumption);
        } else if (mouseElement && typeElement) {
          String mouseType = xmlReader.getText();
          if (mouseType.equalsIgnoreCase("MAIN")) {
            mouseBuilder.setType(Type.MAIN);
          } else if (mouseType.equalsIgnoreCase("MEMORY")) {
            mouseBuilder.setType(Type.MEMORY);
          } else if (mouseType.equalsIgnoreCase("PERIPHERAL")) {
            mouseBuilder.setType(Type.PERIPHERAL);
          }
        } else if (mouseElement && criticalElement) {
          Boolean critical = Boolean.valueOf(xmlReader.getText());
          mouseBuilder.setCritical(critical);
        } else if (mouseElement && numOfButtonsElement) {
          Integer numOfButtons = Integer.valueOf(xmlReader.getText());
          mouseBuilder.setNumOfButtons(numOfButtons);

          Mouse mouse = mouseBuilder.buildMouse();
          mouseList.add(mouse);
          devices.setMouseList(mouseList);
        } else if (powerSupplyElement && originElement) {
          powerSupplyBuilder.setOrigin(xmlReader.getText());
        } else if (powerSupplyElement && priceElement) {
          Double price = Double.valueOf(xmlReader.getText());
          powerSupplyBuilder.setPrice(price);
        } else if (powerSupplyElement && energyConsumptionElement) {
          Integer energyConsumption = Integer.valueOf(xmlReader.getText());
          powerSupplyBuilder.setEnergyConsumption(energyConsumption);
        } else if (powerSupplyElement && typeElement) {
          String powerSupplyType = xmlReader.getText();
          if (powerSupplyType.equalsIgnoreCase("MAIN")) {
            powerSupplyBuilder.setType(Type.MAIN);
          } else if (powerSupplyType.equalsIgnoreCase("MEMORY")) {
            powerSupplyBuilder.setType(Type.MEMORY);
          } else if (powerSupplyType.equalsIgnoreCase("PERIPHERAL")) {
            powerSupplyBuilder.setType(Type.PERIPHERAL);
          }
        } else if (powerSupplyElement && powerRatingElement) {
          Integer powerRating = Integer.valueOf(xmlReader.getText());
          powerSupplyBuilder.setPowerRating(powerRating);

          PowerSupply powerSupply = powerSupplyBuilder.buildPowerSupply();
          powerSupplyList.add(powerSupply);
          devices.setPowerSupplyList(powerSupplyList);
        } else if (ramElement && originElement) {
          ramBuilder.setOrigin(xmlReader.getText());
        } else if (ramElement && priceElement) {
          Double price = Double.valueOf(xmlReader.getText());
          ramBuilder.setPrice(price);
        } else if (ramElement && energyConsumptionElement) {
          Integer energyConsumption = Integer.valueOf(xmlReader.getText());
          ramBuilder.setEnergyConsumption(energyConsumption);
        } else if (ramElement && typeElement) {
          String ramType = xmlReader.getText();
          if (ramType.equalsIgnoreCase("MAIN")) {
            ramBuilder.setType(Type.MAIN);
          } else if (ramType.equalsIgnoreCase("MEMORY")) {
            ramBuilder.setType(Type.MEMORY);
          } else if (ramType.equalsIgnoreCase("PERIPHERAL")) {
            ramBuilder.setType(Type.PERIPHERAL);
          }
          } else if (ramElement && RAMTypeElement) {
          String RAMType = xmlReader.getText();
          ramBuilder.setRAMType(RAMType);

          RAM ram = ramBuilder.buildRAM();
          RAMList.add(ram);
          devices.setRAMList(RAMList);
        } else if (screenElement && originElement) {
          ramBuilder.setOrigin(xmlReader.getText());
        } else if (screenElement && priceElement) {
          Double price = Double.valueOf(xmlReader.getText());
          screenBuilder.setPrice(price);
        } else if (screenElement && energyConsumptionElement) {
          Integer energyConsumption = Integer.valueOf(xmlReader.getText());
          screenBuilder.setEnergyConsumption(energyConsumption);
        } else if (screenElement && typeElement) {
          String screenType = xmlReader.getText();
          if (screenType.equalsIgnoreCase("MAIN")) {
            screenBuilder.setType(Type.MAIN);
          } else if (screenType.equalsIgnoreCase("MEMORY")) {
            screenBuilder.setType(Type.MEMORY);
          } else if (screenType.equalsIgnoreCase("PERIPHERAL")) {
            screenBuilder.setType(Type.PERIPHERAL);
          }
        } else if (screenElement && sizeElement) {
          Integer size = Integer.valueOf(xmlReader.getText());
          screenBuilder.setSize(size);

          Screen screen = screenBuilder.buildScreen();
          screenList.add(screen);
          devices.setScreenList(screenList);
        } else if (speakerElement && originElement) {
          speakersBuilder.setOrigin(xmlReader.getText());
        } else if (speakerElement && priceElement) {
          Double price = Double.valueOf(xmlReader.getText());
          speakersBuilder.setPrice(price);
        } else if (speakerElement && energyConsumptionElement) {
          Integer energyConsumption = Integer.valueOf(xmlReader.getText());
          speakersBuilder.setEnergyConsumption(energyConsumption);
        } else if (speakerElement && typeElement) {
          String scrType = xmlReader.getText();
          if (scrType.equalsIgnoreCase("MAIN")) {
            speakersBuilder.setType(Type.MAIN);
          } else if (scrType.equalsIgnoreCase("MEMORY")) {
            speakersBuilder.setType(Type.MEMORY);
          } else if (scrType.equalsIgnoreCase("PERIPHERAL")) {
            speakersBuilder.setType(Type.PERIPHERAL);
          }
        } else if (speakerElement && soundPowerElement) {
          Integer soundPower = Integer.valueOf(xmlReader.getText());
          speakersBuilder.setSoundPower(soundPower);

          Speaker speaker = speakersBuilder.buildSpeaker();
          speakerList.add(speaker);
          devices.setSpeakerList(speakerList);
        }
      }
    }
    return devices;
  }
}
