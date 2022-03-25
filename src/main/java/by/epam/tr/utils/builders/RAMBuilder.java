package by.epam.tr.utils.builders;

import by.epam.tr.beans.RAM;
import by.epam.tr.beans.Type;

public class RAMBuilder implements DeviceBuilder {
  RAM ram = new RAM();

  public void setEnergyConsumption(int energyConsumption) {
    ram.setEnergyConsumption(energyConsumption);

  }

  public void setType(Type type) {
    ram.setType(type);

  }

  public void setCritical(boolean critical) {
    ram.setCritical(critical);

  }

  public void setOrigin(String origin) {
    ram.setOrigin(origin);

  }

  public void setPrice(double price) {
    ram.setPrice(price);

  }

  public void setRAMType(String ramType) {
    ram.setRAMType(ramType);
  }

  public RAM buildRAM() {
    return ram;
  }
}
