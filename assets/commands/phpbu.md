# TAGLINE

PHP Backup Utility

# TLDR

**Run backup**

```phpbu```

**Use specific config**

```phpbu --configuration=[phpbu.xml]```

**Simulate backup**

```phpbu --simulate```

**Verbose output**

```phpbu -v```

# SYNOPSIS

**phpbu** [_options_]

# PARAMETERS

**--configuration** _FILE_
> Configuration file.

**--simulate**
> Dry run mode.

**-v**
> Verbose output.

**--bootstrap** _FILE_
> Bootstrap file.

**--help**
> Display help.

# DESCRIPTION

**phpbu** is PHP Backup Utility. Automates backup creation.

The tool handles databases, files, and syncing. XML configuration.

# CAVEATS

Requires configuration. Supports MySQL, files, etc.

# HISTORY

PHPBU was created for **automated PHP application** backup workflows.

# SEE ALSO

[mysqldump](/man/mysqldump)(1), [rsync](/man/rsync)(1)

