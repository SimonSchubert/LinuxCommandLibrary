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

**sqlx** manages SQL in Rust. It's compile-time checked SQL.

Migration management. Version control schema.

Offline mode support. Cached query data.

Compile-time verification. Type-safe queries.

Multiple databases. Postgres, MySQL, SQLite.

# CAVEATS

Rust development tool. DATABASE_URL required. Compile-time checks.

# HISTORY

**sqlx** is a Rust SQL toolkit providing compile-time checked queries and database migrations.

# SEE ALSO

[diesel](/man/diesel)(1), [psql](/man/psql)(1), [sqlite3](/man/sqlite3)(1)
