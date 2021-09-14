package main.java.net.guides.springboot2.crud.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "stuff")
public class Stuff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "stuff_name", nullable = false)
    private String stuffName;

    @Column(name = "stuff_desc", nullable = true)
    private String stuffDesc;

    @Column(name = "stuff_type", nullable = true)
    private String stuffType;

    public Stuff() {
    }

    public Stuff(String stuffName, String stuffDesc, String stuffType) {
        this.stuffName = stuffName;
        this.stuffDesc = stuffDesc;
        this.stuffType = stuffType;
    }

    public String getStuffName() {
        return stuffName;
    }

    public void setStuffName(String stuffName) {
        this.stuffName = stuffName;
    }

    public String getStuffDesc() {
        return stuffDesc;
    }

    public void setStuffDesc(String stuffDesc) {
        this.stuffDesc = stuffDesc;
    }

    public String getStuffType() {
        return stuffType;
    }

    public void setStuffType(String stuffType) {
        this.stuffType = stuffType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
