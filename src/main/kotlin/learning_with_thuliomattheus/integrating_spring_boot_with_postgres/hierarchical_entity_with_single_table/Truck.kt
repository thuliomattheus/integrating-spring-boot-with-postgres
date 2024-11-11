package learning_with_thuliomattheus.integrating_spring_boot_with_postgres.hierarchical_entity_with_single_table

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("Truck")
class Truck(
    manufacturer: String,
    model: String,
    year: Int,

    val axles: Int,
) : Vehicle(manufacturer, model, year)
