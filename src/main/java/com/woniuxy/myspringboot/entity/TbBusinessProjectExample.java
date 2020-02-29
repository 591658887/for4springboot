package com.woniuxy.myspringboot.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbBusinessProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBusinessProjectExample() {
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

        public Criteria andBusinessProjectIdIsNull() {
            addCriterion("business_project_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectIdIsNotNull() {
            addCriterion("business_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectIdEqualTo(Integer value) {
            addCriterion("business_project_id =", value, "businessProjectId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectIdNotEqualTo(Integer value) {
            addCriterion("business_project_id <>", value, "businessProjectId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectIdGreaterThan(Integer value) {
            addCriterion("business_project_id >", value, "businessProjectId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_project_id >=", value, "businessProjectId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectIdLessThan(Integer value) {
            addCriterion("business_project_id <", value, "businessProjectId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_project_id <=", value, "businessProjectId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectIdIn(List<Integer> values) {
            addCriterion("business_project_id in", values, "businessProjectId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectIdNotIn(List<Integer> values) {
            addCriterion("business_project_id not in", values, "businessProjectId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("business_project_id between", value1, value2, "businessProjectId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_project_id not between", value1, value2, "businessProjectId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectCountyIdIsNull() {
            addCriterion("business_project_county_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectCountyIdIsNotNull() {
            addCriterion("business_project_county_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectCountyIdEqualTo(Integer value) {
            addCriterion("business_project_county_id =", value, "businessProjectCountyId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectCountyIdNotEqualTo(Integer value) {
            addCriterion("business_project_county_id <>", value, "businessProjectCountyId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectCountyIdGreaterThan(Integer value) {
            addCriterion("business_project_county_id >", value, "businessProjectCountyId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectCountyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_project_county_id >=", value, "businessProjectCountyId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectCountyIdLessThan(Integer value) {
            addCriterion("business_project_county_id <", value, "businessProjectCountyId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectCountyIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_project_county_id <=", value, "businessProjectCountyId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectCountyIdIn(List<Integer> values) {
            addCriterion("business_project_county_id in", values, "businessProjectCountyId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectCountyIdNotIn(List<Integer> values) {
            addCriterion("business_project_county_id not in", values, "businessProjectCountyId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectCountyIdBetween(Integer value1, Integer value2) {
            addCriterion("business_project_county_id between", value1, value2, "businessProjectCountyId");
            return (Criteria) this;
        }

        public Criteria andBusinessProjectCountyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_project_county_id not between", value1, value2, "businessProjectCountyId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdIsNull() {
            addCriterion("industry_type_id is null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdIsNotNull() {
            addCriterion("industry_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdEqualTo(Integer value) {
            addCriterion("industry_type_id =", value, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdNotEqualTo(Integer value) {
            addCriterion("industry_type_id <>", value, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdGreaterThan(Integer value) {
            addCriterion("industry_type_id >", value, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry_type_id >=", value, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdLessThan(Integer value) {
            addCriterion("industry_type_id <", value, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("industry_type_id <=", value, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdIn(List<Integer> values) {
            addCriterion("industry_type_id in", values, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdNotIn(List<Integer> values) {
            addCriterion("industry_type_id not in", values, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("industry_type_id between", value1, value2, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("industry_type_id not between", value1, value2, "industryTypeId");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIdIsNull() {
            addCriterion("project_status_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIdIsNotNull() {
            addCriterion("project_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIdEqualTo(Integer value) {
            addCriterion("project_status_id =", value, "projectStatusId");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIdNotEqualTo(Integer value) {
            addCriterion("project_status_id <>", value, "projectStatusId");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIdGreaterThan(Integer value) {
            addCriterion("project_status_id >", value, "projectStatusId");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_status_id >=", value, "projectStatusId");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIdLessThan(Integer value) {
            addCriterion("project_status_id <", value, "projectStatusId");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_status_id <=", value, "projectStatusId");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIdIn(List<Integer> values) {
            addCriterion("project_status_id in", values, "projectStatusId");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIdNotIn(List<Integer> values) {
            addCriterion("project_status_id not in", values, "projectStatusId");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("project_status_id between", value1, value2, "projectStatusId");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_status_id not between", value1, value2, "projectStatusId");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIdIsNull() {
            addCriterion("check_status_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIdIsNotNull() {
            addCriterion("check_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIdEqualTo(Integer value) {
            addCriterion("check_status_id =", value, "checkStatusId");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIdNotEqualTo(Integer value) {
            addCriterion("check_status_id <>", value, "checkStatusId");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIdGreaterThan(Integer value) {
            addCriterion("check_status_id >", value, "checkStatusId");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_status_id >=", value, "checkStatusId");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIdLessThan(Integer value) {
            addCriterion("check_status_id <", value, "checkStatusId");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("check_status_id <=", value, "checkStatusId");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIdIn(List<Integer> values) {
            addCriterion("check_status_id in", values, "checkStatusId");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIdNotIn(List<Integer> values) {
            addCriterion("check_status_id not in", values, "checkStatusId");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("check_status_id between", value1, value2, "checkStatusId");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("check_status_id not between", value1, value2, "checkStatusId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNull() {
            addCriterion("module_id is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("module_id is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(Integer value) {
            addCriterion("module_id =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(Integer value) {
            addCriterion("module_id <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(Integer value) {
            addCriterion("module_id >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_id >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(Integer value) {
            addCriterion("module_id <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("module_id <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<Integer> values) {
            addCriterion("module_id in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<Integer> values) {
            addCriterion("module_id not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(Integer value1, Integer value2) {
            addCriterion("module_id between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("module_id not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectContentIsNull() {
            addCriterion("project_content is null");
            return (Criteria) this;
        }

        public Criteria andProjectContentIsNotNull() {
            addCriterion("project_content is not null");
            return (Criteria) this;
        }

        public Criteria andProjectContentEqualTo(String value) {
            addCriterion("project_content =", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentNotEqualTo(String value) {
            addCriterion("project_content <>", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentGreaterThan(String value) {
            addCriterion("project_content >", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentGreaterThanOrEqualTo(String value) {
            addCriterion("project_content >=", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentLessThan(String value) {
            addCriterion("project_content <", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentLessThanOrEqualTo(String value) {
            addCriterion("project_content <=", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentLike(String value) {
            addCriterion("project_content like", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentNotLike(String value) {
            addCriterion("project_content not like", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentIn(List<String> values) {
            addCriterion("project_content in", values, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentNotIn(List<String> values) {
            addCriterion("project_content not in", values, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentBetween(String value1, String value2) {
            addCriterion("project_content between", value1, value2, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentNotBetween(String value1, String value2) {
            addCriterion("project_content not between", value1, value2, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectTimeIsNull() {
            addCriterion("project_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectTimeIsNotNull() {
            addCriterion("project_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTimeEqualTo(Date value) {
            addCriterion("project_time =", value, "projectTime");
            return (Criteria) this;
        }

        public Criteria andProjectTimeNotEqualTo(Date value) {
            addCriterion("project_time <>", value, "projectTime");
            return (Criteria) this;
        }

        public Criteria andProjectTimeGreaterThan(Date value) {
            addCriterion("project_time >", value, "projectTime");
            return (Criteria) this;
        }

        public Criteria andProjectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("project_time >=", value, "projectTime");
            return (Criteria) this;
        }

        public Criteria andProjectTimeLessThan(Date value) {
            addCriterion("project_time <", value, "projectTime");
            return (Criteria) this;
        }

        public Criteria andProjectTimeLessThanOrEqualTo(Date value) {
            addCriterion("project_time <=", value, "projectTime");
            return (Criteria) this;
        }

        public Criteria andProjectTimeIn(List<Date> values) {
            addCriterion("project_time in", values, "projectTime");
            return (Criteria) this;
        }

        public Criteria andProjectTimeNotIn(List<Date> values) {
            addCriterion("project_time not in", values, "projectTime");
            return (Criteria) this;
        }

        public Criteria andProjectTimeBetween(Date value1, Date value2) {
            addCriterion("project_time between", value1, value2, "projectTime");
            return (Criteria) this;
        }

        public Criteria andProjectTimeNotBetween(Date value1, Date value2) {
            addCriterion("project_time not between", value1, value2, "projectTime");
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