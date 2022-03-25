package by.epam.tr.utils.builders;

import by.epam.tr.beans.PowerSupply;
import by.epam.tr.beans.Type;

public class PowerSupplyBuilder implements DeviceBuilder {
  PowerSupply psu = new PowerSupply();

  public void setEnergyConsumption(int energyConsumption) {
    psu.setEnergyConsumption(energyConsumption);

  }

  public void setType(Type type) {
    psu.setType(type);

  }

  public void setCritical(boolean critical) {
    psu.setCritical(critical);

  }

  public void setOrigin(String origin) {
    psu.setOrigin(origin);

  }

  public void setPrice(double price) {
    psu.setPrice(price);

  }

  public void setPowerRating(int powerRating) {
    psu.setPowerRating(powerRating);
  }

  public PowerSupply buildPowerSupply() {
    return psu;
  }
}
