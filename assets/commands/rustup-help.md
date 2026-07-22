# TAGLINE

Display help for rustup commands

# TLDR

**Show top-level help**

```rustup help```

**Help for a specific** subcommand

```rustup help [command]```

**Help for a nested** subcommand

```rustup help [toolchain] [install]```

**Help for the** override subcommand

```rustup help override```

# SYNOPSIS

**rustup** **help** [_subcommand_...]

# PARAMETERS

_subcommand_
> One or more subcommand names to drill into. Without arguments, rustup prints its top-level help.

# DESCRIPTION

**rustup help** prints usage, options, and the list of subcommands for **rustup** or any of its subcommands. It is equivalent to running the command with **--help**, but accepts nested subcommand names as positional arguments instead of flags.

# INSTALL

```apt: sudo apt install rustup```

```dnf: sudo dnf install rustup```

```pacman: sudo pacman -S rustup```

```zypper: sudo zypper install rustup```

```brew: brew install rustup```

```nix: nix profile install nixpkgs#rustup```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[rustup](/man/rustup)(1)
