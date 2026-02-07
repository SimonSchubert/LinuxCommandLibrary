# TAGLINE

update Go code for newer API versions

# TLDR

**Fix old Go code**

```go fix [package]```

**Fix current package**

```go fix .```

**Dry run**

```go fix -n [package]```

# SYNOPSIS

**go fix** [_options_] [_packages_]

# PARAMETERS

_PACKAGES_
> Packages to fix.

**-n**
> Dry run, show changes.

**--help**
> Display help information.

# DESCRIPTION

**go fix** updates Go code for newer Go versions. It applies transformations for API changes and deprecated patterns, helping maintain code across Go releases.

The tool runs specific fixers that handle known changes between Go versions. It modifies source files in place, so version control is recommended before running.

# CAVEATS

Modifies files in place. Use version control. May need manual review. Limited to known fixes.

# HISTORY

go fix is part of the **Go** toolchain, helping maintain code compatibility across Go language evolution.

# SEE ALSO

[go](/man/go)(1), [go-vet](/man/go-vet)(1)
