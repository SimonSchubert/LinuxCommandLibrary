# TAGLINE

SQL query builder for Node

# TLDR

**Initialize Knex project**

```npx knex init```

**Create migration**

```npx knex migrate:make [migration_name]```

**Run migrations**

```npx knex migrate:latest```

**Rollback migration**

```npx knex migrate:rollback```

**Create seed file**

```npx knex seed:make [seed_name]```

**Run seeds**

```npx knex seed:run```

**Show migration status** (completed and pending)

```npx knex migrate:list```

**Run migrations** for a specific environment

```npx knex migrate:latest --env [production]```

**Roll back all migrations**

```npx knex migrate:rollback --all```

**Create a TypeScript knexfile**

```npx knex init -x ts```

# SYNOPSIS

**npx knex** _command_ [_options_]

# PARAMETERS

**init** [**-x** _ext_]
> Create a fresh knexfile (**js** by default, **-x ts** for TypeScript).

**migrate:make** _name_
> Create a named migration file (**-x** sets the extension, **--stub** a custom template).

**migrate:latest**
> Run pending migrations.

**migrate:rollback** [**--all**]
> Undo the last migration batch (or all completed migrations).

**seed:make** _name_
> Create seed file.

**seed:run** [**--specific** _file_]
> Run all seed files, or only one.

**migrate:up** [_filename_]
> Run the next pending migration (or a named one).

**migrate:down** [_filename_]
> Roll back the last completed migration (or a named one).

**migrate:list** (alias **migrate:status**)
> List completed and pending migrations.

**migrate:currentVersion**
> Show the current migration version.

**migrate:unlock**
> Forcibly release the migration lock (use after a crashed run).

**--env** _ENVIRONMENT_
> Pick the section of **knexfile** to use (default: _development_, or **NODE_ENV**).

**--knexfile** _PATH_
> Specify a custom knexfile path.

**--client** _DIALECT_
> Override the database client dialect.

**--connection** _ADDRESS_
> Override the database connection string.

**--cwd** _PATH_
> Set the working directory.

**--esm**
> Enable ESM interop (for ES module knexfiles).

**--disable-transactions**
> Run migrations without wrapping each one in a transaction.

**--debug**
> Print SQL statements as they execute.

# DESCRIPTION

**Knex.js** is a SQL query builder for Node.js. The CLI manages database migrations and seeds, providing version-controlled schema changes.

Knex supports PostgreSQL, CockroachDB, MySQL, MariaDB, SQLite3, MSSQL, Oracle, and Amazon Redshift. Migrations define schema changes and are applied in batches recorded in the **knex_migrations** table; seeds populate test data.

# KNEXFILE EXAMPLE

```javascript
module.exports = {
  development: {
    client: 'postgresql',
    connection: {
      database: 'mydb',
      user: 'user',
      password: 'password'
    },
    migrations: {
      tableName: 'knex_migrations'
    }
  }
};
```

# CAVEATS

Database connection required for migrations. Rollbacks may cause data loss. Seed files run in alphabetical order, so prefix them (e.g. **01_users.js**) to control order. Test migrations on copy first.

# HISTORY

Knex was created by **Tim Griesser** in **2012** as a flexible SQL query builder for Node.js. It provides a foundation for ORMs like Objection.js.

# SEE ALSO

[node](/man/node)(1), [prisma](/man/prisma)(1), [sequelize](/man/sequelize)(1)

# RESOURCES

```[Homepage](https://knexjs.org/)```

```[Source code](https://github.com/knex/knex)```

```[Documentation](https://knexjs.org/guide/migrations.html)```

<!-- verified: 2026-11-23 -->
