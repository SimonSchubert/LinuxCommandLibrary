# TLDR

**Setup database** (create if not exists)

```diesel setup```

**Generate a new migration**

```diesel migration generate [migration_name]```

**Run pending migrations**

```diesel migration run```

**Revert last migration**

```diesel migration revert```

**Print current schema**

```diesel print-schema```

**Generate schema.rs from database**

```diesel print-schema > src/schema.rs```

**Check migration status**

```diesel migration list```

# SYNOPSIS

**diesel** _command_ [_options_]

# PARAMETERS

**setup**
> Create database and run migrations.

**migration generate** _name_
> Create new migration files.

**migration run**
> Run all pending migrations.

**migration revert**
> Revert the latest migration.

**migration redo**
> Revert and re-run latest migration.

**migration list**
> List all migrations and their status.

**print-schema**
> Output database schema as Rust code.

**database setup**
> Create the database.

**database reset**
> Drop and recreate database.

**--database-url** _url_
> Database connection URL.

**--config-file** _file_
> Path to diesel.toml.

**--migration-dir** _dir_
> Directory containing migrations.

# DESCRIPTION

**Diesel** CLI is the command-line tool for the Diesel ORM, a safe, extensible ORM and query builder for Rust. It manages database migrations and generates Rust code representing the database schema.

Migrations are SQL files in a migrations directory, with "up" and "down" files for applying and reverting changes. The CLI tracks applied migrations in a database table.

The **print-schema** command introspects the database and generates Rust code (schema.rs) that Diesel uses for compile-time query validation. This ensures queries are type-checked against the actual database structure.

# CONFIGURATION

**diesel.toml**:
```toml
[print_schema]
file = "src/schema.rs"
with_docs = true

[migrations_directory]
dir = "migrations"
```

# CAVEATS

Requires database driver libraries (libpq for PostgreSQL, libmysqlclient for MySQL). The DATABASE_URL environment variable or --database-url must be set. Schema generation requires an accessible database. Migration SQL varies by database backend.

# HISTORY

Diesel was created by **Sean Griffin** (also a Ruby on Rails contributor) and first released in **2015**. It was designed to leverage Rust's type system for database safety. The CLI tool provides migration management similar to ActiveRecord or Knex. Diesel has become one of the most popular Rust database libraries.

# SEE ALSO

[sqlx](/man/sqlx)(1), [sea-orm](/man/sea-orm)(1), [cargo](/man/cargo)(1)
