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

**guake** [_options_]

# PARAMETERS

**-t**, **--toggle-visibility**
> Toggle visibility from command line

**-n**, **--new-tab** _DIR_
> Add new tab, optionally with working directory

**-s**, **--select-tab** _INDEX_
> Select tab by index

**-e**, **--execute-command** _CMD_
> Execute command in the terminal

**-r**, **--rename-tab** _NAME_
> Rename current tab

**--show-preferences**
> Open preferences window

**-q**, **--quit**
> Quit Guake

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

guake was inspired by the drop-down console in id Software's Quake game and similar terminals like Yakuake (KDE) and Tilda. It was first released around **2007** for the GNOME desktop environment.

# SEE ALSO

[yakuake](/man/yakuake)(1), [tilda](/man/tilda)(1), [gnome-terminal](/man/gnome-terminal)(1)
