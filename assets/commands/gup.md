# TAGLINE

Update binaries installed by "go install" in parallel

# TLDR

**Update all binaries** installed under $GOPATH/bin in parallel

```gup update```

**List all installed** Go binaries with paths and versions

```gup list```

**Update all binaries** but exclude specific ones

```gup update --exclude=[binary1,binary2]```

**Preview updates** without making any changes

```gup update --dry-run```

**Check** if installed binaries are at their latest versions

```gup check```

**Remove** an installed Go binary

```gup remove [binary_name]```

**Export** current binary configuration to gup.json

```gup export```

**Reinstall** all binaries from a gup.json configuration file

```gup import --input=[path/to/gup.json]```

# SYNOPSIS

**gup** _subcommand_ [_options_]

# PARAMETERS

**update**
> Update all binaries under $GOPATH/bin to the latest version using goroutines.

**list**
> Display all installed binaries with their import paths and versions.

**remove** _binary_
> Delete the specified binary from $GOPATH/bin or $GOBIN.

**check**
> Verify whether each installed binary is at its latest version without updating.

**export**
> Write the current set of binaries to a gup.json configuration file.

**import**
> Install or restore binaries listed in a gup.json file.

**man**
> Generate man pages (Linux/macOS).

**completion**
> Generate shell completion scripts.

**version**
> Print version information.

**-e**, **--exclude** _list_
> Comma-separated list of binaries to skip during update.

**--dry-run**
> Show what would be done without performing any updates.

**--notify**
> Display a desktop notification when the operation finishes.

**--main**
> Use the @main module channel when updating.

**--master**
> Use the @master module channel when updating.

**--latest**
> Use the @latest module channel when updating.

**--force**
> Skip confirmation prompts (used with **remove**).

# DESCRIPTION

**gup** updates binaries installed by **go install** to the latest version. It scans the directory pointed to by **GOBIN** (or **$GOPATH/bin**), inspects each binary's embedded module information, and rebuilds them in parallel using goroutines. This makes upgrading large collections of Go-based CLI tools significantly faster than running **go install** manually for each one.

The tool reads version metadata embedded in Go binaries since Go 1.17 and feeds the original module path back into **go install**. Binaries built without module information cannot be updated and are skipped with a warning.

In addition to updates, **gup** provides subcommands for listing, removing, checking, exporting, and re-importing binaries, making it useful for replicating a Go toolchain across machines.

# CAVEATS

Requires the **go** toolchain to be installed and available in **$PATH**. Only binaries built with module information (Go 1.17+ default) can be updated. Binaries installed via **GOPROXY=off** or from local paths cannot be reinstalled. Update channels (**@latest**, **@main**, **@master**) must be supported by the upstream module.

# CONFIGURATION

**gup.json**
> Configuration file written by **gup export** and consumed by **gup import**. Stores each binary's module path and chosen update channel. Replaced the older **gup.conf** format in v1.0.0.

**$GOPATH/bin** / **$GOBIN**
> Target directory scanned for binaries. **$GOBIN** takes precedence when set.

# HISTORY

**gup** was created by **nao1215** and first released in **2022**. Written in Go, it was designed to make managing Go-installed CLI tools easier by updating them concurrently. Version **1.0.0** introduced the JSON configuration format and per-binary update channel selection.

# INSTALL

```brew: brew install gup```

```nix: nix profile install nixpkgs#gup```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[go](/man/go)(1), [asdf](/man/asdf)(1)
