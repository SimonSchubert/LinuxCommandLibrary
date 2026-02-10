# TAGLINE

creates shells with packages

# TLDR

**Enter shell with package**

```nix3 shell nixpkgs#[hello]```

**Shell with multiple packages**

```nix3 shell nixpkgs#[git] nixpkgs#[curl]```

**Run command in shell**

```nix3 shell nixpkgs#[jq] --command [jq --version]```

# SYNOPSIS

**nix3** **shell** [_options_] _installables_

# PARAMETERS

_INSTALLABLES_
> Packages to include.

**--command** _CMD_
> Run command in shell.

**--help**
> Display help information.

# DESCRIPTION

**nix3 shell** creates shells with packages. Alternative to nix-shell -p.

The tool provides temporary environments. Packages available immediately.

# CAVEATS

Alias for nix shell. Flakes enabled. No permanent installation.

# HISTORY

nix3 shell is part of the **Nix 3.x CLI** for ad-hoc development environments.

# SEE ALSO

[nix](/man/nix)(1), [nix-shell](/man/nix-shell)(1), [nix3-develop](/man/nix3-develop)(1)

