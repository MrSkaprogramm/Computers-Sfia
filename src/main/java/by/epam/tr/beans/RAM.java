package by.epam.tr.beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ram")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ram",
    propOrder = {"origin", "price", "energyConsumption", "type", "critical", "RAMType"})
public class RAM implements Serializable {
  private static final long serialVersionUID = 8331544946375652403L;
  @XmlElement(name = "origin", required = true)
  private String origin;
  @XmlElement(name = "price", required = true)
  private double price;
  @XmlElement(name = "energyConsumption", required = true)
  private int energyConsumption;
  @XmlElement(name = "type", required = true)
  private Type type;
  @XmlElement(name = "critical", required = true)
  private boolean critical;
  @XmlElement(name = "RAMType", required = true)
  private String RAMType;

  public RAM() {

  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getEnergyConsumption() {
    return energyConsumption;
  }

  public void setEnergyConsumption(int energyConsumption) {
    this.energyConsumption = energyConsumption;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public boolean isCritical() {
    return critical;
  }

  public void setCritical(boolean critical) {
    this.critical = critical;
  }

  public String getRAMType() {
    return RAMType;
  }

  public void setRAMType(String rAMType) {
    RAMType = rAMType;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((RAMType == null) ? 0 : RAMType.hashCode());
    result = prime * result + (critical ? 1231 : 1237);
    result = prime * result + energyConsumption;
    result = prime * result + ((origin == null) ? 0 : origin.hashCode());
    long temp;
    temp = Double.doubleToLongBits(price);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + ((type == null) ? 0 : type.hashCode());
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
    RAM other = (RAM) obj;
    if (RAMType == null) {
      if (other.RAMType != null)
        return false;
    } else if (!RAMType.equals(other.RAMType))
      return false;
    if (critical != other.critical)
      return false;
    if (energyConsumption != other.energyConsumption)
      return false;
    if (origin == null) {
      if (other.origin != null)
        return false;
    } else if (!origin.equals(other.origin))
      return false;
    if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
      return false;
    if (type != other.type)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "RAM [origin=" + origin + ", price=" + price + ", energyConsumption=" + energyConsumption
        + ", type=" + type + ", critical=" + critical + ", RAMType=" + RAMType + "]";
  }

}