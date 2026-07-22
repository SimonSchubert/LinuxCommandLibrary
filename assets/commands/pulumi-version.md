# TAGLINE

Display the installed Pulumi CLI version

# TLDR

**Show Pulumi version**

```pulumi version```

# SYNOPSIS

**pulumi** **version**

# PARAMETERS

**--color** _mode_
> Colorize output. Choices: `always`, `never`, `raw`, `auto` (default: `auto`).

**--non-interactive**
> Disable interactive mode for all commands.

**--logflow**
> Flow log settings to child processes such as plugins.

**--logtostderr**
> Log to stderr instead of to files.

**-v**, **--verbose** _level_
> Enable verbose logging at the given level.

# DESCRIPTION

**pulumi version** prints the version number of the installed Pulumi CLI. Useful for verifying the installation and checking whether an upgrade is available.

# INSTALL

```pacman: sudo pacman -S pulumi```

```apk: sudo apk add pulumi```

```brew: brew install pulumi```

```nix: nix profile install nixpkgs#pulumi```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-about](/man/pulumi-about)(1)
