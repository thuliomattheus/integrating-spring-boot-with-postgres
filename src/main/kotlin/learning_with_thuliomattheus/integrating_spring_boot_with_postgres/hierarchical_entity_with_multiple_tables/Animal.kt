package learning_with_thuliomattheus.integrating_spring_boot_with_postgres.hierarchical_entity_with_multiple_tables

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Inheritance
import jakarta.persistence.InheritanceType
import java.util.UUID

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract class Animal(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID? = null,
    val species: String,
    @Column(name = "can_fly") val canFly: Boolean,
)
