package com.fierceq.complex.pojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
//@XStreamAlias 作用就是将属性按照别名输出
@XStreamAlias("ContactDetails")
public class ContactDetails {

    private String mobile;

    private String landline;

    // XStreamAsAttribute 作用是将类内成员作为父节点属性输出
    @XStreamAsAttribute
    private String contactType;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    @Override
    public String toString() {
        return "ContactDetails [mobile=" + mobile + ", landline=" + landline + ", contactType=" + contactType + "]";
    }
}
