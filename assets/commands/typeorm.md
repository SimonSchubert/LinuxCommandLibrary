# TAGLINE

TypeORM database migration and entity CLI

# TLDR

**Initialize project**

```typeorm init```

**Generate migration**

```typeorm migration:generate -n [MigrationName]```

**Run migrations**

```typeorm migration:run```

**Revert migration**

```typeorm migration:revert```

**Create entity**

```typeorm entity:create -n [EntityName]```

**Sync schema**

```typeorm schema:sync```

# SYNOPSIS

**typeorm** _command_ [_-n name_] [_options_]

# PARAMETERS

**init**
> Initialize project.

**migration:generate**
> Generate migration.

**migration:run**
> Run migrations.

**migration:revert**
> Revert last.

**entity:create**
> Create entity.

**schema:sync**
> Sync database.

# DESCRIPTION

**typeorm** is the command-line interface for TypeORM, a TypeScript and JavaScript ORM that supports PostgreSQL, MySQL, SQLite, and other databases. It provides tools for managing database migrations, generating entity scaffolds, and synchronizing schema changes.

Migrations track database schema changes as versioned files that can be applied and reverted. The **migration:generate** command automatically creates migration files by comparing the current entities to the database state. Schema sync provides a simpler alternative that directly updates the database to match entity definitions.

The CLI also supports initializing new projects with boilerplate configuration and entity files.

# CAVEATS

TypeScript/Node.js. Config file needed. Database connection required.

# HISTORY

**TypeORM** is an ORM for TypeScript and JavaScript, with the CLI providing database management operations.

# SEE ALSO

[prisma](/man/prisma)(1), [knex](/man/knex)(1), [sequelize](/man/sequelize)(1)
