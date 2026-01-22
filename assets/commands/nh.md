# TLDR

**Build NixOS configuration**

```nh os switch```

**Build home-manager**

```nh home switch```

**Build with flake**

```nh os switch --flake [.]```

**Dry run build**

```nh os switch --dry```

**Clean old generations**

```nh clean all```

**Search packages**

```nh search [package]```

# SYNOPSIS

**nh** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> nh subcommand.

**os** _ACTION_
> NixOS operations.

**home** _ACTION_
> home-manager operations.

**clean** _TARGET_
> Clean generations.

**search** _QUERY_
> Search packages.

**--flake** _PATH_
> Use flake at path.

**--help**
> Display help information.

# DESCRIPTION

**nh** is a Nix helper tool. It simplifies NixOS and home-manager operations.

The tool wraps common Nix commands. Provides better output and UX.

nh is Nix operations helper.

# CAVEATS

Requires Nix/NixOS. Rust-based. Wrapper around nixos-rebuild.

# HISTORY

nh was created to provide a **better interface** for common NixOS and home-manager operations.

# SEE ALSO

[nix](/man/nix)(1), [nixos-rebuild](/man/nixos-rebuild)(1), [home-manager](/man/home-manager)(1)

