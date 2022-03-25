package by.epam.tr.beans;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "devices")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "devices",
    propOrder = {"cpuList", "dataStorageList", "heatSinkList", "keyboardList", "motherboardList",
        "mouseList", "powerSupplyList", "RAMList", "screenList", "speakerList"})
public class Devices {
  @XmlElement(name = "cpu")
  private ArrayList<CPU> cpuList = new ArrayList<CPU>();
  @XmlElement(name = "datastorage")
  private ArrayList<DataStorage> dataStorageList = new ArrayList<DataStorage>();
  @XmlElement(name = "heatsink")
  private ArrayList<HeatSink> heatSinkList = new ArrayList<HeatSink>();
  @XmlElement(name = "keyboard")
  private ArrayList<Keyboard> keyboardList = new ArrayList<Keyboard>();
  @XmlElement(name = "motherboard")
  private ArrayList<Motherboard> motherboardList = new ArrayList<Motherboard>();
  @XmlElement(name = "mouse")
  private ArrayList<Mouse> mouseList = new ArrayList<Mouse>();
  @XmlElement(name = "powersupply")
  private ArrayList<PowerSupply> powerSupplyList = new ArrayList<PowerSupply>();
  @XmlElement(name = "ram")
  private ArrayList<RAM> RAMList = new ArrayList<RAM>();
  @XmlElement(name = "screen")
  private ArrayList<Screen> screenList = new ArrayList<Screen>();
  @XmlElement(name = "speaker")
  private ArrayList<Speaker> speakerList = new ArrayList<Speaker>();

  public void setCpuList(ArrayList<CPU> cpuList) {
    this.cpuList = cpuList;
  }

  public boolean add(CPU cpu) {
    return cpuList.add(cpu);
  }

  public ArrayList<CPU> getCpuList() {
    return cpuList;
  }

  public ArrayList<DataStorage> getDataStorageList() {
    return dataStorageList;
  }

  public void setDataStorageList(ArrayList<DataStorage> dataStorageList) {
    this.dataStorageList = dataStorageList;
  }

  public ArrayList<HeatSink> getHeatSinkList() {
    return heatSinkList;
  }

  public void setHeatSinkList(ArrayList<HeatSink> heatSinkList) {
    this.heatSinkList = heatSinkList;
  }

  public ArrayList<Keyboard> getKeyboardList() {
    return keyboardList;
  }

  public void setKeyboardList(ArrayList<Keyboard> keyboardList) {
    this.keyboardList = keyboardList;
  }

  public ArrayList<Motherboard> getMotherboardList() {
    return motherboardList;
  }

  public void setMotherboardList(ArrayList<Motherboard> motherboardList) {
    this.motherboardList = motherboardList;
  }

  public ArrayList<Mouse> getMouseList() {
    return mouseList;
  }

  public void setMouseList(ArrayList<Mouse> mouseList) {
    this.mouseList = mouseList;
  }

  public ArrayList<PowerSupply> getPowerSupplyList() {
    return powerSupplyList;
  }

  public void setPowerSupplyList(ArrayList<PowerSupply> powerSupplyList) {
    this.powerSupplyList = powerSupplyList;
  }

  public ArrayList<RAM> getRAMList() {
    return RAMList;
  }

  public void setRAMList(ArrayList<RAM> rAMList) {
    RAMList = rAMList;
  }

  public ArrayList<Screen> getScreenList() {
    return screenList;
  }

  public void setScreenList(ArrayList<Screen> screenList) {
    this.screenList = screenList;
  }

  public ArrayList<Speaker> getSpeakerList() {
    return speakerList;
  }

  public void setSpeakerList(ArrayList<Speaker> speakerList) {
    this.speakerList = speakerList;
  }

  @Override
  public String toString() {
    return "Devices [cpuList=" + cpuList + ", dataStorageList=" + dataStorageList
        + ", heatSinkList=" + heatSinkList + ", keyboardList=" + keyboardList + ", motherboardList="
        + motherboardList + ", mouseList=" + mouseList + ", powerSupplyList=" + powerSupplyList
        + ", RAMList=" + RAMList + ", screenList=" + screenList + ", speakerList=" + speakerList
        + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((RAMList == null) ? 0 : RAMList.hashCode());
    result = prime * result + ((cpuList == null) ? 0 : cpuList.hashCode());
    result = prime * result + ((dataStorageList == null) ? 0 : dataStorageList.hashCode());
    result = prime * result + ((heatSinkList == null) ? 0 : heatSinkList.hashCode());
    result = prime * result + ((keyboardList == null) ? 0 : keyboardList.hashCode());
    result = prime * result + ((motherboardList == null) ? 0 : motherboardList.hashCode());
    result = prime * result + ((mouseList == null) ? 0 : mouseList.hashCode());
    result = prime * result + ((powerSupplyList == null) ? 0 : powerSupplyList.hashCode());
    result = prime * result + ((screenList == null) ? 0 : screenList.hashCode());
    result = prime * result + ((speakerList == null) ? 0 : speakerList.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Devices other = (Devices) obj;
    if (RAMList == null) {
      if (other.RAMList != null)
        return false;
    } else if (!RAMList.equals(other.RAMList))
      return false;
    if (cpuList == null) {
      if (other.cpuList != null)
        return false;
    } else if (!cpuList.equals(other.cpuList))
      return false;
    if (dataStorageList == null) {
      if (other.dataStorageList != null)
        return false;
    } else if (!dataStorageList.equals(other.dataStorageList))
      return false;
    if (heatSinkList == null) {
      if (other.heatSinkList != null)
        return false;
    } else if (!heatSinkList.equals(other.heatSinkList))
      return false;
    if (keyboardList == null) {
      if (other.keyboardList != null)
        return false;
    } else if (!keyboardList.equals(other.keyboardList))
      return false;
    if (motherboardList == null) {
      if (other.motherboardList != null)
        return false;
    } else if (!motherboardList.equals(other.motherboardList))
      return false;
    if (mouseList == null) {
      if (other.mouseList != null)
        return false;
    } else if (!mouseList.equals(other.mouseList))
      return false;
    if (powerSupplyList == null) {
      if (other.powerSupplyList != null)
        return false;
    } else if (!powerSupplyList.equals(other.powerSupplyList))
      return false;
    if (screenList == null) {
      if (other.screenList != null)
        return false;
    } else if (!screenList.equals(other.screenList))
      return false;
    if (speakerList == null) {
      if (other.speakerList != null)
        return false;
    } else if (!speakerList.equals(other.speakerList))
      return false;
    return true;
  }
}
