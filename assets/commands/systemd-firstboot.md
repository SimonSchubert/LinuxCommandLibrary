# TAGLINE

Initialize basic system settings

# TLDR

Configure a **mounted image or chroot** rather than the running host

```sudo systemd-firstboot --root=[/mnt]```

Set **locale and keyboard** in one pass

```sudo systemd-firstboot --root=[/mnt] --locale=[en_US.UTF-8] --keymap=[us]```

Set the **hostname and timezone**

```sudo systemd-firstboot --root=[/mnt] --hostname=[myhost] --timezone=[Europe/Berlin]```

Set the root password from a **hash** rather than plaintext

```sudo systemd-firstboot --root=[/mnt] --root-password-hashed=[hash]```

Read the root password from a **file**

```sudo systemd-firstboot --root=[/mnt] --root-password-file=[path/to/password]```

Choose the **root account's shell**

```sudo systemd-firstboot --root=[/mnt] --root-shell=[/bin/bash]```

**Copy the host's** locale, keymap, timezone and root password into the image

```sudo systemd-firstboot --root=[/mnt] --copy```

Generate a **machine ID** for the image

```sudo systemd-firstboot --root=[/mnt] --setup-machine-id```

**Ask interactively** for anything not already configured

```sudo systemd-firstboot --prompt```

**Overwrite** settings that are already present

```sudo systemd-firstboot --root=[/mnt] --force --hostname=[myhost]```

**Clear** every setting systemd-firstboot manages

```sudo systemd-firstboot --root=[/mnt] --reset```

Leave the root account with an **empty password**

```sudo systemd-firstboot --root=[/mnt] --delete-root-password```

# SYNOPSIS

**systemd-firstboot** [_options_]

# PARAMETERS

**--root _path_**
> Operate on specified root directory

**--hostname _name_**
> Set the system hostname

**--keymap _map_**
> Set the keyboard layout

**--timezone _tz_**
> Set the system timezone

**--locale _locale_**
> Set the system locale

**--root-password _password_**
> Set root's password

**--root-shell _shell_**
> Set root's login shell

**--prompt**
> Prompt interactively for settings

**--force**
> Overwrite existing configuration

**--reset**
> Remove all firstboot configuration files

**--delete-root-password**
> Remove root password

# DESCRIPTION

**systemd-firstboot** initializes basic system settings on or before the first boot of a system. It is typically used when preparing OS images or system installations.

The tool can set hostname, locale, timezone, keyboard layout, and root password. When run without options on a live system, it interactively prompts for unconfigured settings.

# CAVEATS

Some settings require the **--force** flag to overwrite existing configuration. The **--root** option is essential when preparing disk images. Passwords should be provided securely. Part of the systemd suite.

# INSTALL

```apt: sudo apt install systemd```

```dnf: sudo dnf install systemd```

```pacman: sudo pacman -S systemd```

```zypper: sudo zypper install systemd```

```brew: brew install systemd```

```nix: nix profile install nixpkgs#systemd```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[localectl](/man/localectl)(1), [timedatectl](/man/timedatectl)(1), [hostnamectl](/man/hostnamectl)(1)
