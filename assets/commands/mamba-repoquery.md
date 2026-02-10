# TAGLINE

queries package metadata

# TLDR

**Search package**

```mamba repoquery search [package]```

**Show package dependencies**

```mamba repoquery depends [package]```

**Show what depends on package**

```mamba repoquery whoneeds [package]```

**Show package info**

```mamba repoquery info [package]```

**Query installed packages**

```mamba repoquery search --installed [pattern]```

# SYNOPSIS

**mamba repoquery** _command_ [_options_] _query_

# PARAMETERS

_COMMAND_
> Query type.

_QUERY_
> Package name or pattern.

**search**
> Search for packages.

**depends**
> Show dependencies.

**whoneeds**
> Show reverse dependencies.

**info**
> Package information.

**--installed**
> Query installed only.

**--help**
> Display help information.

# DESCRIPTION

**mamba repoquery** queries package metadata. It shows dependencies and reverse dependencies.

The tool helps understand package relationships. Faster than conda search.

# CAVEATS

Part of mamba. Repository must be indexed. Uses conda channels.

# HISTORY

mamba repoquery provides fast package queries using **mamba's** optimized C++ backend.

# SEE ALSO

[mamba](/man/mamba)(1), [conda](/man/conda)(1)

