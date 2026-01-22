# TLDR

**Show general help**

```gh help```

**Get help for command**

```gh help [pr]```

**Get help for subcommand**

```gh help [pr] [create]```

**Show environment variables**

```gh help environment```

**List formatting options**

```gh help formatting```

# SYNOPSIS

**gh help** [_command_] [_subcommand_]

# PARAMETERS

_COMMAND_
> Command to get help for.

_SUBCOMMAND_
> Subcommand to get help for.

**environment**
> Show environment variables.

**formatting**
> Show output formatting options.

**mintty**
> Show MinTTY configuration help.

**--help**
> Display help information.

# DESCRIPTION

**gh help** provides documentation for GitHub CLI commands. It displays usage information, available flags, examples, and related commands for any gh command or subcommand.

The help system includes special topics like environment variables that affect gh behavior and formatting options for customizing output. Help content is built into the gh binary and available offline.

gh help is essential for discovering command capabilities and correct usage.

# CAVEATS

Help content matches installed gh version. Online documentation may be more current. Some help topics are platform-specific.

# HISTORY

gh help follows Unix man page conventions, providing comprehensive command documentation as part of the **GitHub CLI**.

# SEE ALSO

[gh](/man/gh)(1), [man](/man/man)(1)
