# TLDR

Show **full parsed** pacman configuration

```pacconf```

List **configured repositories**

```pacconf --repo-list```

Always show **directive names** even for single directives

```pacconf --verbose [directive]```

Display only **first value** of multi-value options

```pacconf --single```

Display **help**

```pacconf --help```

# SYNOPSIS

**pacconf** [_options_] [_directive_...]

# PARAMETERS

**--config** _file_
> Use alternate configuration file

**--root** _path_
> Use alternate installation root

**--repo-list**
> List configured repositories

**--repo** _name_
> Query options for specific repository

**--verbose**
> Always show directive names in output

**--single**
> Display only the first value of multi-value directives

**--null**
> Use null delimiter for output

**--raw**
> Display unprocessed directive values

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**pacconf** queries and displays pacman's configuration as it would be parsed by pacman itself. It can show the complete configuration or specific directive values, making it useful for scripts that need to read pacman settings.

The tool handles configuration include directives and processes values the same way pacman does, ensuring accurate representation of the active configuration. It can query global options or repository-specific settings.

# CAVEATS

Output represents the parsed configuration, which may differ from the raw config file due to includes and defaults. Repository-specific queries require the **--repo** option.

# HISTORY

Part of **pacutils**, a collection of helper utilities for pacman by Andrew Gregory. Provides programmatic access to pacman configuration, useful for system administration scripts and tools that interact with pacman.

# SEE ALSO

[pacman](/man/pacman)(8), [pacman.conf](/man/pacman.conf)(5), [paccheck](/man/paccheck)(8)
