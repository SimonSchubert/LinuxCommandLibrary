# TAGLINE

Universal installer for the Haskell toolchain

# TLDR

**Install GHC version**

```ghcup install ghc [9.4.7]```

**Install latest GHC**

```ghcup install ghc```

**Set default GHC**

```ghcup set ghc [9.4.7]```

**Install Cabal**

```ghcup install cabal```

**Install HLS**

```ghcup install hls```

**List installed tools**

```ghcup list```

**Interactive TUI**

```ghcup tui```

**Upgrade ghcup**

```ghcup upgrade```

# SYNOPSIS

**ghcup** _command_ [_options_]

# SUBCOMMANDS

**install**
> Install tool.

**set**
> Set default version.

**list**
> List versions.

**rm**
> Remove version.

**upgrade**
> Upgrade ghcup.

**tui**
> Interactive interface.

**whereis**
> Show tool location.

**gc**
> Garbage collect.

# PARAMETERS

**ghc**
> Glasgow Haskell Compiler.

**cabal**
> Cabal build tool.

**hls**
> Haskell Language Server.

**stack**
> Stack build tool.

# DESCRIPTION

**ghcup** is the universal installer and version manager for the Haskell toolchain. It provides a centralized way to install, manage, and switch between multiple versions of GHC, Cabal, Stack, and HLS (Haskell Language Server).

The tool handles downloading, installing, and setting up PATH entries for all Haskell development tools. It supports installing specific versions, setting global defaults, and maintaining multiple versions side-by-side. The interactive TUI mode provides a visual interface for managing installations.

# CONFIGURATION

**~/.ghcup/config.yaml**
> Configuration file for ghcup settings, download mirrors, and caching preferences.

**~/.ghcup/bin/**
> Installation directory for all managed toolchain binaries.

# SEE ALSO

[ghc](/man/ghc)(1), [cabal](/man/cabal)(1), [stack](/man/stack)(1)
