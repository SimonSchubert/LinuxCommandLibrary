# TAGLINE

drop-down terminal for GNOME that provides quick access to a terminal

# TLDR

**Toggle** Guake visibility

```F12```

Toggle **fullscreen** mode

```F11```

Open a **new tab**

```Ctrl+Shift+T```

**Close** the terminal

```Super+X```

Go to the **previous tab**

```Ctrl+PageUp```

**Search** selected text in browser

```Ctrl+Shift+L```

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

# SEE ALSO

[yakuake](/man/yakuake)(1), [tilda](/man/tilda)(1), [gnome-terminal](/man/gnome-terminal)(1)

# RESOURCES

```[Homepage](https://guake.github.io/)```

```[Source code](https://github.com/Guake/guake)```

```[Documentation](https://guake.readthedocs.io/en/latest/)```

<!-- verified: 2026-07-17 -->
