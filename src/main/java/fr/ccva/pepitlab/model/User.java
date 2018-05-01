package fr.ccva.pepitlab.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
@NamedQueries({
        @NamedQuery(name = "user.getByEmail", query = "SELECT u FROM User u WHERE u.email = :email")
})

public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name ="firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "corparate_name")
    private String corporateName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "personal_data_storage_approved", nullable = false)
    private boolean personalDataStorageApprouved;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPersonalDataStorageApprouved() {
        return personalDataStorageApprouved;
    }

    public void setPersonalDataStorageApprouved(boolean personalDataStorageApprouved) {
        this.personalDataStorageApprouved = personalDataStorageApprouved;
    }
}
