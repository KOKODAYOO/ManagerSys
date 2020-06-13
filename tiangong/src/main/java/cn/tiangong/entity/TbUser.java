package cn.tiangong.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbUser implements Serializable {
    private Integer id;

    private String phone;

    private String password;

    private Boolean gender;

    private Boolean status;

    private Integer level;

    private String username;

    private String province;

    private String city;

    private Date reg_time;

    private Date last_login;

    private String avatar_url;

    private String e_mail;

    private Integer focus_count;

    private Integer focused_count;

    private Integer favor_count;

    private Integer msg_count_not_read;

    private Date noAdv_time;

    private BigDecimal money;

    private String mtto;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public TbUser withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public TbUser withPhone(String phone) {
        this.setPhone(phone);
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public TbUser withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getGender() {
        return gender;
    }

    public TbUser withGender(Boolean gender) {
        this.setGender(gender);
        return this;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Boolean getStatus() {
        return status;
    }

    public TbUser withStatus(Boolean status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getLevel() {
        return level;
    }

    public TbUser withLevel(Integer level) {
        this.setLevel(level);
        return this;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public TbUser withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProvince() {
        return province;
    }

    public TbUser withProvince(String province) {
        this.setProvince(province);
        return this;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public TbUser withCity(String city) {
        this.setCity(city);
        return this;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getReg_time() {
        return reg_time;
    }

    public TbUser withReg_time(Date reg_time) {
        this.setReg_time(reg_time);
        return this;
    }

    public void setReg_time(Date reg_time) {
        this.reg_time = reg_time;
    }

    public Date getLast_login() {
        return last_login;
    }

    public TbUser withLast_login(Date last_login) {
        this.setLast_login(last_login);
        return this;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public TbUser withAvatar_url(String avatar_url) {
        this.setAvatar_url(avatar_url);
        return this;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getE_mail() {
        return e_mail;
    }

    public TbUser withE_mail(String e_mail) {
        this.setE_mail(e_mail);
        return this;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public Integer getFocus_count() {
        return focus_count;
    }

    public TbUser withFocus_count(Integer focus_count) {
        this.setFocus_count(focus_count);
        return this;
    }

    public void setFocus_count(Integer focus_count) {
        this.focus_count = focus_count;
    }

    public Integer getFocused_count() {
        return focused_count;
    }

    public TbUser withFocused_count(Integer focused_count) {
        this.setFocused_count(focused_count);
        return this;
    }

    public void setFocused_count(Integer focused_count) {
        this.focused_count = focused_count;
    }

    public Integer getFavor_count() {
        return favor_count;
    }

    public TbUser withFavor_count(Integer favor_count) {
        this.setFavor_count(favor_count);
        return this;
    }

    public void setFavor_count(Integer favor_count) {
        this.favor_count = favor_count;
    }

    public Integer getMsg_count_not_read() {
        return msg_count_not_read;
    }

    public TbUser withMsg_count_not_read(Integer msg_count_not_read) {
        this.setMsg_count_not_read(msg_count_not_read);
        return this;
    }

    public void setMsg_count_not_read(Integer msg_count_not_read) {
        this.msg_count_not_read = msg_count_not_read;
    }

    public Date getNoAdv_time() {
        return noAdv_time;
    }

    public TbUser withNoAdv_time(Date noAdv_time) {
        this.setNoAdv_time(noAdv_time);
        return this;
    }

    public void setNoAdv_time(Date noAdv_time) {
        this.noAdv_time = noAdv_time;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public TbUser withMoney(BigDecimal money) {
        this.setMoney(money);
        return this;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getMtto() {
        return mtto;
    }

    public TbUser withMtto(String mtto) {
        this.setMtto(mtto);
        return this;
    }

    public void setMtto(String mtto) {
        this.mtto = mtto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", phone=").append(phone);
        sb.append(", password=").append(password);
        sb.append(", gender=").append(gender);
        sb.append(", status=").append(status);
        sb.append(", level=").append(level);
        sb.append(", username=").append(username);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", reg_time=").append(reg_time);
        sb.append(", last_login=").append(last_login);
        sb.append(", avatar_url=").append(avatar_url);
        sb.append(", e_mail=").append(e_mail);
        sb.append(", focus_count=").append(focus_count);
        sb.append(", focused_count=").append(focused_count);
        sb.append(", favor_count=").append(favor_count);
        sb.append(", msg_count_not_read=").append(msg_count_not_read);
        sb.append(", noAdv_time=").append(noAdv_time);
        sb.append(", money=").append(money);
        sb.append(", mtto=").append(mtto);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TbUser other = (TbUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getReg_time() == null ? other.getReg_time() == null : this.getReg_time().equals(other.getReg_time()))
            && (this.getLast_login() == null ? other.getLast_login() == null : this.getLast_login().equals(other.getLast_login()))
            && (this.getAvatar_url() == null ? other.getAvatar_url() == null : this.getAvatar_url().equals(other.getAvatar_url()))
            && (this.getE_mail() == null ? other.getE_mail() == null : this.getE_mail().equals(other.getE_mail()))
            && (this.getFocus_count() == null ? other.getFocus_count() == null : this.getFocus_count().equals(other.getFocus_count()))
            && (this.getFocused_count() == null ? other.getFocused_count() == null : this.getFocused_count().equals(other.getFocused_count()))
            && (this.getFavor_count() == null ? other.getFavor_count() == null : this.getFavor_count().equals(other.getFavor_count()))
            && (this.getMsg_count_not_read() == null ? other.getMsg_count_not_read() == null : this.getMsg_count_not_read().equals(other.getMsg_count_not_read()))
            && (this.getNoAdv_time() == null ? other.getNoAdv_time() == null : this.getNoAdv_time().equals(other.getNoAdv_time()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getMtto() == null ? other.getMtto() == null : this.getMtto().equals(other.getMtto()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getReg_time() == null) ? 0 : getReg_time().hashCode());
        result = prime * result + ((getLast_login() == null) ? 0 : getLast_login().hashCode());
        result = prime * result + ((getAvatar_url() == null) ? 0 : getAvatar_url().hashCode());
        result = prime * result + ((getE_mail() == null) ? 0 : getE_mail().hashCode());
        result = prime * result + ((getFocus_count() == null) ? 0 : getFocus_count().hashCode());
        result = prime * result + ((getFocused_count() == null) ? 0 : getFocused_count().hashCode());
        result = prime * result + ((getFavor_count() == null) ? 0 : getFavor_count().hashCode());
        result = prime * result + ((getMsg_count_not_read() == null) ? 0 : getMsg_count_not_read().hashCode());
        result = prime * result + ((getNoAdv_time() == null) ? 0 : getNoAdv_time().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getMtto() == null) ? 0 : getMtto().hashCode());
        return result;
    }
}