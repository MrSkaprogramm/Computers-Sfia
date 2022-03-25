package by.epam.tr.utils.builders;

import by.epam.tr.beans.Mouse;
import by.epam.tr.beans.Type;

public class MouseBuilder implements DeviceBuilder {
  Mouse mouse = new Mouse();

  public void setEnergyConsumption(int energyConsumption) {
    mouse.setEnergyConsumption(energyConsumption);

  }

  public void setType(Type type) {
    mouse.setType(type);

  }

  public void setCritical(boolean critical) {
    mouse.setCritical(critical);

  }

  public void setOrigin(String origin) {
    mouse.setOrigin(origin);

  }

  public void setPrice(double price) {
    mouse.setPrice(price);

  }

  public void setNumOfButtons(int numOfButtons) {
    mouse.setNumOfButtons(numOfButtons);
  }

  public Mouse buildMouse() {
    return mouse;
  }
}
