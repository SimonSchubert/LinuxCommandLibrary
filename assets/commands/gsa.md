# TAGLINE

Analyze size breakdown of Go compiled binaries

# TLDR

**Text report** for a binary

```gsa [path/to/binary]```

**Interactive terminal UI**

```gsa --tui [path/to/binary]```

**Web UI** on local server

```gsa --web [path/to/binary]```

**JSON output**

```gsa -f json [path/to/binary]```

**Compare two binaries**

```gsa --diff [old-binary] [new-binary]```

# SYNOPSIS

**gsa** [*options*] *binary*...

# DESCRIPTION

**gsa** (**go-size-analyzer**) analyses the size of Go-compiled binaries. It supports ELF, Mach-O, PE, and experimental WebAssembly, with breakdowns by packages and sections. Output formats include text, JSON, HTML, and SVG. Interactive exploration is available via **--tui** and **--web**.

Install from GitHub releases, Homebrew (**brew install go-size-analyzer**), Scoop, or:

```
GOEXPERIMENT=jsonv2 go install github.com/Zxilly/go-size-analyzer/cmd/gsa@latest
```

Building from source needs a recent Go toolchain with the **jsonv2** experiment enabled (as documented upstream).

# PARAMETERS

*binary*

> Path to a compiled Go binary (or multiple for supported modes).

**--tui**

> Open the terminal UI explorer.

**--web**

> Start a web UI (default port documented in **--help**, commonly 8080).

**-f**, **--format** text|json|html|svg

> Output format for non-interactive runs.

**--diff**

> Compare binaries (json/text).

See **gsa --help** for verbose flags, hide options, and server bind addresses.

# CAVEATS

Best results on Go binaries with symbol/package information; stripped binaries yield coarser reports. WebAssembly analysis is experimental. Browser/WASM analysis is much slower than native. Source builds need specific Go version features.

# INSTALL

```apt: sudo apt install gwenhywfar-tools```

```dnf: sudo dnf install gwenhywfar```

```pacman: sudo pacman -S gwenhywfar```

```apk: sudo apk add gwenhywfar```

```zypper: sudo zypper install gwenhywfar-tools```

```brew: brew install gwenhywfar```

```nix: nix profile install nixpkgs#gwenhywfar```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[go](/man/go)(1), [nm](/man/nm)(1), [size](/man/size)(1), [binsider](/man/binsider)(1)

# RESOURCES

```[Source code](https://github.com/Zxilly/go-size-analyzer)```

```[Homepage](https://gsa.zxilly.dev)```

<!-- verified: 2026-07-19 -->
