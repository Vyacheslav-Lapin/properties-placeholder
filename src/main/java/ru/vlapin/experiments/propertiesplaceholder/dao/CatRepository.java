package ru.vlapin.experiments.propertiesplaceholder.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.experiments.propertiesplaceholder.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
