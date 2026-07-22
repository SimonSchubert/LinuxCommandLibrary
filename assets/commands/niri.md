# TAGLINE

Scrollable-tiling Wayland compositor

# TLDR

**Start** the compositor

```niri```

**Start as a desktop session** (imports environment into systemd and D-Bus)

```niri --session```

**Use an alternate config** file

```niri -c [path/to/config.kdl]```

**Validate** the configuration file

```niri validate```

**Query the running instance** for connected outputs

```niri msg outputs```

**Run a bound action** in the running instance

```niri msg action [action-name]```

**List windows** as machine-readable JSON

```niri msg --json windows```

# SYNOPSIS

**niri** [_-c config_] [_--session_] [_subcommand_]

# DESCRIPTION

**niri** is a scrollable-tiling Wayland compositor. Instead of squeezing windows onto a fixed grid, it arranges them in columns on an infinitely wide horizontal strip: opening a new window never resizes the others, you just scroll to it. Each monitor has its own independent strip and set of dynamic workspaces stacked vertically.

Running **niri** on a TTY starts the compositor directly. Inside an existing session it is usually launched as **niri --session**, which exports the Wayland and display environment to systemd and D-Bus so that portals and user services work. A running instance can be inspected and controlled over its IPC socket with the **niri msg** subcommand, which reports outputs, workspaces, and windows and can trigger any of niri's built-in actions.

# PARAMETERS

**-c** _PATH_, **--config** _PATH_
> Load configuration from _PATH_ instead of the default location.

**--session**
> Start as a session: set up the environment and integrate with systemd and D-Bus.

**validate**
> Check the configuration file for errors and exit.

**msg** _SUBCOMMAND_
> Communicate with the running niri instance (outputs, workspaces, windows, focused-window, focused-output, action, keyboard-layouts, version, event-stream).

**msg --json** _SUBCOMMAND_
> Emit the reply as JSON for scripting.

**panic**
> Deliberately trigger a panic, used for testing crash handling.

# CONFIGURATION

niri reads a KDL configuration file from **$XDG_CONFIG_HOME/niri/config.kdl** (falling back to **~/.config/niri/config.kdl**). The file defines key bindings, input devices, output layout, window rules, and animations, and is reloaded live whenever it changes on disk.

# HISTORY

**niri** was created by **Ivan Molodetskikh** (YaLTeR) and first released in **2023**. It is written in **Rust** on top of the Smithay compositor toolkit and is distributed under the **GPL-3.0** license. Its column-based "scrollable tiling" model is inspired by the PaperWM extension for GNOME.

# INSTALL

```dnf: sudo dnf install niri```

```pacman: sudo pacman -S niri```

```apk: sudo apk add niri```

```zypper: sudo zypper install niri```

```nix: nix profile install nixpkgs#niri```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[sway](/man/sway)(1), [hyprland](/man/hyprland)(1), [swaymsg](/man/swaymsg)(1), [weston](/man/weston)(1)

# RESOURCES

```[Source code](https://github.com/YaLTeR/niri)```

```[Documentation](https://niri-wm.github.io/niri/)```

<!-- verified: 2026-06-10 -->
