package by.epam.tr.service;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
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
import by.epam.tr.dao.DOMparser;

public class DOMService {
  DOMparser domParser = new DOMparser();

  public String viewDOMObjects() throws ParserConfigurationException, SAXException, IOException {
    Devices devices = domParser.parse();
    StringBuffer DOMParserString = new StringBuffer();

    for (CPU cpu : devices.getCpuList()) {
      DOMParserString.append(cpu.getClass().getSimpleName() + "\n");
      DOMParserString.append(cpu.getOrigin() + "\n");
      DOMParserString.append(cpu.getPrice() + "\n");
      DOMParserString.append(cpu.getType() + "\n");
      DOMParserString.append(cpu.getEnergyConsumption() + "\n");
      DOMParserString.append(cpu.getClockRate() + "\n");
      DOMParserString.append(cpu.isCritical() + "\n");
      DOMParserString.append("----------------------------" + "\n");
    }

    for (DataStorage dataStorage : devices.getDataStorageList()) {
      DOMParserString.append(dataStorage.getClass().getSimpleName() + "\n");
      DOMParserString.append(dataStorage.getOrigin() + "\n");
      DOMParserString.append(dataStorage.getPrice() + "\n");
      DOMParserString.append(dataStorage.getType() + "\n");
      DOMParserString.append(dataStorage.getEnergyConsumption() + "\n");
      DOMParserString.append(dataStorage.getCapacity() + "\n");
      DOMParserString.append(dataStorage.isCritical() + "\n");
      DOMParserString.append("----------------------------" + "\n");
    }

    for (HeatSink heatsink : devices.getHeatSinkList()) {
      DOMParserString.append(heatsink.getClass().getSimpleName() + "\n");
      DOMParserString.append(heatsink.getOrigin() + "\n");
      DOMParserString.append(heatsink.getPrice() + "\n");
      DOMParserString.append(heatsink.getType() + "\n");
      DOMParserString.append(heatsink.getEnergyConsumption() + "\n");
      DOMParserString.append(heatsink.getCoolingType());
      DOMParserString.append(heatsink.isCritical() + "\n");
      DOMParserString.append("----------------------------" + "\n");
    }

    for (Keyboard keyboard : devices.getKeyboardList()) {
      DOMParserString.append(keyboard.getClass().getSimpleName() + "\n");
      DOMParserString.append(keyboard.getOrigin() + "\n");
      DOMParserString.append(keyboard.getPrice() + "\n");
      DOMParserString.append(keyboard.getType() + "\n");
      DOMParserString.append(keyboard.getEnergyConsumption() + "\n");
      DOMParserString.append(keyboard.isLights() + "\n");
      DOMParserString.append(keyboard.isCritical() + "\n");
      DOMParserString.append("----------------------------" + "\n");
    }

    for (Motherboard motherboard : devices.getMotherboardList()) {
      DOMParserString.append(motherboard.getClass().getSimpleName() + "\n");
      DOMParserString.append(motherboard.getOrigin() + "\n");
      DOMParserString.append(motherboard.getPrice() + "\n");
      DOMParserString.append(motherboard.getType() + "\n");
      DOMParserString.append(motherboard.getEnergyConsumption() + "\n");
      DOMParserString.append(motherboard.getFormFactor() + "\n");
      DOMParserString.append(motherboard.isCritical() + "\n");
      DOMParserString.append("----------------------------" + "\n");
    }

    for (Mouse mouse : devices.getMouseList()) {
      DOMParserString.append(mouse.getClass().getSimpleName() + "\n");
      DOMParserString.append(mouse.getOrigin() + "\n");
      DOMParserString.append(mouse.getPrice() + "\n");
      DOMParserString.append(mouse.getType() + "\n");
      DOMParserString.append(mouse.getEnergyConsumption() + "\n");
      DOMParserString.append(mouse.getNumOfButtons() + "\n");
      DOMParserString.append(mouse.isCritical() + "\n");
      DOMParserString.append("----------------------------" + "\n");
    }

    for (PowerSupply powersupply : devices.getPowerSupplyList()) {
      DOMParserString.append(powersupply.getClass().getSimpleName() + "\n");
      DOMParserString.append(powersupply.getOrigin() + "\n");
      DOMParserString.append(powersupply.getPrice() + "\n");
      DOMParserString.append(powersupply.getType() + "\n");
      DOMParserString.append(powersupply.getEnergyConsumption() + "\n");
      DOMParserString.append(powersupply.getPowerRating() + "\n");
      DOMParserString.append(powersupply.isCritical() + "\n");
      DOMParserString.append("----------------------------" + "\n");
    }

    for (RAM ram : devices.getRAMList()) {
      DOMParserString.append(ram.getClass().getSimpleName() + "\n");
      DOMParserString.append(ram.getOrigin() + "\n");
      DOMParserString.append(ram.getPrice() + "\n");
      DOMParserString.append(ram.getType() + "\n");
      DOMParserString.append(ram.getEnergyConsumption() + "\n");
      DOMParserString.append(ram.getRAMType() + "\n");
      DOMParserString.append(ram.isCritical() + "\n");
      DOMParserString.append("----------------------------" + "\n");
    }

    for (Screen screen : devices.getScreenList()) {
      DOMParserString.append(screen.getClass().getSimpleName() + "\n");
      DOMParserString.append(screen.getOrigin() + "\n");
      DOMParserString.append(screen.getPrice() + "\n");
      DOMParserString.append(screen.getType() + "\n");
      DOMParserString.append(screen.getEnergyConsumption() + "\n");
      DOMParserString.append(screen.getSize() + "\n");
      DOMParserString.append(screen.isCritical() + "\n");
      DOMParserString.append("----------------------------" + "\n");
    }

    for (Speaker speaker : devices.getSpeakerList()) {
      DOMParserString.append(speaker.getClass().getSimpleName() + "\n");
      DOMParserString.append(speaker.getOrigin() + "\n");
      DOMParserString.append(speaker.getPrice() + "\n");
      DOMParserString.append(speaker.getType() + "\n");
      DOMParserString.append(speaker.getEnergyConsumption() + "\n");
      DOMParserString.append(speaker.getSoundPower() + "\n");
      DOMParserString.append(speaker.isCritical() + "\n");
      DOMParserString.append("----------------------------" + "\n");
    }
    return DOMParserString.toString();
  }
}
