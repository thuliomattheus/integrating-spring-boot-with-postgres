package learning_with_thuliomattheus.integrating_spring_boot_with_postgres

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IntegratingSpringBootWithPostgresApplication

fun main(args: Array<String>) {
	runApplication<IntegratingSpringBootWithPostgresApplication>(*args)
}
