# TAGLINE

loads output character translation maps

# TLDR

**Load a screen mapping table**

```mapscrn [mapfile]```

**Load from the standard map directory** (resolved under /usr/{share,lib}/kbd/consoletrans)

```mapscrn [trivial]```

**Save the current mapping table** to a file before loading a new one

```mapscrn -o [old-map.bin] [new-map]```

**Reset to the trivial (identity) map**

```mapscrn trivial```

**Apply the map on a specific console**

```mapscrn -C /dev/tty3 [mapfile]```

# SYNOPSIS

**mapscrn** [_options_] _mapfile_

# PARAMETERS

_MAPFILE_
> Screen mapping table to load. Either an absolute path or a name resolved under the kbd consoletrans directory (e.g. **/usr/share/kbd/consoletrans/**). Files may be 256-byte binary, 512-byte (Unicode) binary, or a textual mapping.

**-o** _FILE_, **--output**=_FILE_
> Save the previous mapping table to _FILE_ before loading the new one.

**-C** _DEV_, **--console**=_DEV_
> Apply the change to the named console device (default: current TTY).

**-v**, **--verbose**
> Verbose output.

**-V**, **--version**
> Print version and exit.

**-h**, **--help**
> Print usage and exit.

# DESCRIPTION

**mapscrn** loads a screen output character mapping table for the Linux text console. The table tells the kernel how to translate the bytes written to **/dev/tty**_n_ into glyph indices in the currently loaded console font. Together with **loadkeys** (input mapping) and **setfont** (glyphs), it controls the legacy 8-bit console pipeline.

To return to the identity mapping, load the **trivial** table (e.g. **mapscrn trivial**); there is no dedicated "clear" flag.

# CAVEATS

The functionality of **mapscrn** is now built into **setfont** — modern kbd installations keep **mapscrn** only for backwards compatibility. The command applies only to Linux text VTs (not to terminal emulators or framebuffer terminals such as **fbterm**). On UTF-8 consoles it is rarely needed; load a Unicode map (**-u** to **setfont**) instead. Requires sufficient privileges to write to the console.

# HISTORY

**mapscrn** is part of the **kbd** package, the standard Linux console keyboard and character utilities maintained by Alexey Gladkov and others.

# INSTALL

```apt: sudo apt install kbd```

```dnf: sudo dnf install kbd```

```pacman: sudo pacman -S kbd```

```apk: sudo apk add kbd```

```zypper: sudo zypper install kbd```

```nix: nix profile install nixpkgs#kbd```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[setfont](/man/setfont)(8), [loadkeys](/man/loadkeys)(1), [showconsolefont](/man/showconsolefont)(8)

