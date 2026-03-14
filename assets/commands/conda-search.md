# TAGLINE

package repository searcher

# TLDR

**Search for a package**

```conda search [package_name]```

**Search with version pattern**

```conda search "[package_name]>=[version]"```

**Search in specific channel**

```conda search -c [conda-forge] [package_name]```

**Show detailed info**

```conda search --info [package_name]```

**Search for a specific platform**

```conda search --platform [linux-64] [package_name]```

# SYNOPSIS

**conda** **search** [_options_] [_query_]

# PARAMETERS

**-c**, **--channel** _channel_
> Search in specific channel.

**--info**
> Show detailed package information.

**--platform** _subdir_
> Search for the given platform (e.g., osx-64, linux-64, win-64). Default is the current platform.

**-O**, **--override-channels**
> Do not search default or .condarc channels; only search specified channels.

**--json**
> Output in JSON format.

**-v**, **--verbose**
> Use once for info, twice for debug, three times for trace.

# CONFIGURATION

**~/.condarc**
> User-level conda configuration for channels, package settings, and solver options.

**/opt/conda/.condarc**
> System-wide conda configuration.

# DESCRIPTION

**conda search** searches configured channels for packages matching the query. It shows available versions and build variants.

Package specifications can include version constraints like **>=**, **<=**, **==**.

# SEE ALSO

[conda](/man/conda)(1), [conda-install](/man/conda-install)(1), [conda-repoquery](/man/conda-repoquery)(1)
