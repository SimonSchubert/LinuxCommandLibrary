# TLDR

**Run package from nixpkgs**

```nix run nixpkgs#[hello]```

**Run from flake**

```nix run [.#default]```

**Run with arguments**

```nix run nixpkgs#[cowsay] -- "[Hello]"```

**Run from GitHub**

```nix run [github:owner/repo]```

**Run specific app**

```nix run [.#apps.x86_64-linux.default]```

# SYNOPSIS

**nix** **run** [_options_] _installable_ [-- _args_]

# PARAMETERS

_INSTALLABLE_
> Flake reference to run.

_ARGS_
> Arguments to pass to program.

**--impure**
> Allow impure evaluation.

**--help**
> Display help information.

# DESCRIPTION

**nix run** runs programs from Nix packages. No installation required.

The tool fetches and runs packages. Temporary execution without pollution.

nix run executes Nix packages.

# CAVEATS

Requires flakes enabled. Downloads on first run. Network dependent.

# HISTORY

nix run is part of the **new Nix CLI** for running packages without installation.

# SEE ALSO

[nix](/man/nix)(1), [nix-shell](/man/nix-shell)(1), [nix-build](/man/nix-build)(1)

