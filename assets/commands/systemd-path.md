# TAGLINE

Query systemd file hierarchy paths

# TLDR

**Display** a list of known paths and their values

```systemd-path```

**Query** a specific path and display its value

```systemd-path "[path_name]"```

**Suffix** printed paths with a string

```systemd-path --suffix [suffix_string]```

# SYNOPSIS

**systemd-path** [_options_] [_name_...]

# PARAMETERS

**--suffix _string_**
> Append suffix to printed paths

**--no-pager**
> Don't pipe output through a pager

**-h, --help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**systemd-path** queries and lists various system and user paths as defined by the systemd file hierarchy specification. These include standard locations for configuration, cache, runtime data, and other system directories.

Common path names include: **temporary**, **temporary-large**, **system-binaries**, **system-configuration**, **user-configuration**, **user-runtime**, and many others.

# CAVEATS

Path values may vary based on system configuration and user context. The tool reflects the file hierarchy as understood by systemd. Part of the systemd suite.

# SEE ALSO

[file-hierarchy](/man/file-hierarchy)(7), [systemd](/man/systemd)(1)
