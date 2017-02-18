package com.brillinx.iot.service.core.entity.client;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by kaizhao on 10/18/16.
 * The company level client
 * iot_client_data_db.clientinfo
 */
public class ClientInfo extends Entity{

    private String client_name;

    // the date when the client(company) registered into the system
    private Integer register_date;

    // when the iot service is ready for client
    private Integer service_start_date;

    // when the iot service is shutdown for the client
    private Integer service_end_date;

    // the address location of the client
    private String address;
    private String contact_personname;
    private String contact_phone;
    private String contact_email;

    // the url for client's url register URL.
    private String user_register_url;

    public ClientInfo() {
    }

    public ClientInfo(String id, String client_name, Integer register_date, Integer service_start_date, Integer service_end_date, String address, String contact_personname, String contact_phone, String contact_email, String user_register_url) {
        super(id);
        this.client_name = client_name;
        this.register_date = register_date;
        this.service_start_date = service_start_date;
        this.service_end_date = service_end_date;
        this.address = address;
        this.contact_personname = contact_personname;
        this.contact_phone = contact_phone;
        this.contact_email = contact_email;
        this.user_register_url = user_register_url;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public Integer getRegister_date() {
        return register_date;
    }

    public void setRegister_date(Integer register_date) {
        this.register_date = register_date;
    }

    public Integer getService_start_date() {
        return service_start_date;
    }

    public void setService_start_date(Integer service_start_date) {
        this.service_start_date = service_start_date;
    }

    public Integer getService_end_date() {
        return service_end_date;
    }

    public void setService_end_date(Integer service_end_date) {
        this.service_end_date = service_end_date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact_personname() {
        return contact_personname;
    }

    public void setContact_personname(String contact_personname) {
        this.contact_personname = contact_personname;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getUser_register_url() {
        return user_register_url;
    }

    public void setUser_register_url(String user_register_url) {
        this.user_register_url = user_register_url;
    }
}
