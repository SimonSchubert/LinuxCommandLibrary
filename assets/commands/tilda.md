# TLDR

**Start Tilda terminal**

```tilda```

**Start with D-Bus support** for Wayland

```tilda --dbus```

**Toggle specific Tilda instance**

```tilda -T [0]```

**Start hidden**

```tilda --hidden```

**Use specific config file**

```tilda -c [~/.config/tilda/config_0]```

**Show version**

```tilda --version```

**Display help**

```tilda --help```

# SYNOPSIS

**tilda** [_options_]

# PARAMETERS

**--dbus**
> Enable D-Bus interface for window toggling.

**-T**, **--toggle** _n_
> Toggle visibility of instance n.

**--hidden**
> Start with window hidden.

**-c**, **--config** _file_
> Use specified configuration file.

**-C**
> Open configuration wizard (deprecated, use right-click menu).

**--version**
> Display version information.

**-h**, **--help**
> Display help information.

# KEYBOARD SHORTCUTS

**F1**: Pull down/up terminal (default hotkey)

**Shift+Ctrl+T**: Open new tab

**Shift+Ctrl+W**: Close current tab

**Shift+Ctrl+PageUp**: Move tab left

**Shift+Ctrl+PageDown**: Move tab right

**Shift+Ctrl+C**: Copy selected text

**Shift+Ctrl+V**: Paste clipboard

**Shift+Ctrl+F**: Search

**F11**: Toggle fullscreen

**F12**: Toggle transparency

**Shift+Ctrl+Q**: Quit Tilda

# DESCRIPTION

**Tilda** is a GTK-based drop-down terminal emulator for Linux. It slides down from the top of the screen when activated by a hotkey, similar to the console in Quake-style games.

The terminal supports tabs, transparency, customizable appearance, and can be configured to auto-hide when losing focus. Configuration is done through the preferences dialog accessible by right-clicking the terminal window.

Multiple Tilda instances can run simultaneously, each with its own configuration file (config_0, config_1, etc.) stored in ~/.config/tilda/. The D-Bus interface enables integration with desktop environments for global hotkey support, particularly useful on Wayland.

# CAVEATS

On Wayland, requires --dbus flag and desktop environment hotkey configuration. The first instance uses config_0. Global hotkey may conflict with other applications. Some transparency features require a compositing window manager.

# HISTORY

**Tilda** was inspired by the drop-down console found in first-person shooter games like Quake. It was created to provide quick terminal access without managing separate windows. The project continues to be maintained with support for modern features like Wayland compatibility.

# SEE ALSO

[guake](/man/guake)(1), [yakuake](/man/yakuake)(1), [gnome-terminal](/man/gnome-terminal)(1), [xterm](/man/xterm)(1)
