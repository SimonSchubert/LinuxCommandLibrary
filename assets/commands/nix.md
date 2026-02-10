# TAGLINE

package manager CLI

# TLDR

**Search packages**

```nix search nixpkgs [package]```

**Run package**

```nix run nixpkgs#[package]```

**Build derivation**

```nix build```

**Enter development shell**

```nix develop```

**Show flake info**

```nix flake show```

**Update flake**

```nix flake update```

**Evaluate expression**

```nix eval --expr "[1 + 1]"```

**Garbage collect**

```nix store gc```

# SYNOPSIS

**nix** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Nix subcommand.

**search** _QUERY_
> Search packages.

**run** _INSTALLABLE_
> Run a package.

**build**
> Build derivation.

**develop**
> Enter dev shell.

**flake** _ACTION_
> Flake operations.

**--help**
> Display help information.

# DESCRIPTION

**nix** is the Nix package manager CLI. It provides reproducible package management.

The tool handles builds and environments. Supports flakes for reproducibility.

# CAVEATS

Steep learning curve. Nix expression language. Requires Nix installation.

# HISTORY

Nix was created by **Eelco Dolstra** as his PhD thesis project, first released in 2003.

# SEE ALSO

[nix-shell](/man/nix-shell)(1), [nixos-rebuild](/man/nixos-rebuild)(1), [home-manager](/man/home-manager)(1)

