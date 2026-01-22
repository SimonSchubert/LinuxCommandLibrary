# TLDR

**Swap** left-click and right-click on the pointer

```xmodmap -e 'pointer = 3 2 1'```

**Reassign** a key on the keyboard to another key

```xmodmap -e 'keycode [keycode] = [keyname]'```

**Disable** a key on the keyboard

```xmodmap -e 'keycode [keycode] ='```

**Execute** all expressions in a file

```xmodmap [path/to/file]```

# SYNOPSIS

**xmodmap** [_options_] [_filename_]

# PARAMETERS

**-e _expression_**
> Execute the given expression

**-pm**
> Print current modifier map

**-pk**
> Print current keymap table

**-pp**
> Print current pointer map

**-grammar**
> Print expression grammar

**-verbose**
> Verbose output

**-n**
> Show what would be done without applying

# DESCRIPTION

**xmodmap** modifies keymaps and pointer button mappings in X Window System. It can remap keys, swap modifier keys, and change mouse button behavior.

Common uses include swapping Caps Lock and Control, remapping special keys, or configuring multi-button mice. Changes are stored in memory and persist until the X session ends.

# CAVEATS

Changes are not persistent across X server restarts. For permanent changes, add xmodmap commands to **~/.xinitrc** or **~/.xprofile**. Use **xev** to find keycodes. Modern systems may prefer **setxkbmap** for keyboard configuration.

# SEE ALSO

[xev](/man/xev)(1), [setxkbmap](/man/setxkbmap)(1), [xkbcomp](/man/xkbcomp)(1)
