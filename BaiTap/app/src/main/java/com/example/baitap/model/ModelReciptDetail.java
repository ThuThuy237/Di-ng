package com.example.baitap.model;

public class ModelReciptDetail {
    private Integer productId;
    private Integer quantitySizeS;
    private Integer quantitySizeM;
    private Integer quantitySizeL;
    private Integer quantitySizeXL;
    private Float price;

    public ModelReciptDetail(Integer id, Integer quantity_s_size, Integer quantity_m_size, Integer quantity_l_size, Integer quantity_xl_size, Float totalPriceAllSize) {
        this.productId = productId;
        this.quantitySizeS = quantity_s_size;
        this.quantitySizeM = quantity_m_size;
        this.quantitySizeL = quantity_l_size;
        this.quantitySizeXL = quantity_xl_size;
        this.price = totalPriceAllSize;
    }


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantitySizeS() {
        return quantitySizeS;
    }

    public void setQuantitySizeS(Integer quantitySizeS) {
        this.quantitySizeS = quantitySizeS;
    }

    public Integer getQuantitySizeM() {
        return quantitySizeM;
    }

    public void setQuantitySizeM(Integer quantitySizeM) {
        this.quantitySizeM = quantitySizeM;
    }

    public Integer getQuantitySizeL() {
        return quantitySizeL;
    }

    public void setQuantitySizeL(Integer quantitySizeL) {
        this.quantitySizeL = quantitySizeL;
    }

    public Integer getQuantitySizeXL() {
        return quantitySizeXL;
    }

    public void setQuantitySizeXL(Integer quantitySizeXL) {
        this.quantitySizeXL = quantitySizeXL;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
