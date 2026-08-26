# TAGLINE

GPU-accelerated screen locker for Hyprland

# TLDR

Lock using the **default** config search path

```hyprlock```

Lock with an explicit **config** file

```hyprlock -c [path/to/hyprlock.conf]```

Skip the **grace** period and require a password immediately

```hyprlock --grace 0```

Disable the **fade-in** animation

```hyprlock --no-fade-in```

Unlock from another TTY (**SIGUSR1**)

```pkill -USR1 hyprlock```

# SYNOPSIS

**hyprlock** [_options_]

# PARAMETERS

**-c**, **--config** _file_
> Config file to use.

**--display** _name_
> Wayland display to connect to.

**--grace** _seconds_
> Seconds during which moving the mouse or typing unlocks without a password.

**--immediate-render**
> Draw the background immediately (same as `general:immediate_render`).

**--no-fade-in**
> Skip the fade-in animation.

**-v**, **--verbose**
> Verbose logging.

**-q**, **--quiet**
> Disable logging.

**-V**, **--version**
> Print version and exit.

**-h**, **--help**
> Show help.

# DESCRIPTION

**hyprlock** is Hyprland's multi-threaded, GPU-accelerated session lock. Layout is entirely widget-based (background, input-field, label, image, shape) in **hyprlock.conf**. Authentication uses PAM (`auth:pam:module`, default **hyprlock**, falling back to **su**) and optionally **fprintd** fingerprints.

Config is loaded from the first match of `$XDG_CONFIG_HOME/hypr/hyprlock.conf`, `~/.config/hypr/hyprlock.conf`, `$XDG_CONFIG_DIRS/hypr/hyprlock.conf`, then `/etc/xdg/hypr/hyprlock.conf`.

**ESC**, **Ctrl+u**, and **Ctrl+Backspace** clear the password buffer. Hyprland binds with flag **l** still work while locked (volume, brightness). **SIGUSR1** unlocks; **SIGUSR2** refreshes labels and images.

# CAVEATS

If no config file is found, hyprlock **exits with an error and does not lock**. Keep an example config in place. PAM faillock on Arch can impose a 10-minute lockout after three failures (`/etc/security/faillock.conf`). Fingerprint auth needs fprintd. At least one auth method must be enabled.

# HISTORY

Part of the Hyprland ecosystem (hyprwm).

# INSTALL

```pacman: sudo pacman -S hyprlock```

```zypper: sudo zypper install hyprlock```

```nix: nix profile install nixpkgs#hyprlock```

<!-- packages: 2026-08-26 -->

# SEE ALSO

[hypridle](/man/hypridle)(1), [hyprland](/man/hyprland)(1), [swaylock](/man/swaylock)(1)

# RESOURCES

```[Source code](https://github.com/hyprwm/hyprlock)```

```[Documentation](https://wiki.hypr.land/Hypr-Ecosystem/hyprlock/)```

<!-- verified: 2026-08-26 -->
