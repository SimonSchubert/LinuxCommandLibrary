# TLDR

**Show flake outputs**

```nix flake show```

**Show remote flake**

```nix flake show [github:NixOS/nixpkgs]```

**Show as JSON**

```nix flake show --json```

**Show all systems**

```nix flake show --all-systems```

# SYNOPSIS

**nix** **flake** **show** [_options_] [_flake-url_]

# PARAMETERS

_FLAKE-URL_
> Flake reference.

**--json**
> Output as JSON.

**--all-systems**
> Show all system outputs.

**--help**
> Display help information.

# DESCRIPTION

**nix flake show** displays flake outputs. Shows packages, apps, and devShells.

The command lists available attributes. Tree view of flake structure.

nix flake show lists outputs.

# CAVEATS

Flakes must be enabled. Evaluates flake. Network for remote flakes.

# HISTORY

nix flake show is part of **Nix flakes** for inspecting flake output structure.

# SEE ALSO

[nix-flake](/man/nix-flake)(1), [nix-flake-info](/man/nix-flake-info)(1), [nix](/man/nix)(1)

