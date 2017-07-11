package com.mogoroom.service.cntr.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleContractDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleContractDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSaleContractIdIsNull() {
            addCriterion("saleContractId is null");
            return (Criteria) this;
        }

        public Criteria andSaleContractIdIsNotNull() {
            addCriterion("saleContractId is not null");
            return (Criteria) this;
        }

        public Criteria andSaleContractIdEqualTo(Integer value) {
            addCriterion("saleContractId =", value, "saleContractId");
            return (Criteria) this;
        }

        public Criteria andSaleContractIdNotEqualTo(Integer value) {
            addCriterion("saleContractId <>", value, "saleContractId");
            return (Criteria) this;
        }

        public Criteria andSaleContractIdGreaterThan(Integer value) {
            addCriterion("saleContractId >", value, "saleContractId");
            return (Criteria) this;
        }

        public Criteria andSaleContractIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("saleContractId >=", value, "saleContractId");
            return (Criteria) this;
        }

        public Criteria andSaleContractIdLessThan(Integer value) {
            addCriterion("saleContractId <", value, "saleContractId");
            return (Criteria) this;
        }

        public Criteria andSaleContractIdLessThanOrEqualTo(Integer value) {
            addCriterion("saleContractId <=", value, "saleContractId");
            return (Criteria) this;
        }

        public Criteria andSaleContractIdIn(List<Integer> values) {
            addCriterion("saleContractId in", values, "saleContractId");
            return (Criteria) this;
        }

        public Criteria andSaleContractIdNotIn(List<Integer> values) {
            addCriterion("saleContractId not in", values, "saleContractId");
            return (Criteria) this;
        }

        public Criteria andSaleContractIdBetween(Integer value1, Integer value2) {
            addCriterion("saleContractId between", value1, value2, "saleContractId");
            return (Criteria) this;
        }

        public Criteria andSaleContractIdNotBetween(Integer value1, Integer value2) {
            addCriterion("saleContractId not between", value1, value2, "saleContractId");
            return (Criteria) this;
        }

        public Criteria andConfirmChannelIsNull() {
            addCriterion("confirmChannel is null");
            return (Criteria) this;
        }

        public Criteria andConfirmChannelIsNotNull() {
            addCriterion("confirmChannel is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmChannelEqualTo(String value) {
            addCriterion("confirmChannel =", value, "confirmChannel");
            return (Criteria) this;
        }

        public Criteria andConfirmChannelNotEqualTo(String value) {
            addCriterion("confirmChannel <>", value, "confirmChannel");
            return (Criteria) this;
        }

        public Criteria andConfirmChannelGreaterThan(String value) {
            addCriterion("confirmChannel >", value, "confirmChannel");
            return (Criteria) this;
        }

        public Criteria andConfirmChannelGreaterThanOrEqualTo(String value) {
            addCriterion("confirmChannel >=", value, "confirmChannel");
            return (Criteria) this;
        }

        public Criteria andConfirmChannelLessThan(String value) {
            addCriterion("confirmChannel <", value, "confirmChannel");
            return (Criteria) this;
        }

        public Criteria andConfirmChannelLessThanOrEqualTo(String value) {
            addCriterion("confirmChannel <=", value, "confirmChannel");
            return (Criteria) this;
        }

        public Criteria andConfirmChannelLike(String value) {
            addCriterion("confirmChannel like", value, "confirmChannel");
            return (Criteria) this;
        }

        public Criteria andConfirmChannelNotLike(String value) {
            addCriterion("confirmChannel not like", value, "confirmChannel");
            return (Criteria) this;
        }

        public Criteria andConfirmChannelIn(List<String> values) {
            addCriterion("confirmChannel in", values, "confirmChannel");
            return (Criteria) this;
        }

        public Criteria andConfirmChannelNotIn(List<String> values) {
            addCriterion("confirmChannel not in", values, "confirmChannel");
            return (Criteria) this;
        }

        public Criteria andConfirmChannelBetween(String value1, String value2) {
            addCriterion("confirmChannel between", value1, value2, "confirmChannel");
            return (Criteria) this;
        }

        public Criteria andConfirmChannelNotBetween(String value1, String value2) {
            addCriterion("confirmChannel not between", value1, value2, "confirmChannel");
            return (Criteria) this;
        }

        public Criteria andFreeForegiftActivityIsNull() {
            addCriterion("freeForegiftActivity is null");
            return (Criteria) this;
        }

        public Criteria andFreeForegiftActivityIsNotNull() {
            addCriterion("freeForegiftActivity is not null");
            return (Criteria) this;
        }

        public Criteria andFreeForegiftActivityEqualTo(Byte value) {
            addCriterion("freeForegiftActivity =", value, "freeForegiftActivity");
            return (Criteria) this;
        }

        public Criteria andFreeForegiftActivityNotEqualTo(Byte value) {
            addCriterion("freeForegiftActivity <>", value, "freeForegiftActivity");
            return (Criteria) this;
        }

        public Criteria andFreeForegiftActivityGreaterThan(Byte value) {
            addCriterion("freeForegiftActivity >", value, "freeForegiftActivity");
            return (Criteria) this;
        }

        public Criteria andFreeForegiftActivityGreaterThanOrEqualTo(Byte value) {
            addCriterion("freeForegiftActivity >=", value, "freeForegiftActivity");
            return (Criteria) this;
        }

        public Criteria andFreeForegiftActivityLessThan(Byte value) {
            addCriterion("freeForegiftActivity <", value, "freeForegiftActivity");
            return (Criteria) this;
        }

        public Criteria andFreeForegiftActivityLessThanOrEqualTo(Byte value) {
            addCriterion("freeForegiftActivity <=", value, "freeForegiftActivity");
            return (Criteria) this;
        }

        public Criteria andFreeForegiftActivityIn(List<Byte> values) {
            addCriterion("freeForegiftActivity in", values, "freeForegiftActivity");
            return (Criteria) this;
        }

        public Criteria andFreeForegiftActivityNotIn(List<Byte> values) {
            addCriterion("freeForegiftActivity not in", values, "freeForegiftActivity");
            return (Criteria) this;
        }

        public Criteria andFreeForegiftActivityBetween(Byte value1, Byte value2) {
            addCriterion("freeForegiftActivity between", value1, value2, "freeForegiftActivity");
            return (Criteria) this;
        }

        public Criteria andFreeForegiftActivityNotBetween(Byte value1, Byte value2) {
            addCriterion("freeForegiftActivity not between", value1, value2, "freeForegiftActivity");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Boolean value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Boolean value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Boolean value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Boolean value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Boolean value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Boolean> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Boolean> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Boolean value1, Boolean value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("createBy is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("createBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Integer value) {
            addCriterion("createBy =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Integer value) {
            addCriterion("createBy <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Integer value) {
            addCriterion("createBy >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("createBy >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Integer value) {
            addCriterion("createBy <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Integer value) {
            addCriterion("createBy <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Integer> values) {
            addCriterion("createBy in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Integer> values) {
            addCriterion("createBy not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Integer value1, Integer value2) {
            addCriterion("createBy between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Integer value1, Integer value2) {
            addCriterion("createBy not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByTypeIsNull() {
            addCriterion("createByType is null");
            return (Criteria) this;
        }

        public Criteria andCreateByTypeIsNotNull() {
            addCriterion("createByType is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByTypeEqualTo(Byte value) {
            addCriterion("createByType =", value, "createByType");
            return (Criteria) this;
        }

        public Criteria andCreateByTypeNotEqualTo(Byte value) {
            addCriterion("createByType <>", value, "createByType");
            return (Criteria) this;
        }

        public Criteria andCreateByTypeGreaterThan(Byte value) {
            addCriterion("createByType >", value, "createByType");
            return (Criteria) this;
        }

        public Criteria andCreateByTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("createByType >=", value, "createByType");
            return (Criteria) this;
        }

        public Criteria andCreateByTypeLessThan(Byte value) {
            addCriterion("createByType <", value, "createByType");
            return (Criteria) this;
        }

        public Criteria andCreateByTypeLessThanOrEqualTo(Byte value) {
            addCriterion("createByType <=", value, "createByType");
            return (Criteria) this;
        }

        public Criteria andCreateByTypeIn(List<Byte> values) {
            addCriterion("createByType in", values, "createByType");
            return (Criteria) this;
        }

        public Criteria andCreateByTypeNotIn(List<Byte> values) {
            addCriterion("createByType not in", values, "createByType");
            return (Criteria) this;
        }

        public Criteria andCreateByTypeBetween(Byte value1, Byte value2) {
            addCriterion("createByType between", value1, value2, "createByType");
            return (Criteria) this;
        }

        public Criteria andCreateByTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("createByType not between", value1, value2, "createByType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("updateBy is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("updateBy is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Integer value) {
            addCriterion("updateBy =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Integer value) {
            addCriterion("updateBy <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Integer value) {
            addCriterion("updateBy >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("updateBy >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Integer value) {
            addCriterion("updateBy <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Integer value) {
            addCriterion("updateBy <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Integer> values) {
            addCriterion("updateBy in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Integer> values) {
            addCriterion("updateBy not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Integer value1, Integer value2) {
            addCriterion("updateBy between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Integer value1, Integer value2) {
            addCriterion("updateBy not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByTypeIsNull() {
            addCriterion("updateByType is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByTypeIsNotNull() {
            addCriterion("updateByType is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByTypeEqualTo(Integer value) {
            addCriterion("updateByType =", value, "updateByType");
            return (Criteria) this;
        }

        public Criteria andUpdateByTypeNotEqualTo(Integer value) {
            addCriterion("updateByType <>", value, "updateByType");
            return (Criteria) this;
        }

        public Criteria andUpdateByTypeGreaterThan(Integer value) {
            addCriterion("updateByType >", value, "updateByType");
            return (Criteria) this;
        }

        public Criteria andUpdateByTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("updateByType >=", value, "updateByType");
            return (Criteria) this;
        }

        public Criteria andUpdateByTypeLessThan(Integer value) {
            addCriterion("updateByType <", value, "updateByType");
            return (Criteria) this;
        }

        public Criteria andUpdateByTypeLessThanOrEqualTo(Integer value) {
            addCriterion("updateByType <=", value, "updateByType");
            return (Criteria) this;
        }

        public Criteria andUpdateByTypeIn(List<Integer> values) {
            addCriterion("updateByType in", values, "updateByType");
            return (Criteria) this;
        }

        public Criteria andUpdateByTypeNotIn(List<Integer> values) {
            addCriterion("updateByType not in", values, "updateByType");
            return (Criteria) this;
        }

        public Criteria andUpdateByTypeBetween(Integer value1, Integer value2) {
            addCriterion("updateByType between", value1, value2, "updateByType");
            return (Criteria) this;
        }

        public Criteria andUpdateByTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("updateByType not between", value1, value2, "updateByType");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}