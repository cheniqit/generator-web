package com.mogoroom.service.cntr.dao;

import java.util.Date;

public class SaleContractDetail {
    private Integer id;

    private Integer saleContractId;

    private String confirmChannel;

    private Byte freeForegiftActivity;

    private Boolean valid;

    private String remark;

    private Integer createBy;

    private Byte createByType;

    private Date createTime;

    private Integer updateBy;

    private Integer updateByType;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSaleContractId() {
        return saleContractId;
    }

    public void setSaleContractId(Integer saleContractId) {
        this.saleContractId = saleContractId;
    }

    public String getConfirmChannel() {
        return confirmChannel;
    }

    public void setConfirmChannel(String confirmChannel) {
        this.confirmChannel = confirmChannel == null ? null : confirmChannel.trim();
    }

    public Byte getFreeForegiftActivity() {
        return freeForegiftActivity;
    }

    public void setFreeForegiftActivity(Byte freeForegiftActivity) {
        this.freeForegiftActivity = freeForegiftActivity;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Byte getCreateByType() {
        return createByType;
    }

    public void setCreateByType(Byte createByType) {
        this.createByType = createByType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getUpdateByType() {
        return updateByType;
    }

    public void setUpdateByType(Integer updateByType) {
        this.updateByType = updateByType;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}