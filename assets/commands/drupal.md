# TAGLINE

CLI for Drupal code generation and site management

# TLDR

**Generate module** boilerplate

```drupal generate:module```

**Generate controller**

```drupal generate:controller```

**Clear all caches**

```drupal cache:rebuild```

**List available commands**

```drupal list```

**Install module**

```drupal module:install [module_name]```

**Update database**

```drupal update:execute```

**Check system status**

```drupal site:status```

# SYNOPSIS

**drupal** _command_ [_options_] [_arguments_]

# PARAMETERS

_COMMAND_
> Drupal Console command to execute.

**generate:module**
> Generate module scaffolding.

**generate:controller**
> Generate controller class.

**cache:rebuild**
> Clear all caches.

**module:install** _NAME_
> Install and enable module.

**site:status**
> Show site information.

**update:execute**
> Run database updates.

**--help**
> Display help information.

# CONFIGURATION

**~/.console/config.yml**
> User-level configuration for Drupal Console, including default options and preferences.

**drupal.yml**
> Project-specific configuration file in Drupal root, defining module paths and custom settings.

# DESCRIPTION

**Drupal Console** is a CLI tool for generating boilerplate code, interacting with, and debugging Drupal applications. It accelerates development through code generation and provides utilities for common tasks.

The generate commands create scaffolding for modules, plugins, controllers, forms, and other Drupal components following best practices. Interactive prompts guide through configuration options.

Drupal Console also provides debugging tools, cache management, and database operations from the command line.

# CAVEATS

Requires Drupal 8+ installation. Must run from Drupal root. Some commands need database access. Being superseded by Drush for many tasks.

# HISTORY

Drupal Console was created as a code generation and developer tool for **Drupal 8**, released around **2015**. It was inspired by Symfony Console and brought modern CLI development practices to Drupal.

# SEE ALSO

[drush](/man/drush)(1), [composer](/man/composer)(1), [php](/man/php)(1)
