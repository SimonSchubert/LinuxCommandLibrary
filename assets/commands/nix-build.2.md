# TLDR

**Build default.nix**

```nix-build```

**Build specific attribute**

```nix-build -A [package]```

**Build from nixpkgs**

```nix-build '<nixpkgs>' -A [hello]```

**Build without result link**

```nix-build --no-out-link```

# SYNOPSIS

**nix-build** [_options_] [_path_]

# PARAMETERS

_PATH_
> Nix expression path.

**-A** _ATTR_
> Attribute to build.

**--no-out-link**
> Skip result symlink.

**--help**
> Display help information.

# DESCRIPTION

**nix-build** builds Nix derivations. This is an alternate documentation version.

The tool evaluates Nix expressions. Produces store paths and result links.

nix-build creates Nix packages.

# CAVEATS

Part of Nix toolset. Legacy interface. Use nix build for flakes.

# HISTORY

nix-build is a core **Nix** command for building derivations from expressions.

# SEE ALSO

[nix-build](/man/nix-build)(1), [nix](/man/nix)(1), [nix-shell](/man/nix-shell)(1)

