# TLDR

**Clear all caches**

```drush cache:rebuild```

**Download and install** module

```drush pm:install [module_name]```

**Update database**

```drush updatedb```

**Run cron**

```drush cron```

**Show site status**

```drush status```

**Export configuration**

```drush config:export```

**Import configuration**

```drush config:import```

**Generate one-time** login link

```drush user:login```

# SYNOPSIS

**drush** _command_ [_options_] [_arguments_]

# PARAMETERS

_COMMAND_
> Drush command to execute.

**cache:rebuild**, **cr**
> Clear all caches.

**pm:install** _NAME_
> Install module.

**updatedb**, **updb**
> Apply database updates.

**config:export**, **cex**
> Export configuration.

**config:import**, **cim**
> Import configuration.

**user:login**, **uli**
> Generate login link.

**status**, **st**
> Show site information.

**--help**
> Display help information.

# DESCRIPTION

**Drush** (Drupal Shell) is the command-line interface for Drupal, providing tools for site administration, development, and deployment. It's essential for Drupal developers and administrators.

The tool handles cache clearing, module management, database updates, configuration synchronization, and user administration. Short aliases (cr, cex, cim) provide quick access to common commands.

Drush supports site aliases for managing multiple Drupal sites and integrates with deployment workflows for configuration management.

# CAVEATS

Requires Drupal installation. Must run from site root or use aliases. Version must match Drupal version. Some commands need database access.

# HISTORY

Drush was created by **Moshe Weitzman** and others in **2007** for Drupal 5. It has evolved alongside Drupal, becoming the standard CLI tool for Drupal administration and development.

# SEE ALSO

[drupal](/man/drupal)(1), [composer](/man/composer)(1), [php](/man/php)(1)
