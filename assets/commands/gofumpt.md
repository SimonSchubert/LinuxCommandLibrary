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

**gofumpt** is a stricter gofmt. It applies additional formatting rules beyond standard gofmt, enforcing a more consistent code style.

The tool removes unnecessary blank lines, applies consistent grouping, and enforces other style preferences. It's a superset of gofmt.

gofumpt provides stricter Go code formatting.

# CAVEATS

Stricter than gofmt. May conflict with project style. Configure editors accordingly.

# HISTORY

gofumpt was created by **Daniel Martí** to provide stricter formatting than standard gofmt.

# SEE ALSO

[gofmt](/man/gofmt)(1), [go-fmt](/man/go-fmt)(1)
