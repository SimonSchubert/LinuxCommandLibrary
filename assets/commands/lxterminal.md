# TAGLINE

lightweight terminal emulator designed for the LXDE desktop environment

# TLDR

Open **terminal** window

```lxterminal```

Run **command** and exit

```lxterminal -e "[command]"```

Open with **multiple tabs**

```lxterminal --tabs=[tab1,tab2,tab3]```

Open with **title**

```lxterminal --title=[title]```

Set **working directory**

```lxterminal --working-directory=[path/to/dir]```

# SYNOPSIS

**lxterminal** [_options_]

# DESCRIPTION

**lxterminal** is a lightweight terminal emulator designed for the LXDE desktop environment. It supports tabs, customizable appearance, and command execution.

# PARAMETERS

**-e, --command COMMAND**
> Execute command in terminal

**--tabs=TAB1,TAB2,...**
> Open with named tabs

**--title=TITLE**
> Set window title

**--working-directory=DIR**
> Set working directory

**--geometry=WxH**
> Window geometry

**-?, --help**
> Display help information

# CAVEATS

Part of LXDE desktop. Lightweight alternative to gnome-terminal or konsole.

# INSTALL

```apt: sudo apt install lxterminal```

```dnf: sudo dnf install lxterminal```

```pacman: sudo pacman -S lxterminal```

```apk: sudo apk add lxterminal```

```zypper: sudo zypper install lxterminal```

```nix: nix profile install nixpkgs#lxterminal```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[xterm](/man/xterm)(1), [gnome-terminal](/man/gnome-terminal)(1), [konsole](/man/konsole)(1)
