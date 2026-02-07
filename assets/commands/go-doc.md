# TAGLINE

display Go package and symbol documentation

# TLDR

**Show package documentation**

```go doc [fmt]```

**Show function documentation**

```go doc [fmt.Println]```

**Show all documentation**

```go doc -all [package]```

**Show unexported symbols**

```go doc -u [package]```

**Show source code**

```go doc -src [fmt.Println]```

# SYNOPSIS

**go doc** [_options_] [_package_] [_symbol_]

# PARAMETERS

_PACKAGE_
> Package to document.

_SYMBOL_
> Symbol to look up.

**-all**
> Show all documentation.

**-u**
> Include unexported.

**-src**
> Show source code.

**-c**
> Case-sensitive matching.

**--help**
> Display help information.

# DESCRIPTION

**go doc** shows documentation for Go packages and symbols. It extracts documentation from source code comments following Go documentation conventions.

The command displays documentation for packages, types, functions, and methods. It can show source code and unexported symbols for development reference.

# CAVEATS

Reads from source, not installed docs. Standard library always available. Custom packages need source.

# HISTORY

go doc is part of the **Go** toolchain, providing documentation access following Go's convention of documentation in source code.

# SEE ALSO

[go](/man/go)(1), [godoc](/man/godoc)(1)
