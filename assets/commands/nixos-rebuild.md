# TAGLINE

reconfigures a NixOS system by building a new configuration

# TLDR

Build the configuration, **activate it, and make it the boot default**

```sudo nixos-rebuild switch```

Build from a **flake** rather than `/etc/nixos`

```sudo nixos-rebuild switch --flake [path/to/flake]#[hostname]```

Check that the configuration **still builds**, changing nothing

```nixos-rebuild dry-build```

Print what **activation would change**

```sudo nixos-rebuild dry-activate```

Activate for **this session only**, leaving the boot entry alone

```sudo nixos-rebuild test --fast```

Stage the configuration for the **next boot** without activating it now

```sudo nixos-rebuild boot --install-bootloader```

Update **every channel** and rebuild

```sudo nixos-rebuild switch --upgrade-all```

Go back to the **previous generation**

```sudo nixos-rebuild switch --rollback```

List the generations, as **JSON**

```nixos-rebuild list-generations --json```

Boot the configuration in a **virtual machine** to try it out

```sudo nixos-rebuild build-vm-with-bootloader```

Deploy the configuration to a **remote machine**

```nixos-rebuild switch --target-host [user]@[host] --use-remote-sudo```

Print a **full trace** when evaluation fails

```sudo nixos-rebuild switch --show-trace```

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
