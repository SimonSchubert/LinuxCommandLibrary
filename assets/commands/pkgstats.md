# TAGLINE

Submit and query Arch package usage statistics

# TLDR

**Submit** installed package data

```pkgstats submit```

Submit and **view** sent data

```pkgstats submit -d```

**Search** for packages

```pkgstats search [term]```

Search with **limited** results

```pkgstats search [term] -l [count]```

**Compare** package popularity

```pkgstats show [package1] [package2]```

Display **help**

```pkgstats -h```

# SYNOPSIS

**pkgstats** [**submit**|**search**|**show**] [**-d**|**--dump-json**] [**-l** _count_] [_packages_...]

# COMMANDS

**submit**
> Send installed package statistics

**search**
> Search package statistics

**show**
> Display statistics for specific packages

# PARAMETERS

**-d, --dump-json**
> Output data as JSON

**-l, --limit _count_**
> Limit search results (default: 10)

**-h, --help**
> Display help information

# DESCRIPTION

**pkgstats** collects and submits anonymous statistics about installed packages to help the Arch Linux community understand package usage patterns. The data helps maintainers prioritize development efforts.

Users can also query the collected statistics to see package popularity and compare different packages. Submission is voluntary and privacy-preserving.

# CAVEATS

Requires internet access for submission and queries. Data is anonymous but includes package list and architecture. Opt-in participation only.

# HISTORY

**pkgstats** is maintained by **Arch Linux DE** community to gather package usage statistics. It helps the Arch community make informed decisions about package maintenance and repository organization.

# SEE ALSO

[pacman](/man/pacman)(8), [pkgfile](/man/pkgfile)(1)
