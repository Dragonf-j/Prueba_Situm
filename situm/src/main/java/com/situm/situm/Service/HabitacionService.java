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

import com.situm.situm.Model.HabitacionModel;
import com.situm.situm.Repository.HabitacionRepository;


/**
 * Esta clase es la encargada de si debe devolver datos de la tabla habitación o realizar alguna operación con ellos
 */
@Service
public class HabitacionService implements HabitacionRepository {
    private final HabitacionRepository habitacionRepository;

    public HabitacionService(HabitacionRepository habitacionRepository) {
        this.habitacionRepository = habitacionRepository;
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> ids) {
        habitacionRepository.deleteAllByIdInBatch(ids);
    }

    @Override
    public void deleteAllInBatch() {
        habitacionRepository.deleteAllInBatch();
    }

    @Override
    public void deleteAllInBatch(Iterable<HabitacionModel> entities) {
        habitacionRepository.deleteAllInBatch(entities);
    }

    @Override
    public <S extends HabitacionModel> List<S> findAll(Example<S> example) {
        return habitacionRepository.findAll(example);
    }

    @Override
    public <S extends HabitacionModel> List<S> findAll(Example<S> example, Sort sort) {
        return habitacionRepository.findAll(example, sort);
    }

    @Override
    public void flush() {
        habitacionRepository.flush();
    }

    @Override
    public HabitacionModel getById(Integer id) {
        return habitacionRepository.getById(id);
    }

    @Override
    public HabitacionModel getOne(Integer id) {
        return habitacionRepository.getOne(id);
    }

    @Override
    public HabitacionModel getReferenceById(Integer id) {
        return habitacionRepository.getReferenceById(id);
    }

    @Override
    public <S extends HabitacionModel> List<S> saveAllAndFlush(Iterable<S> entities) {
        return habitacionRepository.saveAllAndFlush(entities);
    }

    @Override
    public <S extends HabitacionModel> S saveAndFlush(S entity) {
        return habitacionRepository.saveAndFlush(entity);
    }

    @Override
    public List<HabitacionModel> findAll() {
        return habitacionRepository.findAll();
    }

    @Override
    public List<HabitacionModel> findAllById(Iterable<Integer> ids) {
        return habitacionRepository.findAllById(ids);
    }

    @Override
    public <S extends HabitacionModel> List<S> saveAll(Iterable<S> entities) {
        return habitacionRepository.saveAll(entities);
    }

    @Override
    public long count() {
        return habitacionRepository.count();
    }

    @Override
    public void delete(HabitacionModel entity) {
        habitacionRepository.delete(entity);
    }

    @Override
    public void deleteAll() {
        habitacionRepository.deleteAll();
    }

    @Override
    public void deleteAll(Iterable<? extends HabitacionModel> entities) {
        habitacionRepository.deleteAll(entities);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> ids) {
        habitacionRepository.deleteAllById(ids);
    }

    @Override
    public void deleteById(Integer id) {
        habitacionRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Integer id) {
        return habitacionRepository.existsById(id);
    }

    @Override
    public Optional<HabitacionModel> findById(Integer id) {
        return habitacionRepository.findById(id);
    }

    @Override
    public <S extends HabitacionModel> S save(S entity) {
        return habitacionRepository.save(entity);
    }

    @Override
    public List<HabitacionModel> findAll(Sort sort) {
        return habitacionRepository.findAll(sort);
    }

    @Override
    public Page<HabitacionModel> findAll(Pageable pageable) {
        return habitacionRepository.findAll(pageable);
    }

    @Override
    public <S extends HabitacionModel> long count(Example<S> example) {
        return habitacionRepository.count(example);
    }

    @Override
    public <S extends HabitacionModel> boolean exists(Example<S> example) {
        return habitacionRepository.exists(example);
    }

    @Override
    public <S extends HabitacionModel> Page<S> findAll(Example<S> example, Pageable pageable) {
        return habitacionRepository.findAll(example, pageable);
    }

    @Override
    public <S extends HabitacionModel, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
        return habitacionRepository.findBy(example, queryFunction);
    }

    @Override
    public <S extends HabitacionModel> Optional<S> findOne(Example<S> example) {
        return habitacionRepository.findOne(example);
    }


}

