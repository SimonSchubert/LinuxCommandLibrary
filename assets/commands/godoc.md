# TAGLINE

Go documentation web server

# TLDR

**Start documentation server on port 6060**

```godoc -http=:6060```

**Start server with search index enabled**

```godoc -http=:6060 -index```

**Start server with Go playground support**

```godoc -http=:6060 -play```

**Print documentation that would be served for a URL path**

```godoc -url=/pkg/[fmt]/```

**Start server with a custom GOROOT**

```godoc -http=:6060 -goroot=[/usr/local/go]```

# SYNOPSIS

**godoc** [_flags_]

# PARAMETERS

**-http** _addr_
> HTTP service address (e.g., `:6060` or `127.0.0.1:6060`).

**-index**
> Enable identifier and full text search index. Without this flag, no search box is shown.

**-play**
> Enable the Go playground for executable examples.

**-url** _path_
> Print to stdout the data that would be served by an HTTP request for the given path, then exit.

**-goroot** _dir_
> Set the Go root directory (default: `$GOROOT`).

**-v**
> Verbose mode.

**-timestamps**
> Show timestamps with directory listings (default: true).

**-links**
> Link identifiers to their declarations (default: true).

**-index_interval** _duration_
> Interval between index updates; 0 for every 5 minutes, negative to index only at startup.

**-index_throttle** _float_
> Index throttle value between 0.0 and 1.0 (default: 0.75).

**-maxresults** _n_
> Maximum number of full text search results shown (default: 10000). Set to 0 to disable full text search.

**-notes** _regexp_
> Regular expression matching note markers to show (default: `BUG`).

**-templates** _dir_
> Directory containing alternate template files.

**-zip** _file_
> Zip file providing the file system to serve instead of the local filesystem.

# DESCRIPTION

**godoc** extracts and generates documentation for Go packages, serving it as a browsable web interface. It indexes all packages in GOROOT and GOPATH for comprehensive browsing with source code links and optional search.

The web interface supports URL parameters to control presentation: `?m=all` shows unexported declarations, `?m=methods` shows all embedded methods, `?m=src` shows source code, and `?m=flat` uses flat directory listings.

For quick command-line lookups of individual packages or symbols, use `go doc` instead. godoc is primarily useful as a local documentation server.

# CAVEATS

godoc requires separate installation since Go 1.12 via `go install golang.org/x/tools/cmd/godoc@latest`. It cannot select which version of a package is displayed. The newer `pkgsite` tool (`golang.org/x/pkgsite/cmd/pkgsite`) is the recommended replacement for local documentation browsing.

# HISTORY

godoc was the original **Go** documentation tool, bundled with Go until version 1.12. It is now available separately from `golang.org/x/tools/cmd/godoc` and has been largely superseded by `pkgsite` for local use and `pkg.go.dev` for online documentation.

# SEE ALSO

[go-doc](/man/go-doc)(1), [go](/man/go)(1), [gofmt](/man/gofmt)(1)
