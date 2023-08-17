package hello.itemservice.domain.item;

import lombok.Data;

@Data // 보통은 안쓰는게 좋음, 위험한 부분이 있음
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
