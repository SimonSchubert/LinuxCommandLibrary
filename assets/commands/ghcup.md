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

**ghcup** is the Haskell toolchain installer. Manages installations of GHC (compiler), Cabal, Stack, and HLS. The recommended way to install Haskell tools.

# SEE ALSO

[ghc](/man/ghc)(1), [cabal](/man/cabal)(1), [stack](/man/stack)(1)

