# TAGLINE

Interactive Cargo target selector

# TLDR

**Interactively select** and run a binary target

```cargo selector run```

**Interactively select** and run a test

```cargo selector test```

**Interactively select** and run a benchmark

```cargo selector bench```

**Interactively select** and run an example

```cargo selector example```

# SYNOPSIS

**cargo selector** _command_ [_options_]

# DESCRIPTION

**cargo-selector** is a Cargo subcommand that provides an interactive fuzzy-search interface for selecting and running targets in a Rust project. Instead of typing exact target names, it presents a searchable list of available binaries, tests, examples, or benchmarks and runs the selected one.

This is particularly useful in workspaces or projects with many targets, where remembering exact names is impractical. The selector uses a fuzzy finder interface for quick filtering.

# CAVEATS

Requires a valid Cargo project with defined targets. Additional arguments to the underlying cargo command may need to be passed after the target selection.

# INSTALL

```apt: sudo apt install cargo```

```dnf: sudo dnf install cargo```

```apk: sudo apk add cargo```

```zypper: sudo zypper install cargo```

```nix: nix profile install nixpkgs#cargo```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[cargo](/man/cargo)(1), [fzf](/man/fzf)(1)
