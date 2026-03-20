# TAGLINE

load keyboard translation tables for the console

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

**loadkeys** reads keymap files and loads the keyboard translation tables into the kernel, changing the keyboard layout for virtual consoles.

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
> Suppress all normal output

**-u, --unicode**
> Force Unicode mode

**-a, --ascii**
> Force conversion to ASCII

**-s, --clearstrings**
> Clear kernel string table

**-c, --clearcompose**
> Clear kernel accent table

**-t, --tkeymap** _[shape]_
> Output a text keymap (optional shape: 2, 4, 8, 16)

**-V, --version**
> Display version number and exit

# CAVEATS

Only affects Linux virtual consoles, not X11 or Wayland. Changes apply to all virtual consoles simultaneously and persist until reboot. Anyone with read access to /dev/console can run loadkeys.

# SEE ALSO

[dumpkeys](/man/dumpkeys)(1), [showkey](/man/showkey)(1), [setxkbmap](/man/setxkbmap)(1), [localectl](/man/localectl)(1)
