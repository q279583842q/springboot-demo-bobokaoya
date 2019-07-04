package com.sxt.sys.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasicExample() {
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

        public Criteria andBasicIdIsNull() {
            addCriterion("basic_id is null");
            return (Criteria) this;
        }

        public Criteria andBasicIdIsNotNull() {
            addCriterion("basic_id is not null");
            return (Criteria) this;
        }

        public Criteria andBasicIdEqualTo(Integer value) {
            addCriterion("basic_id =", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotEqualTo(Integer value) {
            addCriterion("basic_id <>", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdGreaterThan(Integer value) {
            addCriterion("basic_id >", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_id >=", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdLessThan(Integer value) {
            addCriterion("basic_id <", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdLessThanOrEqualTo(Integer value) {
            addCriterion("basic_id <=", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdIn(List<Integer> values) {
            addCriterion("basic_id in", values, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotIn(List<Integer> values) {
            addCriterion("basic_id not in", values, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdBetween(Integer value1, Integer value2) {
            addCriterion("basic_id between", value1, value2, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_id not between", value1, value2, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicNameIsNull() {
            addCriterion("basic_name is null");
            return (Criteria) this;
        }

        public Criteria andBasicNameIsNotNull() {
            addCriterion("basic_name is not null");
            return (Criteria) this;
        }

        public Criteria andBasicNameEqualTo(String value) {
            addCriterion("basic_name =", value, "basicName");
            return (Criteria) this;
        }

        public Criteria andBasicNameNotEqualTo(String value) {
            addCriterion("basic_name <>", value, "basicName");
            return (Criteria) this;
        }

        public Criteria andBasicNameGreaterThan(String value) {
            addCriterion("basic_name >", value, "basicName");
            return (Criteria) this;
        }

        public Criteria andBasicNameGreaterThanOrEqualTo(String value) {
            addCriterion("basic_name >=", value, "basicName");
            return (Criteria) this;
        }

        public Criteria andBasicNameLessThan(String value) {
            addCriterion("basic_name <", value, "basicName");
            return (Criteria) this;
        }

        public Criteria andBasicNameLessThanOrEqualTo(String value) {
            addCriterion("basic_name <=", value, "basicName");
            return (Criteria) this;
        }

        public Criteria andBasicNameLike(String value) {
            addCriterion("basic_name like", value, "basicName");
            return (Criteria) this;
        }

        public Criteria andBasicNameNotLike(String value) {
            addCriterion("basic_name not like", value, "basicName");
            return (Criteria) this;
        }

        public Criteria andBasicNameIn(List<String> values) {
            addCriterion("basic_name in", values, "basicName");
            return (Criteria) this;
        }

        public Criteria andBasicNameNotIn(List<String> values) {
            addCriterion("basic_name not in", values, "basicName");
            return (Criteria) this;
        }

        public Criteria andBasicNameBetween(String value1, String value2) {
            addCriterion("basic_name between", value1, value2, "basicName");
            return (Criteria) this;
        }

        public Criteria andBasicNameNotBetween(String value1, String value2) {
            addCriterion("basic_name not between", value1, value2, "basicName");
            return (Criteria) this;
        }

        public Criteria andBasicDescIsNull() {
            addCriterion("basic_desc is null");
            return (Criteria) this;
        }

        public Criteria andBasicDescIsNotNull() {
            addCriterion("basic_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBasicDescEqualTo(String value) {
            addCriterion("basic_desc =", value, "basicDesc");
            return (Criteria) this;
        }

        public Criteria andBasicDescNotEqualTo(String value) {
            addCriterion("basic_desc <>", value, "basicDesc");
            return (Criteria) this;
        }

        public Criteria andBasicDescGreaterThan(String value) {
            addCriterion("basic_desc >", value, "basicDesc");
            return (Criteria) this;
        }

        public Criteria andBasicDescGreaterThanOrEqualTo(String value) {
            addCriterion("basic_desc >=", value, "basicDesc");
            return (Criteria) this;
        }

        public Criteria andBasicDescLessThan(String value) {
            addCriterion("basic_desc <", value, "basicDesc");
            return (Criteria) this;
        }

        public Criteria andBasicDescLessThanOrEqualTo(String value) {
            addCriterion("basic_desc <=", value, "basicDesc");
            return (Criteria) this;
        }

        public Criteria andBasicDescLike(String value) {
            addCriterion("basic_desc like", value, "basicDesc");
            return (Criteria) this;
        }

        public Criteria andBasicDescNotLike(String value) {
            addCriterion("basic_desc not like", value, "basicDesc");
            return (Criteria) this;
        }

        public Criteria andBasicDescIn(List<String> values) {
            addCriterion("basic_desc in", values, "basicDesc");
            return (Criteria) this;
        }

        public Criteria andBasicDescNotIn(List<String> values) {
            addCriterion("basic_desc not in", values, "basicDesc");
            return (Criteria) this;
        }

        public Criteria andBasicDescBetween(String value1, String value2) {
            addCriterion("basic_desc between", value1, value2, "basicDesc");
            return (Criteria) this;
        }

        public Criteria andBasicDescNotBetween(String value1, String value2) {
            addCriterion("basic_desc not between", value1, value2, "basicDesc");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andB1IsNull() {
            addCriterion("b1 is null");
            return (Criteria) this;
        }

        public Criteria andB1IsNotNull() {
            addCriterion("b1 is not null");
            return (Criteria) this;
        }

        public Criteria andB1EqualTo(String value) {
            addCriterion("b1 =", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1NotEqualTo(String value) {
            addCriterion("b1 <>", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1GreaterThan(String value) {
            addCriterion("b1 >", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1GreaterThanOrEqualTo(String value) {
            addCriterion("b1 >=", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1LessThan(String value) {
            addCriterion("b1 <", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1LessThanOrEqualTo(String value) {
            addCriterion("b1 <=", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1Like(String value) {
            addCriterion("b1 like", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1NotLike(String value) {
            addCriterion("b1 not like", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1In(List<String> values) {
            addCriterion("b1 in", values, "b1");
            return (Criteria) this;
        }

        public Criteria andB1NotIn(List<String> values) {
            addCriterion("b1 not in", values, "b1");
            return (Criteria) this;
        }

        public Criteria andB1Between(String value1, String value2) {
            addCriterion("b1 between", value1, value2, "b1");
            return (Criteria) this;
        }

        public Criteria andB1NotBetween(String value1, String value2) {
            addCriterion("b1 not between", value1, value2, "b1");
            return (Criteria) this;
        }

        public Criteria andB2IsNull() {
            addCriterion("b2 is null");
            return (Criteria) this;
        }

        public Criteria andB2IsNotNull() {
            addCriterion("b2 is not null");
            return (Criteria) this;
        }

        public Criteria andB2EqualTo(String value) {
            addCriterion("b2 =", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2NotEqualTo(String value) {
            addCriterion("b2 <>", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2GreaterThan(String value) {
            addCriterion("b2 >", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2GreaterThanOrEqualTo(String value) {
            addCriterion("b2 >=", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2LessThan(String value) {
            addCriterion("b2 <", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2LessThanOrEqualTo(String value) {
            addCriterion("b2 <=", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2Like(String value) {
            addCriterion("b2 like", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2NotLike(String value) {
            addCriterion("b2 not like", value, "b2");
            return (Criteria) this;
        }

        public Criteria andB2In(List<String> values) {
            addCriterion("b2 in", values, "b2");
            return (Criteria) this;
        }

        public Criteria andB2NotIn(List<String> values) {
            addCriterion("b2 not in", values, "b2");
            return (Criteria) this;
        }

        public Criteria andB2Between(String value1, String value2) {
            addCriterion("b2 between", value1, value2, "b2");
            return (Criteria) this;
        }

        public Criteria andB2NotBetween(String value1, String value2) {
            addCriterion("b2 not between", value1, value2, "b2");
            return (Criteria) this;
        }

        public Criteria andB3IsNull() {
            addCriterion("b3 is null");
            return (Criteria) this;
        }

        public Criteria andB3IsNotNull() {
            addCriterion("b3 is not null");
            return (Criteria) this;
        }

        public Criteria andB3EqualTo(String value) {
            addCriterion("b3 =", value, "b3");
            return (Criteria) this;
        }

        public Criteria andB3NotEqualTo(String value) {
            addCriterion("b3 <>", value, "b3");
            return (Criteria) this;
        }

        public Criteria andB3GreaterThan(String value) {
            addCriterion("b3 >", value, "b3");
            return (Criteria) this;
        }

        public Criteria andB3GreaterThanOrEqualTo(String value) {
            addCriterion("b3 >=", value, "b3");
            return (Criteria) this;
        }

        public Criteria andB3LessThan(String value) {
            addCriterion("b3 <", value, "b3");
            return (Criteria) this;
        }

        public Criteria andB3LessThanOrEqualTo(String value) {
            addCriterion("b3 <=", value, "b3");
            return (Criteria) this;
        }

        public Criteria andB3Like(String value) {
            addCriterion("b3 like", value, "b3");
            return (Criteria) this;
        }

        public Criteria andB3NotLike(String value) {
            addCriterion("b3 not like", value, "b3");
            return (Criteria) this;
        }

        public Criteria andB3In(List<String> values) {
            addCriterion("b3 in", values, "b3");
            return (Criteria) this;
        }

        public Criteria andB3NotIn(List<String> values) {
            addCriterion("b3 not in", values, "b3");
            return (Criteria) this;
        }

        public Criteria andB3Between(String value1, String value2) {
            addCriterion("b3 between", value1, value2, "b3");
            return (Criteria) this;
        }

        public Criteria andB3NotBetween(String value1, String value2) {
            addCriterion("b3 not between", value1, value2, "b3");
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