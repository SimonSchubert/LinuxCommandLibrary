# TLDR

**Generate fish completions**

```go-fish```

**Specific package completions**

```go-fish [package]```

# SYNOPSIS

**go-fish** [_package_]

# PARAMETERS

_PACKAGE_
> Package to generate completions for.

**--help**
> Display help information.

# DESCRIPTION

**go-fish** generates fish shell completions for Go programs. It analyzes Go command-line flag definitions and creates fish completion scripts.

The tool automates completion script generation from Go source code. It uses Go's flag package conventions to identify commands and options.

go-fish creates fish shell completions from Go programs.

# CAVEATS

Requires Go flags package usage. Fish shell specific. May need customization.

# HISTORY

go-fish was created to automate fish shell completion generation for Go command-line applications.

# SEE ALSO

[go](/man/go)(1), [fish](/man/fish)(1)
