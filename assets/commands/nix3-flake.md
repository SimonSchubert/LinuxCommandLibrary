# TAGLINE

manages Nix flakes

# TLDR

**Show flake outputs**

```nix3 flake show```

**Update inputs**

```nix3 flake update```

**Initialize flake**

```nix3 flake init```

**Check flake**

```nix3 flake check```

# SYNOPSIS

**nix3** **flake** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Flake subcommand.

**show**
> Display outputs.

**update**
> Update inputs.

**init**
> Create new flake.

**check**
> Validate flake.

**--help**
> Display help information.

# DESCRIPTION

**nix3 flake** manages Nix flakes. Alternative name for nix flake commands.

The tool handles flake.nix files. Manages reproducible package definitions.

# CAVEATS

Alias for nix flake. Experimental features. Lock file management.

# HISTORY

nix3 flake is part of the **Nix 3.x** flake system for hermetic builds.

# SEE ALSO

[nix](/man/nix)(1), [nix-flake](/man/nix-flake)(1), [nix3-build](/man/nix3-build)(1)

