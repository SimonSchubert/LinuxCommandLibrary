# TAGLINE

Fast, drop-in replacement for the conda package manager

# TLDR

**Create environment**

```mamba create -n [myenv] [python=3.10]```

**Install package**

```mamba install [numpy]```

**Update package**

```mamba update [package]```

**Remove package**

```mamba remove [package]```

**Search for a package**

```mamba search [numpy]```

**List environments**

```mamba env list```

**Activate environment**

```mamba activate [myenv]```

**Clean package caches**

```mamba clean --all```

# SYNOPSIS

**mamba** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation to perform.

**create**
> Create new environment.

**install**
> Install packages.

**update**
> Update packages.

**remove**
> Remove packages.

**search**
> Search for packages in configured channels.

**list**
> List packages in active environment.

**clean**
> Remove cached package files and unused caches.

**env**
> Environment management.

**repoquery**
> Query package dependencies and reverse dependencies.

**-n** _NAME_
> Environment name.

**-c** _CHANNEL_
> Additional channel to search for packages.

**-y**, **--yes**
> Do not ask for confirmation.

**--dry-run**
> Only display what would have been done.

**--no-banner**
> Suppress the mamba banner.

**--help**
> Display help information.

# DESCRIPTION

**mamba** is a fast, drop-in replacement for **conda**. It provides faster package resolution using the **libsolv** dependency solver (written in C++) and parallel downloading of packages.

The tool is fully compatible with conda commands, packages, and environments. It can be used wherever conda is used and supports the same command-line interface.

# CAVEATS

Conda-compatible but may have minor edge case differences in dependency resolution. Requires an existing conda installation (mamba runs as a conda plugin). For a standalone alternative, see **micromamba**.

# HISTORY

mamba was created by **QuantStack** to provide faster package management than conda.

# SEE ALSO

[conda](/man/conda)(1), [micromamba](/man/micromamba)(1), [pip](/man/pip)(1)

