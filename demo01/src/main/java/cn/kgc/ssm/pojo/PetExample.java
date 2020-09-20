package cn.kgc.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PetExample() {
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

        public Criteria andPetidIsNull() {
            addCriterion("petId is null");
            return (Criteria) this;
        }

        public Criteria andPetidIsNotNull() {
            addCriterion("petId is not null");
            return (Criteria) this;
        }

        public Criteria andPetidEqualTo(Integer value) {
            addCriterion("petId =", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidNotEqualTo(Integer value) {
            addCriterion("petId <>", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidGreaterThan(Integer value) {
            addCriterion("petId >", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("petId >=", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidLessThan(Integer value) {
            addCriterion("petId <", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidLessThanOrEqualTo(Integer value) {
            addCriterion("petId <=", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidIn(List<Integer> values) {
            addCriterion("petId in", values, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidNotIn(List<Integer> values) {
            addCriterion("petId not in", values, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidBetween(Integer value1, Integer value2) {
            addCriterion("petId between", value1, value2, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidNotBetween(Integer value1, Integer value2) {
            addCriterion("petId not between", value1, value2, "petid");
            return (Criteria) this;
        }

        public Criteria andPetnameIsNull() {
            addCriterion("petName is null");
            return (Criteria) this;
        }

        public Criteria andPetnameIsNotNull() {
            addCriterion("petName is not null");
            return (Criteria) this;
        }

        public Criteria andPetnameEqualTo(String value) {
            addCriterion("petName =", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameNotEqualTo(String value) {
            addCriterion("petName <>", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameGreaterThan(String value) {
            addCriterion("petName >", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameGreaterThanOrEqualTo(String value) {
            addCriterion("petName >=", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameLessThan(String value) {
            addCriterion("petName <", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameLessThanOrEqualTo(String value) {
            addCriterion("petName <=", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameLike(String value) {
            addCriterion("petName like", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameNotLike(String value) {
            addCriterion("petName not like", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameIn(List<String> values) {
            addCriterion("petName in", values, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameNotIn(List<String> values) {
            addCriterion("petName not in", values, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameBetween(String value1, String value2) {
            addCriterion("petName between", value1, value2, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameNotBetween(String value1, String value2) {
            addCriterion("petName not between", value1, value2, "petname");
            return (Criteria) this;
        }

        public Criteria andPetbreedIsNull() {
            addCriterion("petBreed is null");
            return (Criteria) this;
        }

        public Criteria andPetbreedIsNotNull() {
            addCriterion("petBreed is not null");
            return (Criteria) this;
        }

        public Criteria andPetbreedEqualTo(String value) {
            addCriterion("petBreed =", value, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedNotEqualTo(String value) {
            addCriterion("petBreed <>", value, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedGreaterThan(String value) {
            addCriterion("petBreed >", value, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedGreaterThanOrEqualTo(String value) {
            addCriterion("petBreed >=", value, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedLessThan(String value) {
            addCriterion("petBreed <", value, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedLessThanOrEqualTo(String value) {
            addCriterion("petBreed <=", value, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedLike(String value) {
            addCriterion("petBreed like", value, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedNotLike(String value) {
            addCriterion("petBreed not like", value, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedIn(List<String> values) {
            addCriterion("petBreed in", values, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedNotIn(List<String> values) {
            addCriterion("petBreed not in", values, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedBetween(String value1, String value2) {
            addCriterion("petBreed between", value1, value2, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetbreedNotBetween(String value1, String value2) {
            addCriterion("petBreed not between", value1, value2, "petbreed");
            return (Criteria) this;
        }

        public Criteria andPetsexIsNull() {
            addCriterion("petSex is null");
            return (Criteria) this;
        }

        public Criteria andPetsexIsNotNull() {
            addCriterion("petSex is not null");
            return (Criteria) this;
        }

        public Criteria andPetsexEqualTo(String value) {
            addCriterion("petSex =", value, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexNotEqualTo(String value) {
            addCriterion("petSex <>", value, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexGreaterThan(String value) {
            addCriterion("petSex >", value, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexGreaterThanOrEqualTo(String value) {
            addCriterion("petSex >=", value, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexLessThan(String value) {
            addCriterion("petSex <", value, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexLessThanOrEqualTo(String value) {
            addCriterion("petSex <=", value, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexLike(String value) {
            addCriterion("petSex like", value, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexNotLike(String value) {
            addCriterion("petSex not like", value, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexIn(List<String> values) {
            addCriterion("petSex in", values, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexNotIn(List<String> values) {
            addCriterion("petSex not in", values, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexBetween(String value1, String value2) {
            addCriterion("petSex between", value1, value2, "petsex");
            return (Criteria) this;
        }

        public Criteria andPetsexNotBetween(String value1, String value2) {
            addCriterion("petSex not between", value1, value2, "petsex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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