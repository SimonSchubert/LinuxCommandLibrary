# TLDR

**Start sway** from a TTY

```sway```

**Start with a custom configuration file**

```sway --config [path/to/config]```

**Validate the configuration file** without starting

```sway --validate```

**Start with verbose logging**

```sway --verbose```

**Start with debug output**

```sway --debug```

**Execute a command** after sway initializes

```sway --exec "[command]"```

**Start without executing** default session commands

```sway --no-exec```

# SYNOPSIS

**sway** [_-hcCdDvV_] [_-c config_] [_--exec command_]

# PARAMETERS

**-c**, **--config** _file_
> Use an alternative configuration file instead of the default (~/.config/sway/config).

**-C**, **--validate**
> Check the configuration file for syntax errors without starting the compositor.

**-d**, **--debug**
> Enable verbose debug logging for troubleshooting.

**-v**, **--verbose**
> Enable verbose logging output.

**-q**, **--quiet**
> Suppress all logging output to stderr.

**--exec** _command_
> Execute a shell command after sway has successfully initialized.

**--no-exec**
> Prevent execution of default session commands.

**--unsupported-gpu**
> Allow running on unsupported GPUs (required for NVIDIA with driver 495+).

**-V**, **--version**
> Display version information and exit.

**-h**, **--help**
> Display help message and exit.

# DESCRIPTION

**sway** is a tiling Wayland compositor and a drop-in replacement for the i3 window manager for X11. It works with existing i3 configuration files and supports most i3 features while running natively on Wayland.

Sway can be launched directly from a TTY or via a Wayland-compatible display manager. The configuration file is typically located at **~/.config/sway/config**, with the default template at **/etc/sway/config**. Sway communicates with clients via an IPC socket specified in the **SWAYSOCK** environment variable.

The compositor uses wlroots as its Wayland library and supports features like multiple outputs, workspaces, floating and tiling layouts, keyboard and mouse bindings, and integration with status bars like waybar and swaybar.

# CAVEATS

Proprietary NVIDIA drivers are not officially supported. For NVIDIA driver version 495 and later, sway may work with **--unsupported-gpu** flag after enabling kernel mode setting, but this is unsupported. Open-source drivers (Intel, AMD, nouveau) are recommended.

# HISTORY

Sway was created by **Drew DeVault** (SirCmpwn) and first released in **2016** as part of an effort to bring i3's workflow to Wayland. The name stands for "SirCmpwn's Wayland compositor". Sway reached version 1.0 stable in **March 2019**, marking feature parity with i3. It is built on the **wlroots** library, which Drew DeVault also created to provide a modular Wayland compositor library.

# SEE ALSO

[swaymsg](/man/swaymsg)(1), [swaybar](/man/swaybar)(5), [sway-input](/man/sway-input)(5), [i3](/man/i3)(1), [waybar](/man/waybar)(5)
