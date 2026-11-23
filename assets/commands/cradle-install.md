# TAGLINE

Install the Cradle PHP framework and its packages

# TLDR

**Run the interactive installer** (prompts for database details)

```cradle install```

**Install non-interactively**, overwriting files and accepting defaults

```cradle install -f```

**Install into a named database**

```cradle install [database_name]```

**Supply database credentials** on the command line

```cradle install -h [127.0.0.1] -u [root] -p [password]```

**Install without running SQL setup**

```cradle install --skip-sql```

**Install without updating package versions**

```cradle install --skip-versioning```

**Skip directory creation and permission changes**

```cradle install --skip-mkdir --skip-chmod```

# SYNOPSIS

**cradle** **install** [_database_] [_options_]

# PARAMETERS

_database_
> Name of the SQL database to install into (default prompt value: **testing_db**).

**-f**, **--force**
> Overwrite existing files and database without asking, and use default answers instead of prompting.

**-h**, **--host** _HOST_
> Database host (default: **127.0.0.1**).

**-u**, **--user** _USER_
> Database username (default: **root**).

**-p**, **--password** _PASSWORD_
> Database password (default: empty).

**--skip-configs**
> Do not write the config files under **config/**.

**--skip-sql**
> Skip the SQL setup step (database creation and table reset).

**--skip-versioning**
> Skip resetting package versions and running the package update.

**--skip-mkdir**
> Skip creation of the **compiled**, **log**, **public/upload**, **config/schema**, and **config/packages** directories.

**--skip-chmod**
> Skip setting permissions (0777) on generated directories.

# DESCRIPTION

**cradle install** is the bootstrap subcommand of the **Cradle** PHP framework CLI, usually run as **bin/cradle install** from the project root. It walks through the first-run setup: writing database settings into the config files under **config/**, creating the cache, log and upload directories, applying file permissions, creating the MySQL database, and resetting package versions so that the package update installs every active package.

Without **-f**, the installer prompts for the database name, host, user, and password, and asks before overwriting each existing config file or database. Individual phases can be turned off with the **--skip-*** flags for use in Docker images, CI, or partial redeploys. When finished, it recommends running **cradle sql populate** and **yarn build**.

# CAVEATS

Must be run from the root of a Cradle project, and **config/schema** must be writable. The SQL step **drops all tables** in the target database before reinstalling; with **-f** this happens without confirmation. Credentials passed via **-p** on the command line are visible in the process list and shell history. The CradlePHP project has seen little development since around 2021.

# HISTORY

**cradle install** is part of the **CradlePHP** project (github.com/CradlePHP), developed by Openovate Labs. The install command lives in the **cradle-developer** package.

# SEE ALSO

[cradle](/man/cradle)(1), [composer](/man/composer)(1), [php](/man/php)(1)

# RESOURCES

```[Source code](https://github.com/CradlePHP/cradle-developer)```

```[Homepage](https://cradlephp.github.io/)```

```[Documentation](https://cradlephp.github.io/docs/3.B.-Reference-Command-Line-Tools.html)```

<!-- verified: 2026-11-23 -->
