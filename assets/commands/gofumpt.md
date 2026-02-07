# TAGLINE

Stricter Go code formatter

# TLDR

**Format file**

```gofumpt [file.go]```

**Format in place**

```gofumpt -w [file.go]```

**Format directory**

```gofumpt -w .```

**Check formatting**

```gofumpt -d [file.go]```

**Extra formatting rules**

```gofumpt -extra [file.go]```

# SYNOPSIS

**gofumpt** [_options_] [_files_]

# PARAMETERS

_FILES_
> Go files to format.

**-w**
> Write to file.

**-d**
> Show diff.

**-s**
> Simplify code.

**-extra**
> Enable extra rules.

**--help**
> Display help information.

# DESCRIPTION

**gofumpt** is a stricter alternative to gofmt that applies additional formatting rules beyond the standard Go style. It removes unnecessary blank lines, enforces consistent grouping, and applies other style preferences while remaining a superset of gofmt.

The **-extra** flag enables even more opinionated rules for tighter code formatting.

# CAVEATS

Stricter than gofmt. May conflict with project style. Configure editors accordingly.

# HISTORY

gofumpt was created by **Daniel Marti** to provide stricter formatting than standard gofmt.

# SEE ALSO

[gofmt](/man/gofmt)(1), [go-fmt](/man/go-fmt)(1)
