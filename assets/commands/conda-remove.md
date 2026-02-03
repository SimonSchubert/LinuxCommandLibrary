# TLDR

**Remove a package**

```conda remove [package_name]```

**Remove from specific environment**

```conda remove -n [env_name] [package_name]```

**Remove an entire environment**

```conda remove -n [env_name] --all```

**Remove multiple packages**

```conda remove [package1] [package2]```

**Remove without confirmation**

```conda remove -y [package_name]```

# SYNOPSIS

**conda** **remove** [_options_] [_packages..._]

# PARAMETERS

**-n**, **--name** _name_
> Remove from named environment.

**--all**
> Remove entire environment.

**-y**, **--yes**
> Don't ask for confirmation.

**--force**
> Force removal without dependency checking.

# DESCRIPTION

**conda remove** uninstalls packages from a conda environment. With **--all**, removes the entire environment.

Dependencies that are no longer needed may remain; use **conda clean** to remove them.

# SEE ALSO

[conda](/man/conda)(1), [conda-install](/man/conda-install)(1), [conda-clean](/man/conda-clean)(1)
