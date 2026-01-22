# TLDR

**Show flake info**

```nix flake info```

**Show remote flake info**

```nix flake info [github:NixOS/nixpkgs]```

**Show info as JSON**

```nix flake info --json```

# SYNOPSIS

**nix** **flake** **info** [_options_] [_flake-url_]

# PARAMETERS

_FLAKE-URL_
> Flake reference URL.

**--json**
> Output as JSON.

**--help**
> Display help information.

# DESCRIPTION

**nix flake info** shows flake metadata. Displays inputs and description.

The command shows flake URL. Lists locked inputs and revisions.

nix flake info displays metadata.

# CAVEATS

Renamed to metadata in newer versions. Flakes must be enabled. Network for remote.

# HISTORY

nix flake info was part of early **flakes** implementation, now superseded by metadata.

# SEE ALSO

[nix-flake](/man/nix-flake)(1), [nix-flake-show](/man/nix-flake-show)(1), [nix](/man/nix)(1)

