# TAGLINE

Output installed packages in requirements format

# TLDR

**List installed packages**

```pip freeze```

**Output to requirements file**

```pip freeze > requirements.txt```

**Exclude editable packages**

```pip freeze --exclude-editable```

**Exclude specific packages**

```pip freeze --exclude [package]```

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

**--exclude-editable**
> Exclude editable packages.

# DESCRIPTION

**pip freeze** outputs installed packages in requirements format. Each package shown with its exact version (package==version). Standard method for capturing Python environment dependencies for reproducibility.

# SEE ALSO

[pip](/man/pip)(1), [pip-list](/man/pip-list)(1), [pip-install](/man/pip-install)(1)

