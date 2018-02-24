package ru.vsu.hospital.domain.repositiry;

import org.springframework.data.repository.CrudRepository;
import ru.vsu.hospital.domain.entity.Doctor;

public interface DoctorRepository extends CrudRepository <Doctor, Long>{}