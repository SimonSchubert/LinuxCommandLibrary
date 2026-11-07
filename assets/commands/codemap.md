# TAGLINE

Write one HTML page that maps a Go module

# TLDR

Map the module in the current directory

```go run github.com/peterretief/codemap@latest -o code-map.html```

Map a **different** directory

```codemap -root [dir] -o code-map.html```

# SYNOPSIS

**codemap** [**-root** _dir_] **-o** _file_

# PARAMETERS

**-o** _file_

> HTML file to write. One self-contained page, with nothing to serve

**-root** _dir_

> Module directory to read. The default is the current directory

# DESCRIPTION

**codemap** reads a Go module and writes a single HTML file: every package, the packages it builds on inside the module, and the functions in each file. Open the file in a browser. Search it, select a package to see what it uses and what uses it, and, for a module on GitHub, jump to a function's line. Tests are omitted.

Rows are ordered so each package builds only on rows below it. Wider boxes have more functions. Colors are top-level folders. Direct edges are drawn. Edges already implied by another path appear when you select a package. `internal/` is dropped from names. `vendor`, `testdata`, and folders that contain their own `go.mod` are left out. The page loads fonts from Google Fonts and falls back to system fonts.

Go 1.24 or newer is required. `go run github.com/peterretief/codemap@latest` builds and runs the **codemap** binary. A GitHub Action in the same repository can emit the HTML in CI. The action is not a second command.

# CAVEATS

The tool maps one Go module. It does not follow modules outside the root, and it does not draw tests. A Kubernetes-sized module is expected to finish in a few seconds and produce a multi-megabyte HTML file. That file is static. It does not update itself when the code changes.

The page is a graph of packages and functions, not a coverage or vulnerability report.

# HISTORY

**codemap** is a MIT-licensed Go program by Peter Retief. The same idea for Perl lives in a separate project, perl-codemap. The HTML example published with the tool is a map of the yggstore module.

# SEE ALSO

[go](/man/go)(1)

# RESOURCES

```[Source code](https://github.com/peterretief/codemap)```

<!-- verified: 2026-11-07 -->
