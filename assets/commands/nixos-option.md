# TLDR

List all **subkeys** of a given option key

```nixos-option [option_key]```

List current **boot kernel modules**

```nixos-option boot.kernelModules```

List **authorized keys** for a specific user

```nixos-option users.users.[username].openssh.authorizedKeys.keys```

List all **remote builders**

```nixos-option nix.buildMachines```

List subkeys on **another NixOS configuration**

```NIXOS_CONFIG=[path/to/configuration.nix] nixos-option [option_key]```

Show **recursively all values** of a user

```nixos-option -r users.users.[user]```

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

# SEE ALSO

[nixos-rebuild](/man/nixos-rebuild)(8), [nix-env](/man/nix-env)(1), [configuration.nix](/man/configuration.nix)(5)
