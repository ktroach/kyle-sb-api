package main.java.net.guides.springboot2.crud.dao.entity;

import javax.persistence.*;
//import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email_address", nullable = false)
    private String emailId;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;    

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
//    private List<Address> addresses;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String emailId, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }    


    @Override
    public String toString() {
        return "Employee [id=" + id
                + ", firstName=" + firstName
                + ", lastName=" + lastName
                + ", emailId=" + emailId
                + ", phoneNumber=" + phoneNumber
                + "]";
    }

}
