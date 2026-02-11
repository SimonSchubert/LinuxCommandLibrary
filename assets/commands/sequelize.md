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
> Revert migration.

**seed:generate**
> Create seed file.

**db:seed:all**
> Run all seeds.

**migration:generate**
> Create migration.

**--name** _NAME_
> Model/migration name.

**--attributes** _ATTRS_
> Model attributes.

# DESCRIPTION

**sequelize-cli** manages Sequelize ORM projects, providing scaffolding for models, migrations, and seed files. The **init** command creates the standard project structure with config, models, migrations, and seeders directories.

Models define database table mappings with typed attributes, and the CLI generates both the model file and an initial migration. Migrations version the database schema using up and down functions, allowing incremental schema changes that can be applied or reverted. Seeds populate tables with initial or test data.

The CLI supports PostgreSQL, MySQL, MariaDB, SQLite, and Microsoft SQL Server through Sequelize's database abstraction layer.

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

[node](/man/node)(1), [npm](/man/npm)(1), [knex](/man/knex)(1)
