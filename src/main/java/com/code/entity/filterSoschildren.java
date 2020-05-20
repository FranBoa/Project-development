package com.code.entity;

/**
 * ClassName:filterSoschildren
 * Package:com.code.entity
 * Description:
 *
 * @Date: 2020/5/19 0019 0:47
 * @Author:YAP
 */
public class filterSoschildren {
    private String id;
    private String prefix;
    private String field;
    private String mode;
    private String type;
    private String value;
    private String groupId;

    public filterSoschildren(String id, String prefix, String field, String mode, String type, String value, String groupId) {
        this.id = id;
        this.prefix = prefix;
        this.field = field;
        this.mode = mode;
        this.type = type;
        this.value = value;
        this.groupId = groupId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    public  filterSoschildren(){
        super();
    }

    @Override
    public String toString() {
        return "filterSoschildren{" +
                "id='" + id + '\'' +
                ", prefix='" + prefix + '\'' +
                ", field='" + field + '\'' +
                ", mode='" + mode + '\'' +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", groupId='" + groupId + '\'' +
                '}';
    }
}
