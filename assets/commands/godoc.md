# TAGLINE

Go documentation server and viewer

# TLDR

**Start documentation server**

```godoc -http=:6060```

**Show package docs**

```godoc [fmt]```

**Show specific function**

```godoc [fmt Println]```

**Output HTML**

```godoc -html [package]```

# SYNOPSIS

**godoc** [_options_] [_package_] [_symbol_]

# PARAMETERS

_PACKAGE_
> Package to document.

_SYMBOL_
> Symbol to look up.

**-http** _ADDR_
> Start HTTP server.

**-html**
> Output HTML format.

**-src**
> Show source code.

**--help**
> Display help information.

# DESCRIPTION

**godoc** extracts and generates documentation for Go packages. It can serve documentation as a web server or print to the console, providing browsable, searchable documentation.

The HTTP server mode indexes all packages in GOPATH/GOROOT for comprehensive browsing with source code links. For quick command-line lookups, the `go doc` subcommand is preferred.

# CAVEATS

Separate install since Go 1.12. Use go doc for quick lookups. Server mode for browsing.

# HISTORY

godoc was the original **Go** documentation tool, now available separately from golang.org/x/tools/cmd/godoc.

# SEE ALSO

[go-doc](/man/go-doc)(1), [go](/man/go)(1)
