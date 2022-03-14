package com.org.invoice;

public class InvoiceItem1 {


private String id;
private String desc;
private int qty;
private double unitPrice;

public InvoiceItem1(String i,String d,int q,double u) {
id=i;
desc=d;
qty=q;
unitPrice=u;
}
public String getID() {
return id;
}
public String getDesc() {
return desc;
}
public int getQty() {
return qty;
}
public void setQty(int q) {
qty=q;
}
public double getUnitPrice() {
return unitPrice;
}
public void setUnitPrice(double u) {
unitPrice=u;
}
public double getTotal() {
return unitPrice*qty;
}
public String toString() {
return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice +"]";
}
}
