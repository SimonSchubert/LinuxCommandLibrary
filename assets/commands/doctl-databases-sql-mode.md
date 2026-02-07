# TAGLINE

manage MySQL SQL mode settings

# TLDR

**Get SQL mode**

```doctl databases sql-mode get [cluster_id]```

**Set SQL mode**

```doctl databases sql-mode set [cluster_id] [modes...]```

# SYNOPSIS

**doctl** **databases** **sql-mode** _command_ [_options_]

# SUBCOMMANDS

**get**
> Get current SQL mode.

**set**
> Set SQL mode.

# DESCRIPTION

**doctl databases sql-mode** manages SQL mode settings for MySQL managed database clusters on DigitalOcean. SQL modes control how MySQL handles query syntax validation, data type conversions, and error conditions.

Different SQL modes affect database behavior significantly. For example, STRICT_TRANS_TABLES rejects invalid data rather than silently converting it, ANSI_QUOTES changes how identifiers are quoted, and NO_ZERO_DATE prevents use of '0000-00-00' dates. These modes help enforce data integrity standards and ensure compatibility with specific application requirements or database migration scenarios.

Understanding and configuring SQL modes is important for database compatibility, especially when migrating from other database systems or maintaining strict data validation requirements.

# SEE ALSO

[doctl-databases](/man/doctl-databases)(1)
