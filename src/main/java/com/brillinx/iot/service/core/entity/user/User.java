package com.brillinx.iot.service.core.entity.user;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by Kai on 2016/7/14.
 */
public class User extends Entity{

    private String organization_id;
    private String space_id;
    private String name;
    private String login_email;
    private String encrypted_password;
    private Integer create_time;

    public User(String id, String organization_id, String space_id, String name, String login_email, String encrypted_password, Integer create_time) {
        super(id);
        this.organization_id = organization_id;
        this.space_id = space_id;
        this.name = name;
        this.login_email = login_email;
        this.encrypted_password = encrypted_password;
        this.create_time = create_time;
    }

    public String getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(String organization_id) {
        this.organization_id = organization_id;
    }

    public String getSpace_id() {
        return space_id;
    }

    public void setSpace_id(String space_id) {
        this.space_id = space_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin_email() {
        return login_email;
    }

    public void setLogin_email(String login_email) {
        this.login_email = login_email;
    }

    public String getEncrypted_password() {
        return encrypted_password;
    }

    public void setEncrypted_password(String encrypted_password) {
        this.encrypted_password = encrypted_password;
    }

    public Integer getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Integer create_time) {
        this.create_time = create_time;
    }
}
