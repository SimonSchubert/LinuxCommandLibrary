# TAGLINE

CLI for the Cradle PHP framework

# TLDR

**Install the Cradle framework**

```cradle install```

**Install and force override files**

```cradle install -f```

**Start a PHP server**

```cradle server -h [127.0.0.1] -p [8888]```

**Update all packages**

```cradle update```

**Install a package from Packagist**

```cradle package install [foo/bar]```

**Rebuild the database schema**

```cradle sql build```

**Connect to a configured server**

```cradle connect [app-1]```

**Deploy code to a server**

```cradle deploy production```

# SYNOPSIS

**cradle** _command_ [_options_] [_arguments_]

# PARAMETERS

**install**
> Install the Cradle framework and dependencies. Supports `-f`/`--force` to override files, `--skip-sql`, `--skip-versioning`, `--skip-mkdir`, `--skip-chmod`, and `-h`, `-u`, `-p` for the database host, user and password.

**server**
> Start a PHP server. Use `-h` for the host and `-p` for the port.

**update**
> Update all packages to their latest version.

**connect** _NAME_
> Connect to a server defined in `config/deploy.php`.

**deploy production**
> Deploy code to the server defined in `config/deploy.php`.

**deploy s3**
> Upload static assets to S3. Supports `--include-yarn` and `--include-upload`.

**elastic** **flush**|**map**|**populate** [_PACKAGE_]
> Truncate the index, submit the schema, or populate ElasticSearch.

**package** **install**|**update** _PACKAGE_ [_VERSION_]
> Install a package from Packagist or update it.

**package** **list**
> List the available packages.

**package** **remove** _PACKAGE_
> Remove a package.

**package** **search** _TERM_
> Search Packagist for a package.

**redis** **flush** [_PACKAGE_]
> Truncate the entire cache.

**sql** **flush**|**build**|**populate** [_PACKAGE_]
> Truncate the database, rebuild the schema, or populate the tables.

**help**
> Display the general help menu.

# DESCRIPTION

**Cradle** is a PHP framework and content management system designed for rapid application development with a focus on modularity and developer experience. The CLI tool provides commands for installation, package management, deployment, and managing the SQL, Redis and ElasticSearch services of a project.

The framework follows an event-driven architecture, allowing loose coupling between components. Modules can be developed independently and plugged into applications.

# CAVEATS

Requires PHP 7.1 or newer and Composer. Database commands require proper configuration in the framework's settings. The project appears inactive: its main repository was last pushed in **2022**.

# HISTORY

Cradle was developed as a modern PHP framework emphasizing event-driven programming and modularity. It emerged from the PHP development community's need for frameworks that balance convention with flexibility, providing structure without excessive constraints.

# SEE ALSO

[composer](/man/composer)(1), [php](/man/php)(1), [artisan](/man/artisan)(1)

# RESOURCES

```[Source code](https://github.com/CradlePHP/Cradle)```

```[Homepage](https://cradlephp.github.io/)```

```[Documentation](https://cradlephp.github.io/docs/3.B.-Reference-Command-Line-Tools.html)```

<!-- verified: 2026-11-09 -->
