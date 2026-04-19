# TAGLINE

Submit and query Arch package usage statistics

# TLDR

**Submit** installed package data anonymously

```pkgstats submit```

**Dump JSON** of what would be submitted without sending

```pkgstats submit --dump-json```

**Search** for packages by name

```pkgstats search [term]```

**Compare** package popularity across multiple packages

```pkgstats show [firefox] [chromium]```

Display **help**

```pkgstats --help```

# SYNOPSIS

**pkgstats** _subcommand_ [_options_] [_packages_...]

# COMMANDS

**submit**
> Collect and send installed package list, architecture, and mirror info anonymously.

**search** _term_
> Search for packages and display their popularity metrics.

**show** _packages_...
> Compare popularity statistics for the given packages.

# PARAMETERS

**--dump-json**
> With `submit`, print the JSON payload that would be sent instead of submitting.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# CONFIGURATION

**/etc/pkgstats.yaml**
> Optional configuration file used to filter packages or mirrors from submissions using glob patterns.

# DESCRIPTION

**pkgstats** collects and submits anonymous statistics about installed packages to help the Arch Linux community understand package usage patterns. The data helps maintainers prioritize development efforts.

Users can also query the collected statistics to see package popularity and compare different packages. Submission is voluntary and privacy-preserving.

# CAVEATS

Requires internet access for submission and queries. Data is anonymous but includes package list and architecture. Opt-in participation only.

# HISTORY

**pkgstats** is maintained by **Arch Linux DE** community to gather package usage statistics. It helps the Arch community make informed decisions about package maintenance and repository organization.

# SEE ALSO

[pacman](/man/pacman)(8), [pkgfile](/man/pkgfile)(1)
