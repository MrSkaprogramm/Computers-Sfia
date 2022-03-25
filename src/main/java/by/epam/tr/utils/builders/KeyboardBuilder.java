package by.epam.tr.utils.builders;

import by.epam.tr.beans.Keyboard;
import by.epam.tr.beans.Type;

public class KeyboardBuilder implements DeviceBuilder {
  Keyboard keyboard = new Keyboard();

  public void setEnergyConsumption(int energyConsumption) {
    keyboard.setEnergyConsumption(energyConsumption);

  }

  public void setType(Type type) {
    keyboard.setType(type);

  }

  public void setCritical(boolean critical) {
    keyboard.setCritical(critical);

  }

  public void setOrigin(String origin) {
    keyboard.setOrigin(origin);

  }

  public void setPrice(double price) {
    keyboard.setPrice(price);

  }

  public void setLights(boolean lights) {
    keyboard.setLights(lights);
  }

  public Keyboard buildKeyboard() {
    return keyboard;
  }

}
