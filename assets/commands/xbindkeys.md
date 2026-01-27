# TLDR

**Start xbindkeys**

```xbindkeys```

**Generate default config file**

```xbindkeys --defaults > ~/.xbindkeysrc```

**Identify key codes interactively**

```xbindkeys -k```

**Identify multi-key combinations**

```xbindkeys -mk```

**Show current bindings**

```xbindkeys -s```

**Reload configuration**

```killall -HUP xbindkeys```

**Use specific config file**

```xbindkeys -f [~/.config/xbindkeysrc]```

# SYNOPSIS

**xbindkeys** [_options_]

# PARAMETERS

**-d**, **--defaults**
> Print default configuration to stdout.

**-f**, **--file** _file_
> Use specified configuration file.

**-k**, **--key**
> Identify a key (press key in window).

**-mk**, **--multikey**
> Identify multi-key combination.

**-s**, **--show**
> Show current key bindings.

**-n**, **--nodaemon**
> Don't run as daemon.

**-v**, **--verbose**
> Verbose mode.

**-h**, **--help**
> Display help.

**-V**, **--version**
> Display version.

# CONFIGURATION

Config file syntax (~/.xbindkeysrc):
```
"command"
    modifier + key

# Example: Volume up
"pactl set-sink-volume @DEFAULT_SINK@ +5%"
    XF86AudioRaiseVolume

# Example: Screenshot
"scrot"
    Print
```

# MODIFIERS

**Control**, **Shift**, **Mod1** (Alt), **Mod2** (NumLock), **Mod3** (CapsLock), **Mod4** (Super/Win), **Mod5** (Scroll Lock), **Release** (trigger on key release)

# DESCRIPTION

**xbindkeys** binds keys or key combinations to shell commands in X11. It works independently of window managers, making it useful for global hotkeys including multimedia keys.

Use `xbindkeys -k` to identify key names interactively. Press the desired key in the popup window to see its name and keycode.

Configuration is read from ~/.xbindkeysrc by default. The daemon monitors the config file and reloads automatically when modified. Send SIGHUP to force reload.

For complex setups, xbindkeys supports Guile Scheme configuration via ~/.xbindkeysrc.scm.

# CAVEATS

X11 only; won't work under Wayland. Some keys may be grabbed by other applications. Key names can be found in /usr/include/X11/keysymdef.h. Multimedia keys require proper kernel/X configuration.

# HISTORY

**xbindkeys** was created to provide a window-manager-independent way to bind keys to commands. It fills the gap for desktop environments and window managers that lack built-in hotkey configuration.

# SEE ALSO

[xev](/man/xev)(1), [xmodmap](/man/xmodmap)(1), [sxhkd](/man/sxhkd)(1), [xdotool](/man/xdotool)(1)
