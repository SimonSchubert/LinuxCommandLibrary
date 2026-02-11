# TAGLINE

Rust SQL toolkit with compile-time checks

# TLDR

**Create database**

```sqlx database create```

**Run migrations**

```sqlx migrate run```

**Create migration**

```sqlx migrate add [migration_name]```

**Revert migration**

```sqlx migrate revert```

**Prepare offline**

```sqlx prepare```

**Check queries**

```sqlx prepare --check```

# SYNOPSIS

**sqlx** _command_ [_options_]

# PARAMETERS

**database**
> Database operations.

**migrate**
> Migration commands.

**prepare**
> Prepare for offline.

**--database-url** _URL_
> Connection string.

**add**
> Add migration.

**run**
> Run migrations.

# DESCRIPTION

**sqlx** is a command-line tool for the SQLx Rust SQL toolkit that provides database migration management and compile-time query verification. It supports PostgreSQL, MySQL, MariaDB, and SQLite.

The migration system creates versioned SQL scripts that track schema changes, with commands to create, run, and revert migrations. The **prepare** command caches query metadata to a JSON file, enabling compile-time type checking of SQL queries in Rust code without requiring a live database connection during builds.

A **DATABASE_URL** environment variable or **.env** file must specify the database connection string for all operations.

# CONFIGURATION

**DATABASE_URL**
> Environment variable specifying the database connection string (e.g., postgres://user:pass@host/db, sqlite:data.db).

**.env**
> Project-level file where DATABASE_URL can be defined; automatically loaded by sqlx commands.

# CAVEATS

Rust development tool. DATABASE_URL required. Compile-time checks.

# HISTORY

**sqlx** is a Rust SQL toolkit providing compile-time checked queries and database migrations.

# SEE ALSO

[diesel](/man/diesel)(1), [psql](/man/psql)(1), [sqlite3](/man/sqlite3)(1)
