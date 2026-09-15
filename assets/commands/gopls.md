# TAGLINE

Official Go language server

# TLDR

**Start the language server** (this is the default; editors usually launch it)

```gopls serve```

Show **diagnostics** for one or more files

```gopls check [path/to/file.go]```

**Format** files in place

```gopls format -w [path/to/file.go]```

Add missing and remove unused **imports**, writing the file

```gopls imports -w [path/to/file.go]```

Show the **definition** of the identifier at a file location

```gopls definition [path/to/file.go]:[line]:[column]```

List **references** to the identifier at a file location

```gopls references [path/to/file.go]:[line]:[column]```

**Rename** an identifier, writing the affected files

```gopls rename -w [path/to/file.go]:[line]:[column] [new_name]```

Print the **version**

```gopls version```

# SYNOPSIS

**gopls** [_flags_] [_command_] [_command-flags_] [_args_]

# PARAMETERS

**serve**
> Run the LSP server (default if no command is given). Speaks JSON-RPC on stdin/stdout unless **--listen** is set.

**check** _files_
> Print diagnostics for the given Go files.

**format** [_-w_] _files_
> Format Go source. **--write** / **-w** overwrites the files; default prints the formatted text.

**imports** [_-w_] _file_
> Add missing imports and remove unused ones (same edit flags as **format**).

**definition** _file.go:line:column_
> Print the location of the definition of the identifier at that position.

**references** _file.go:line:column_
> List references to the identifier at that position.

**rename** [_-w_] _file.go:line:column_ _new_name_
> Rename the identifier across the module. **--write** / **-w** applies edits; default prints the new file text.

**version**
> Print the gopls version.

**help** [_command_]
> Help for gopls or for a subcommand (for example **gopls help serve**).

**-v**, **--verbose**
> Verbose logging.

**--remote** _addr_
> Forward commands to a remote gopls (**tcp** address, **unix;**_path_, or **auto**).

**--write**, **-w**
> With **format**, **imports**, and **rename**, write edits back to the source files.

**--diff**, **-d**
> Print unified diffs instead of full file contents.

**--list**, **-l**
> Print the names of files that would be edited.

# DESCRIPTION

**gopls** (pronounced "Go please") is the official language server for Go, developed by the Go team. Editors that speak the Language Server Protocol (LSP) use it for completion, diagnostics, navigation, renaming, and refactoring. You normally do not run it by hand: VS Code, Vim, Neovim, Emacs, Helix, Sublime Text, Zed, and others start **gopls serve** and talk to it over stdin/stdout.

The same binary also exposes an experimental command-line interface for the same features. Positions are **file.go:line:column** with 1-based line and column in UTF-8 bytes, or **file.go:#**_offset_ for a 0-based byte offset. The CLI is intended as a debugging aid; it is not efficient or officially supported as a stable API.

**gopls** follows the Go release policy for the **go** toolchain it finds on **$PATH** (the two most recent major releases). It can still analyze source written for older Go versions according to the **go** directive in **go.mod**.

# CONFIGURATION

Editors pass settings through the LSP **workspace/configuration** request (the **gopls** section). A full list is at the gopls settings documentation. **gopls** also inherits the editor's environment, including **GOROOT**, **GOPATH**, and **GOFLAGS**.

**.clangd**-style project files are not used; layout is a Go module, a multi-module workspace, or GOPATH, as described in the gopls workspace documentation.

# CAVEATS

The command-line interface is experimental and may change without notice. **gopls** only supports the **go** command as a build system; Bazel needs a **go/packages** driver and is not officially supported. Building gopls requires Go 1.21 or later. After upgrading, restart running **gopls** processes (for example **killall gopls**). Positions in non-ASCII files are UTF-8 byte columns, which may not match an editor's UTF-16 or code-point column.

# HISTORY

**gopls** is maintained by the Go tools team as the successor to earlier editor integrations such as **gocode** and **guru**. It lives in **golang.org/x/tools/gopls** and ships on a roughly quarterly minor-release cadence aligned with the Go release cycle.

# INSTALL

```apt: sudo apt install gopls```

```dnf: sudo dnf install gopls```

```pacman: sudo pacman -S gopls```

```apk: sudo apk add gopls```

```brew: brew install gopls```

```nix: nix profile install nixpkgs#gopls```

<!-- packages: 2026-09-15 -->

# SEE ALSO

[go](/man/go)(1), [gofmt](/man/gofmt)(1), [goimports](/man/goimports)(1), [go-fmt](/man/go-fmt)(1)

# RESOURCES

```[Source code](https://github.com/golang/tools/tree/master/gopls)```

```[Homepage](https://go.dev/gopls)```

```[Documentation](https://go.dev/gopls/command-line)```

<!-- verified: 2026-09-15 -->
