package learning_with_thuliomattheus.integrating_spring_boot_with_postgres.hierarchical_entity_with_single_table

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("Motorcycle")
class Motorcycle(
    manufacturer: String,
    model: String,
    year: Int,
) : Vehicle(manufacturer, model, year) {

    fun wheelie() {
        println("Vrum vrum vrum")
    }
}
