# TAGLINE

Sequelize ORM migration and model CLI

# TLDR

**Initialize sequelize**

```npx sequelize-cli init```

**Create model**

```npx sequelize-cli model:generate --name [User] --attributes [name:string,email:string]```

**Run migrations**

```npx sequelize-cli db:migrate```

**Undo last migration**

```npx sequelize-cli db:migrate:undo```

**Create seed**

```npx sequelize-cli seed:generate --name [demo-user]```

**Run seeds**

```npx sequelize-cli db:seed:all```

**Create migration**

```npx sequelize-cli migration:generate --name [add-column]```

**Create the configured database**

```npx sequelize-cli db:create```

**Show migration status**

```npx sequelize-cli db:migrate:status```

**Run migrations against a specific environment**

```npx sequelize-cli db:migrate --env [production]```

**Revert all seeds**

```npx sequelize-cli db:seed:undo:all```

# SYNOPSIS

**sequelize-cli** _command_ [_options_]

# PARAMETERS

**init**
> Initialize project.

**model:generate**
> Create model.

**db:migrate**
> Run migrations.

**db:migrate:undo**
> Revert the most recent migration.

**db:migrate:undo:all**
> Revert all migrations, or back to a given one with **--to**.

**db:migrate:status**
> List the status of all migrations.

**db:create**
> Create the database specified by the configuration.

**db:drop**
> Drop the database specified by the configuration.

**seed:generate**
> Create seed file.

**db:seed:all**
> Run all seeds.

**db:seed:undo**
> Undo the most recent seed, or a specific one with **--seed**.

**db:seed:undo:all**
> Undo all seeds.

**migration:generate**
> Create migration.

**--name** _NAME_
> Model/migration name.

**--attributes** _ATTRS_
> Model attributes as comma-separated _name:type_ pairs.

**--env** _NAME_
> Environment to run the command in (default: development).

**--config** _FILE_
> Path to the config file.

**--url** _URL_
> Database connection string, as an alternative to config files.

**--migrations-path**, **--seeders-path**, **--models-path** _DIR_
> Override the default project directories.

**--options-path** _FILE_
> Path to a file with additional options.

**--debug**
> Show additional debug information when available.

# DESCRIPTION

**sequelize-cli** manages Sequelize ORM projects, providing scaffolding for models, migrations, and seed files. The **init** command creates the standard project structure with config, models, migrations, and seeders directories.

Models define database table mappings with typed attributes, and the CLI generates both the model file and an initial migration. Migrations version the database schema using up and down functions, allowing incremental schema changes that can be applied or reverted. Seeds populate tables with initial or test data.

The CLI works with the databases supported by Sequelize, including PostgreSQL, MySQL, MariaDB, SQLite, Microsoft SQL Server, and Oracle. It is installed per project with **npm install --save-dev sequelize-cli** and provides both the **sequelize** and **sequelize-cli** executables.

# CONFIGURATION

**config/config.json**
> Database connection configuration for development, test, and production environments, specifying host, port, username, password, dialect, and database name.

**.sequelizerc**
> Project-level configuration file overriding default paths for models, migrations, seeders, and config directories.

# CAVEATS

Node.js ORM. Database-specific syntax may vary. Migration ordering is important.

# HISTORY

**Sequelize** is a Node.js ORM supporting PostgreSQL, MySQL, SQLite, and others. The CLI provides scaffolding and migration tools.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [npx](/man/npx)(1), [knex](/man/knex)(1)

# RESOURCES

```[Source code](https://github.com/sequelize/cli)```

```[Homepage](https://sequelize.org/)```

```[Documentation](https://sequelize.org/docs/v6/other-topics/migrations/)```

<!-- verified: 2026-11-08 -->
