# TAGLINE

POSIX-compatible interactive shell written in Rust

# TLDR

**Install** via Cargo

```cargo install nsh```

**Start** an interactive session

```nsh```

**Run** as login shell (if installed on PATH)

```nsh -l```

# SYNOPSIS

**nsh** [*options*] [*script*]

# DESCRIPTION

**nsh** is a command-line shell focused on interactive productivity while remaining POSIX-oriented with some Bash extensions. Features include tab completion, syntax highlighting, Bash completion support (by invoking genuine Bash internally), and builtin zero-configuration defaults. It is written in Rust.

The project describes itself as alpha: many Bash features are still missing, and daily use may hit rough edges. Documentation lives in the repository **docs/** tree.

# PARAMETERS

See **nsh --help** for the flags supported by your build (script execution, interactive mode, version). Primary install path is **cargo install nsh**.

# CAVEATS

Alpha software; do not replace a production login shell without testing. Bash completion bridging requires **bash** installed. Feature completeness lags Bash/zsh for complex interactive setups.

# INSTALL

```brew: brew install nsh```

```nix: nix profile install nixpkgs#nsh```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1), [oil](/man/oil)(1)

# RESOURCES

```[Source code](https://github.com/nuta/nsh)```

```[Documentation](https://github.com/nuta/nsh/tree/master/docs)```

<!-- verified: 2026-07-19 -->
