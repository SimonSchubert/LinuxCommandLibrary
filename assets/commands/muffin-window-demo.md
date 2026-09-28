# TAGLINE

demonstrates Muffin window types

# TLDR

**Run window demo**

```muffin-window-demo```

Run the demo on a **specific X display**

```muffin-window-demo --display=[:0]```

# SYNOPSIS

**muffin-window-demo** [_gtk-options_]

# PARAMETERS

**--display** _DISPLAY_
> X display to use (standard GTK option).

**--help**
> Display help information.

# DESCRIPTION

**muffin-window-demo** opens a sample application window whose **Windows** menu spawns every window type the window manager has to handle: dialogs, modal and parentless dialogs, utility windows, splash screens, docks on each screen edge, desktop, toolbar and menu windows, plus fullscreen and border-only variants.

It is used to test how Muffin (and Cinnamon themes) decorate, stack and place different EWMH window types. There are no program-specific options; window types are chosen from the menu, not on the command line.

# CAVEATS

Development tool. Cinnamon/Muffin specific, X11 only. The tool was removed from Muffin in **5.4** (2022) and is only shipped by older distributions such as Linux Mint 20 and earlier.

# HISTORY

muffin-window-demo was inherited from **metacity-window-demo** via Mutter when Linux Mint forked Mutter into **Muffin** in 2011 for the Cinnamon desktop.

# SEE ALSO

[muffin](/man/muffin)(1), [muffin-theme-viewer](/man/muffin-theme-viewer)(1), [cinnamon](/man/cinnamon)(1)

# RESOURCES

```[Source code](https://github.com/linuxmint/muffin)```

<!-- verified: 2026-09-29 -->
