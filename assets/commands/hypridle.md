# TAGLINE

idle daemon for Hyprland that runs commands after inactivity

# TLDR

Start with the default **config**

```hypridle```

Start with a **specific** config file

```hypridle -c [path/to/hypridle.conf]```

Run with **verbose** logs

```hypridle -v```

Enable the user **systemd** unit (when Hyprland is started via uwsm)

```systemctl --user enable --now hypridle.service```

# SYNOPSIS

**hypridle** [_options_]

# PARAMETERS

**-c**, **--config** _file_
> Path to the configuration file.

**-v**, **--verbose**
> Verbose logging.

**-h**, **--help**
> Show help.

# DESCRIPTION

**hypridle** is Hyprland's idle management daemon. After a configured number of idle seconds it runs **on-timeout** commands (dim the screen, lock, DPMS off, suspend). When input resumes it runs **on-resume**. It also reacts to logind D-Bus lock/unlock and prepare-sleep events so the session can lock before suspend.

A config file is **required**; hypridle will not start without one. Add `hypridle` to Hyprland autostart, or enable **hypridle.service** if the session is started with uwsm.

# CONFIGURATION

Default path: **~/.config/hypr/hypridle.conf**.

**general** keys include **lock_cmd**, **unlock_cmd**, **before_sleep_cmd**, **after_sleep_cmd**, **ignore_dbus_inhibit**, **ignore_systemd_inhibit**, **ignore_wayland_inhibit**, and **inhibit_sleep** (0 disable, 1 wait for before_sleep_cmd, 2 auto, 3 wait until a lock screen holds the session).

Each **listener** needs **timeout** (seconds). Optional **on-timeout**, **on-resume**, **ignore_inhibit**, **condition_cmd** (run before on-timeout; exit 0 to fire), and **condition_retry** (re-check every N seconds while still idle).

```
general {
    lock_cmd = pidof hyprlock || hyprlock
    before_sleep_cmd = loginctl lock-session
}

listener {
    timeout = 300
    on-timeout = loginctl lock-session
}
```

**condition_cmd** runs on hypridle's event loop; keep it fast. Video players often hold a Wayland idle inhibit, which pauses every listener unless **ignore_inhibit** is set on that listener.

# CAVEATS

Needs a running Hyprland session and a valid config. Sleep inhibition depends on logind. Do not put blocking scripts in **condition_cmd**.

# HISTORY

Part of the Hyprland ecosystem (hyprwm).

# INSTALL

```pacman: sudo pacman -S hypridle```

```zypper: sudo zypper install hypridle```

```nix: nix profile install nixpkgs#hypridle```

<!-- packages: 2026-08-26 -->

# SEE ALSO

[hyprlock](/man/hyprlock)(1), [hyprland](/man/hyprland)(1), [hyprctl](/man/hyprctl)(1), [swayidle](/man/swayidle)(1)

# RESOURCES

```[Source code](https://github.com/hyprwm/hypridle)```

```[Documentation](https://wiki.hypr.land/Hypr-Ecosystem/hypridle/)```

<!-- verified: 2026-08-26 -->
