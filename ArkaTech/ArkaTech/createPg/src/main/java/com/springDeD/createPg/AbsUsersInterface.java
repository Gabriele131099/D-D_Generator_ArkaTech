package com.springDeD.createPg;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public abstract class AbsUsersInterface implements UserRepository {

    @Override
    public void flush() {

    }

    @Override
    public <S extends User> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<User> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public User getOne(Long aLong) {
        return null;
    }

    @Override
    public User getById(Long aLong) {
        return null;
    }

    @Override
    public User getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends User> Optional<S> findOne(Example<S> example) {
        return Optional.empty ( );
    }

    @Override
    public <S extends User> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends User> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends User> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends User, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends User> S save(S entity) {

        List<User> userList = new ArrayList<> ();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dnddb", "root", "Cucina21");
             PreparedStatement statement = connection.prepareStatement("");
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                User user = new User();
                user.setId (resultSet.getLong ("Id"));
                user.setUsername (resultSet.getString("Username"));
                user.setEmail(resultSet.getString("Email"));
                user.setPassword (resultSet.getString("Password"));

                userList.add(user);
            }
        } catch ( SQLException e) {
        }
        return entity;
    }

    @Override
    public <S extends User> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty ( );
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }


    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<> ();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dnddb", "root", "Cucina21");
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM users");
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                User user = new User();
                user.setId (resultSet.getLong ("ID"));
                user.setUsername (resultSet.getString("Username"));
                user.setEmail(resultSet.getString("Email"));
                user.setPassword (resultSet.getString("Password"));
                userList.add(user);
            }

        } catch ( SQLException e) {

        }

        return userList;
    }

    @Override
    public List<User> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(User entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends User> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<User> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }
}
