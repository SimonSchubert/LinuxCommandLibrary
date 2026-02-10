# TAGLINE

parses and queries INI-style configuration files in the format used by pacman

# TLDR

Show the **full parsed** configuration file

```pacini [path/to/file]```

List **configured sections**

```pacini [path/to/file] --section-list```

Always show **directive names** even for single directives

```pacini [path/to/file] --verbose```

Display directives in a **specific section**

```pacini [path/to/file] --section [section_name]```

Display **help**

```pacini --help```

# SYNOPSIS

**pacini** [_options_] [_file_] [_directive_...]

# PARAMETERS

**--section-list**
> List all sections in the configuration file

**--section** _name_
> Query directives only from the specified section

**--verbose**
> Always show directive names in output

**--null**
> Use null delimiter for output

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**pacini** parses and queries INI-style configuration files in the format used by pacman. It can display the full parsed configuration, list sections, or extract specific directive values from named sections.

The tool handles pacman's configuration format including Include directives, making it useful for scripts that need to extract values from pacman.conf or similar configuration files. Reads from stdin if no file is specified.

# CAVEATS

Specific to pacman-style INI format; may not correctly parse all INI variations. Include directives are not followed by default. Section names are case-sensitive.

# HISTORY

Part of **pacutils**, a collection of utilities for pacman by Andrew Gregory. Provides a dedicated tool for parsing pacman configuration files, complementing pacconf which specifically handles pacman.conf.

# SEE ALSO

[pacconf](/man/pacconf)(8), [pacman.conf](/man/pacman.conf)(5)
