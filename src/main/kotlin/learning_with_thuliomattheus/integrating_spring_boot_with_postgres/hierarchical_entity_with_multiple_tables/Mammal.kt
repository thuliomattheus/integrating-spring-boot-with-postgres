package learning_with_thuliomattheus.integrating_spring_boot_with_postgres.hierarchical_entity_with_multiple_tables

import jakarta.persistence.Entity
import java.util.UUID

@Entity
class Mammal(
    id: UUID,
    species: String,
    canFly: Boolean,
    val teeth: Int,
    val legs: Int,
    val wings: Int,
) : Animal(id, species, canFly)
