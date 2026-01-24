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

**wp** (WP-CLI) manages WordPress from command line. It handles all WordPress administration.

Core updates and management. Install, update, verify.

Plugin and theme operations. Install, activate, delete.

User administration. Create, modify, delete users.

Database operations. Export, import, search-replace.

Content management. Posts, pages, comments.

# CAVEATS

Requires WordPress installation. PHP needed. Some operations need database access.

# HISTORY

**WP-CLI** was created for WordPress command-line management. It's the official CLI tool for WordPress administration.

# SEE ALSO

[php](/man/php)(1), [mysql](/man/mysql)(1)
