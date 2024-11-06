# Using a PostgreSQL instance with Docker:
If you want to use a PostgreSQL instance with Docker, you can use the following command:
```bash
docker-compose up
```

# Database initialization:
If you still don't have created the database, create it with the name `my_database_name` (or another one, but in this case you need to update the values on docker-compose.yaml and application.yml files) in your PostgreSQL server.

Example of how to run a command into a Docker instance:
```bash
docker exec -it postgres-container /bin/sh
```

The `postgres-container` must be the same value on `container_name` attribute in docker-compose.yaml file.

Example of how to create a database in PostgreSQL:
```
psql -U postgres
CREATE DATABASE my_database_name;
OR
CREATE DATABASE my_database_name WITH OWNER = postgres;
OR
CREATE DATABASE my_database_name WITH OWNER = postgres ENCODING = 'UTF8';
```

To validate the creation of the database, you can run the command `\l` or `\list` in the psql terminal.
