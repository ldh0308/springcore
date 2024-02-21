package hello.core.order;

public class Order {

    private Long memberId;
    private String itemName;
    private int intemPrice;
    private  int discountPrice;

    public Order(Long memberId, String itemName, int intemPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.intemPrice = intemPrice;
        this.discountPrice = discountPrice;
    }

    public int calculatePrice(){
        return intemPrice - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getIntemPrice() {
        return intemPrice;
    }

    public void setIntemPrice(int intemPrice) {
        this.intemPrice = intemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", intemPrice=" + intemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
