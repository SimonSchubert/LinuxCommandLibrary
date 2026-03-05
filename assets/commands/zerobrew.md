# TAGLINE

5-20x faster experimental Homebrew alternative

# TLDR

**Install a package**

```brew install [ripgrep]```

**Upgrade all packages**

```brew upgrade```

**Garbage collect unreferenced data**

```brew gc```

# SYNOPSIS

**brew** _command_ [_options_]

# DESCRIPTION

**zerobrew** is a drop-in Homebrew replacement that uses parallel downloads and extraction, APFS clonefiles for zero-overhead copying, and a SHA256 content-addressable store for instant reinstalls. Compatible with existing Homebrew workflows and the bottle ecosystem.

# HISTORY

**zerobrew** was created by **Lucas Gelfond** (lucasgelfond) and is written in **Rust**.

# SEE ALSO

[brew](/man/brew)(1), [nix](/man/nix)(1)
