# TAGLINE

Show installed Rust toolchains and active version

# TLDR

**Show installed toolchains**

```rustup show```

**Show active toolchain**

```rustup show active-toolchain```

**Show home directory**

```rustup show home```

**Show installation profile**

```rustup show profile```

# SYNOPSIS

**rustup** **show** [_command_]

# PARAMETERS

**active-toolchain**
> Currently active toolchain.

**home**
> Rustup home directory.

**profile**
> Default installation profile.

# DESCRIPTION

**rustup show** displays rustup installation information. Shows installed toolchains, active toolchain, and configured settings. Default command shows comprehensive overview.

# INSTALL

```apt: sudo apt install rustup```

```dnf: sudo dnf install rustup```

```pacman: sudo pacman -S rustup```

```zypper: sudo zypper install rustup```

```brew: brew install rustup```

```nix: nix profile install nixpkgs#rustup```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[rustup](/man/rustup)(1), [rustup-default](/man/rustup-default)(1)

