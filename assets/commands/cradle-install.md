# TAGLINE

Install the Cradle PHP framework and its packages

# TLDR

**Run the interactive installer with defaults**

```cradle install```

**Force install, overwriting existing files**

```cradle install -f```

**Install without running SQL setup**

```cradle install --skip-sql```

**Install without updating package versions**

```cradle install --skip-versioning```

**Install without creating cache directories**

```cradle install --skip-mkdir```

**Install without adjusting file permissions**

```cradle install --skip-chmod```

**Supply database credentials on the command line**

```cradle install -h [127.0.0.1] -u [root] -p [password]```

# SYNOPSIS

**cradle** **install** [_options_]

# PARAMETERS

**-f**, **--force**
> Force installation, overwriting any previously installed files.

**--skip-sql**
> Skip the SQL setup step (databases, seed data, schema import).

**--skip-versioning**
> Skip updating package version metadata.

**--skip-mkdir**
> Skip creation of cache, upload, and log directories.

**--skip-chmod**
> Skip setting filesystem permissions on generated directories.

**-h** _HOST_
> Database host used when SQL setup is enabled.

**-u** _USER_
> Database username.

**-p** _PASSWORD_
> Database password.

# DESCRIPTION

**cradle install** is the bootstrap subcommand of the **Cradle** PHP framework CLI. It walks through the first-run setup: importing SQL schemas, writing configuration under `config/`, creating cache and upload directories, applying file permissions, and registering active packages with the framework.

The command is idempotent when **-f** is not given; existing configuration and files are preserved, and individual phases can be turned off with the various `--skip-*` flags for use in Docker images, CI, or partial redeploys.

# CAVEATS

Must be run from the root of a Cradle project. Credentials passed via **-p** on the command line are visible in the process list; prefer environment variables or a prepared `config/settings.php` when security matters.

# HISTORY

**cradle install** is part of the **CradlePHP** project (github.com/CradlePHP). It started as an experimental admin package manager and was merged into the core `cradle` CLI as the standard installer.

# SEE ALSO

[cradle](/man/cradle)(1), [composer](/man/composer)(1), [php](/man/php)(1)
