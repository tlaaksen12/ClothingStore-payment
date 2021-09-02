package clothingstore;

public class ShippingCanceled extends AbstractEvent {

    private Long id;
    private String clothingid;
    private String status;
    private String address;
    private String cnt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getClothingid() {
        return clothingid;
    }

    public void setClothingid(String clothingid) {
        this.clothingid = clothingid;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getCnt() {
        return cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt;
    }
}