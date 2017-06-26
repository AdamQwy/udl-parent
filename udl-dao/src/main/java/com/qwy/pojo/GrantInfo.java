package com.qwy.pojo;

public class GrantInfo {
    private Integer id;

    private Integer granter;

    private String code;

    private Integer root;

    private Byte used;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGranter() {
        return granter;
    }

    public void setGranter(Integer granter) {
        this.granter = granter;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getRoot() {
        return root;
    }

    public void setRoot(Integer root) {
        this.root = root;
    }

    public Byte getUsed() {
        return used;
    }

    public void setUsed(Byte used) {
        this.used = used;
    }
}