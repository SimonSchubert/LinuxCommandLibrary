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

**go version** prints the Go version. When given binaries, it reports the Go version used to compile them and optionally their module information.

The command helps verify installed Go version and debug binaries' build information. The -m flag shows embedded module and dependency versions.

go version identifies Go version and binary build info.

# CAVEATS

Binary info requires debug symbols. Module info needs Go 1.13+. Stripped binaries may lack info.

# HISTORY

go version is part of the **Go** toolchain, extended to report binary build information for debugging.

# SEE ALSO

[go](/man/go)(1), [go-build](/man/go-build)(1)
