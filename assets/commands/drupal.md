# TAGLINE

CLI for Drupal code generation and site management

# TLDR

**List all available commands**

```drupal list```

**Generate module scaffolding** (interactive)

```drupal generate:module```

**Generate a controller class**

```drupal generate:controller```

**Clear and rebuild all caches**

```drupal cache:rebuild```

**Install and enable a module**

```drupal module:install [module_name]```

**Run pending database updates**

```drupal update:execute```

**Check site status and configuration**

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

**Drupal Console** is a CLI tool for generating boilerplate code, interacting with, and debugging Drupal 8+ applications. Built on the Symfony Console component, it accelerates development through code generation and provides utilities for common administrative tasks.

The generate commands create scaffolding for modules, plugins, controllers, forms, and other Drupal components following best practices. Interactive prompts guide through configuration options.

Drupal Console also provides debugging tools, cache management, configuration import/export, and database operations from the command line.

# CAVEATS

Requires Drupal 8+ installation. Must be run from the Drupal root directory. Some commands require database access. The project is no longer actively maintained; **Drush** has adopted many of its features and is the recommended CLI tool for modern Drupal development.

# HISTORY

Drupal Console was created as a code generation and developer tool for **Drupal 8**, released around **2015**. It was inspired by Symfony Console and brought modern CLI development practices to Drupal.

# SEE ALSO

[drush](/man/drush)(1), [composer](/man/composer)(1), [php](/man/php)(1)
