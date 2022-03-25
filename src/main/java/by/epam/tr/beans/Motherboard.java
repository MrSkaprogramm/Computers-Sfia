package by.epam.tr.beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "motherboard")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motherboard",
    propOrder = {"origin", "price", "energyConsumption", "type", "critical", "formFactor"})
public class Motherboard implements Serializable {
  private static final long serialVersionUID = -3204354005097010896L;
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
  @XmlElement(name = "formFactor", required = true)
  private String formFactor;

  public Motherboard() {

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

  public String getFormFactor() {
    return formFactor;
  }

  public void setFormFactor(String formFactor) {
    this.formFactor = formFactor;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (critical ? 1231 : 1237);
    result = prime * result + energyConsumption;
    result = prime * result + ((formFactor == null) ? 0 : formFactor.hashCode());
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
    Motherboard other = (Motherboard) obj;
    if (critical != other.critical)
      return false;
    if (energyConsumption != other.energyConsumption)
      return false;
    if (formFactor == null) {
      if (other.formFactor != null)
        return false;
    } else if (!formFactor.equals(other.formFactor))
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
    return "Motherboard [origin=" + origin + ", price=" + price + ", energyConsumption="
        + energyConsumption + ", type=" + type + ", critical=" + critical + ", formFactor="
        + formFactor + "]";
  }

}
