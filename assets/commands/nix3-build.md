# TLDR

**Build flake**

```nix3 build```

**Build specific package**

```nix3 build [.#package]```

**Build from nixpkgs**

```nix3 build nixpkgs#[hello]```

**Build without result link**

```nix3 build --no-link```

# SYNOPSIS

**nix3** **build** [_options_] [_installable_]

# PARAMETERS

_INSTALLABLE_
> Flake reference to build.

**--no-link**
> Don't create result symlink.

**-o** _NAME_
> Output link name.

**--help**
> Display help information.

# DESCRIPTION

**nix3 build** builds derivations from flakes. Alternative name for nix build.

The tool produces store paths. Creates result symlink to output.

nix3 build compiles flakes.

# CAVEATS

Alias for nix build. Flakes must be enabled. Experimental feature.

# HISTORY

nix3 refers to the **Nix 3.x CLI**, with build being the primary compilation command.

# SEE ALSO

[nix](/man/nix)(1), [nix-build](/man/nix-build)(1), [nix3-develop](/man/nix3-develop)(1)

