# TAGLINE

Retrieve and display channel notices

# TLDR

**Show channel notices**

```conda notices```

**Show notices from a specific channel**

```conda notices -c [channel_name]```

# SYNOPSIS

**conda** **notices** [_options_]

# PARAMETERS

**-c**, **--channel** _CHANNEL_
> Include the given channel. Can be specified multiple times.

**--use-local**
> Use locally built packages.

**--override-channels**
> Do not search default or .condarc channels. Requires **--channel**.

# CONFIGURATION

**~/.condarc**
> User-level conda configuration for channels, package settings, and solver options.

**/opt/conda/.condarc**
> System-wide conda configuration.

# DESCRIPTION

**conda notices** retrieves and displays notices from conda channels. Channels can publish important announcements, deprecation warnings, or security advisories that are shown through this command. Notices are cached locally and only fetched again after the cache expires.

# SEE ALSO

[conda](/man/conda)(1), [conda-config](/man/conda-config)(1), [conda-info](/man/conda-info)(1)
