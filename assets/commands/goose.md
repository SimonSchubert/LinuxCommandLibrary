# TAGLINE

Database migration tool

# TLDR

**Create** a new migration

```goose create [migration-name] [sql|go]```

**Apply** migrations

```goose up```

**Rollback** last migration

```goose down```

**Check** migration status

```goose status```

# SYNOPSIS

**goose** [_options_] _command_

# PARAMETERS

**up**
> Migrate up

**up-by-one**
> Migrate up by one version

**down**
> Migrate down

**down-to** _VERSION_
> Migrate down to specific version

**status**
> Show migration status

**create** _NAME_ _TYPE_
> Create new migration (sql or go)

**fix**
> Apply sequential ordering to migrations

**version**
> Print goose version

**-dir** _DIR_
> Migrations directory (default: migrations)

**-table** _TABLE_
> Migrations table name (default: goose_db_version)

**-s, --allow-missing**
> Allow missing migrations

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**goose** is a database migration tool that supports both SQL and Go migrations. It manages database schema changes by versioning migration files and tracking which migrations have been applied.

The tool supports PostgreSQL, MySQL, SQLite, SQL Server, and other databases, providing a consistent interface for schema migrations.

# DATABASE DRIVERS

Supported databases:
- PostgreSQL
- MySQL/MariaDB
- SQLite3
- SQL Server
- ClickHouse
- Redshift
- TiDB
- Turso

# CAVEATS

Requires database connection. Migration files must follow naming conventions. Down migrations should be tested carefully. Concurrent migrations may need locking.

# HISTORY

**goose** was created as a language-agnostic migration tool supporting both SQL and Go-based migrations, filling the gap for Go developers needing database migrations.

# SEE ALSO

[migrate](https://github.com/golang-migrate/migrate), [dbmate](https://github.com/amacneil/dbmate), [flyway](https://flywaydb.org/), [liquibase](https://www.liquibase.org/)