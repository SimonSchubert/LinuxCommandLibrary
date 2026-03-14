# TAGLINE

Stricter Go code formatter

# TLDR

**Format a Go file and print result to stdout**

```gofumpt [file.go]```

**Format a file in place**

```gofumpt -w [file.go]```

**Format all Go files in the current directory recursively**

```gofumpt -w .```

**Show a diff of formatting changes without applying**

```gofumpt -d [file.go]```

**Format with extra opinionated rules**

```gofumpt -extra [file.go]```

**Read from stdin and format**

```cat [file.go] | gofumpt```

# SYNOPSIS

**gofumpt** [_options_] [_files_]

# PARAMETERS

_FILES_
> Go files to format.

**-w**
> Write result to the source file instead of stdout.

**-d**
> Display diffs instead of rewriting files.

**-e**
> Report all errors (not just the first 10 per file).

**-extra**
> Enable extra formatting rules (e.g., enforce short case bodies on one line).

**-l**
> List files whose formatting differs from gofumpt's.

**-version**
> Print the version and exit.

# DESCRIPTION

**gofumpt** is a stricter alternative to gofmt that applies additional formatting rules beyond the standard Go style. It removes unnecessary blank lines, enforces consistent grouping, and applies other style preferences while remaining a superset of gofmt.

The **-extra** flag enables even more opinionated rules for tighter code formatting.

# CAVEATS

Stricter than gofmt -- code formatted by gofumpt is always valid gofmt output, but not vice versa. May conflict with project conventions. Most editors support gofumpt as a drop-in replacement for gofmt via settings.

# HISTORY

gofumpt was created by **Daniel Marti** to provide stricter formatting than standard gofmt.

# SEE ALSO

[gofmt](/man/gofmt)(1), [go-fmt](/man/go-fmt)(1)
