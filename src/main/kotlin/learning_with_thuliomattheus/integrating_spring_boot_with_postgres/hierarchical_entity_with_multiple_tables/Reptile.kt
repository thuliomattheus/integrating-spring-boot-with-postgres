package learning_with_thuliomattheus.integrating_spring_boot_with_postgres.hierarchical_entity_with_multiple_tables

import jakarta.persistence.Column
import jakarta.persistence.Entity
import java.util.UUID

@Entity
class Reptile(
    id: UUID,
    species: String,
    canFly: Boolean,
    val poisonous: Boolean,
    @Column(name = "eggs_per_year") val eggsPerYear: Int,
) : Animal(id, species, canFly)
