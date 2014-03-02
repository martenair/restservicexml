package com.regs.core.service;

import com.regs.core.domain.Person;

/**
 * Created by home on 01.03.14.
 */
public interface IPersonService {
    Person getRandom();
    Person getById(Long id);
    void save(Person obj);
}
