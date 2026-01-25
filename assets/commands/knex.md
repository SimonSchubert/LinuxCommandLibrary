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

**Show migration status**

```npx knex migrate:status```

# SYNOPSIS

**npx knex** _command_ [_options_]

# PARAMETERS

**init**
> Create knexfile.js configuration.

**migrate:make** _name_
> Create new migration.

**migrate:latest**
> Run pending migrations.

**migrate:rollback**
> Undo last migration batch.

**migrate:status**
> Show migration status.

**seed:make** _name_
> Create seed file.

**seed:run**
> Run seed files.

**--env** _environment_
> Target environment.

**--knexfile** _path_
> Specify knexfile path.

# DESCRIPTION

**Knex.js** is a SQL query builder for Node.js. The CLI manages database migrations and seeds, providing version-controlled schema changes.

Knex supports PostgreSQL, MySQL, SQLite3, and other databases. Migrations define schema changes; seeds populate test data.

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

Database connection required for migrations. Rollbacks may cause data loss. Seed order not guaranteed. Test migrations on copy first.

# HISTORY

Knex was created by **Tim Griesser** as a flexible SQL query builder for Node.js. It provides a foundation for ORMs like Objection.js.

# SEE ALSO

[node](/man/node)(1), [prisma](/man/prisma)(1), [sequelize](/man/sequelize)(1)
