# TLDR

**Run generators in current package**

```go generate```

**Run generators in all packages**

```go generate ./...```

**Run specific generator by pattern**

```go generate -run [pattern]```

**Preview commands without executing**

```go generate -n```

**Run with verbose output**

```go generate -v```

**Skip generators matching pattern**

```go generate -skip [pattern]```

# SYNOPSIS

**go** **generate** [**-run** _regexp_] [**-skip** _regexp_] [**-n**] [**-v**] [**-x**] [_packages_]

# PARAMETERS

**-run** _regexp_
> Run only directives matching regexp.

**-skip** _regexp_
> Skip directives matching regexp.

**-n**
> Print commands without executing.

**-v**
> Print package names as processed.

**-x**
> Print commands as executed.

# DESCRIPTION

**go generate** scans Go source files for special directives of the form **//go:generate command** and executes the specified command. It automates code generation before compilation, commonly used for creating string methods, mock implementations, protocol buffers, and other generated code. Directives must start at the beginning of a line with no space between // and go:generate.

# CAVEATS

Environment variables $GOFILE, $GOLINE, $GOPACKAGE, and $GOROOT are set during execution. Generated files should include a comment matching **^// Code generated .* DO NOT EDIT\.$** before non-comment content.

# SEE ALSO

[go](/man/go)(1), [go-build](/man/go-build)(1)

