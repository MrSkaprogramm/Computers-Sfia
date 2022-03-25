package by.epam.tr.utils.builders;

import by.epam.tr.beans.Screen;
import by.epam.tr.beans.Type;

public class ScreenBuilder implements DeviceBuilder {
  Screen screen = new Screen();

  public void setEnergyConsumption(int energyConsumption) {
    screen.setEnergyConsumption(energyConsumption);

  }

  public void setType(Type type) {
    screen.setType(type);

  }

  public void setCritical(boolean critical) {
    screen.setCritical(critical);

  }

  public void setOrigin(String origin) {
    screen.setOrigin(origin);

  }

  public void setPrice(double price) {
    screen.setPrice(price);

  }

  public void setSize(int size) {
    screen.setSize(size);
  }

  public Screen buildScreen() {
    return screen;
  }
}
