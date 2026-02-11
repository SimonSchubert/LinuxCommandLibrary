# TAGLINE

Configure X11 keyboard layouts

# TLDR

Set the keyboard layout to **French AZERTY**

```setxkbmap fr```

Set **multiple layouts** with switching option

```setxkbmap -layout us,de -variant ,qwerty -option 'grp:alt_caps_toggle'```

**Query** current keyboard settings

```setxkbmap -query```

Set keyboard **model**

```setxkbmap -model pc105 -layout us```

**Print** keymap components without applying

```setxkbmap -layout us -print```

Set layout for a specific **input device**

```setxkbmap -device [device_id] -layout [layout]```

# SYNOPSIS

**setxkbmap** [_args_] [_layout_ [_variant_ [_option_...]]]

# PARAMETERS

**-layout** _name_
> Specifies layout name (comma-separated for multiple layouts)

**-variant** _name_
> Specifies layout variant (comma-separated, matching layout order)

**-model** _name_
> Specifies keyboard model (e.g., pc104, pc105, thinkpad)

**-option** _name_
> Specifies XKB option (can be used multiple times)

**-device** _device_
> Numeric device ID to update (default: core keyboard)

**-display** _display_
> X display to update

**-config** _file_
> XKB configuration file describing keyboard

**-rules** _file_
> Rules file for resolving layout to components

**-query**
> Display current rules, model, layout, variant, and options

**-print**
> Output component names in xkbcomp format, then exit

**-I** _directory_
> Add directory to search path for layout files

**-v, -verbose** [_level_]
> Set verbosity level (0-10, default 5)

**-help**
> Display usage information

**-version**
> Print program version

# DESCRIPTION

**setxkbmap** configures keyboard layouts for the X Window System using the X Keyboard Extension (XKB). It builds keymaps from components stored in **/usr/share/X11/xkb** and applies them to the current X session.

The command supports multiple keyboard layouts that can be switched using configurable key combinations (options). Common switching options include **grp:alt_shift_toggle**, **grp:caps_toggle**, and **grp:win_space_toggle**.

# CONFIGURATION

**/usr/share/X11/xkb/**
> System XKB data directory containing layout definitions, rules, symbols, and keycodes.

**/etc/X11/xorg.conf.d/**
> Drop-in configuration directory for persistent keyboard layout settings via X.Org.

# CAVEATS

Changes are session-only and do not persist across X restarts. For permanent changes, configure through desktop environment settings, **/etc/X11/xorg.conf.d/**, or systemd's **localectl**. Does not work in Wayland sessions; use compositor-specific tools instead. Layout names vary by distribution.

# HISTORY

**setxkbmap** is part of the X Keyboard Extension (XKB), which was developed in the mid-**1990s** to replace the older core X keyboard protocol. XKB was integrated into XFree86 and later X.Org, becoming the standard keyboard configuration mechanism for X11. The tool is maintained as part of the **xorg-x11-xkb-utils** package.

# SEE ALSO

[xkbcomp](/man/xkbcomp)(1), [localectl](/man/localectl)(1), [loadkeys](/man/loadkeys)(1), [xmodmap](/man/xmodmap)(1)
