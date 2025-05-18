package org.evangelion.evacommandservice.repository;

import org.evangelion.evacommandservice.model.Mission;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MissionRepository implements JpaRepository<Mission, Long> {
    @Override
    public void flush() {

    }

    @Override
    public <S extends Mission> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Mission> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Mission> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Mission getOne(Long aLong) {
        return null;
    }

    @Override
    public Mission getById(Long aLong) {
        return null;
    }

    @Override
    public Mission getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Mission> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Mission> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Mission> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Mission> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Mission> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Mission> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Mission, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Mission> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Mission> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Mission> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Mission> findAll() {
        return List.of();
    }

    @Override
    public List<Mission> findAllById(Iterable<Long> longs) {
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
    public void delete(Mission entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Mission> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Mission> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Mission> findAll(Pageable pageable) {
        return null;
    }
}
