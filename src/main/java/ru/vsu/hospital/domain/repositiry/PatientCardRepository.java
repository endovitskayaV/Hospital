package ru.vsu.hospital.domain.repositiry;

import org.springframework.data.repository.CrudRepository;
import ru.vsu.hospital.domain.entity.PatientCard;

public interface PatientCardRepository extends CrudRepository <PatientCard, Long>{}