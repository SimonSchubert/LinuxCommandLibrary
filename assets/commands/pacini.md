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

```pacini --section [section_name] [path/to/file]```

Print the value of a **single directive**

```pacini --section [options] [path/to/file] [directive]```

Display **help**

```pacini --help```

# SYNOPSIS

**pacini** [_options_] [_file_ [_directive_...]]

# PARAMETERS

**--section-list**
> List all sections in the configuration file

**--section** _name_
> Query directives only from the specified section

**--verbose**
> Always show directive names even if only one directive is given

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**pacini** parses and queries INI-style configuration files in the format used by pacman. It can display the full parsed configuration, list sections, or extract specific directive values from named sections.

If no directives are given, the file is printed in a normalized format. With a single directive, only its value is printed (or the directive name for valueless options). If _file_ is omitted or **-**, input is read from stdin. Unlike **pacconf**, no pacman defaults or variable substitution are applied, so it works for any file in pacman's INI dialect.

# CAVEATS

Specific to pacman-style INI format; may not correctly parse all INI variations. To query pacman.conf with defaults applied, use **pacconf** instead.

# HISTORY

Part of **pacutils**, a collection of utilities for pacman by Andrew Gregory. Provides a dedicated tool for parsing pacman configuration files, complementing pacconf which specifically handles pacman.conf.

# INSTALL

```pacman: sudo pacman -S pacutils```

<!-- packages: 2026-11-07 -->

# SEE ALSO

[pacconf](/man/pacconf)(1), [pacman.conf](/man/pacman.conf)(5)

# RESOURCES

```[Source code](https://github.com/andrewgregory/pacutils)```

<!-- verified: 2026-11-07 -->
