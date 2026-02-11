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

**core** - WordPress core
**plugin** - Plugin management
**theme** - Theme management
**user** - User management
**db** - Database operations
**cache** - Cache commands
**config** - Configuration

**--path** _DIR_
> WordPress path.

**--url** _URL_
> Site URL.

**--skip-plugins**
> Skip loading plugins.

# DESCRIPTION

**wp** (WP-CLI) is the official command-line interface for WordPress administration. It provides complete control over WordPress installations from the terminal, including core updates, plugin and theme management, user administration, and database operations.

Common workflows include installing and activating plugins, creating users with specific roles, exporting and importing databases, and performing search-replace operations across the database for tasks like domain migration. The tool can also manage posts, pages, comments, and virtually every aspect of a WordPress site without needing a web browser.

# CAVEATS

Requires WordPress installation. PHP needed. Some operations need database access.

# HISTORY

**WP-CLI** was created for WordPress command-line management. It's the official CLI tool for WordPress administration.

# SEE ALSO

[php](/man/php)(1), [mysql](/man/mysql)(1)
