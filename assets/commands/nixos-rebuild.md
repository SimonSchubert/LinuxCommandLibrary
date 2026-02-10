# TAGLINE

reconfigures a NixOS system by building a new configuration

# TLDR

**Build and switch** to new configuration (make boot default)

```sudo nixos-rebuild switch```

Build and switch with **custom profile name**

```sudo nixos-rebuild switch -p [name]```

Build, switch, and **install updates**

```sudo nixos-rebuild switch --upgrade```

**Rollback** to previous generation

```sudo nixos-rebuild switch --rollback```

Build and make **boot default** without activating

```sudo nixos-rebuild boot```

Build and **test** without making boot entry

```sudo nixos-rebuild test```

Build configuration and run in **virtual machine**

```sudo nixos-rebuild build-vm```

**List** available generations

```nixos-rebuild list-generations```

# SYNOPSIS

**nixos-rebuild** [**switch**|**boot**|**test**|**build**|**build-vm**] [**--upgrade**] [**--rollback**] [**-p** _name_]

# COMMANDS

**switch**
> Build, activate, and make boot default

**boot**
> Build and make boot default without activating

**test**
> Build and activate without making boot entry

**build**
> Build configuration without activating

**build-vm**
> Build and open configuration in virtual machine

**dry-build**
> Show what would be built

**dry-activate**
> Show what would change on activation

**list-generations**
> List available system generations

# PARAMETERS

**--upgrade**
> Update nixpkgs channel before building

**--rollback**
> Roll back to previous generation

**-p, --profile-name _name_**
> Name for the boot entry

**--flake _uri_**
> Build from flake reference

**--no-build-nix**
> Don't rebuild Nix during switch

**--fast**
> Skip rebuilding Nix and documentation

**--show-trace**
> Show detailed error traces

# DESCRIPTION

**nixos-rebuild** reconfigures a NixOS system by building a new configuration from /etc/nixos/configuration.nix and optionally activating it. NixOS uses a declarative configuration model where the entire system is described in Nix expressions.

Each build creates a new generation that can be selected at boot time. This allows safe rollback to previous working configurations if problems occur.

# CAVEATS

Requires root privileges for most operations. Configuration errors prevent build completion. Large changes may require significant download and build time. The switch command restarts services that changed.

# HISTORY

**nixos-rebuild** is part of **NixOS**, the Linux distribution based on the Nix package manager. NixOS was created by Eelco Dolstra and first released in 2003. It pioneered declarative system configuration and atomic upgrades with rollback capability.

# SEE ALSO

[nix](/man/nix)(1), [nix-env](/man/nix-env)(1), [nix-channel](/man/nix-channel)(1)
