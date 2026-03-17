# TAGLINE

key remapping daemon for Linux using kernel-level input

# TLDR

**Start** and enable the keyd service

```systemctl enable keyd --now```

Display **keypress** information (monitor mode)

```sudo keyd monitor```

Display keypress events with **timestamps**

```sudo keyd monitor -t```

**Reload** configuration files

```sudo keyd reload```

**List** all valid key names

```keyd list-keys```

Create a **temporary binding**

```sudo keyd bind "[pressed_key] = [output_key]"```

**Reset** all temporary bindings

```sudo keyd bind reset```

**Input** text as if typed on the keyboard

```sudo keyd input "[text]"```

# SYNOPSIS

**keyd** [_options_] [_command_]

# PARAMETERS

**monitor** [**-t**]
> Display keypress information in real-time. If -t is supplied, also prints time since the last event in milliseconds.

**listen**
> Print layer state changes of the running keyd daemon to stdout. Useful for scripting.

**reload**
> Reset bindings and reload configuration from /etc/keyd.

**list-keys**
> Display all valid key names.

**bind** reset|_BINDING_ [_BINDING_...]
> Apply the supplied key bindings, or reset all bindings.

**input** [**-t** _timeout_] _text_ [_text_...]
> Input the supplied text as keyboard events. If no arguments are given, read from stdin. Timeout in microseconds sets delay between emitted events.

**-v**, **--version**
> Print the current version and exit.

**-h**, **--help**
> Print help and exit.

# DESCRIPTION

**keyd** is a key remapping daemon that operates at the kernel level using evdev. It allows remapping keys system-wide, independent of the display server (works with X11, Wayland, and virtual consoles).

Configuration files in /etc/keyd/ define key mappings, layers, and macros. The daemon intercepts input events and transforms them according to the configuration before passing them to applications. Features include layering, oneshot modifiers, and macros.

# CAVEATS

Requires root privileges for most operations. Configuration changes require a reload via `keyd reload`. Works at a lower level than X11 keymaps, so remappings apply everywhere including virtual consoles.

# HISTORY

keyd was developed as a modern, simple key remapping solution that works universally across display servers. It provides functionality similar to tools like xmodmap but operates at the kernel input level.

# SEE ALSO

[xmodmap](/man/xmodmap)(1), [setxkbmap](/man/setxkbmap)(1), [evtest](/man/evtest)(1), [systemctl](/man/systemctl)(1)
