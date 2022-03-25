package by.epam.tr.utils.builders;

import by.epam.tr.beans.HeatSink;
import by.epam.tr.beans.Type;

public class HeatSinkBuilder implements DeviceBuilder {
  HeatSink heatSink = new HeatSink();

  public void setEnergyConsumption(int energyConsumption) {
    heatSink.setEnergyConsumption(energyConsumption);

  }

  public void setType(Type type) {
    heatSink.setType(type);

  }

  public void setCritical(boolean critical) {
    heatSink.setCritical(critical);

  }

  public void setOrigin(String origin) {
    heatSink.setOrigin(origin);

  }

  public void setPrice(double price) {
    heatSink.setPrice(price);

  }

  public void setCoolingType(String coolingType) {
    heatSink.setCoolingType(coolingType);
  }

  public HeatSink buildHeatSink() {
    return heatSink;
  }
}
