# TAGLINE

Print Go version and binary build info

# TLDR

**Show Go version**

```go version```

**Show binary's Go version**

```go version [binary]```

**Show version of all binaries**

```go version -m [binary]```

# SYNOPSIS

**go version** [_options_] [_files_]

# PARAMETERS

_FILES_
> Binary files to inspect.

**-m**
> Show module info in binary.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**go version** prints the installed Go version. When given compiled binaries, it reports the Go version used to build them and optionally their embedded module information.

The **-m** flag shows module and dependency versions embedded in the binary, which is useful for debugging and auditing deployed applications.

# CAVEATS

Binary info requires debug symbols. Module info needs Go 1.13+. Stripped binaries may lack info.

# HISTORY

go version is part of the **Go** toolchain, extended to report binary build information for debugging.

# SEE ALSO

[go](/man/go)(1), [go-build](/man/go-build)(1)
