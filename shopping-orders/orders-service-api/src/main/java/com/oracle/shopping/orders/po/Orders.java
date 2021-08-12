package com.oracle.shopping.orders.po;

import java.io.Serializable;

public class Orders implements Serializable {
    private String ordersId;

    private String status;

    private Integer userId;

    private static final long serialVersionUID = 1L;

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ordersId=").append(ordersId);
        sb.append(", status=").append(status);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}