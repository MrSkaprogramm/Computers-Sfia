package by.epam.tr.utils.builders;

import by.epam.tr.beans.Speaker;
import by.epam.tr.beans.Type;

public class SpeakersBuilder implements DeviceBuilder {
  Speaker speakers = new Speaker();

  public void setEnergyConsumption(int energyConsumption) {
    speakers.setEnergyConsumption(energyConsumption);

  }

  public void setType(Type type) {
    speakers.setType(type);

  }

  public void setCritical(boolean critical) {
    speakers.setCritical(critical);

  }

  public void setOrigin(String origin) {
    speakers.setOrigin(origin);

  }

  public void setPrice(double price) {
    speakers.setPrice(price);

  }

  public void setSoundPower(int soundPower) {
    speakers.setSoundPower(soundPower);
  }

  public Speaker buildSpeaker() {
    return speakers;
  }
}
