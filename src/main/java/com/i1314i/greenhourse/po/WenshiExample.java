package com.i1314i.greenhourse.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WenshiExample {
    private int start;//设置分页开始
    private int limit;//设置分页的每页的数量
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;


    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setOredCriteria(List<Criteria> oredCriteria) {
        this.oredCriteria = oredCriteria;
    }

    public WenshiExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNull() {
            addCriterion("datetime is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("datetime is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(Date value) {
            addCriterion("datetime =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(Date value) {
            addCriterion("datetime <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(Date value) {
            addCriterion("datetime >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("datetime >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(Date value) {
            addCriterion("datetime <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("datetime <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<Date> values) {
            addCriterion("datetime in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<Date> values) {
            addCriterion("datetime not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(Date value1, Date value2) {
            addCriterion("datetime between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("datetime not between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andAirtempIsNull() {
            addCriterion("airtemp is null");
            return (Criteria) this;
        }

        public Criteria andAirtempIsNotNull() {
            addCriterion("airtemp is not null");
            return (Criteria) this;
        }

        public Criteria andAirtempEqualTo(String value) {
            addCriterion("airtemp =", value, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempNotEqualTo(String value) {
            addCriterion("airtemp <>", value, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempGreaterThan(String value) {
            addCriterion("airtemp >", value, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempGreaterThanOrEqualTo(String value) {
            addCriterion("airtemp >=", value, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempLessThan(String value) {
            addCriterion("airtemp <", value, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempLessThanOrEqualTo(String value) {
            addCriterion("airtemp <=", value, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempLike(String value) {
            addCriterion("airtemp like", value, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempNotLike(String value) {
            addCriterion("airtemp not like", value, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempIn(List<String> values) {
            addCriterion("airtemp in", values, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempNotIn(List<String> values) {
            addCriterion("airtemp not in", values, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempBetween(String value1, String value2) {
            addCriterion("airtemp between", value1, value2, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirtempNotBetween(String value1, String value2) {
            addCriterion("airtemp not between", value1, value2, "airtemp");
            return (Criteria) this;
        }

        public Criteria andAirhumiIsNull() {
            addCriterion("airhumi is null");
            return (Criteria) this;
        }

        public Criteria andAirhumiIsNotNull() {
            addCriterion("airhumi is not null");
            return (Criteria) this;
        }

        public Criteria andAirhumiEqualTo(String value) {
            addCriterion("airhumi =", value, "airhumi");
            return (Criteria) this;
        }

        public Criteria andAirhumiNotEqualTo(String value) {
            addCriterion("airhumi <>", value, "airhumi");
            return (Criteria) this;
        }

        public Criteria andAirhumiGreaterThan(String value) {
            addCriterion("airhumi >", value, "airhumi");
            return (Criteria) this;
        }

        public Criteria andAirhumiGreaterThanOrEqualTo(String value) {
            addCriterion("airhumi >=", value, "airhumi");
            return (Criteria) this;
        }

        public Criteria andAirhumiLessThan(String value) {
            addCriterion("airhumi <", value, "airhumi");
            return (Criteria) this;
        }

        public Criteria andAirhumiLessThanOrEqualTo(String value) {
            addCriterion("airhumi <=", value, "airhumi");
            return (Criteria) this;
        }

        public Criteria andAirhumiLike(String value) {
            addCriterion("airhumi like", value, "airhumi");
            return (Criteria) this;
        }

        public Criteria andAirhumiNotLike(String value) {
            addCriterion("airhumi not like", value, "airhumi");
            return (Criteria) this;
        }

        public Criteria andAirhumiIn(List<String> values) {
            addCriterion("airhumi in", values, "airhumi");
            return (Criteria) this;
        }

        public Criteria andAirhumiNotIn(List<String> values) {
            addCriterion("airhumi not in", values, "airhumi");
            return (Criteria) this;
        }

        public Criteria andAirhumiBetween(String value1, String value2) {
            addCriterion("airhumi between", value1, value2, "airhumi");
            return (Criteria) this;
        }

        public Criteria andAirhumiNotBetween(String value1, String value2) {
            addCriterion("airhumi not between", value1, value2, "airhumi");
            return (Criteria) this;
        }

        public Criteria andSoilhumi1IsNull() {
            addCriterion("soilhumi1 is null");
            return (Criteria) this;
        }

        public Criteria andSoilhumi1IsNotNull() {
            addCriterion("soilhumi1 is not null");
            return (Criteria) this;
        }

        public Criteria andSoilhumi1EqualTo(String value) {
            addCriterion("soilhumi1 =", value, "soilhumi1");
            return (Criteria) this;
        }

        public Criteria andSoilhumi1NotEqualTo(String value) {
            addCriterion("soilhumi1 <>", value, "soilhumi1");
            return (Criteria) this;
        }

        public Criteria andSoilhumi1GreaterThan(String value) {
            addCriterion("soilhumi1 >", value, "soilhumi1");
            return (Criteria) this;
        }

        public Criteria andSoilhumi1GreaterThanOrEqualTo(String value) {
            addCriterion("soilhumi1 >=", value, "soilhumi1");
            return (Criteria) this;
        }

        public Criteria andSoilhumi1LessThan(String value) {
            addCriterion("soilhumi1 <", value, "soilhumi1");
            return (Criteria) this;
        }

        public Criteria andSoilhumi1LessThanOrEqualTo(String value) {
            addCriterion("soilhumi1 <=", value, "soilhumi1");
            return (Criteria) this;
        }

        public Criteria andSoilhumi1Like(String value) {
            addCriterion("soilhumi1 like", value, "soilhumi1");
            return (Criteria) this;
        }

        public Criteria andSoilhumi1NotLike(String value) {
            addCriterion("soilhumi1 not like", value, "soilhumi1");
            return (Criteria) this;
        }

        public Criteria andSoilhumi1In(List<String> values) {
            addCriterion("soilhumi1 in", values, "soilhumi1");
            return (Criteria) this;
        }

        public Criteria andSoilhumi1NotIn(List<String> values) {
            addCriterion("soilhumi1 not in", values, "soilhumi1");
            return (Criteria) this;
        }

        public Criteria andSoilhumi1Between(String value1, String value2) {
            addCriterion("soilhumi1 between", value1, value2, "soilhumi1");
            return (Criteria) this;
        }

        public Criteria andSoilhumi1NotBetween(String value1, String value2) {
            addCriterion("soilhumi1 not between", value1, value2, "soilhumi1");
            return (Criteria) this;
        }

        public Criteria andSoilhumi2IsNull() {
            addCriterion("soilhumi2 is null");
            return (Criteria) this;
        }

        public Criteria andSoilhumi2IsNotNull() {
            addCriterion("soilhumi2 is not null");
            return (Criteria) this;
        }

        public Criteria andSoilhumi2EqualTo(String value) {
            addCriterion("soilhumi2 =", value, "soilhumi2");
            return (Criteria) this;
        }

        public Criteria andSoilhumi2NotEqualTo(String value) {
            addCriterion("soilhumi2 <>", value, "soilhumi2");
            return (Criteria) this;
        }

        public Criteria andSoilhumi2GreaterThan(String value) {
            addCriterion("soilhumi2 >", value, "soilhumi2");
            return (Criteria) this;
        }

        public Criteria andSoilhumi2GreaterThanOrEqualTo(String value) {
            addCriterion("soilhumi2 >=", value, "soilhumi2");
            return (Criteria) this;
        }

        public Criteria andSoilhumi2LessThan(String value) {
            addCriterion("soilhumi2 <", value, "soilhumi2");
            return (Criteria) this;
        }

        public Criteria andSoilhumi2LessThanOrEqualTo(String value) {
            addCriterion("soilhumi2 <=", value, "soilhumi2");
            return (Criteria) this;
        }

        public Criteria andSoilhumi2Like(String value) {
            addCriterion("soilhumi2 like", value, "soilhumi2");
            return (Criteria) this;
        }

        public Criteria andSoilhumi2NotLike(String value) {
            addCriterion("soilhumi2 not like", value, "soilhumi2");
            return (Criteria) this;
        }

        public Criteria andSoilhumi2In(List<String> values) {
            addCriterion("soilhumi2 in", values, "soilhumi2");
            return (Criteria) this;
        }

        public Criteria andSoilhumi2NotIn(List<String> values) {
            addCriterion("soilhumi2 not in", values, "soilhumi2");
            return (Criteria) this;
        }

        public Criteria andSoilhumi2Between(String value1, String value2) {
            addCriterion("soilhumi2 between", value1, value2, "soilhumi2");
            return (Criteria) this;
        }

        public Criteria andSoilhumi2NotBetween(String value1, String value2) {
            addCriterion("soilhumi2 not between", value1, value2, "soilhumi2");
            return (Criteria) this;
        }

        public Criteria andPlotidIsNull() {
            addCriterion("plotid is null");
            return (Criteria) this;
        }

        public Criteria andPlotidIsNotNull() {
            addCriterion("plotid is not null");
            return (Criteria) this;
        }

        public Criteria andPlotidEqualTo(String value) {
            addCriterion("plotid =", value, "plotid");
            return (Criteria) this;
        }

        public Criteria andPlotidNotEqualTo(String value) {
            addCriterion("plotid <>", value, "plotid");
            return (Criteria) this;
        }

        public Criteria andPlotidGreaterThan(String value) {
            addCriterion("plotid >", value, "plotid");
            return (Criteria) this;
        }

        public Criteria andPlotidGreaterThanOrEqualTo(String value) {
            addCriterion("plotid >=", value, "plotid");
            return (Criteria) this;
        }

        public Criteria andPlotidLessThan(String value) {
            addCriterion("plotid <", value, "plotid");
            return (Criteria) this;
        }

        public Criteria andPlotidLessThanOrEqualTo(String value) {
            addCriterion("plotid <=", value, "plotid");
            return (Criteria) this;
        }

        public Criteria andPlotidLike(String value) {
            addCriterion("plotid like", value, "plotid");
            return (Criteria) this;
        }

        public Criteria andPlotidNotLike(String value) {
            addCriterion("plotid not like", value, "plotid");
            return (Criteria) this;
        }

        public Criteria andPlotidIn(List<String> values) {
            addCriterion("plotid in", values, "plotid");
            return (Criteria) this;
        }

        public Criteria andPlotidNotIn(List<String> values) {
            addCriterion("plotid not in", values, "plotid");
            return (Criteria) this;
        }

        public Criteria andPlotidBetween(String value1, String value2) {
            addCriterion("plotid between", value1, value2, "plotid");
            return (Criteria) this;
        }

        public Criteria andPlotidNotBetween(String value1, String value2) {
            addCriterion("plotid not between", value1, value2, "plotid");
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