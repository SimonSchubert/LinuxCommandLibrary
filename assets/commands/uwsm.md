# TAGLINE

systemd session manager for standalone Wayland compositors

# TLDR

**Start** the default compositor session

```uwsm start default```

**Pick** a compositor from wayland-sessions, then start it

```uwsm select```

```uwsm start default```

**Launch** an app as its own systemd user unit

```uwsm app -- [firefox]```

**Launch** a desktop entry (optional action after a colon)

```uwsm app -- [org.mozilla.firefox.desktop]```

**Stop** the graphical session

```uwsm stop```

**Check** whether a login-shell autostart is appropriate

```uwsm check may-start```

# SYNOPSIS

**uwsm** [**-h**] _subcommand_ [_options_...]

# DESCRIPTION

**uwsm** (Universal Wayland Session Manager) wraps a standalone Wayland compositor in systemd user units. It handles environment export/cleanup, XDG autostart, binding the graphical session to the login session, and clean shutdown. Hyprland, Sway, Niri, labwc, wayfire, and mango have plugins.

**uwsm start** -- _compositor_ launches an executable, a **wayland-sessions** desktop-entry ID, **select**, or **default**. **uwsm app** starts programs as scopes (default) or services in **app-graphical.slice** so they are not children of the compositor unit. Omarchy includes **uwsm** in its base packages.

A typical TTY profile snippet is: **uwsm check may-start && uwsm select && exec uwsm start default**.

# COMMANDS

**start** [**--**] _compositor_ [_args_...]
> Generate units and start the compositor. Always put **--** before compositor flags.

**select**
> Interactive (whiptail) picker; saves the default compositor ID.

**stop** [**-r** [_compositor_]]
> Tear down the session. **-r** also removes generated units.

**app** [**-s** a|b|s] [**-t** scope|service] **--** {_cmd_|_entry.desktop_[:_action_]}
> Launch an app in **app-graphical**, **background-graphical**, or **session-graphical** slice.

**finalize** [_VAR_...]
> Export compositor-set variables (**WAYLAND_DISPLAY**, **DISPLAY**, extras) and notify systemd the compositor is ready.

**check may-start**
> Return success only if login-shell autostart conditions are met (tty, graphical.target, no existing session, ...).

# CAVEATS

Requires systemd. Do not exit the compositor with its native quit if you want an ordered unit shutdown; use **uwsm stop** or loginctl. **uwsm app** is Python-heavy; **uwsm-app** (optional) is a faster client. Plugins and unit layout can change across versions.

# INSTALL

```pacman: sudo pacman -S uwsm```

```zypper: sudo zypper install uwsm```

```nix: nix profile install nixpkgs#uwsm```

<!-- packages: 2026-08-29 -->

# SEE ALSO

[hyprland](/man/hyprland)(1), [systemctl](/man/systemctl)(1), [loginctl](/man/loginctl)(1)

# RESOURCES

```[Source code](https://github.com/Vladimir-csp/uwsm)```

```[Documentation](https://wiki.archlinux.org/title/Universal_Wayland_Session_Manager)```

<!-- verified: 2026-08-29 -->
