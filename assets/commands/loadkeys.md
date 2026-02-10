# TAGLINE

loads the kernel keymap for the Linux console

# TLDR

Load **keyboard layout**

```sudo loadkeys [en|de|dvorak]```

Load **default** keymap

```sudo loadkeys --default```

Load keymap for **specific console**

```sudo loadkeys -C /dev/ttyN [layout]```

Load from **file**

```sudo loadkeys -C /dev/ttyN [path/to/keymap]```

Create **binary** keymap

```loadkeys --bkeymap > [output.bmap]```

**Parse** keymap without loading

```loadkeys --parse [keymap]```

# SYNOPSIS

**loadkeys** [_options_] [_keymap_...]

# DESCRIPTION

**loadkeys** loads the kernel keymap for the Linux console. It reads keymap files and loads them into the kernel, changing the keyboard layout for virtual consoles.

# PARAMETERS

**-d, --default**
> Load default keymap

**-C, --console DEVICE**
> Target specific console device

**-m, --mktable**
> Output kernel source table

**-b, --bkeymap**
> Output binary keymap

**-p, --parse**
> Parse keymap without loading

**-q, --quiet**
> Suppress output messages

**-u, --unicode**
> Force Unicode mode

# CAVEATS

Only affects Linux virtual consoles, not X11 or Wayland. Requires root privileges. Changes are temporary and reset on reboot.

# SEE ALSO

[localectl](/man/localectl)(1), [setxkbmap](/man/setxkbmap)(1), [dumpkeys](/man/dumpkeys)(1)
