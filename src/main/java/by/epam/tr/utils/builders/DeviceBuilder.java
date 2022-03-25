package by.epam.tr.utils.builders;

import by.epam.tr.beans.Type;

public interface DeviceBuilder {
  public void setEnergyConsumption(int energyConsumption);

  public void setType(Type type);

  public void setCritical(boolean critical);

  public void setOrigin(String origin);

  public void setPrice(double price);
}
