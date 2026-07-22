# TAGLINE

translate a Linux keytable file into an xmodmap file

# TLDR

**Translate a Linux console keymap** to xmodmap format

```mk_modmap [keymap_file]```

**Save the output** to a file

```mk_modmap [keymap_file] > [keymap.xmodmap]```

**Translate with verbose** output

```mk_modmap -v [keymap_file]```

**Dump the current keymap** and convert it

```dumpkeys | mk_modmap```

# SYNOPSIS

**mk_modmap** [**-v**] _keymap_file_

# PARAMETERS

**-v**
> Verbose output during conversion.

_keymap_file_
> A Linux console keytable file (as produced by `dumpkeys` or shipped under `/usr/share/keymaps`).

# DESCRIPTION

**mk_modmap** translates a Linux console keytable file into a file that can be parsed by **xmodmap** and used within X11. The translated result is written to standard output. It requires the X11 header files to be installed at build time.

The tool is part of the **xkeycaps** package. Modern X.Org versions initialize their keymap from the active Linux keymap, so mk_modmap is rarely needed on contemporary systems.

# CAVEATS

X11 specific. Output for xmodmap. Not all console key actions have a direct xmodmap equivalent. Largely obsolete on modern X.Org and Wayland setups.

# HISTORY

mk_modmap ships with **xkeycaps**, originally written by Jamie Zawinski. It dates to early X11/Linux days when keyboard layouts were configured separately for the console and X server.

# INSTALL

```apt: sudo apt install kbd```

```dnf: sudo dnf install kbd```

```pacman: sudo pacman -S kbd```

```zypper: sudo zypper install kbd```

```nix: nix profile install nixpkgs#kbd```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[xmodmap](/man/xmodmap)(1), [xev](/man/xev)(1), [setxkbmap](/man/setxkbmap)(1)
