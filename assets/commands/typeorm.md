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

**typeorm** manages ORM tasks. It's TypeORM CLI.

Migration management. Database versioning.

Entity generation. Create models.

Schema sync. Auto-update DB.

Multiple databases. PostgreSQL, MySQL, etc.

# CAVEATS

TypeScript/Node.js. Config file needed. Database connection required.

# HISTORY

**TypeORM** is an ORM for TypeScript and JavaScript, with the CLI providing database management operations.

# SEE ALSO

[prisma](/man/prisma)(1), [knex](/man/knex)(1), [sequelize](/man/sequelize)(1)
