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

# SYNOPSIS

**conda** **search** [_options_] [_query_]

# PARAMETERS

**-c**, **--channel** _channel_
> Search in specific channel.

**--info**
> Show detailed package information.

**--json**
> Output in JSON format.

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
