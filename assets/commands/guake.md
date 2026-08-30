# TAGLINE

drop-down terminal for GNOME that provides quick access to a terminal

# TLDR

Toggle the drop-down terminal with the **default key**

```F12```

Toggle it from a **script or another binding**

```guake --toggle-visibility```

**Show** it without toggling

```guake --show```

**Hide** it

```guake --hide```

Ask whether it is **currently visible**

```guake --is-visible```

Open a **new tab** in a given directory

```guake --new-tab [path/to/directory]```

**Run a command** in the current tab

```guake --execute-command "[command]"```

**Switch to a tab** by its index

```guake --select-tab [2]```

**Rename** the current tab

```guake --rename-current-tab "[title]"```

Split the current terminal **side by side**

```guake --split-vertical```

Split it **top and bottom**

```guake --split-horizontal```

Open the **preferences** window

```guake --preferences```

**Save the current settings** to a file

```guake --save-preferences [path/to/preferences]```

**Quit** guake entirely

```guake --quit```

# SYNOPSIS

**guake** [_options_] [_path_]

# PARAMETERS

**-t**, **--toggle-visibility**
> Toggle visibility from command line.

**-n**, **--new-tab** _DIR_
> Add a new tab, optionally with working directory set to DIR.

**-s**, **--select-tab** _INDEX_
> Select tab by index.

**-e**, **--execute-command** _CMD_
> Execute an arbitrary command in a new tab.

**-r**, **--rename-current-tab** _TITLE_
> Rename the current tab. Reset to default if TITLE is "-".

**-p**, **--preferences**
> Show Guake preferences window.

**-f**, **--fullscreen**
> Put Guake in fullscreen mode.

**--show**, **--hide**
> Force show or hide the main window.

**-V**, **--version**
> Show Guake version number and exit.

**-q**, **--quit**
> Quit Guake.

# DESCRIPTION

**guake** is a drop-down terminal for GNOME that provides quick access to a terminal by pressing a hotkey (F12 by default). The terminal slides down from the top of the screen like a heads-up display, inspired by the console in Quake games.

Features include tabbed interface, transparency, custom colors, and persistent sessions across toggle operations. The terminal stays resident in memory for instant access.

Configuration is available through the preferences dialog or gsettings.

# KEYBOARD SHORTCUTS

**F12** - Toggle visibility
**F11** - Toggle fullscreen
**Ctrl+Shift+T** - New tab
**Ctrl+Shift+W** - Close tab
**Ctrl+PageUp/PageDown** - Navigate tabs

# CAVEATS

Works best with compositing enabled. May have issues on some window managers. Conflicts with other applications using F12. Requires GTK and VTE libraries.

# HISTORY

guake was created by **Gabriel Falcão** in **2007**, originally hosted on SourceForge, and inspired by the drop-down console in id Software's Quake game and similar terminals like Yakuake (KDE) and Tilda. It has since moved to GitHub and is maintained by a community of contributors.

# INSTALL

```dnf: sudo dnf install guake```

```pacman: sudo pacman -S guake```

```zypper: sudo zypper install guake```

```nix: nix profile install nixpkgs#guake```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[yakuake](/man/yakuake)(1), [tilda](/man/tilda)(1), [gnome-terminal](/man/gnome-terminal)(1)

# RESOURCES

```[Homepage](https://guake.github.io/)```

```[Source code](https://github.com/Guake/guake)```

```[Documentation](https://guake.readthedocs.io/en/latest/)```

<!-- verified: 2026-07-17 -->
