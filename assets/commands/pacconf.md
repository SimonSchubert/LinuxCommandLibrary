# TAGLINE

queries and displays pacman's configuration as it would be parsed by pacman

# TLDR

Show **full parsed** pacman configuration

```pacconf```

List **configured repositories**

```pacconf --repo-list```

Always show **directive names** even for single directives

```pacconf --verbose [directive]```

Show only **global settings** from the [options] section

```pacconf --options```

Show the **settings of one repository**

```pacconf --repo [core]```

Check a **single directive** (prints only its value)

```pacconf [ParallelDownloads]```

Display **help**

```pacconf --help```

# SYNOPSIS

**pacconf** [_options_] [_directive_...]

# PARAMETERS

**--config** _file_
> Use alternate configuration file

**--root** _path_
> Use alternate installation root

**--sysroot** _path_
> Use alternate system root (see pacutils-sysroot(7))

**--arch** _arch_
> Use alternate architecture

**--options**
> Only display global settings from the [options] section (header not printed)

**--repo-list**
> List configured repositories

**--repo** _name_
> Only display directives for repository _name_ (header not printed)

**--verbose**
> Always show directive names in output

**--single**
> Display only the first value of multi-value directives

**--null**[=_sep_]
> Set the separator for values read from stdin (NUL if _sep_ is omitted)

**--raw**
> Display unmodified values: Includes are processed, but defaults are not set and $arch/$repo are not substituted

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**pacconf** queries and displays pacman's configuration as it would be parsed by pacman itself. It can show the complete configuration or specific directive values, making it useful for scripts that need to read pacman settings.

All defaults are applied, **Include** directives are processed, **$arch** and **$repo** in server URLs are substituted, and **Architecture = auto** is resolved. When a single directive is queried, only its value is printed (or the directive name for valueless options like **Color**), which makes it easy to use in scripts:

```bash
[[ -n $(pacconf Color) ]] && echo "color enabled"
```

# CAVEATS

Output represents the parsed configuration, which may differ from the raw config file due to includes and defaults. Repository-specific queries require the **--repo** option.

# HISTORY

Part of **pacutils**, a collection of helper utilities for pacman by Andrew Gregory. Provides programmatic access to pacman configuration, useful for system administration scripts and tools that interact with pacman.

# INSTALL

```pacman: sudo pacman -S pacutils```

<!-- packages: 2026-11-07 -->

# SEE ALSO

[pacman](/man/pacman)(8), [pacman.conf](/man/pacman.conf)(5), [pacini](/man/pacini)(1), [paccheck](/man/paccheck)(8)

# RESOURCES

```[Source code](https://github.com/andrewgregory/pacutils)```

<!-- verified: 2026-11-07 -->
