# TLDR

**Edit system configuration**

```sudo nano /etc/nixos/configuration.nix```

**Rebuild system after changes**

```sudo nixos-rebuild switch```

**Test configuration without making it default**

```sudo nixos-rebuild test```

**Build but don't activate**

```sudo nixos-rebuild build```

**Rollback to previous generation**

```sudo nixos-rebuild switch --rollback```

**Check configuration syntax**

```nix-instantiate --parse /etc/nixos/configuration.nix```

# SYNOPSIS

**/etc/nixos/configuration.nix**

# COMMON OPTIONS

**boot.loader.systemd-boot.enable**
> Enable systemd-boot bootloader.

**networking.hostName**
> Set system hostname.

**time.timeZone**
> Set system timezone.

**users.users.<name>**
> Define user accounts.

**environment.systemPackages**
> List of system-wide packages.

**services.<name>.enable**
> Enable system services.

**programs.<name>.enable**
> Enable system programs.

**nixpkgs.config.allowUnfree**
> Allow proprietary packages.

# DESCRIPTION

**configuration.nix** is the main system configuration file for NixOS, a Linux distribution built on the Nix package manager. It declaratively defines the entire system state: installed packages, enabled services, user accounts, and system settings.

The file uses the Nix expression language to describe system configuration. Changes are applied atomically via **nixos-rebuild**, which builds a new system generation that can be activated immediately or on next boot.

NixOS stores previous configurations as generations, enabling easy rollback to any prior state. This approach ensures reproducible system configurations that can be version-controlled and shared.

# EXAMPLE

```nix
{ config, pkgs, ... }:
{
  boot.loader.systemd-boot.enable = true;
  networking.hostName = "myhost";
  time.timeZone = "America/New_York";

  users.users.alice = {
    isNormalUser = true;
    extraGroups = [ "wheel" ];
  };

  environment.systemPackages = with pkgs; [
    vim git firefox
  ];

  services.openssh.enable = true;
}
```

# CAVEATS

Syntax errors prevent system rebuild; always test with **nixos-rebuild test** first. The Nix language has a learning curve. Some proprietary software requires explicit allowUnfree setting. Large configuration changes may require significant download and build time.

# HISTORY

NixOS was created by **Eelco Dolstra** based on his PhD research on the Nix package manager, with the first release in **2003**. The declarative configuration model was revolutionary, treating system configuration as code that produces reproducible results. NixOS has gained popularity in DevOps and development environments where reproducibility is valued.

# SEE ALSO

[nixos-rebuild](/man/nixos-rebuild)(8), [nix-env](/man/nix-env)(1), [nix](/man/nix)(1), [home-manager](/man/home-manager)(1)
