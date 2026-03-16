# TAGLINE

Output installed packages in requirements format

# TLDR

**List installed packages**

```pip freeze```

**Output to requirements file**

```pip freeze > requirements.txt```

**Include all packages including pip and setuptools**

```pip freeze --all```

**Exclude editable packages**

```pip freeze --exclude-editable```

**Exclude specific packages**

```pip freeze --exclude [package]```

**Only list packages in the current virtualenv**

```pip freeze --local```

# SYNOPSIS

**pip** **freeze** [_options_]

# PARAMETERS

**-r**, **--requirement** _file_
> Use requirements file order.

**-l**, **--local**
> Only show virtualenv packages.

**--user**
> Only show user packages.

**--exclude** _package_
> Exclude package from output.

**--all**
> Include all packages, even pip and setuptools that are normally excluded.

**--exclude-editable**
> Exclude editable packages.

**--path** _directory_
> Restrict to the specified installation path for listing packages.

**-q**, **--quiet**
> Decrease output verbosity.

# DESCRIPTION

**pip freeze** outputs installed packages in requirements format. Each package is shown with its exact version (package==version). This is the standard method for capturing Python environment dependencies for reproducibility. By default, pip, setuptools, wheel, and distribute are excluded from the output; use **--all** to include them. Packages are listed in case-insensitive sorted order.

# SEE ALSO

[pip](/man/pip)(1), [pip-list](/man/pip-list)(1), [pip-install](/man/pip-install)(1), [pip-show](/man/pip-show)(1)

