# TAGLINE

command-line control utility for Hyprland, a dynamic tiling Wayland compositor

# TLDR

**Reload** Hyprland configuration

```hyprctl reload```

Return the **active window** name

```hyprctl activewindow```

List all connected **input devices**

```hyprctl devices```

List all **workspaces** with properties

```hyprctl workspaces```

Call a **dispatcher**

```hyprctl dispatch [dispatcher]```

Set a **configuration keyword** dynamically

```hyprctl keyword [keyword] [value]```

Display **version**

```hyprctl version```

# SYNOPSIS

**hyprctl** [_command_] [_arguments_]

# PARAMETERS

**reload**
> Reload Hyprland configuration

**activewindow**
> Show active window information

**devices**
> List input devices

**workspaces**
> List workspaces

**monitors**
> List monitors and properties

**clients**
> List all windows/clients

**dispatch** _DISPATCHER_ [_ARGS_]
> Execute a dispatcher (window actions, workspace changes)

**keyword** _KEY_ _VALUE_
> Set configuration option at runtime

**setcursor** _THEME_ _SIZE_
> Set cursor theme and size

**switchxkblayout** _DEVICE_ _CMD_
> Switch keyboard layout (_CMD_ is `next`, `prev`, or a layout index)

**getoption** _SECTION.OPTION_
> Print the current value of a config option, e.g. `getoption general.border_size`

**layers**
> List layer-shell surfaces (bars, launchers, notifications, etc.)

**notify** _ICON_ _TIME_MS_ _COLOR_ _MESSAGE_
> Show an on-screen notification using Hyprland's built-in notification system

**seterror** _COLOR_ _MESSAGE_ | disable
> Set (or clear) a persistent error bar message

**eval** _LUA_
> Run a Lua expression against the Lua config API (e.g. `hl.dispatch(...)`), added alongside Hyprland's optional Lua config

**repl**
> Start an interactive Lua REPL for the same API used by **eval**

**output** create|remove _BACKEND_ [_NAME_]
> Add or remove a fake output (`wayland`, `headless`, or `auto` backend)

**--batch** _CMD1;CMD2;..._
> Execute multiple commands in one request, separated by semicolons - cuts down IPC round-trips versus many separate calls

**-j**
> Output in JSON format

**-r**
> Force a state refresh after issuing the command (e.g. after a layout or rule change)

**-i** _INSTANCE_
> Target a specific Hyprland instance (id or index from `hyprctl instances`) when more than one is running

# DESCRIPTION

**hyprctl** is the command-line control utility for Hyprland, a dynamic tiling Wayland compositor. It talks to the running compositor over its IPC socket to query state (monitors, workspaces, clients, devices) and to trigger actions at runtime, and is installed automatically alongside Hyprland.

Dispatchers control actions like moving windows, changing workspaces, and executing programs, invoked via `hyprctl dispatch <DISPATCHER> [ARGS]`. Common dispatchers include **exec**, **killactive**, **workspace**, **movewindow**, **fullscreen**, and **togglefloating**; see the Dispatchers page in the Hyprland wiki for the full list.

Runtime config values are read with **getoption** and set with **keyword** _SECTION.OPTION_ _VALUE_; changes made this way are lost on the next **reload** unless also written to the config file. Since Hyprland added optional Lua-based configuration (`hyprland.lua`), **hyprctl eval** and **hyprctl repl** expose the same Lua API (`hl.dispatch`, `hl.config`, etc.) for scripting, alongside the traditional **keyword**/**dispatch** interface which still works for `hyprland.conf`-based setups.

Because hyprctl calls are handled synchronously by the compositor, issuing many of them in quick succession (e.g. from a script) can cause visible stutter - use **--batch** to bundle several commands into a single request instead.

# CAVEATS

Only works when Hyprland is running, and talks only to the local Hyprland instance(s) via a Unix socket under `$XDG_RUNTIME_DIR/hypr`. Changes made via **keyword** don't persist across restarts or reloads unless also saved to the config file. The Lua config system (and thus **eval**/**repl**) is optional and only active if `~/.config/hypr/hyprland.lua` exists; otherwise Hyprland falls back to the classic `hyprland.conf`.

# HISTORY

hyprctl is part of the Hyprland project, a Wayland compositor created by **Vaxry**, first released in **2022** and known for its animations, dynamic tiling, and extensive customization. In **2026**, Hyprland 0.55 added an optional Lua configuration system, extending hyprctl with the **eval** and **repl** commands for scripting alongside its existing keyword/dispatch interface.

# INSTALL

```pacman: sudo pacman -S hyprland```

```apk: sudo apk add hyprland```

```zypper: sudo zypper install hyprland```

```nix: nix profile install nixpkgs#hyprland```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[hyprpaper](/man/hyprpaper)(1), [hyprshot](/man/hyprshot)(1), [swaymsg](/man/swaymsg)(1)

# RESOURCES

```[Source code](https://github.com/hyprwm/Hyprland)```

```[Homepage](https://hyprland.org)```

```[Documentation](https://wiki.hypr.land/Configuring/Advanced-and-Cool/Using-hyprctl/)```

<!-- verified: 2026-07-19 -->
