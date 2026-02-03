# TLDR

**Uninstall package**

```pip uninstall [package]```

**Uninstall without confirmation**

```pip uninstall -y [package]```

**Uninstall multiple packages**

```pip uninstall [package1] [package2]```

**Uninstall from requirements file**

```pip uninstall -r requirements.txt```

# SYNOPSIS

**pip** **uninstall** [_options_] _packages_...

# PARAMETERS

**-r**, **--requirement** _file_
> Uninstall packages from requirements file.

**-y**, **--yes**
> Don't ask for confirmation.

# DESCRIPTION

**pip uninstall** removes installed Python packages. Prompts for confirmation before removing unless -y flag is used. Does not remove dependencies that were installed alongside the package.

# SEE ALSO

[pip](/man/pip)(1), [pip-install](/man/pip-install)(1)

