# TAGLINE

TypeORM database migration and entity CLI

# TLDR

**Initialize a project**

```typeorm init --name [my-project] --database [postgres]```

**Create an entity file**

```typeorm entity:create [path/to/entity/Name]```

**Create an empty migration**

```typeorm migration:create [path/to/migrations/Name]```

**Generate a migration from entity changes**

```typeorm migration:generate -d [path/to/datasource] [path/to/migrations/Name]```

**Run migrations**

```typeorm migration:run -d [path/to/datasource]```

**Revert the last migration**

```typeorm migration:revert -d [path/to/datasource]```

**Show migration status**

```typeorm migration:show -d [path/to/datasource]```

**Synchronize the schema**

```typeorm schema:sync -d [path/to/datasource]```

**Log schema changes without running them**

```typeorm schema:log -d [path/to/datasource]```

# SYNOPSIS

**typeorm** _command_ [_path_] [**-d** _datasource_] [_options_]

# PARAMETERS

**init**
> Create a new project (**--name**, **--database**, **--module esm**, **--express**, **--docker**).

**entity:create** _PATH_
> Create an entity file.

**subscriber:create** _PATH_
> Create a subscriber file.

**migration:create** _PATH_
> Create an empty migration.

**migration:generate** _PATH_
> Generate a migration by comparing entities with the database schema (**-o** JavaScript output, **-p** pretty-print queries).

**migration:run**
> Execute all pending migrations.

**migration:revert**
> Revert the last migration.

**migration:show**
> List all migrations with their execution status.

**schema:sync**
> Synchronize the database schema with entities.

**schema:log**
> Show the queries schema:sync would run.

**schema:drop**
> Drop the database schema.

**query** _SQL_
> Run an SQL query.

**cache:clear**
> Clear the query cache.

**version**
> Show local and global TypeORM versions.

**-d** _PATH_
> Path to the data source configuration.

# DESCRIPTION

**typeorm** is the command-line interface for TypeORM, a TypeScript and JavaScript ORM that supports PostgreSQL, MySQL, SQLite, and other databases. It provides tools for managing database migrations, generating entity scaffolds, and synchronizing schema changes.

Migrations track database schema changes as versioned files that can be applied and reverted. The **migration:generate** command creates migration files by comparing the current entities to the database state. Schema sync directly updates the database to match entity definitions.

The CLI also initializes new projects with boilerplate configuration and entity files.

# CAVEATS

The **-n** name flag of older releases was replaced by a path argument. **migration:run** and **migration:revert** work on .js files, so compile TypeScript first or use **typeorm-ts-node-commonjs** or **typeorm-ts-node-esm**. When run through **npm run**, add `--` before the CLI options. **schema:sync** and **schema:drop** can lose data and should be used carefully in production.

# HISTORY

**TypeORM** is an ORM for TypeScript and JavaScript, with the CLI providing database management operations.

# SEE ALSO

[prisma](/man/prisma)(1), [knex](/man/knex)(1), [sequelize](/man/sequelize)(1)

# RESOURCES

```[Homepage](https://typeorm.io)```

```[Source code](https://github.com/typeorm/typeorm)```

```[Documentation](https://typeorm.io/docs/advanced-topics/using-cli/)```

<!-- verified: 2026-11-09 -->
