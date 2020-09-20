package cn.kgc.ssm.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Pet {
    private Integer petid;

    private String petname;

    private String petbreed;

    private String petsex;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private String description;

    @Override
    public String toString() {
        return "Pet{" +
                "petid=" + petid +
                ", petname='" + petname + '\'' +
                ", petbreed='" + petbreed + '\'' +
                ", petsex='" + petsex + '\'' +
                ", birthday=" + birthday +
                ", description='" + description + '\'' +
                '}';
    }

    public Integer getPetid() {
        return petid;
    }

    public void setPetid(Integer petid) {
        this.petid = petid;
    }

    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname == null ? null : petname.trim();
    }

    public String getPetbreed() {
        return petbreed;
    }

    public void setPetbreed(String petbreed) {
        this.petbreed = petbreed == null ? null : petbreed.trim();
    }

    public String getPetsex() {
        return petsex;
    }

    public void setPetsex(String petsex) {
        this.petsex = petsex == null ? null : petsex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}