package fr.ccva.pepitlab.dao;


import fr.ccva.pepitlab.model.User;

public interface UserDao {
    User getByEmail(String email);
}
