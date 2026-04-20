# TAGLINE

Daily builds of Go from development tree

# TLDR

**Run** Go development version

```gotip [go-commands]```

**Install** latest development version

```gotip download```

**Build** specific CL

```gotip download [CL-number]```

# SYNOPSIS

**gotip** [_options_] _command_

# PARAMETERS

**download** [_CL_]
> Fetch and build the current Go development tree into **$HOME/sdk/gotip**. When a Gerrit change-list number is supplied, that CL is applied on top before building.

Any other argument is passed through unchanged to the **go** tool inside the installed gotip SDK, so **gotip build**, **gotip test**, **gotip env**, etc. all Just Work.

# DESCRIPTION

**gotip** provides access to daily builds of Go from the development tree. It allows developers to test upcoming Go features and bug fixes before they are released in stable versions.

Unlike the numbered `go1.XX` download wrappers, **gotip download** builds the toolchain from source at the latest **master** commit of **golang/go**, so a working Go installation is required to bootstrap it. To refresh the installation, delete **~/sdk/gotip/.unpacked-success** (or the whole directory) and re-run **gotip download**.

# USAGE

Install latest development version:

```gotip download```

Use gotip like regular Go:

```gotip run main.go```
```gotip test ./...```
```gotip build```

# CAVEATS

Development versions may be unstable. Not recommended for production use. Requires internet connection to download. Binaries are large downloads.

# HISTORY

**gotip** was created by the Go team to make testing development versions easier, replacing earlier workarounds for accessing pre-release Go versions.

# SEE ALSO

[go](/man/go)(1), [dl.golang.org](https://dl.golang.org/), [go.dev](https://go.dev/)