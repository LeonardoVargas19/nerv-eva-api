package org.evangelion.evacommandservice.repository;

import org.evangelion.evacommandservice.model.Eva;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class EvaRepository implements JpaRepository<Eva,Long> {
    @Override
    public void flush() {

    }

    @Override
    public <S extends Eva> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Eva> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Eva> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Eva getOne(Long aLong) {
        return null;
    }

    @Override
    public Eva getById(Long aLong) {
        return null;
    }

    @Override
    public Eva getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Eva> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Eva> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Eva> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Eva> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Eva> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Eva> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Eva, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Eva> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Eva> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Eva> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Eva> findAll() {
        return List.of();
    }

    @Override
    public List<Eva> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Eva entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Eva> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Eva> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Eva> findAll(Pageable pageable) {
        return null;
    }
}
