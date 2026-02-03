# TLDR

**Inspect installed packages**

```pip inspect```

**Output as JSON**

```pip inspect --local```

# SYNOPSIS

**pip** **inspect** [_options_]

# PARAMETERS

**--local**
> Only inspect virtualenv packages.

**--user**
> Only inspect user packages.

**--path** _path_
> Inspect packages in path.

# DESCRIPTION

**pip inspect** outputs JSON describing installed packages and their metadata. Provides detailed information about installed distributions including versions, requires, and provides metadata. Useful for programmatic environment analysis.

# SEE ALSO

[pip](/man/pip)(1), [pip-list](/man/pip-list)(1), [pip-show](/man/pip-show)(1)

