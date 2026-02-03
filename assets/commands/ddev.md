# TLDR

**Start a project**

```ddev start```

**Stop the project**

```ddev stop```

**Configure a new project**

```ddev config```

**Open project in browser**

```ddev launch```

**SSH into the web container**

```ddev ssh```

**Run composer command**

```ddev composer [install]```

**Run database command**

```ddev mysql```

**Import database**

```ddev import-db --src=[database.sql.gz]```

**Show project status**

```ddev describe```

# SYNOPSIS

**ddev** _command_ [_options_]

# SUBCOMMANDS

**start**
> Start the project containers.

**stop**
> Stop the project containers.

**config**
> Create or modify project configuration.

**launch**
> Open project in browser.

**ssh**
> SSH into the web container.

**exec**
> Execute a command in the web container.

**composer**
> Run Composer commands.

**mysql**
> Access MySQL/MariaDB.

**import-db**
> Import a database dump.

**export-db**
> Export the database.

**describe**
> Show project details.

**list**
> List all DDEV projects.

# DESCRIPTION

**ddev** is an open-source local PHP development environment based on Docker. It provides pre-configured stacks for PHP applications including Drupal, WordPress, Laravel, TYPO3, and generic PHP projects.

DDEV simplifies setting up consistent development environments with web server, database, and PHP configuration.

# CAVEATS

Requires Docker to be installed and running. First-time startup may take time to download Docker images.

# SEE ALSO

[docker-compose](/man/docker-compose)(1), [lando](/man/lando)(1)
