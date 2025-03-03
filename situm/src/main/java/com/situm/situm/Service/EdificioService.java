package com.situm.situm.Service;


import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.situm.situm.Model.EdificioModel;
import com.situm.situm.Repository.EdificioRepository;

/**
 * Esta clase es la encargada de si debe devolver datos de la tabla edificio o realizar alguna operación con ellos
 */
@Service
public class EdificioService implements EdificioRepository{

    private EdificioRepository edificioRepository;
    

    public EdificioService(EdificioRepository edificioRepository) {
        this.edificioRepository = edificioRepository;
    }

    public EdificioRepository getEdificioRepository() {
        return edificioRepository;
    }

    public void setEdificioRepository(EdificioRepository edificioRepository) {
        this.edificioRepository = edificioRepository;
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> ids) {
        edificioRepository.deleteAllByIdInBatch(ids);
    }

    @Override
    public void deleteAllInBatch() {
        edificioRepository.deleteAllInBatch();
    }

    @Override
    public void deleteAllInBatch(Iterable<EdificioModel> entities) {
        edificioRepository.deleteAllInBatch(entities);
    }

    @Override
    public <S extends EdificioModel> List<S> findAll(Example<S> example) {
        return edificioRepository.findAll(example);
    }

    @Override
    public <S extends EdificioModel> List<S> findAll(Example<S> example, Sort sort) {
        return edificioRepository.findAll(example, sort);
    }

    @Override
    public void flush() {
        edificioRepository.flush();
    }

    @Override
    public EdificioModel getById(Integer arg0) {
        return edificioRepository.getById(arg0);
    }

    @Override
    public EdificioModel getOne(Integer arg0) {
        return edificioRepository.getOne(arg0);
    }

    @Override
    public EdificioModel getReferenceById(Integer id) {
        return edificioRepository.getReferenceById(id);
    }

    @Override
    public <S extends EdificioModel> List<S> saveAllAndFlush(Iterable<S> entities) {
        return edificioRepository.saveAllAndFlush(entities);
    }

    @Override
    public <S extends EdificioModel> S saveAndFlush(S entity) {
        return edificioRepository.saveAndFlush(entity);
    }

    @Override
    public List<EdificioModel> findAllById(Iterable<Integer> ids) {
        return edificioRepository.findAllById(ids);
    }

    @Override
    public <S extends EdificioModel> List<S> saveAll(Iterable<S> entities) {
        return edificioRepository.saveAll(entities);
    }

    @Override
    public long count() {
    return edificioRepository.count();
    }

    @Override
    public void delete(EdificioModel entity) {
        edificioRepository.delete(entity);
    }

    @Override
    public void deleteAll() {
        edificioRepository.deleteAll();
    }

    @Override
    public void deleteAll(Iterable<? extends EdificioModel> entities) {
        edificioRepository.deleteAll(entities);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> ids) {
        edificioRepository.deleteAllById(ids);
    }

    @Override
    public void deleteById(Integer id) {
        edificioRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Integer id) {
        return edificioRepository.existsById(id);
    }

    @Override
    public Optional<EdificioModel> findById(Integer id) {
        return edificioRepository.findById(id);
    }

    @Override
    public List<EdificioModel> findAll(Sort sort) {
        return edificioRepository.findAll(sort);
    }

    @Override
    public Page<EdificioModel> findAll(Pageable pageable) {
        return edificioRepository.findAll(pageable);
    }

    @Override
    public <S extends EdificioModel> long count(Example<S> example) {
        return edificioRepository.count(example);
    }

    @Override
    public <S extends EdificioModel> boolean exists(Example<S> example) {
        return edificioRepository.exists(example);
    }

    @Override
    public <S extends EdificioModel> Page<S> findAll(Example<S> example, Pageable pageable) {
        return edificioRepository.findAll(example, pageable);
    }

    @Override
    public <S extends EdificioModel, R> R findBy(Example<S> example,
        @SuppressWarnings("null") Function<FetchableFluentQuery<S>, R> queryFunction) {
        return edificioRepository.findBy(example, queryFunction);
    }

    @Override
    public <S extends EdificioModel> Optional<S> findOne(Example<S> example) {
        return edificioRepository.findOne(example);
    }

    @Override
    public EdificioModel save(EdificioModel edificio) {
        return edificioRepository.save(edificio);
    }

    @Override
    public List findAll() {
        return edificioRepository.findAll();
    }



}