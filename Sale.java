import java.util.Date;

public class Sale {
    String itemType;
    String salesChannel;
    String orderPriority;
    String orderDate;
    String orderId;
    String unitSold;
    float unitPrice;

    public Sale(String itemType, String salesChannel, String orderPriority, String orderDate, String orderId, String unitSold, float unitPrice) {
        this.itemType = itemType;
        this.salesChannel = salesChannel;
        this.orderPriority = orderPriority;
        this.orderDate = orderDate;
        this.orderId = orderId;
        this.unitSold = unitSold;
        this.unitPrice = unitPrice;
    }


    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getSalesChannel() {
        return salesChannel;
    }

    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }

    public String getOrderPriority() {
        return orderPriority;
    }

    public void setOrderPriority(String orderPriority) {
        this.orderPriority = orderPriority;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUnitSold() {
        return unitSold;
    }

    public void setUnitSold(String unitSold) {
        this.unitSold = unitSold;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "itemType='" + itemType + '\'' +
                ", salesChannel='" + salesChannel + '\'' +
                ", orderPriority='" + orderPriority + '\'' +
                ", orderDate=" + orderDate +
                ", orderId='" + orderId + '\'' +
                ", unitSold='" + unitSold + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
