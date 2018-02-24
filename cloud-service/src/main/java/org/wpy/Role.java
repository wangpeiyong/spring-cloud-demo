package org.wpy;

/**
 * Created by wpy on 2017/3/31.
 */
public class Role {

    private String name ;

    private Integer id ;

    public Role(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public Role() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
