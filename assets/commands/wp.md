# TAGLINE

WordPress command-line management tool

# TLDR

**Show WordPress info**

```wp --info```

**Download WordPress** into the current directory

```wp core download```

**Create wp-config.php**

```wp config create --dbname=[db] --dbuser=[user] --prompt=dbpass```

**Update WordPress core**

```wp core update```

**Install plugin**

```wp plugin install [plugin-name]```

**Install and activate plugin**

```wp plugin install [plugin-name] --activate```

**Update all plugins**

```wp plugin update --all```

**Install theme**

```wp theme install [theme-name]```

**Create user**

```wp user create [username] [email@example.com] --role=[editor]```

**Search/replace in database** (preview first)

```wp search-replace [old-url] [new-url] --dry-run```

**Export database**

```wp db export [backup.sql]```

**Import database**

```wp db import [backup.sql]```

# SYNOPSIS

**wp** [_global-options_] _command_ [_subcommand_] [_options_]

# PARAMETERS

**core**
> WordPress core installation and updates.

**plugin**
> Plugin management (install, activate, deactivate, update, delete).

**theme**
> Theme management (install, activate, update, delete).

**user**
> User management (create, list, update, delete).

**db**
> Database operations (export, import, query, optimize, repair).

**search-replace** _old_ _new_
> Search and replace strings in the database.

**cache**
> Object cache commands (add, delete, flush, get, set, type).

**config**
> Configuration file management (create, get, set).

**post**
> Post management (create, list, update, delete).

**media**
> Media attachment management (import, regenerate, image-size).

**--path=**_DIR_
> Path to WordPress installation.

**--url=**_URL_
> Pretend the request came from this URL; selects the target site in multisite.

**--ssh=**[_user_@]_host_[:_port_][_path_]
> Run the command on a remote server over SSH.

**--http=**_URL_
> Run the command against a remote WordPress install over HTTP.

**--skip-plugins**[=_plugin_]
> Skip loading all plugins, or a comma-separated list.

**--skip-themes**[=_theme_]
> Skip loading all themes, or a comma-separated list.

**--skip-packages**
> Skip loading all installed WP-CLI packages.

**--require=**_path_
> Load a PHP file before running the command.

**--exec=**_php-code_
> Execute PHP code before running the command.

**--user=**_id|login|email_
> Set the WordPress user.

**--debug**[=_group_]
> Show debugging output, optionally for one group.

**--quiet**
> Suppress informational messages.

**--allow-root**
> Allow running as root (not recommended).

# DESCRIPTION

**wp** (WP-CLI) is the official command-line interface for WordPress administration. It provides complete control over WordPress installations from the terminal, including core updates, plugin and theme management, user administration, and database operations.

Common workflows include installing and activating plugins, creating users with specific roles, exporting and importing databases, and performing search-replace operations across the database for tasks like domain migration. The tool can also manage posts, pages, comments, and virtually every aspect of a WordPress site without needing a web browser.

# CAVEATS

Requires PHP 7.2.24 or later. Most commands need a WordPress installation; **wp core download** can fetch one. Some operations need direct database access. Running as root is discouraged unless **--allow-root** is specified. For multisite, use **--url** to target a specific site.

# HISTORY

**WP-CLI** was started by **Andreas Creten** in **2011**, with **Cristi Burcă** (scribu) and **Daniel Bachhuber** as long-time maintainers. **Alain Schlesser** is the current maintainer. It became the official command-line tool for WordPress, and the project is actively maintained by the open-source community.

# SEE ALSO

[php](/man/php)(1), [mysql](/man/mysql)(1)

# RESOURCES

```[Source code](https://github.com/wp-cli/wp-cli)```

```[Homepage](https://wp-cli.org/)```

```[Documentation](https://developer.wordpress.org/cli/commands/)```

<!-- verified: 2026-11-09 -->
