# TAGLINE

modern input method framework

# TLDR

**Start fcitx5** input method daemon

```fcitx5```

**Start in daemon mode** (background)

```fcitx5 -d```

**Start with verbose output** for debugging

```fcitx5 -v```

**Replace an existing fcitx5** instance

```fcitx5 -r```

**Display version** information

```fcitx5 --version```

# SYNOPSIS

**fcitx5** [**-drvh**] [**--replace**] [**--verbose**]

# PARAMETERS

**-d**, **--daemon**
> Run as a background daemon.

**-r**, **--replace**
> Replace an existing fcitx5 instance.

**-v**, **--verbose**
> Enable verbose output for debugging.

**-h**, **--help**
> Display help message.

**--version**
> Display version information.

# DESCRIPTION

**Fcitx5** is a flexible input method framework for Unix-like systems, primarily used for entering Chinese, Japanese, Korean (CJK), and other languages requiring complex input methods. It is the successor to Fcitx and features a modular, plugin-based architecture.

The framework provides a lightweight core with additional language support via addons. Input method engines for various languages can be installed separately (e.g., fcitx5-chinese-addons for Chinese, fcitx5-anthy for Japanese, fcitx5-hangul for Korean).

For proper operation, environment variables should be set in the desktop session:

```
XMODIFIERS=@im=fcitx
GTK_IM_MODULE=fcitx
QT_IM_MODULE=fcitx
```

Fcitx5 supports both X11 and Wayland, with native Wayland text-input protocol support for better integration.

# CONFIGURATION

**~/.config/fcitx5/**
> User configuration directory containing profile settings, input method configurations, and addon settings.

**~/.local/share/fcitx5/**
> User data directory for themes, dictionaries, and custom data.

**/etc/xdg/fcitx5/**
> System-wide configuration directory.

# CAVEATS

Different desktop environments may require different configuration methods for autostart and environment variables. On Wayland, the native text-input protocol is preferred over legacy input method modules. Some applications may require the GTK or Qt IM modules for proper input method support.

# HISTORY

Fcitx (Flexible Context Input X) was originally developed for Chinese input on Linux. **Fcitx5** is a complete rewrite released under LGPL-2.1+, offering improved architecture, better Wayland support, and enhanced extensibility. The modular design allows input methods, themes, and features to be added as independent plugins.

# SEE ALSO

[fcitx5-configtool](/man/fcitx5-configtool)(1), [ibus](/man/ibus)(1), [ibus-daemon](/man/ibus-daemon)(1)
