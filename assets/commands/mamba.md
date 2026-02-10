# TAGLINE

fast conda replacement

# TLDR

**Create environment**

```mamba create -n [myenv] [python=3.10]```

**Install package**

```mamba install [numpy]```

**Update package**

```mamba update [package]```

**Remove package**

```mamba remove [package]```

**List environments**

```mamba env list```

**Activate environment**

```mamba activate [myenv]```

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

**env**
> Environment management.

**-n** _NAME_
> Environment name.

**--help**
> Display help information.

# DESCRIPTION

**mamba** is a fast conda replacement. It provides faster package resolution and downloading.

The tool is drop-in compatible with conda. Uses parallel downloading and C++ solver.

# CAVEATS

Conda-compatible. May have edge case differences. Requires conda-forge.

# HISTORY

mamba was created by **QuantStack** to provide faster package management than conda.

# SEE ALSO

[conda](/man/conda)(1), [micromamba](/man/micromamba)(1), [pip](/man/pip)(1)

