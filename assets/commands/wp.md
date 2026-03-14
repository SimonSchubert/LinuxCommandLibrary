# TAGLINE

WordPress command-line management tool

# TLDR

**Show WordPress info**

```wp --info```

**Update WordPress core**

```wp core update```

**Install plugin**

```wp plugin install [plugin-name]```

**Activate plugin**

```wp plugin activate [plugin-name]```

**Install theme**

```wp theme install [theme-name]```

**Create user**

```wp user create [username] [email@example.com] --role=[editor]```

**Search/replace in database**

```wp search-replace [old-url] [new-url]```

**Export database**

```wp db export [backup.sql]```

# SYNOPSIS

**wp** _command_ [_subcommand_] [_options_]

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
> Object cache commands (flush, type).

**config**
> Configuration file management (create, get, set).

**post**
> Post management (create, list, update, delete).

**media**
> Media attachment management (import, regenerate).

**--path=**_DIR_
> Path to WordPress installation.

**--url=**_URL_
> Target site URL (for multisite).

**--skip-plugins**
> Skip loading all plugins.

**--skip-themes**
> Skip loading all themes.

**--user=**_USER_
> Run command as a specific user.

**--allow-root**
> Allow running as root (not recommended).

# DESCRIPTION

**wp** (WP-CLI) is the official command-line interface for WordPress administration. It provides complete control over WordPress installations from the terminal, including core updates, plugin and theme management, user administration, and database operations.

Common workflows include installing and activating plugins, creating users with specific roles, exporting and importing databases, and performing search-replace operations across the database for tasks like domain migration. The tool can also manage posts, pages, comments, and virtually every aspect of a WordPress site without needing a web browser.

# CAVEATS

Requires an existing WordPress installation and PHP CLI. Some operations need direct database access. Running as root is discouraged unless **--allow-root** is specified. For multisite, use **--url** to target a specific site.

# HISTORY

**WP-CLI** was initiated by **Andreas Creten** in **2011** and later maintained by **Daniel Bachhuber**. It became the official command-line tool for WordPress, endorsed by the WordPress project. The tool is actively maintained by the open-source community.

# SEE ALSO

[php](/man/php)(1), [mysql](/man/mysql)(1)
