# TLDR

**Search for packages**

```conda repoquery search [package_name]```

**Show package dependencies**

```conda repoquery depends [package_name]```

**Show what depends on a package**

```conda repoquery whoneeds [package_name]```

# SYNOPSIS

**conda** **repoquery** _subcommand_ [_options_] [_query_]

# SUBCOMMANDS

**search**
> Search for packages.

**depends**
> Show package dependencies.

**whoneeds**
> Show reverse dependencies.

# DESCRIPTION

**conda repoquery** provides advanced package querying capabilities using libmamba. It can search repositories and analyze dependency relationships.

# CAVEATS

Requires libmamba solver. May not be available in older conda versions.

# SEE ALSO

[conda](/man/conda)(1), [conda-search](/man/conda-search)(1)
