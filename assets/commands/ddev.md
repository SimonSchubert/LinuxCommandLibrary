# TAGLINE

Docker-based PHP development environment manager

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

# CONFIGURATION

**.ddev/config.yaml**
> Project configuration file defining PHP version, web server type, database settings, and project name.

**~/.ddev/global_config.yaml**
> Global DDEV settings including default web server, router ports, and performance options.

# DESCRIPTION

**ddev** is an open-source local PHP development environment based on Docker. It provides pre-configured stacks for PHP applications including Drupal, WordPress, Laravel, TYPO3, Magento, and generic PHP projects, eliminating the complexity of manually configuring web servers, databases, and PHP versions.

The tool automatically provisions containers with appropriate versions of PHP, web server (nginx or Apache), database (MySQL, MariaDB, or PostgreSQL), and common services like Redis and Mailhog. Configuration is stored in .ddev/config.yaml, making development environments reproducible and shareable across teams.

DDEV simplifies common development workflows through commands that proxy to tools inside containers (composer, mysql, npm) without requiring those tools on the host system. It supports multiple projects running simultaneously, automatic HTTPS with trusted certificates, and integration with development tools. The environment closely matches production configurations while remaining easy to set up and tear down, making it valuable for agencies managing multiple client projects or developers working across different technology stacks.

# CAVEATS

Requires Docker to be installed and running. First-time startup may take time to download Docker images.

# SEE ALSO

[docker-compose](/man/docker-compose)(1), [lando](/man/lando)(1)
