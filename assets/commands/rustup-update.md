# TAGLINE

Update installed Rust toolchains

# TLDR

**Update all toolchains**

```rustup update```

**Update specific toolchain**

```rustup update stable```

**Update nightly**

```rustup update nightly```

# SYNOPSIS

**rustup** **update** [_toolchain_...]

# PARAMETERS

**--no-self-update**
> Don't update rustup.

**--force**
> Force reinstall.

**--force-non-host**
> Force update non-host toolchains.

# DESCRIPTION

**rustup update** updates installed Rust toolchains to latest versions. Without arguments, updates all installed toolchains. Also updates rustup itself by default.

# INSTALL

```apt: sudo apt install rustup```

```dnf: sudo dnf install rustup```

```pacman: sudo pacman -S rustup```

```zypper: sudo zypper install rustup```

```brew: brew install rustup```

```nix: nix profile install nixpkgs#rustup```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[rustup](/man/rustup)(1), [rustup-check](/man/rustup-check)(1)

