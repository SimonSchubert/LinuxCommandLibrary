# TAGLINE

Faster experimental Homebrew alternative written in Rust

# TLDR

**Install a package**

```brew install [ripgrep]```

**Upgrade all packages**

```brew upgrade```

**Uninstall a package**

```brew uninstall [ripgrep]```

**List installed packages**

```brew list```

**Garbage collect unreferenced data**

```brew gc```

# SYNOPSIS

**brew** _command_ [_options_]

# PARAMETERS

_command_
> Homebrew-compatible subcommand (install, upgrade, uninstall, list, gc, etc.)

# DESCRIPTION

**zerobrew** is a drop-in Homebrew replacement that uses parallel downloads and extraction, APFS clonefiles for zero-overhead copying, and a SHA256 content-addressable store for instant reinstalls. Compatible with existing Homebrew workflows and the bottle ecosystem.

# CAVEATS

macOS only (requires APFS). Experimental software -- not all Homebrew commands may be supported. Only works with bottles (pre-built binaries), not source builds.

# HISTORY

**zerobrew** was created by **Lucas Gelfond** (lucasgelfond) and is written in **Rust**.

# SEE ALSO

[brew](/man/brew)(1), [nix](/man/nix)(1)
