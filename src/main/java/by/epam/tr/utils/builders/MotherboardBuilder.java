package by.epam.tr.utils.builders;

import by.epam.tr.beans.Motherboard;
import by.epam.tr.beans.Type;

public class MotherboardBuilder implements DeviceBuilder {
  Motherboard motherboard = new Motherboard();

  public void setEnergyConsumption(int energyConsumption) {
    motherboard.setEnergyConsumption(energyConsumption);

  }

  public void setType(Type type) {
    motherboard.setType(type);

  }

  public void setCritical(boolean critical) {
    motherboard.setCritical(critical);

  }

  public void setOrigin(String origin) {
    motherboard.setOrigin(origin);

  }

  public void setPrice(double price) {
    motherboard.setPrice(price);

  }

  public void setFormFactor(String formFactor) {
    motherboard.setFormFactor(formFactor);
  }

  public Motherboard buildMotherboard() {
    return motherboard;
  }
}
