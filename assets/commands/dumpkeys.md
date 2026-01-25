# TLDR

**Dump current keymap**

```dumpkeys```

**Dump in full format**

```dumpkeys --full-table```

**Show only key definitions**

```dumpkeys --keys-only```

**Dump function key strings**

```dumpkeys --funcs-only```

**Output in C format**

```dumpkeys -c```

**Save keymap to file**

```dumpkeys > [keymap.map]```

# SYNOPSIS

**dumpkeys** [_options_]

# PARAMETERS

**-f**, **--full-table**
> Output all key bindings, not just modified.

**-k**, **--keys-only**
> Output only key bindings, not function strings.

**--funcs-only**
> Output only function key strings.

**-c**, **--cformat**
> Output in C source format.

**-1**, **--separate-lines**
> One action per line.

**-S** _shape_
> Output shape: 0, 1, or 2.

**-n**, **--numeric**
> Output keycodes numerically.

**-i**, **--short-info**
> Display kernel keymap information.

**-l**, **--long-info**
> Display detailed keymap information.

# DESCRIPTION

**dumpkeys** outputs the current keyboard translation tables used by the Linux console. The output format is compatible with **loadkeys**, allowing keymaps to be saved, modified, and restored.

The command reads from the kernel's keyboard driver and produces a keymap file showing what actions are bound to each key and modifier combination. This is used for console keyboard customization.

# OUTPUT FORMAT

```
keycode  28 = Return
keycode  57 = space
keycode  14 = Delete BackSpace
shift keycode  14 = Delete
```

# CAVEATS

Only works on Linux console, not X11 or Wayland. Requires access to console device. Output format varies with options. Virtual terminals share the same keymap. Use loadkeys to restore or modify keymaps.

# HISTORY

dumpkeys is part of the **kbd** package for Linux console keyboard utilities. It has been included in Linux distributions since the early **1990s** as a companion to loadkeys, providing a way to export and backup keyboard configurations.

# SEE ALSO

[loadkeys](/man/loadkeys)(1), [showkey](/man/showkey)(1), [setxkbmap](/man/setxkbmap)(1), [keymaps](/man/keymaps)(5)
