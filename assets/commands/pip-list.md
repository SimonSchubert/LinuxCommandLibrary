# TLDR

**List installed packages**

```pip list```

**List outdated packages**

```pip list --outdated```

**List in JSON format**

```pip list --format json```

**List user packages only**

```pip list --user```

**List editable packages**

```pip list --editable```

# SYNOPSIS

**pip** **list** [_options_]

# PARAMETERS

**-o**, **--outdated**
> Show only outdated packages.

**-u**, **--uptodate**
> Show only up-to-date packages.

**-e**, **--editable**
> Show only editable packages.

**-l**, **--local**
> Show only virtualenv packages.

**--user**
> Show only user packages.

**--format** _format_
> Output format (columns, freeze, json).

**--not-required**
> Show packages not required by others.

# DESCRIPTION

**pip list** displays installed Python packages with their versions. Can filter by outdated, up-to-date, or editable packages. Supports multiple output formats including JSON for scripting.

# SEE ALSO

[pip](/man/pip)(1), [pip-freeze](/man/pip-freeze)(1), [pip-show](/man/pip-show)(1)

