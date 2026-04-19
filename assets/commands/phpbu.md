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

**--configuration=**_FILE_
> Path to a phpbu XML configuration file.

**--bootstrap=**_FILE_
> Bootstrap PHP file included before running the backup.

**--simulate**
> Perform a trial run without making any changes.

**--limit=**_SUBSET_
> Limit backup execution to the specified subset.

**--restore**
> Print a restore guide for the configured backups.

**--generate-configuration**
> Create a new configuration skeleton interactively.

**--colors**
> Enable colored output.

**--debug**
> Display debugging information during backup generation.

**-v**, **--verbose**
> Output more verbose information.

**-V**, **--version**
> Output version information and exit.

**-h**, **--help**
> Display usage information.

# DESCRIPTION

**phpbu** is PHP Backup Utility. Automates backup creation.

The tool handles databases, files, and syncing. XML configuration.

# CAVEATS

Requires configuration. Supports MySQL, files, etc.

# HISTORY

PHPBU was created for **automated PHP application** backup workflows.

# SEE ALSO

[mysqldump](/man/mysqldump)(1), [rsync](/man/rsync)(1)

