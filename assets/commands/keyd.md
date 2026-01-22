# TLDR

**Start** and enable the keyd service

```systemctl enable keyd --now```

Display **keypress** information (monitor mode)

```sudo keyd -m```

**Reload** configuration files

```sudo keyd reload```

**List** all valid key names

```keyd list-keys```

**Check** configuration files for errors

```keyd check```

Create a **temporary binding**

```sudo keyd bind "[pressed_key] = [output_key]"```

# SYNOPSIS

**keyd** [_options_] [_command_]

# PARAMETERS

**-m**, **monitor**
> Display keypress information in real-time

**reload**
> Reset bindings and reload configuration from /etc/keyd

**list-keys**
> Display all valid key names

**check**
> Validate configuration files for syntax errors

**bind** _BINDING_
> Create a temporary key binding

# DESCRIPTION

**keyd** is a key remapping daemon that operates at the kernel level using evdev. It allows remapping keys system-wide, independent of the display server (works with X11, Wayland, and virtual consoles).

Configuration files in /etc/keyd define key mappings, layers, and macros. The daemon intercepts input events and transforms them according to the configuration before passing them to applications.

# CAVEATS

Requires root privileges for most operations. Configuration changes require reload. Works at a lower level than X11 keymaps, so remappings apply everywhere.

# HISTORY

keyd was developed as a modern, simple key remapping solution that works universally across display servers. It provides functionality similar to tools like xmodmap but operates at the kernel input level.

# SEE ALSO

[xmodmap](/man/xmodmap)(1), [setxkbmap](/man/setxkbmap)(1), [evtest](/man/evtest)(1)
