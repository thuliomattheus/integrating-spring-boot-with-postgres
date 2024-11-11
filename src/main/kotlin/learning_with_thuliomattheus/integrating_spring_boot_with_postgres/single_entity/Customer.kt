package learning_with_thuliomattheus.integrating_spring_boot_with_postgres.single_entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Table
@Entity
class Customer(
    val name: String,
    val email: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID? = null
}
