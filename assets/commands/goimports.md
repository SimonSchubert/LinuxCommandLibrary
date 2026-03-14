# TAGLINE

Go import line management and formatting

# TLDR

**Format and fix imports in a file**

```goimports [file.go]```

**Fix imports and write to file**

```goimports -w [file.go]```

**Show diff of changes**

```goimports -d [file.go]```

**List files with import issues**

```goimports -l [file.go]```

**Separate local packages**

```goimports -local [github.com/myorg] [file.go]```

**Format all files in directory**

```goimports -w .```

# SYNOPSIS

**goimports** [_flags_] [_path_ ...]

# PARAMETERS

**-d**
> Display diffs instead of rewriting.

**-l**
> List files whose imports differ.

**-w**
> Write result to source file.

**-local** _prefix_
> Comma-separated prefixes for local packages.

**-e**
> Report all errors (not just the first 10 on different lines).

**-format-only**
> Do not fix imports; only format the code. In this mode goimports is effectively gofmt with grouped imports.

**-v**
> Verbose logging.

**-srcdir** _dir_
> Choose imports as if source code is from the specified directory.

# DESCRIPTION

**goimports** updates Go import lines by adding missing imports and removing unreferenced ones. It also formats code in the same style as gofmt, making it a drop-in replacement.

Imports are grouped with standard library first, then third-party packages, and sorted alphabetically within each group. The **-local** flag allows separating project-specific imports into their own group.

# SEE ALSO

[gofmt](/man/gofmt)(1), [go-fmt](/man/go-fmt)(1), [gofumpt](/man/gofumpt)(1)
