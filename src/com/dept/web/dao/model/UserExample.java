package com.dept.web.dao.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserExample {
    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user
     */
    protected String orderByClause;

    /**
     * 自动生成的代码.
     * 该字段对应的数据库 tb_user
     */
    protected List<Criteria> oredCriteria;

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 
     */
    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 
     */
    protected UserExample(UserExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_user
     * 
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * 自动生成的代码.
     * 该类对应的数据库 tb_user
     */
    public static class Criteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return this;
        }

        public Criteria andRoleEqualTo(Integer value) {
            addCriterion("role =", value, "role");
            return this;
        }

        public Criteria andRoleNotEqualTo(Integer value) {
            addCriterion("role <>", value, "role");
            return this;
        }

        public Criteria andRoleGreaterThan(Integer value) {
            addCriterion("role >", value, "role");
            return this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("role >=", value, "role");
            return this;
        }

        public Criteria andRoleLessThan(Integer value) {
            addCriterion("role <", value, "role");
            return this;
        }

        public Criteria andRoleLessThanOrEqualTo(Integer value) {
            addCriterion("role <=", value, "role");
            return this;
        }

        public Criteria andRoleIn(List<Integer> values) {
            addCriterion("role in", values, "role");
            return this;
        }

        public Criteria andRoleNotIn(List<Integer> values) {
            addCriterion("role not in", values, "role");
            return this;
        }

        public Criteria andRoleBetween(Integer value1, Integer value2) {
            addCriterion("role between", value1, value2, "role");
            return this;
        }

        public Criteria andRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("role not between", value1, value2, "role");
            return this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return this;
        }

        public Criteria andPasswordHashIsNull() {
            addCriterion("password_hash is null");
            return this;
        }

        public Criteria andPasswordHashIsNotNull() {
            addCriterion("password_hash is not null");
            return this;
        }

        public Criteria andPasswordHashEqualTo(String value) {
            addCriterion("password_hash =", value, "passwordHash");
            return this;
        }

        public Criteria andPasswordHashNotEqualTo(String value) {
            addCriterion("password_hash <>", value, "passwordHash");
            return this;
        }

        public Criteria andPasswordHashGreaterThan(String value) {
            addCriterion("password_hash >", value, "passwordHash");
            return this;
        }

        public Criteria andPasswordHashGreaterThanOrEqualTo(String value) {
            addCriterion("password_hash >=", value, "passwordHash");
            return this;
        }

        public Criteria andPasswordHashLessThan(String value) {
            addCriterion("password_hash <", value, "passwordHash");
            return this;
        }

        public Criteria andPasswordHashLessThanOrEqualTo(String value) {
            addCriterion("password_hash <=", value, "passwordHash");
            return this;
        }

        public Criteria andPasswordHashLike(String value) {
            addCriterion("password_hash like", value, "passwordHash");
            return this;
        }

        public Criteria andPasswordHashNotLike(String value) {
            addCriterion("password_hash not like", value, "passwordHash");
            return this;
        }

        public Criteria andPasswordHashIn(List<String> values) {
            addCriterion("password_hash in", values, "passwordHash");
            return this;
        }

        public Criteria andPasswordHashNotIn(List<String> values) {
            addCriterion("password_hash not in", values, "passwordHash");
            return this;
        }

        public Criteria andPasswordHashBetween(String value1, String value2) {
            addCriterion("password_hash between", value1, value2, "passwordHash");
            return this;
        }

        public Criteria andPasswordHashNotBetween(String value1, String value2) {
            addCriterion("password_hash not between", value1, value2, "passwordHash");
            return this;
        }

        public Criteria andPasswordPayHashIsNull() {
            addCriterion("password_pay_hash is null");
            return this;
        }

        public Criteria andPasswordPayHashIsNotNull() {
            addCriterion("password_pay_hash is not null");
            return this;
        }

        public Criteria andPasswordPayHashEqualTo(String value) {
            addCriterion("password_pay_hash =", value, "passwordPayHash");
            return this;
        }

        public Criteria andPasswordPayHashNotEqualTo(String value) {
            addCriterion("password_pay_hash <>", value, "passwordPayHash");
            return this;
        }

        public Criteria andPasswordPayHashGreaterThan(String value) {
            addCriterion("password_pay_hash >", value, "passwordPayHash");
            return this;
        }

        public Criteria andPasswordPayHashGreaterThanOrEqualTo(String value) {
            addCriterion("password_pay_hash >=", value, "passwordPayHash");
            return this;
        }

        public Criteria andPasswordPayHashLessThan(String value) {
            addCriterion("password_pay_hash <", value, "passwordPayHash");
            return this;
        }

        public Criteria andPasswordPayHashLessThanOrEqualTo(String value) {
            addCriterion("password_pay_hash <=", value, "passwordPayHash");
            return this;
        }

        public Criteria andPasswordPayHashLike(String value) {
            addCriterion("password_pay_hash like", value, "passwordPayHash");
            return this;
        }

        public Criteria andPasswordPayHashNotLike(String value) {
            addCriterion("password_pay_hash not like", value, "passwordPayHash");
            return this;
        }

        public Criteria andPasswordPayHashIn(List<String> values) {
            addCriterion("password_pay_hash in", values, "passwordPayHash");
            return this;
        }

        public Criteria andPasswordPayHashNotIn(List<String> values) {
            addCriterion("password_pay_hash not in", values, "passwordPayHash");
            return this;
        }

        public Criteria andPasswordPayHashBetween(String value1, String value2) {
            addCriterion("password_pay_hash between", value1, value2, "passwordPayHash");
            return this;
        }

        public Criteria andPasswordPayHashNotBetween(String value1, String value2) {
            addCriterion("password_pay_hash not between", value1, value2, "passwordPayHash");
            return this;
        }

        public Criteria andPasswordResetTokenIsNull() {
            addCriterion("password_reset_token is null");
            return this;
        }

        public Criteria andPasswordResetTokenIsNotNull() {
            addCriterion("password_reset_token is not null");
            return this;
        }

        public Criteria andPasswordResetTokenEqualTo(String value) {
            addCriterion("password_reset_token =", value, "passwordResetToken");
            return this;
        }

        public Criteria andPasswordResetTokenNotEqualTo(String value) {
            addCriterion("password_reset_token <>", value, "passwordResetToken");
            return this;
        }

        public Criteria andPasswordResetTokenGreaterThan(String value) {
            addCriterion("password_reset_token >", value, "passwordResetToken");
            return this;
        }

        public Criteria andPasswordResetTokenGreaterThanOrEqualTo(String value) {
            addCriterion("password_reset_token >=", value, "passwordResetToken");
            return this;
        }

        public Criteria andPasswordResetTokenLessThan(String value) {
            addCriterion("password_reset_token <", value, "passwordResetToken");
            return this;
        }

        public Criteria andPasswordResetTokenLessThanOrEqualTo(String value) {
            addCriterion("password_reset_token <=", value, "passwordResetToken");
            return this;
        }

        public Criteria andPasswordResetTokenLike(String value) {
            addCriterion("password_reset_token like", value, "passwordResetToken");
            return this;
        }

        public Criteria andPasswordResetTokenNotLike(String value) {
            addCriterion("password_reset_token not like", value, "passwordResetToken");
            return this;
        }

        public Criteria andPasswordResetTokenIn(List<String> values) {
            addCriterion("password_reset_token in", values, "passwordResetToken");
            return this;
        }

        public Criteria andPasswordResetTokenNotIn(List<String> values) {
            addCriterion("password_reset_token not in", values, "passwordResetToken");
            return this;
        }

        public Criteria andPasswordResetTokenBetween(String value1, String value2) {
            addCriterion("password_reset_token between", value1, value2, "passwordResetToken");
            return this;
        }

        public Criteria andPasswordResetTokenNotBetween(String value1, String value2) {
            addCriterion("password_reset_token not between", value1, value2, "passwordResetToken");
            return this;
        }

        public Criteria andAuthKeyIsNull() {
            addCriterion("auth_key is null");
            return this;
        }

        public Criteria andAuthKeyIsNotNull() {
            addCriterion("auth_key is not null");
            return this;
        }

        public Criteria andAuthKeyEqualTo(String value) {
            addCriterion("auth_key =", value, "authKey");
            return this;
        }

        public Criteria andAuthKeyNotEqualTo(String value) {
            addCriterion("auth_key <>", value, "authKey");
            return this;
        }

        public Criteria andAuthKeyGreaterThan(String value) {
            addCriterion("auth_key >", value, "authKey");
            return this;
        }

        public Criteria andAuthKeyGreaterThanOrEqualTo(String value) {
            addCriterion("auth_key >=", value, "authKey");
            return this;
        }

        public Criteria andAuthKeyLessThan(String value) {
            addCriterion("auth_key <", value, "authKey");
            return this;
        }

        public Criteria andAuthKeyLessThanOrEqualTo(String value) {
            addCriterion("auth_key <=", value, "authKey");
            return this;
        }

        public Criteria andAuthKeyLike(String value) {
            addCriterion("auth_key like", value, "authKey");
            return this;
        }

        public Criteria andAuthKeyNotLike(String value) {
            addCriterion("auth_key not like", value, "authKey");
            return this;
        }

        public Criteria andAuthKeyIn(List<String> values) {
            addCriterion("auth_key in", values, "authKey");
            return this;
        }

        public Criteria andAuthKeyNotIn(List<String> values) {
            addCriterion("auth_key not in", values, "authKey");
            return this;
        }

        public Criteria andAuthKeyBetween(String value1, String value2) {
            addCriterion("auth_key between", value1, value2, "authKey");
            return this;
        }

        public Criteria andAuthKeyNotBetween(String value1, String value2) {
            addCriterion("auth_key not between", value1, value2, "authKey");
            return this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return this;
        }

        public Criteria andLitpicIsNull() {
            addCriterion("litpic is null");
            return this;
        }

        public Criteria andLitpicIsNotNull() {
            addCriterion("litpic is not null");
            return this;
        }

        public Criteria andLitpicEqualTo(String value) {
            addCriterion("litpic =", value, "litpic");
            return this;
        }

        public Criteria andLitpicNotEqualTo(String value) {
            addCriterion("litpic <>", value, "litpic");
            return this;
        }

        public Criteria andLitpicGreaterThan(String value) {
            addCriterion("litpic >", value, "litpic");
            return this;
        }

        public Criteria andLitpicGreaterThanOrEqualTo(String value) {
            addCriterion("litpic >=", value, "litpic");
            return this;
        }

        public Criteria andLitpicLessThan(String value) {
            addCriterion("litpic <", value, "litpic");
            return this;
        }

        public Criteria andLitpicLessThanOrEqualTo(String value) {
            addCriterion("litpic <=", value, "litpic");
            return this;
        }

        public Criteria andLitpicLike(String value) {
            addCriterion("litpic like", value, "litpic");
            return this;
        }

        public Criteria andLitpicNotLike(String value) {
            addCriterion("litpic not like", value, "litpic");
            return this;
        }

        public Criteria andLitpicIn(List<String> values) {
            addCriterion("litpic in", values, "litpic");
            return this;
        }

        public Criteria andLitpicNotIn(List<String> values) {
            addCriterion("litpic not in", values, "litpic");
            return this;
        }

        public Criteria andLitpicBetween(String value1, String value2) {
            addCriterion("litpic between", value1, value2, "litpic");
            return this;
        }

        public Criteria andLitpicNotBetween(String value1, String value2) {
            addCriterion("litpic not between", value1, value2, "litpic");
            return this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return this;
        }

        public Criteria andEmailBindingStatusIsNull() {
            addCriterion("email_binding_status is null");
            return this;
        }

        public Criteria andEmailBindingStatusIsNotNull() {
            addCriterion("email_binding_status is not null");
            return this;
        }

        public Criteria andEmailBindingStatusEqualTo(Byte value) {
            addCriterion("email_binding_status =", value, "emailBindingStatus");
            return this;
        }

        public Criteria andEmailBindingStatusNotEqualTo(Byte value) {
            addCriterion("email_binding_status <>", value, "emailBindingStatus");
            return this;
        }

        public Criteria andEmailBindingStatusGreaterThan(Byte value) {
            addCriterion("email_binding_status >", value, "emailBindingStatus");
            return this;
        }

        public Criteria andEmailBindingStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("email_binding_status >=", value, "emailBindingStatus");
            return this;
        }

        public Criteria andEmailBindingStatusLessThan(Byte value) {
            addCriterion("email_binding_status <", value, "emailBindingStatus");
            return this;
        }

        public Criteria andEmailBindingStatusLessThanOrEqualTo(Byte value) {
            addCriterion("email_binding_status <=", value, "emailBindingStatus");
            return this;
        }

        public Criteria andEmailBindingStatusIn(List<Byte> values) {
            addCriterion("email_binding_status in", values, "emailBindingStatus");
            return this;
        }

        public Criteria andEmailBindingStatusNotIn(List<Byte> values) {
            addCriterion("email_binding_status not in", values, "emailBindingStatus");
            return this;
        }

        public Criteria andEmailBindingStatusBetween(Byte value1, Byte value2) {
            addCriterion("email_binding_status between", value1, value2, "emailBindingStatus");
            return this;
        }

        public Criteria andEmailBindingStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("email_binding_status not between", value1, value2, "emailBindingStatus");
            return this;
        }

        public Criteria andMobileBindingStatusIsNull() {
            addCriterion("mobile_binding_status is null");
            return this;
        }

        public Criteria andMobileBindingStatusIsNotNull() {
            addCriterion("mobile_binding_status is not null");
            return this;
        }

        public Criteria andMobileBindingStatusEqualTo(Integer value) {
            addCriterion("mobile_binding_status =", value, "mobileBindingStatus");
            return this;
        }

        public Criteria andMobileBindingStatusNotEqualTo(Integer value) {
            addCriterion("mobile_binding_status <>", value, "mobileBindingStatus");
            return this;
        }

        public Criteria andMobileBindingStatusGreaterThan(Integer value) {
            addCriterion("mobile_binding_status >", value, "mobileBindingStatus");
            return this;
        }

        public Criteria andMobileBindingStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("mobile_binding_status >=", value, "mobileBindingStatus");
            return this;
        }

        public Criteria andMobileBindingStatusLessThan(Integer value) {
            addCriterion("mobile_binding_status <", value, "mobileBindingStatus");
            return this;
        }

        public Criteria andMobileBindingStatusLessThanOrEqualTo(Integer value) {
            addCriterion("mobile_binding_status <=", value, "mobileBindingStatus");
            return this;
        }

        public Criteria andMobileBindingStatusIn(List<Integer> values) {
            addCriterion("mobile_binding_status in", values, "mobileBindingStatus");
            return this;
        }

        public Criteria andMobileBindingStatusNotIn(List<Integer> values) {
            addCriterion("mobile_binding_status not in", values, "mobileBindingStatus");
            return this;
        }

        public Criteria andMobileBindingStatusBetween(Integer value1, Integer value2) {
            addCriterion("mobile_binding_status between", value1, value2, "mobileBindingStatus");
            return this;
        }

        public Criteria andMobileBindingStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("mobile_binding_status not between", value1, value2, "mobileBindingStatus");
            return this;
        }

        public Criteria andRealVerifyStatusIsNull() {
            addCriterion("real_verify_status is null");
            return this;
        }

        public Criteria andRealVerifyStatusIsNotNull() {
            addCriterion("real_verify_status is not null");
            return this;
        }

        public Criteria andRealVerifyStatusEqualTo(Integer value) {
            addCriterion("real_verify_status =", value, "realVerifyStatus");
            return this;
        }

        public Criteria andRealVerifyStatusNotEqualTo(Integer value) {
            addCriterion("real_verify_status <>", value, "realVerifyStatus");
            return this;
        }

        public Criteria andRealVerifyStatusGreaterThan(Integer value) {
            addCriterion("real_verify_status >", value, "realVerifyStatus");
            return this;
        }

        public Criteria andRealVerifyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_verify_status >=", value, "realVerifyStatus");
            return this;
        }

        public Criteria andRealVerifyStatusLessThan(Integer value) {
            addCriterion("real_verify_status <", value, "realVerifyStatus");
            return this;
        }

        public Criteria andRealVerifyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("real_verify_status <=", value, "realVerifyStatus");
            return this;
        }

        public Criteria andRealVerifyStatusIn(List<Integer> values) {
            addCriterion("real_verify_status in", values, "realVerifyStatus");
            return this;
        }

        public Criteria andRealVerifyStatusNotIn(List<Integer> values) {
            addCriterion("real_verify_status not in", values, "realVerifyStatus");
            return this;
        }

        public Criteria andRealVerifyStatusBetween(Integer value1, Integer value2) {
            addCriterion("real_verify_status between", value1, value2, "realVerifyStatus");
            return this;
        }

        public Criteria andRealVerifyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("real_verify_status not between", value1, value2, "realVerifyStatus");
            return this;
        }

        public Criteria andCardBindingStatusIsNull() {
            addCriterion("card_binding_status is null");
            return this;
        }

        public Criteria andCardBindingStatusIsNotNull() {
            addCriterion("card_binding_status is not null");
            return this;
        }

        public Criteria andCardBindingStatusEqualTo(Integer value) {
            addCriterion("card_binding_status =", value, "cardBindingStatus");
            return this;
        }

        public Criteria andCardBindingStatusNotEqualTo(Integer value) {
            addCriterion("card_binding_status <>", value, "cardBindingStatus");
            return this;
        }

        public Criteria andCardBindingStatusGreaterThan(Integer value) {
            addCriterion("card_binding_status >", value, "cardBindingStatus");
            return this;
        }

        public Criteria andCardBindingStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_binding_status >=", value, "cardBindingStatus");
            return this;
        }

        public Criteria andCardBindingStatusLessThan(Integer value) {
            addCriterion("card_binding_status <", value, "cardBindingStatus");
            return this;
        }

        public Criteria andCardBindingStatusLessThanOrEqualTo(Integer value) {
            addCriterion("card_binding_status <=", value, "cardBindingStatus");
            return this;
        }

        public Criteria andCardBindingStatusIn(List<Integer> values) {
            addCriterion("card_binding_status in", values, "cardBindingStatus");
            return this;
        }

        public Criteria andCardBindingStatusNotIn(List<Integer> values) {
            addCriterion("card_binding_status not in", values, "cardBindingStatus");
            return this;
        }

        public Criteria andCardBindingStatusBetween(Integer value1, Integer value2) {
            addCriterion("card_binding_status between", value1, value2, "cardBindingStatus");
            return this;
        }

        public Criteria andCardBindingStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("card_binding_status not between", value1, value2, "cardBindingStatus");
            return this;
        }

        public Criteria andCardIdBaseIsNull() {
            addCriterion("card_id_base is null");
            return this;
        }

        public Criteria andCardIdBaseIsNotNull() {
            addCriterion("card_id_base is not null");
            return this;
        }

        public Criteria andCardIdBaseEqualTo(Integer value) {
            addCriterion("card_id_base =", value, "cardIdBase");
            return this;
        }

        public Criteria andCardIdBaseNotEqualTo(Integer value) {
            addCriterion("card_id_base <>", value, "cardIdBase");
            return this;
        }

        public Criteria andCardIdBaseGreaterThan(Integer value) {
            addCriterion("card_id_base >", value, "cardIdBase");
            return this;
        }

        public Criteria andCardIdBaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_id_base >=", value, "cardIdBase");
            return this;
        }

        public Criteria andCardIdBaseLessThan(Integer value) {
            addCriterion("card_id_base <", value, "cardIdBase");
            return this;
        }

        public Criteria andCardIdBaseLessThanOrEqualTo(Integer value) {
            addCriterion("card_id_base <=", value, "cardIdBase");
            return this;
        }

        public Criteria andCardIdBaseIn(List<Integer> values) {
            addCriterion("card_id_base in", values, "cardIdBase");
            return this;
        }

        public Criteria andCardIdBaseNotIn(List<Integer> values) {
            addCriterion("card_id_base not in", values, "cardIdBase");
            return this;
        }

        public Criteria andCardIdBaseBetween(Integer value1, Integer value2) {
            addCriterion("card_id_base between", value1, value2, "cardIdBase");
            return this;
        }

        public Criteria andCardIdBaseNotBetween(Integer value1, Integer value2) {
            addCriterion("card_id_base not between", value1, value2, "cardIdBase");
            return this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return this;
        }

        public Criteria andCreatedAtEqualTo(Integer value) {
            addCriterion("created_at =", value, "createdAt");
            return this;
        }

        public Criteria andCreatedAtNotEqualTo(Integer value) {
            addCriterion("created_at <>", value, "createdAt");
            return this;
        }

        public Criteria andCreatedAtGreaterThan(Integer value) {
            addCriterion("created_at >", value, "createdAt");
            return this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_at >=", value, "createdAt");
            return this;
        }

        public Criteria andCreatedAtLessThan(Integer value) {
            addCriterion("created_at <", value, "createdAt");
            return this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Integer value) {
            addCriterion("created_at <=", value, "createdAt");
            return this;
        }

        public Criteria andCreatedAtIn(List<Integer> values) {
            addCriterion("created_at in", values, "createdAt");
            return this;
        }

        public Criteria andCreatedAtNotIn(List<Integer> values) {
            addCriterion("created_at not in", values, "createdAt");
            return this;
        }

        public Criteria andCreatedAtBetween(Integer value1, Integer value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return this;
        }

        public Criteria andCreatedAtNotBetween(Integer value1, Integer value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return this;
        }

        public Criteria andLastLogintimeIsNull() {
            addCriterion("last_logintime is null");
            return this;
        }

        public Criteria andLastLogintimeIsNotNull() {
            addCriterion("last_logintime is not null");
            return this;
        }

        public Criteria andLastLogintimeEqualTo(Integer value) {
            addCriterion("last_logintime =", value, "lastLogintime");
            return this;
        }

        public Criteria andLastLogintimeNotEqualTo(Integer value) {
            addCriterion("last_logintime <>", value, "lastLogintime");
            return this;
        }

        public Criteria andLastLogintimeGreaterThan(Integer value) {
            addCriterion("last_logintime >", value, "lastLogintime");
            return this;
        }

        public Criteria andLastLogintimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_logintime >=", value, "lastLogintime");
            return this;
        }

        public Criteria andLastLogintimeLessThan(Integer value) {
            addCriterion("last_logintime <", value, "lastLogintime");
            return this;
        }

        public Criteria andLastLogintimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_logintime <=", value, "lastLogintime");
            return this;
        }

        public Criteria andLastLogintimeIn(List<Integer> values) {
            addCriterion("last_logintime in", values, "lastLogintime");
            return this;
        }

        public Criteria andLastLogintimeNotIn(List<Integer> values) {
            addCriterion("last_logintime not in", values, "lastLogintime");
            return this;
        }

        public Criteria andLastLogintimeBetween(Integer value1, Integer value2) {
            addCriterion("last_logintime between", value1, value2, "lastLogintime");
            return this;
        }

        public Criteria andLastLogintimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_logintime not between", value1, value2, "lastLogintime");
            return this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return this;
        }

        public Criteria andUpdatedAtEqualTo(Integer value) {
            addCriterion("updated_at =", value, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtNotEqualTo(Integer value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtGreaterThan(Integer value) {
            addCriterion("updated_at >", value, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtLessThan(Integer value) {
            addCriterion("updated_at <", value, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Integer value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtIn(List<Integer> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtNotIn(List<Integer> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtBetween(Integer value1, Integer value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return this;
        }

        public Criteria andUpdatedAtNotBetween(Integer value1, Integer value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return this;
        }

        public Criteria andCreatedIpIsNull() {
            addCriterion("created_ip is null");
            return this;
        }

        public Criteria andCreatedIpIsNotNull() {
            addCriterion("created_ip is not null");
            return this;
        }

        public Criteria andCreatedIpEqualTo(String value) {
            addCriterion("created_ip =", value, "createdIp");
            return this;
        }

        public Criteria andCreatedIpNotEqualTo(String value) {
            addCriterion("created_ip <>", value, "createdIp");
            return this;
        }

        public Criteria andCreatedIpGreaterThan(String value) {
            addCriterion("created_ip >", value, "createdIp");
            return this;
        }

        public Criteria andCreatedIpGreaterThanOrEqualTo(String value) {
            addCriterion("created_ip >=", value, "createdIp");
            return this;
        }

        public Criteria andCreatedIpLessThan(String value) {
            addCriterion("created_ip <", value, "createdIp");
            return this;
        }

        public Criteria andCreatedIpLessThanOrEqualTo(String value) {
            addCriterion("created_ip <=", value, "createdIp");
            return this;
        }

        public Criteria andCreatedIpLike(String value) {
            addCriterion("created_ip like", value, "createdIp");
            return this;
        }

        public Criteria andCreatedIpNotLike(String value) {
            addCriterion("created_ip not like", value, "createdIp");
            return this;
        }

        public Criteria andCreatedIpIn(List<String> values) {
            addCriterion("created_ip in", values, "createdIp");
            return this;
        }

        public Criteria andCreatedIpNotIn(List<String> values) {
            addCriterion("created_ip not in", values, "createdIp");
            return this;
        }

        public Criteria andCreatedIpBetween(String value1, String value2) {
            addCriterion("created_ip between", value1, value2, "createdIp");
            return this;
        }

        public Criteria andCreatedIpNotBetween(String value1, String value2) {
            addCriterion("created_ip not between", value1, value2, "createdIp");
            return this;
        }

        public Criteria andInviteUseridIsNull() {
            addCriterion("invite_userid is null");
            return this;
        }

        public Criteria andInviteUseridIsNotNull() {
            addCriterion("invite_userid is not null");
            return this;
        }

        public Criteria andInviteUseridEqualTo(Integer value) {
            addCriterion("invite_userid =", value, "inviteUserid");
            return this;
        }

        public Criteria andInviteUseridNotEqualTo(Integer value) {
            addCriterion("invite_userid <>", value, "inviteUserid");
            return this;
        }

        public Criteria andInviteUseridGreaterThan(Integer value) {
            addCriterion("invite_userid >", value, "inviteUserid");
            return this;
        }

        public Criteria andInviteUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_userid >=", value, "inviteUserid");
            return this;
        }

        public Criteria andInviteUseridLessThan(Integer value) {
            addCriterion("invite_userid <", value, "inviteUserid");
            return this;
        }

        public Criteria andInviteUseridLessThanOrEqualTo(Integer value) {
            addCriterion("invite_userid <=", value, "inviteUserid");
            return this;
        }

        public Criteria andInviteUseridIn(List<Integer> values) {
            addCriterion("invite_userid in", values, "inviteUserid");
            return this;
        }

        public Criteria andInviteUseridNotIn(List<Integer> values) {
            addCriterion("invite_userid not in", values, "inviteUserid");
            return this;
        }

        public Criteria andInviteUseridBetween(Integer value1, Integer value2) {
            addCriterion("invite_userid between", value1, value2, "inviteUserid");
            return this;
        }

        public Criteria andInviteUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_userid not between", value1, value2, "inviteUserid");
            return this;
        }

        public Criteria andRealVerifyTimeIsNull() {
            addCriterion("real_verify_time is null");
            return this;
        }

        public Criteria andRealVerifyTimeIsNotNull() {
            addCriterion("real_verify_time is not null");
            return this;
        }

        public Criteria andRealVerifyTimeEqualTo(Integer value) {
            addCriterion("real_verify_time =", value, "realVerifyTime");
            return this;
        }

        public Criteria andRealVerifyTimeNotEqualTo(Integer value) {
            addCriterion("real_verify_time <>", value, "realVerifyTime");
            return this;
        }

        public Criteria andRealVerifyTimeGreaterThan(Integer value) {
            addCriterion("real_verify_time >", value, "realVerifyTime");
            return this;
        }

        public Criteria andRealVerifyTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_verify_time >=", value, "realVerifyTime");
            return this;
        }

        public Criteria andRealVerifyTimeLessThan(Integer value) {
            addCriterion("real_verify_time <", value, "realVerifyTime");
            return this;
        }

        public Criteria andRealVerifyTimeLessThanOrEqualTo(Integer value) {
            addCriterion("real_verify_time <=", value, "realVerifyTime");
            return this;
        }

        public Criteria andRealVerifyTimeIn(List<Integer> values) {
            addCriterion("real_verify_time in", values, "realVerifyTime");
            return this;
        }

        public Criteria andRealVerifyTimeNotIn(List<Integer> values) {
            addCriterion("real_verify_time not in", values, "realVerifyTime");
            return this;
        }

        public Criteria andRealVerifyTimeBetween(Integer value1, Integer value2) {
            addCriterion("real_verify_time between", value1, value2, "realVerifyTime");
            return this;
        }

        public Criteria andRealVerifyTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("real_verify_time not between", value1, value2, "realVerifyTime");
            return this;
        }

        public Criteria andTrustTrxidIsNull() {
            addCriterion("trust_trxId is null");
            return this;
        }

        public Criteria andTrustTrxidIsNotNull() {
            addCriterion("trust_trxId is not null");
            return this;
        }

        public Criteria andTrustTrxidEqualTo(String value) {
            addCriterion("trust_trxId =", value, "trustTrxid");
            return this;
        }

        public Criteria andTrustTrxidNotEqualTo(String value) {
            addCriterion("trust_trxId <>", value, "trustTrxid");
            return this;
        }

        public Criteria andTrustTrxidGreaterThan(String value) {
            addCriterion("trust_trxId >", value, "trustTrxid");
            return this;
        }

        public Criteria andTrustTrxidGreaterThanOrEqualTo(String value) {
            addCriterion("trust_trxId >=", value, "trustTrxid");
            return this;
        }

        public Criteria andTrustTrxidLessThan(String value) {
            addCriterion("trust_trxId <", value, "trustTrxid");
            return this;
        }

        public Criteria andTrustTrxidLessThanOrEqualTo(String value) {
            addCriterion("trust_trxId <=", value, "trustTrxid");
            return this;
        }

        public Criteria andTrustTrxidLike(String value) {
            addCriterion("trust_trxId like", value, "trustTrxid");
            return this;
        }

        public Criteria andTrustTrxidNotLike(String value) {
            addCriterion("trust_trxId not like", value, "trustTrxid");
            return this;
        }

        public Criteria andTrustTrxidIn(List<String> values) {
            addCriterion("trust_trxId in", values, "trustTrxid");
            return this;
        }

        public Criteria andTrustTrxidNotIn(List<String> values) {
            addCriterion("trust_trxId not in", values, "trustTrxid");
            return this;
        }

        public Criteria andTrustTrxidBetween(String value1, String value2) {
            addCriterion("trust_trxId between", value1, value2, "trustTrxid");
            return this;
        }

        public Criteria andTrustTrxidNotBetween(String value1, String value2) {
            addCriterion("trust_trxId not between", value1, value2, "trustTrxid");
            return this;
        }

        public Criteria andTrustUsrCustidIsNull() {
            addCriterion("trust_usr_custId is null");
            return this;
        }

        public Criteria andTrustUsrCustidIsNotNull() {
            addCriterion("trust_usr_custId is not null");
            return this;
        }

        public Criteria andTrustUsrCustidEqualTo(String value) {
            addCriterion("trust_usr_custId =", value, "trustUsrCustid");
            return this;
        }

        public Criteria andTrustUsrCustidNotEqualTo(String value) {
            addCriterion("trust_usr_custId <>", value, "trustUsrCustid");
            return this;
        }

        public Criteria andTrustUsrCustidGreaterThan(String value) {
            addCriterion("trust_usr_custId >", value, "trustUsrCustid");
            return this;
        }

        public Criteria andTrustUsrCustidGreaterThanOrEqualTo(String value) {
            addCriterion("trust_usr_custId >=", value, "trustUsrCustid");
            return this;
        }

        public Criteria andTrustUsrCustidLessThan(String value) {
            addCriterion("trust_usr_custId <", value, "trustUsrCustid");
            return this;
        }

        public Criteria andTrustUsrCustidLessThanOrEqualTo(String value) {
            addCriterion("trust_usr_custId <=", value, "trustUsrCustid");
            return this;
        }

        public Criteria andTrustUsrCustidLike(String value) {
            addCriterion("trust_usr_custId like", value, "trustUsrCustid");
            return this;
        }

        public Criteria andTrustUsrCustidNotLike(String value) {
            addCriterion("trust_usr_custId not like", value, "trustUsrCustid");
            return this;
        }

        public Criteria andTrustUsrCustidIn(List<String> values) {
            addCriterion("trust_usr_custId in", values, "trustUsrCustid");
            return this;
        }

        public Criteria andTrustUsrCustidNotIn(List<String> values) {
            addCriterion("trust_usr_custId not in", values, "trustUsrCustid");
            return this;
        }

        public Criteria andTrustUsrCustidBetween(String value1, String value2) {
            addCriterion("trust_usr_custId between", value1, value2, "trustUsrCustid");
            return this;
        }

        public Criteria andTrustUsrCustidNotBetween(String value1, String value2) {
            addCriterion("trust_usr_custId not between", value1, value2, "trustUsrCustid");
            return this;
        }

        public Criteria andAuditStatIsNull() {
            addCriterion("audit_stat is null");
            return this;
        }

        public Criteria andAuditStatIsNotNull() {
            addCriterion("audit_stat is not null");
            return this;
        }

        public Criteria andAuditStatEqualTo(String value) {
            addCriterion("audit_stat =", value, "auditStat");
            return this;
        }

        public Criteria andAuditStatNotEqualTo(String value) {
            addCriterion("audit_stat <>", value, "auditStat");
            return this;
        }

        public Criteria andAuditStatGreaterThan(String value) {
            addCriterion("audit_stat >", value, "auditStat");
            return this;
        }

        public Criteria andAuditStatGreaterThanOrEqualTo(String value) {
            addCriterion("audit_stat >=", value, "auditStat");
            return this;
        }

        public Criteria andAuditStatLessThan(String value) {
            addCriterion("audit_stat <", value, "auditStat");
            return this;
        }

        public Criteria andAuditStatLessThanOrEqualTo(String value) {
            addCriterion("audit_stat <=", value, "auditStat");
            return this;
        }

        public Criteria andAuditStatLike(String value) {
            addCriterion("audit_stat like", value, "auditStat");
            return this;
        }

        public Criteria andAuditStatNotLike(String value) {
            addCriterion("audit_stat not like", value, "auditStat");
            return this;
        }

        public Criteria andAuditStatIn(List<String> values) {
            addCriterion("audit_stat in", values, "auditStat");
            return this;
        }

        public Criteria andAuditStatNotIn(List<String> values) {
            addCriterion("audit_stat not in", values, "auditStat");
            return this;
        }

        public Criteria andAuditStatBetween(String value1, String value2) {
            addCriterion("audit_stat between", value1, value2, "auditStat");
            return this;
        }

        public Criteria andAuditStatNotBetween(String value1, String value2) {
            addCriterion("audit_stat not between", value1, value2, "auditStat");
            return this;
        }

        public Criteria andAuditDescIsNull() {
            addCriterion("audit_desc is null");
            return this;
        }

        public Criteria andAuditDescIsNotNull() {
            addCriterion("audit_desc is not null");
            return this;
        }

        public Criteria andAuditDescEqualTo(String value) {
            addCriterion("audit_desc =", value, "auditDesc");
            return this;
        }

        public Criteria andAuditDescNotEqualTo(String value) {
            addCriterion("audit_desc <>", value, "auditDesc");
            return this;
        }

        public Criteria andAuditDescGreaterThan(String value) {
            addCriterion("audit_desc >", value, "auditDesc");
            return this;
        }

        public Criteria andAuditDescGreaterThanOrEqualTo(String value) {
            addCriterion("audit_desc >=", value, "auditDesc");
            return this;
        }

        public Criteria andAuditDescLessThan(String value) {
            addCriterion("audit_desc <", value, "auditDesc");
            return this;
        }

        public Criteria andAuditDescLessThanOrEqualTo(String value) {
            addCriterion("audit_desc <=", value, "auditDesc");
            return this;
        }

        public Criteria andAuditDescLike(String value) {
            addCriterion("audit_desc like", value, "auditDesc");
            return this;
        }

        public Criteria andAuditDescNotLike(String value) {
            addCriterion("audit_desc not like", value, "auditDesc");
            return this;
        }

        public Criteria andAuditDescIn(List<String> values) {
            addCriterion("audit_desc in", values, "auditDesc");
            return this;
        }

        public Criteria andAuditDescNotIn(List<String> values) {
            addCriterion("audit_desc not in", values, "auditDesc");
            return this;
        }

        public Criteria andAuditDescBetween(String value1, String value2) {
            addCriterion("audit_desc between", value1, value2, "auditDesc");
            return this;
        }

        public Criteria andAuditDescNotBetween(String value1, String value2) {
            addCriterion("audit_desc not between", value1, value2, "auditDesc");
            return this;
        }

        public Criteria andAccesstokenIsNull() {
            addCriterion("accessToken is null");
            return this;
        }

        public Criteria andAccesstokenIsNotNull() {
            addCriterion("accessToken is not null");
            return this;
        }

        public Criteria andAccesstokenEqualTo(String value) {
            addCriterion("accessToken =", value, "accesstoken");
            return this;
        }

        public Criteria andAccesstokenNotEqualTo(String value) {
            addCriterion("accessToken <>", value, "accesstoken");
            return this;
        }

        public Criteria andAccesstokenGreaterThan(String value) {
            addCriterion("accessToken >", value, "accesstoken");
            return this;
        }

        public Criteria andAccesstokenGreaterThanOrEqualTo(String value) {
            addCriterion("accessToken >=", value, "accesstoken");
            return this;
        }

        public Criteria andAccesstokenLessThan(String value) {
            addCriterion("accessToken <", value, "accesstoken");
            return this;
        }

        public Criteria andAccesstokenLessThanOrEqualTo(String value) {
            addCriterion("accessToken <=", value, "accesstoken");
            return this;
        }

        public Criteria andAccesstokenLike(String value) {
            addCriterion("accessToken like", value, "accesstoken");
            return this;
        }

        public Criteria andAccesstokenNotLike(String value) {
            addCriterion("accessToken not like", value, "accesstoken");
            return this;
        }

        public Criteria andAccesstokenIn(List<String> values) {
            addCriterion("accessToken in", values, "accesstoken");
            return this;
        }

        public Criteria andAccesstokenNotIn(List<String> values) {
            addCriterion("accessToken not in", values, "accesstoken");
            return this;
        }

        public Criteria andAccesstokenBetween(String value1, String value2) {
            addCriterion("accessToken between", value1, value2, "accesstoken");
            return this;
        }

        public Criteria andAccesstokenNotBetween(String value1, String value2) {
            addCriterion("accessToken not between", value1, value2, "accesstoken");
            return this;
        }

        public Criteria andLogintimesIsNull() {
            addCriterion("loginTimes is null");
            return this;
        }

        public Criteria andLogintimesIsNotNull() {
            addCriterion("loginTimes is not null");
            return this;
        }

        public Criteria andLogintimesEqualTo(Integer value) {
            addCriterion("loginTimes =", value, "logintimes");
            return this;
        }

        public Criteria andLogintimesNotEqualTo(Integer value) {
            addCriterion("loginTimes <>", value, "logintimes");
            return this;
        }

        public Criteria andLogintimesGreaterThan(Integer value) {
            addCriterion("loginTimes >", value, "logintimes");
            return this;
        }

        public Criteria andLogintimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("loginTimes >=", value, "logintimes");
            return this;
        }

        public Criteria andLogintimesLessThan(Integer value) {
            addCriterion("loginTimes <", value, "logintimes");
            return this;
        }

        public Criteria andLogintimesLessThanOrEqualTo(Integer value) {
            addCriterion("loginTimes <=", value, "logintimes");
            return this;
        }

        public Criteria andLogintimesIn(List<Integer> values) {
            addCriterion("loginTimes in", values, "logintimes");
            return this;
        }

        public Criteria andLogintimesNotIn(List<Integer> values) {
            addCriterion("loginTimes not in", values, "logintimes");
            return this;
        }

        public Criteria andLogintimesBetween(Integer value1, Integer value2) {
            addCriterion("loginTimes between", value1, value2, "logintimes");
            return this;
        }

        public Criteria andLogintimesNotBetween(Integer value1, Integer value2) {
            addCriterion("loginTimes not between", value1, value2, "logintimes");
            return this;
        }

        public Criteria andFristRechargeTimeIsNull() {
            addCriterion("frist_recharge_time is null");
            return this;
        }

        public Criteria andFristRechargeTimeIsNotNull() {
            addCriterion("frist_recharge_time is not null");
            return this;
        }

        public Criteria andFristRechargeTimeEqualTo(Integer value) {
            addCriterion("frist_recharge_time =", value, "fristRechargeTime");
            return this;
        }

        public Criteria andFristRechargeTimeNotEqualTo(Integer value) {
            addCriterion("frist_recharge_time <>", value, "fristRechargeTime");
            return this;
        }

        public Criteria andFristRechargeTimeGreaterThan(Integer value) {
            addCriterion("frist_recharge_time >", value, "fristRechargeTime");
            return this;
        }

        public Criteria andFristRechargeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("frist_recharge_time >=", value, "fristRechargeTime");
            return this;
        }

        public Criteria andFristRechargeTimeLessThan(Integer value) {
            addCriterion("frist_recharge_time <", value, "fristRechargeTime");
            return this;
        }

        public Criteria andFristRechargeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("frist_recharge_time <=", value, "fristRechargeTime");
            return this;
        }

        public Criteria andFristRechargeTimeIn(List<Integer> values) {
            addCriterion("frist_recharge_time in", values, "fristRechargeTime");
            return this;
        }

        public Criteria andFristRechargeTimeNotIn(List<Integer> values) {
            addCriterion("frist_recharge_time not in", values, "fristRechargeTime");
            return this;
        }

        public Criteria andFristRechargeTimeBetween(Integer value1, Integer value2) {
            addCriterion("frist_recharge_time between", value1, value2, "fristRechargeTime");
            return this;
        }

        public Criteria andFristRechargeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("frist_recharge_time not between", value1, value2, "fristRechargeTime");
            return this;
        }
    }
}