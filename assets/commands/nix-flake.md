# TLDR

**Show flake info**

```nix flake show```

**Update flake inputs**

```nix flake update```

**Lock flake inputs**

```nix flake lock```

**Initialize new flake**

```nix flake init```

**Check flake**

```nix flake check```

**Show flake metadata**

```nix flake metadata```

**Clone flake**

```nix flake clone [github:owner/repo]```

# SYNOPSIS

**nix** **flake** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Flake subcommand.

**show**
> Show flake outputs.

**update**
> Update inputs.

**lock**
> Lock inputs.

**init**
> Initialize flake.

**check**
> Validate flake.

**--help**
> Display help information.

# DESCRIPTION

**nix flake** manages Nix flakes. Flakes provide reproducible, hermetic packages.

The tool handles flake.nix files. Manages inputs and outputs.

nix flake manages flakes.

# CAVEATS

Requires experimental features. flake.nix required. Lock file generated.

# HISTORY

Nix flakes were introduced in **Nix 2.4** to provide reproducible and composable package definitions.

# SEE ALSO

[nix](/man/nix)(1), [nix-build](/man/nix-build)(1), [nix-develop](/man/nix-develop)(1)

