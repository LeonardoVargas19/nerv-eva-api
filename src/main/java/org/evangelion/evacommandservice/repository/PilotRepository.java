package org.evangelion.evacommandservice.repository;

import org.evangelion.evacommandservice.model.Pilot;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class PilotRepository implements JpaRepository<Pilot, Long> {
    @Override
    public void flush() {

    }

    @Override
    public <S extends Pilot> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Pilot> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Pilot> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Pilot getOne(Long aLong) {
        return null;
    }

    @Override
    public Pilot getById(Long aLong) {
        return null;
    }

    @Override
    public Pilot getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Pilot> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Pilot> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Pilot> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Pilot> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Pilot> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Pilot> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Pilot, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Pilot> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Pilot> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Pilot> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Pilot> findAll() {
        return List.of();
    }

    @Override
    public List<Pilot> findAllById(Iterable<Long> longs) {
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
    public void delete(Pilot entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Pilot> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Pilot> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Pilot> findAll(Pageable pageable) {
        return null;
    }
}
