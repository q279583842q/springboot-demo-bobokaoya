package com.sxt.sys.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptExample() {
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

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
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

        public Criteria andDeptDescIsNull() {
            addCriterion("dept_desc is null");
            return (Criteria) this;
        }

        public Criteria andDeptDescIsNotNull() {
            addCriterion("dept_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDeptDescEqualTo(String value) {
            addCriterion("dept_desc =", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescNotEqualTo(String value) {
            addCriterion("dept_desc <>", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescGreaterThan(String value) {
            addCriterion("dept_desc >", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescGreaterThanOrEqualTo(String value) {
            addCriterion("dept_desc >=", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescLessThan(String value) {
            addCriterion("dept_desc <", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescLessThanOrEqualTo(String value) {
            addCriterion("dept_desc <=", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescLike(String value) {
            addCriterion("dept_desc like", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescNotLike(String value) {
            addCriterion("dept_desc not like", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescIn(List<String> values) {
            addCriterion("dept_desc in", values, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescNotIn(List<String> values) {
            addCriterion("dept_desc not in", values, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescBetween(String value1, String value2) {
            addCriterion("dept_desc between", value1, value2, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescNotBetween(String value1, String value2) {
            addCriterion("dept_desc not between", value1, value2, "deptDesc");
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

        public Criteria andD1IsNull() {
            addCriterion("d1 is null");
            return (Criteria) this;
        }

        public Criteria andD1IsNotNull() {
            addCriterion("d1 is not null");
            return (Criteria) this;
        }

        public Criteria andD1EqualTo(String value) {
            addCriterion("d1 =", value, "d1");
            return (Criteria) this;
        }

        public Criteria andD1NotEqualTo(String value) {
            addCriterion("d1 <>", value, "d1");
            return (Criteria) this;
        }

        public Criteria andD1GreaterThan(String value) {
            addCriterion("d1 >", value, "d1");
            return (Criteria) this;
        }

        public Criteria andD1GreaterThanOrEqualTo(String value) {
            addCriterion("d1 >=", value, "d1");
            return (Criteria) this;
        }

        public Criteria andD1LessThan(String value) {
            addCriterion("d1 <", value, "d1");
            return (Criteria) this;
        }

        public Criteria andD1LessThanOrEqualTo(String value) {
            addCriterion("d1 <=", value, "d1");
            return (Criteria) this;
        }

        public Criteria andD1Like(String value) {
            addCriterion("d1 like", value, "d1");
            return (Criteria) this;
        }

        public Criteria andD1NotLike(String value) {
            addCriterion("d1 not like", value, "d1");
            return (Criteria) this;
        }

        public Criteria andD1In(List<String> values) {
            addCriterion("d1 in", values, "d1");
            return (Criteria) this;
        }

        public Criteria andD1NotIn(List<String> values) {
            addCriterion("d1 not in", values, "d1");
            return (Criteria) this;
        }

        public Criteria andD1Between(String value1, String value2) {
            addCriterion("d1 between", value1, value2, "d1");
            return (Criteria) this;
        }

        public Criteria andD1NotBetween(String value1, String value2) {
            addCriterion("d1 not between", value1, value2, "d1");
            return (Criteria) this;
        }

        public Criteria andD2IsNull() {
            addCriterion("d2 is null");
            return (Criteria) this;
        }

        public Criteria andD2IsNotNull() {
            addCriterion("d2 is not null");
            return (Criteria) this;
        }

        public Criteria andD2EqualTo(String value) {
            addCriterion("d2 =", value, "d2");
            return (Criteria) this;
        }

        public Criteria andD2NotEqualTo(String value) {
            addCriterion("d2 <>", value, "d2");
            return (Criteria) this;
        }

        public Criteria andD2GreaterThan(String value) {
            addCriterion("d2 >", value, "d2");
            return (Criteria) this;
        }

        public Criteria andD2GreaterThanOrEqualTo(String value) {
            addCriterion("d2 >=", value, "d2");
            return (Criteria) this;
        }

        public Criteria andD2LessThan(String value) {
            addCriterion("d2 <", value, "d2");
            return (Criteria) this;
        }

        public Criteria andD2LessThanOrEqualTo(String value) {
            addCriterion("d2 <=", value, "d2");
            return (Criteria) this;
        }

        public Criteria andD2Like(String value) {
            addCriterion("d2 like", value, "d2");
            return (Criteria) this;
        }

        public Criteria andD2NotLike(String value) {
            addCriterion("d2 not like", value, "d2");
            return (Criteria) this;
        }

        public Criteria andD2In(List<String> values) {
            addCriterion("d2 in", values, "d2");
            return (Criteria) this;
        }

        public Criteria andD2NotIn(List<String> values) {
            addCriterion("d2 not in", values, "d2");
            return (Criteria) this;
        }

        public Criteria andD2Between(String value1, String value2) {
            addCriterion("d2 between", value1, value2, "d2");
            return (Criteria) this;
        }

        public Criteria andD2NotBetween(String value1, String value2) {
            addCriterion("d2 not between", value1, value2, "d2");
            return (Criteria) this;
        }

        public Criteria andD3IsNull() {
            addCriterion("d3 is null");
            return (Criteria) this;
        }

        public Criteria andD3IsNotNull() {
            addCriterion("d3 is not null");
            return (Criteria) this;
        }

        public Criteria andD3EqualTo(String value) {
            addCriterion("d3 =", value, "d3");
            return (Criteria) this;
        }

        public Criteria andD3NotEqualTo(String value) {
            addCriterion("d3 <>", value, "d3");
            return (Criteria) this;
        }

        public Criteria andD3GreaterThan(String value) {
            addCriterion("d3 >", value, "d3");
            return (Criteria) this;
        }

        public Criteria andD3GreaterThanOrEqualTo(String value) {
            addCriterion("d3 >=", value, "d3");
            return (Criteria) this;
        }

        public Criteria andD3LessThan(String value) {
            addCriterion("d3 <", value, "d3");
            return (Criteria) this;
        }

        public Criteria andD3LessThanOrEqualTo(String value) {
            addCriterion("d3 <=", value, "d3");
            return (Criteria) this;
        }

        public Criteria andD3Like(String value) {
            addCriterion("d3 like", value, "d3");
            return (Criteria) this;
        }

        public Criteria andD3NotLike(String value) {
            addCriterion("d3 not like", value, "d3");
            return (Criteria) this;
        }

        public Criteria andD3In(List<String> values) {
            addCriterion("d3 in", values, "d3");
            return (Criteria) this;
        }

        public Criteria andD3NotIn(List<String> values) {
            addCriterion("d3 not in", values, "d3");
            return (Criteria) this;
        }

        public Criteria andD3Between(String value1, String value2) {
            addCriterion("d3 between", value1, value2, "d3");
            return (Criteria) this;
        }

        public Criteria andD3NotBetween(String value1, String value2) {
            addCriterion("d3 not between", value1, value2, "d3");
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