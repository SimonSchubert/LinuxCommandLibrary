# TAGLINE

Shows warning or error messages with buttons on Sway

# TLDR

**Show a simple warning** message

```swaynag -m "[Low battery]"```

**Show an error** (uses the red error style)

```swaynag -t error -m "[Disk full]"```

**Add a button** that runs a command

```swaynag -m "[Reboot required]" -b "[Reboot]" "[systemctl reboot]"```

**Read a detailed message from stdin** and show a toggle

```dmesg | swaynag -m "[Kernel messages]" -l```

**Anchor the bar at the bottom** of the screen

```swaynag -m "[Bottom notice]" -e bottom```

**Target a specific output**

```swaynag -m "[Hello]" -o [HDMI-A-1]```

**Use a custom config** file

```swaynag -c [path/to/config] -m "[Hi]"```

# SYNOPSIS

**swaynag** [_options..._]

# PARAMETERS

**-m**, **--message** _text_
> Message to display.

**-l**, **--detailed-message**
> Read a detailed message from standard input; adds a button that toggles the detailed text.

**-L**, **--detailed-button** _text_
> Text for the detailed-message toggle button (default: _Toggle details_).

**-t**, **--type** _name_
> Message type (_error_, _warning_, or a custom one defined in the config). Each type has its own colors.

**-e**, **--edge** _top|bottom_
> Screen edge on which to anchor (default: _top_).

**-y**, **--layer** _overlay|top|bottom|background_
> wlr-layer-shell layer used (default: _overlay_).

**-o**, **--output** _name_
> Name of the xdg_output on which to show the bar.

**-b**, **--button** _text_ _command_
> Add a button that runs _command_ in a terminal when pressed. Repeatable.

**-B**, **--button-no-terminal** _text_ _command_
> As **-b** but runs _command_ without a terminal.

**-z**, **--button-dismiss** _text_ _command_
> Button that runs _command_ and then dismisses swaynag.

**-Z**, **--button-dismiss-no-terminal** _text_ _command_
> Same as **-z** but without a terminal.

**-s**, **--dismiss-button** _text_
> Text for the dismiss (close) button (default: _X_).

**-f**, **--font** _font_
> Pango font description.

**-c**, **--config** _file_
> Load configuration from _file_.

**-v**, **--version**
> Print version and exit.

**-h**, **--help**
> Show help and exit.

# CONFIGURATION

**swaynag** loads the first readable file from:

```
$HOME/.swaynag/config
$XDG_CONFIG_HOME/swaynag/config
SYSCONFDIR/swaynag/config
```

Config files use INI-style sections. The section name corresponds to the value of **-t**/**--type**; **[<default>]** applies to all types. Typical keys control colors, borders, padding, fonts, layer, and default buttons. See **swaynag**(5) for the full schema.

# DESCRIPTION

**swaynag** is the **Sway** compositor's on-screen message dialog. It draws a bar across the top or bottom of a screen with a message, an optional detailed body, and optional buttons. Sway itself invokes **swaynag** to surface configuration errors or important warnings, but users and scripts may call it directly to display confirmations, reboot prompts, or custom alerts.

The tool uses the **wlr-layer-shell** protocol, so it is specific to Wayland compositors that implement that protocol (Sway and other wlroots-based compositors).

# HISTORY

**swaynag** is part of the **Sway** compositor, a tiling Wayland compositor compatible with i3. Sway was started by **Drew DeVault** in **2015**; **swaynag** was added as the replacement for the i3 nagbar that Sway historically launched for configuration errors.

# SEE ALSO

[sway](/man/sway)(1), [swaymsg](/man/swaymsg)(1), [swaybar](/man/swaybar)(5), [swaynag](/man/swaynag)(5)
