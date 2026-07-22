# TAGLINE

Show path to Rust toolchain binaries

# TLDR

**Find cargo path**

```rustup which cargo```

**Find rustc path**

```rustup which rustc```

**Find tool in specific toolchain**

```rustup which --toolchain nightly rustfmt```

# SYNOPSIS

**rustup** **which** [_options_] _command_

# PARAMETERS

**--toolchain** _name_
> Search in specific toolchain.

# DESCRIPTION

**rustup which** displays the path to Rust tools. Shows which binary would be executed for a given command. Useful for debugging toolchain issues.

# INSTALL

```apt: sudo apt install rustup```

```dnf: sudo dnf install rustup```

```pacman: sudo pacman -S rustup```

```zypper: sudo zypper install rustup```

```brew: brew install rustup```

```nix: nix profile install nixpkgs#rustup```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[rustup](/man/rustup)(1), [which](/man/which)(1)

