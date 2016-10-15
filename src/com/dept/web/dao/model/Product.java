package com.dept.web.dao.model;

import java.math.BigDecimal;

public class Product {
    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_product.id-主键
     */
    private Long id;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_product.name-品名
     */
    private String name;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_product.image_url-图片存放路径
     */
    private String imageUrl;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_product.price-价格
     */
    private BigDecimal price;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_product.model-型号
     */
    private String model;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_product.remark-备注
     */
    private String remark;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_product.status-状态0新建1审核通过2满待抽3抽奖4发放
     */
    private Integer status;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_product.hits-
     */
    private Integer hits;

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_product.id-主键
     *
     * @return the value for 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_product.id-主键
     *
     * @param id set value for 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_product.name-品名
     *
     * @return the value for 品名
     */
    public String getName() {
        return name;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_product.name-品名
     *
     * @param name set value for 品名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_product.image_url-图片存放路径
     *
     * @return the value for 图片存放路径
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_product.image_url-图片存放路径
     *
     * @param imageUrl set value for 图片存放路径
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_product.price-价格
     *
     * @return the value for 价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_product.price-价格
     *
     * @param price set value for 价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_product.model-型号
     *
     * @return the value for 型号
     */
    public String getModel() {
        return model;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_product.model-型号
     *
     * @param model set value for 型号
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_product.remark-备注
     *
     * @return the value for 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_product.remark-备注
     *
     * @param remark set value for 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_product.status-状态0新建1审核通过2满待抽3抽奖4发放
     *
     * @return the value for 状态0新建1审核通过2满待抽3抽奖4发放
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_product.status-状态0新建1审核通过2满待抽3抽奖4发放
     *
     * @param status set value for 状态0新建1审核通过2满待抽3抽奖4发放
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 自动生成的代码.
     * 该方法返回值对应的数据库字段是 tb_product.hits-
     *
     * @return the value for 
     */
    public Integer getHits() {
        return hits;
    }

    /**
     * 自动生成的代码.
     * 该方法设置的值对应的数据库字段是 tb_product.hits-
     *
     * @param hits set value for 
     */
    public void setHits(Integer hits) {
        this.hits = hits;
    }
}