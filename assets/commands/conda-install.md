# TLDR

**Install a package**

```conda install [package_name]```

**Install specific version**

```conda install [package_name]=[version]```

**Install from specific channel**

```conda install -c [conda-forge] [package_name]```

**Install into specific environment**

```conda install -n [env_name] [package_name]```

**Install multiple packages**

```conda install [package1] [package2] [package3]```

**Install without confirmation**

```conda install -y [package_name]```

# SYNOPSIS

**conda** **install** [_options_] [_packages..._]

# PARAMETERS

**-n**, **--name** _name_
> Install into named environment.

**-c**, **--channel** _channel_
> Additional channel to search.

**-y**, **--yes**
> Don't ask for confirmation.

**--freeze-installed**
> Don't update already-installed packages.

**--update-deps**
> Update dependencies.

# DESCRIPTION

**conda install** installs packages into a conda environment. It resolves dependencies and ensures compatibility between packages.

Packages are searched in configured channels, with defaults searched first unless a specific channel is specified.

# SEE ALSO

[conda](/man/conda)(1), [conda-remove](/man/conda-remove)(1), [conda-update](/man/conda-update)(1)
