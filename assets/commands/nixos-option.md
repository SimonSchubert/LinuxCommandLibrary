# TAGLINE

inspects NixOS configuration values, showing what options are set and their

# TLDR

Show an option's **value, type, default and where it was set**

```nixos-option [services.openssh.enable]```

List the **children** under a namespace

```nixos-option [services.nginx]```

Walk a **whole subtree** at once

```nixos-option --recursive [users.users]```

Check which **kernel modules** the configuration loads

```nixos-option boot.kernelModules```

Inspect a user's **authorized SSH keys**

```nixos-option users.users.[username].openssh.authorizedKeys.keys```

Look at the configured **remote build machines**

```nixos-option nix.buildMachines```

Query a **configuration file other than the system one**

```NIXOS_CONFIG=[path/to/configuration.nix] nixos-option [option_key]```

# SYNOPSIS

**nixos-option** [_options_] _option_path_

# PARAMETERS

**-r, --recursive**
> Show all nested values recursively

**_option_path_**
> Dot-separated path to the configuration option

**NIXOS_CONFIG**
> Environment variable to specify an alternative configuration file

# DESCRIPTION

**nixos-option** inspects NixOS configuration values, showing what options are set and their current values. It navigates the hierarchical NixOS module system using dot notation (e.g., services.nginx.enable).

The tool displays the type, default value, description, and current value of configuration options. For container options (like services.* or users.*), it lists available subkeys.

This is useful for exploring available NixOS options, debugging configuration issues, and understanding the current system state as defined by the Nix configuration.

# CAVEATS

Evaluates the Nix configuration, which can take time on complex systems. Only shows options from the NixOS module system; arbitrary Nix expressions are not inspectable. Some dynamic options may not be fully discoverable.

# INSTALL

```nix: nix profile install nixpkgs#nixos-option```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[nixos-rebuild](/man/nixos-rebuild)(8), [nix-env](/man/nix-env)(1), [configuration.nix](/man/configuration.nix)(5)
