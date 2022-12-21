package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "account_role")
public class AccountRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer account_role_id;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    public AccountRole() {
    }

    public AccountRole(Integer account_role_id, Account account, Role role) {
        this.account_role_id = account_role_id;
        this.account = account;
        this.role = role;
    }

    public Integer getAccount_role_id() {
        return account_role_id;
    }

    public void setAccount_role_id(Integer account_role_id) {
        this.account_role_id = account_role_id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
