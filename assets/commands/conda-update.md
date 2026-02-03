# TLDR

**Update all packages**

```conda update --all```

**Update specific package**

```conda update [package_name]```

**Update conda itself**

```conda update conda```

**Update in specific environment**

```conda update -n [env_name] [package_name]```

**Update without confirmation**

```conda update -y [package_name]```

# SYNOPSIS

**conda** **update** [_options_] [_packages..._]

# PARAMETERS

**--all**
> Update all installed packages.

**-n**, **--name** _name_
> Update in named environment.

**-c**, **--channel** _channel_
> Additional channel to search.

**-y**, **--yes**
> Don't ask for confirmation.

**--update-deps**
> Update dependencies.

# DESCRIPTION

**conda update** updates packages to the latest compatible versions. It respects existing package constraints and may update dependencies as needed.

# CAVEATS

**--all** may fail if there are conflicting package requirements. In such cases, update packages individually.

# SEE ALSO

[conda](/man/conda)(1), [conda-install](/man/conda-install)(1), [conda-list](/man/conda-list)(1)
