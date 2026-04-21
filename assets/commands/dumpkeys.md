# TAGLINE

console keyboard translation table dumper

# TLDR

**Dump current keymap**

```dumpkeys```

**Dump in full format**

```dumpkeys --full-table```

**Show only key definitions**

```dumpkeys --keys-only```

**Dump function key strings**

```dumpkeys --funcs-only```

**Output action codes numerically (hex)**

```dumpkeys -n```

**Save keymap to file**

```dumpkeys > [keymap.map]```

# SYNOPSIS

**dumpkeys** [_options_]

# PARAMETERS

**-f**, **--full-table**
> Output all key bindings in canonical form (keymaps line followed by rows for all modifier combinations).

**-1**, **--separate-lines**
> Write one line per (modifier, keycode) pair; prefix plain keycodes with "plain".

**-S** _shape_, **--shape**=_shape_
> Select output format: 2 (default), 4 (one line per keycode), 8 (one line per modifier-keycode), or 16 (stop at first gap).

**-n**, **--numeric**
> Output action codes in hexadecimal rather than symbolic notation.

**-t**, **--funcs-only**
> Output only function key string definitions.

**-k**, **--keys-only**
> Output only key bindings, excluding function strings.

**-d**, **--compose-only**
> Output only compose key combinations (requires kernel compose support).

**-c** _charset_, **--charset**=_charset_
> Interpret character codes using the given charset (iso-8859-1..iso-8859-9).

**-C** _dev_, **--console**=_dev_
> Target the specified console device.

**-i**, **--short-info**
> Display keyboard driver characteristics (keycode range, bindable actions, function key count).

**-l**, **-s**, **--long-info**
> Display long-form info: short-info plus a list of action symbols and values.

**-v**, **--verbose**
> Enable verbose output.

**-V**, **--version**
> Print version information and exit.

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

[loadkeys](/man/loadkeys)(1), [showkey](/man/showkey)(1), [setxkbmap](/man/setxkbmap)(1)
