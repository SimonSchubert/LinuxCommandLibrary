# TAGLINE

executes packages without installing

# TLDR

**Run package**

```nix3 run nixpkgs#[hello]```

**Run from flake**

```nix3 run [.#default]```

**Run with args**

```nix3 run nixpkgs#[cowsay] -- "[text]"```

# SYNOPSIS

**nix3** **run** [_options_] _installable_ [-- _args_]

# PARAMETERS

_INSTALLABLE_
> Flake reference.

_ARGS_
> Program arguments.

**--help**
> Display help information.

# DESCRIPTION

**nix3 run** executes packages without installing. Alternative name for nix run.

The tool runs programs temporarily. Downloads and executes from store.

# CAVEATS

Alias for nix run. Network required. Temporary execution.

# HISTORY

nix3 run is the **new Nix CLI** for running packages without system installation.

# SEE ALSO

[nix](/man/nix)(1), [nix-run](/man/nix-run)(1), [nix3-shell](/man/nix3-shell)(1)

