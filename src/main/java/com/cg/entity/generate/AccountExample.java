package com.cg.entity.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordIsNull() {
            addCriterion("account_password is null");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordIsNotNull() {
            addCriterion("account_password is not null");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordEqualTo(String value) {
            addCriterion("account_password =", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotEqualTo(String value) {
            addCriterion("account_password <>", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordGreaterThan(String value) {
            addCriterion("account_password >", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("account_password >=", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordLessThan(String value) {
            addCriterion("account_password <", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordLessThanOrEqualTo(String value) {
            addCriterion("account_password <=", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordLike(String value) {
            addCriterion("account_password like", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotLike(String value) {
            addCriterion("account_password not like", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordIn(List<String> values) {
            addCriterion("account_password in", values, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotIn(List<String> values) {
            addCriterion("account_password not in", values, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordBetween(String value1, String value2) {
            addCriterion("account_password between", value1, value2, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotBetween(String value1, String value2) {
            addCriterion("account_password not between", value1, value2, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountEmailIsNull() {
            addCriterion("account_email is null");
            return (Criteria) this;
        }

        public Criteria andAccountEmailIsNotNull() {
            addCriterion("account_email is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEmailEqualTo(String value) {
            addCriterion("account_email =", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotEqualTo(String value) {
            addCriterion("account_email <>", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailGreaterThan(String value) {
            addCriterion("account_email >", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailGreaterThanOrEqualTo(String value) {
            addCriterion("account_email >=", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLessThan(String value) {
            addCriterion("account_email <", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLessThanOrEqualTo(String value) {
            addCriterion("account_email <=", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLike(String value) {
            addCriterion("account_email like", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotLike(String value) {
            addCriterion("account_email not like", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailIn(List<String> values) {
            addCriterion("account_email in", values, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotIn(List<String> values) {
            addCriterion("account_email not in", values, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailBetween(String value1, String value2) {
            addCriterion("account_email between", value1, value2, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotBetween(String value1, String value2) {
            addCriterion("account_email not between", value1, value2, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountAgeIsNull() {
            addCriterion("account_age is null");
            return (Criteria) this;
        }

        public Criteria andAccountAgeIsNotNull() {
            addCriterion("account_age is not null");
            return (Criteria) this;
        }

        public Criteria andAccountAgeEqualTo(Integer value) {
            addCriterion("account_age =", value, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeNotEqualTo(Integer value) {
            addCriterion("account_age <>", value, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeGreaterThan(Integer value) {
            addCriterion("account_age >", value, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_age >=", value, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeLessThan(Integer value) {
            addCriterion("account_age <", value, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeLessThanOrEqualTo(Integer value) {
            addCriterion("account_age <=", value, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeIn(List<Integer> values) {
            addCriterion("account_age in", values, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeNotIn(List<Integer> values) {
            addCriterion("account_age not in", values, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeBetween(Integer value1, Integer value2) {
            addCriterion("account_age between", value1, value2, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("account_age not between", value1, value2, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountSexIsNull() {
            addCriterion("account_sex is null");
            return (Criteria) this;
        }

        public Criteria andAccountSexIsNotNull() {
            addCriterion("account_sex is not null");
            return (Criteria) this;
        }

        public Criteria andAccountSexEqualTo(Integer value) {
            addCriterion("account_sex =", value, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexNotEqualTo(Integer value) {
            addCriterion("account_sex <>", value, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexGreaterThan(Integer value) {
            addCriterion("account_sex >", value, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_sex >=", value, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexLessThan(Integer value) {
            addCriterion("account_sex <", value, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexLessThanOrEqualTo(Integer value) {
            addCriterion("account_sex <=", value, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexIn(List<Integer> values) {
            addCriterion("account_sex in", values, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexNotIn(List<Integer> values) {
            addCriterion("account_sex not in", values, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexBetween(Integer value1, Integer value2) {
            addCriterion("account_sex between", value1, value2, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexNotBetween(Integer value1, Integer value2) {
            addCriterion("account_sex not between", value1, value2, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountTelIsNull() {
            addCriterion("account_tel is null");
            return (Criteria) this;
        }

        public Criteria andAccountTelIsNotNull() {
            addCriterion("account_tel is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTelEqualTo(String value) {
            addCriterion("account_tel =", value, "accountTel");
            return (Criteria) this;
        }

        public Criteria andAccountTelNotEqualTo(String value) {
            addCriterion("account_tel <>", value, "accountTel");
            return (Criteria) this;
        }

        public Criteria andAccountTelGreaterThan(String value) {
            addCriterion("account_tel >", value, "accountTel");
            return (Criteria) this;
        }

        public Criteria andAccountTelGreaterThanOrEqualTo(String value) {
            addCriterion("account_tel >=", value, "accountTel");
            return (Criteria) this;
        }

        public Criteria andAccountTelLessThan(String value) {
            addCriterion("account_tel <", value, "accountTel");
            return (Criteria) this;
        }

        public Criteria andAccountTelLessThanOrEqualTo(String value) {
            addCriterion("account_tel <=", value, "accountTel");
            return (Criteria) this;
        }

        public Criteria andAccountTelLike(String value) {
            addCriterion("account_tel like", value, "accountTel");
            return (Criteria) this;
        }

        public Criteria andAccountTelNotLike(String value) {
            addCriterion("account_tel not like", value, "accountTel");
            return (Criteria) this;
        }

        public Criteria andAccountTelIn(List<String> values) {
            addCriterion("account_tel in", values, "accountTel");
            return (Criteria) this;
        }

        public Criteria andAccountTelNotIn(List<String> values) {
            addCriterion("account_tel not in", values, "accountTel");
            return (Criteria) this;
        }

        public Criteria andAccountTelBetween(String value1, String value2) {
            addCriterion("account_tel between", value1, value2, "accountTel");
            return (Criteria) this;
        }

        public Criteria andAccountTelNotBetween(String value1, String value2) {
            addCriterion("account_tel not between", value1, value2, "accountTel");
            return (Criteria) this;
        }

        public Criteria andAccountAddressIsNull() {
            addCriterion("account_address is null");
            return (Criteria) this;
        }

        public Criteria andAccountAddressIsNotNull() {
            addCriterion("account_address is not null");
            return (Criteria) this;
        }

        public Criteria andAccountAddressEqualTo(String value) {
            addCriterion("account_address =", value, "accountAddress");
            return (Criteria) this;
        }

        public Criteria andAccountAddressNotEqualTo(String value) {
            addCriterion("account_address <>", value, "accountAddress");
            return (Criteria) this;
        }

        public Criteria andAccountAddressGreaterThan(String value) {
            addCriterion("account_address >", value, "accountAddress");
            return (Criteria) this;
        }

        public Criteria andAccountAddressGreaterThanOrEqualTo(String value) {
            addCriterion("account_address >=", value, "accountAddress");
            return (Criteria) this;
        }

        public Criteria andAccountAddressLessThan(String value) {
            addCriterion("account_address <", value, "accountAddress");
            return (Criteria) this;
        }

        public Criteria andAccountAddressLessThanOrEqualTo(String value) {
            addCriterion("account_address <=", value, "accountAddress");
            return (Criteria) this;
        }

        public Criteria andAccountAddressLike(String value) {
            addCriterion("account_address like", value, "accountAddress");
            return (Criteria) this;
        }

        public Criteria andAccountAddressNotLike(String value) {
            addCriterion("account_address not like", value, "accountAddress");
            return (Criteria) this;
        }

        public Criteria andAccountAddressIn(List<String> values) {
            addCriterion("account_address in", values, "accountAddress");
            return (Criteria) this;
        }

        public Criteria andAccountAddressNotIn(List<String> values) {
            addCriterion("account_address not in", values, "accountAddress");
            return (Criteria) this;
        }

        public Criteria andAccountAddressBetween(String value1, String value2) {
            addCriterion("account_address between", value1, value2, "accountAddress");
            return (Criteria) this;
        }

        public Criteria andAccountAddressNotBetween(String value1, String value2) {
            addCriterion("account_address not between", value1, value2, "accountAddress");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andAccountAutographIsNull() {
            addCriterion("account_autograph is null");
            return (Criteria) this;
        }

        public Criteria andAccountAutographIsNotNull() {
            addCriterion("account_autograph is not null");
            return (Criteria) this;
        }

        public Criteria andAccountAutographEqualTo(String value) {
            addCriterion("account_autograph =", value, "accountAutograph");
            return (Criteria) this;
        }

        public Criteria andAccountAutographNotEqualTo(String value) {
            addCriterion("account_autograph <>", value, "accountAutograph");
            return (Criteria) this;
        }

        public Criteria andAccountAutographGreaterThan(String value) {
            addCriterion("account_autograph >", value, "accountAutograph");
            return (Criteria) this;
        }

        public Criteria andAccountAutographGreaterThanOrEqualTo(String value) {
            addCriterion("account_autograph >=", value, "accountAutograph");
            return (Criteria) this;
        }

        public Criteria andAccountAutographLessThan(String value) {
            addCriterion("account_autograph <", value, "accountAutograph");
            return (Criteria) this;
        }

        public Criteria andAccountAutographLessThanOrEqualTo(String value) {
            addCriterion("account_autograph <=", value, "accountAutograph");
            return (Criteria) this;
        }

        public Criteria andAccountAutographLike(String value) {
            addCriterion("account_autograph like", value, "accountAutograph");
            return (Criteria) this;
        }

        public Criteria andAccountAutographNotLike(String value) {
            addCriterion("account_autograph not like", value, "accountAutograph");
            return (Criteria) this;
        }

        public Criteria andAccountAutographIn(List<String> values) {
            addCriterion("account_autograph in", values, "accountAutograph");
            return (Criteria) this;
        }

        public Criteria andAccountAutographNotIn(List<String> values) {
            addCriterion("account_autograph not in", values, "accountAutograph");
            return (Criteria) this;
        }

        public Criteria andAccountAutographBetween(String value1, String value2) {
            addCriterion("account_autograph between", value1, value2, "accountAutograph");
            return (Criteria) this;
        }

        public Criteria andAccountAutographNotBetween(String value1, String value2) {
            addCriterion("account_autograph not between", value1, value2, "accountAutograph");
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