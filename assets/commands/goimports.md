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
> Report all errors.

**-srcdir** _dir_
> Source directory for import resolution.

# DESCRIPTION

**goimports** updates Go import lines by adding missing imports and removing unreferenced ones. It also formats code in the same style as gofmt, making it a superset replacement. Imports are grouped with standard library first, then third-party packages, and sorted alphabetically within each group.

# SEE ALSO

[gofmt](/man/gofmt)(1), [go-fmt](/man/go-fmt)(1)

