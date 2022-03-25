package by.epam.tr.utils.builders;

import by.epam.tr.beans.CPU;
import by.epam.tr.beans.Type;

public class CPUBuilder implements DeviceBuilder {
  CPU cpu = new CPU();

  public void setEnergyConsumption(int energyConsumption) {
    cpu.setEnergyConsumption(energyConsumption);
  }

  public void setType(Type type) {
    cpu.setType(type);

  }

  public void setCritical(boolean critical) {
    cpu.setCritical(critical);

  }

  public void setOrigin(String origin) {
    cpu.setOrigin(origin);

  }

  public void setPrice(double price) {

  }

  public void setClockRate(double clockRate) {
    cpu.setClockRate(clockRate);
  }

  public CPU buildCPU() {
    return cpu;
  }
}
