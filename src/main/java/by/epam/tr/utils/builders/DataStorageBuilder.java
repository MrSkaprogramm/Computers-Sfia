package by.epam.tr.utils.builders;

import by.epam.tr.beans.DataStorage;
import by.epam.tr.beans.Type;

public class DataStorageBuilder implements DeviceBuilder {
  DataStorage dataStorage = new DataStorage();

  public void setEnergyConsumption(int energyConsumption) {
    dataStorage.setEnergyConsumption(energyConsumption);

  }

  public void setType(Type type) {
    dataStorage.setType(type);

  }

  public void setCritical(boolean critical) {
    dataStorage.setCritical(critical);

  }

  public void setOrigin(String origin) {
    dataStorage.setOrigin(origin);

  }

  public void setPrice(double price) {
    dataStorage.setPrice(price);
  }

  public void setCapacity(int capacity) {
    dataStorage.setCapacity(capacity);
  }

  public DataStorage buildDataStorage() {
    return dataStorage;
  }
}
