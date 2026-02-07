# TAGLINE

input method framework

# TLDR

**Start fcitx**

```fcitx```

**Start in daemon** mode

```fcitx -d```

**Restart fcitx**

```fcitx -r```

**Replace existing instance**

```fcitx --replace```

**Show version**

```fcitx -v```

# SYNOPSIS

**fcitx** [_options_]

# PARAMETERS

**-d**, **--daemon**
> Run as daemon (background).

**-r**, **--replace**
> Replace existing instance.

**-D**, **--disable**
> Disable addon loading.

**-s**, **--enable**
> Enable specific addon.

**-v**, **--version**
> Display version information.

**--help**
> Display help information.

# DESCRIPTION

**fcitx** (Flexible Context-aware Input Tool with eXtension) is an input method framework for entering non-Latin characters. It supports Chinese, Japanese, Korean, and many other languages through various input method engines.

The framework provides a modular architecture with addons for different input methods like Pinyin, Wubi, Hangul, and Anthy. It integrates with desktop environments through GTK and Qt input modules.

fcitx handles input method switching, candidate selection, and provides a configurable user interface for text entry.

# CONFIGURATION

**~/.config/fcitx/**
> User configuration files for input methods, hotkeys, and addons.

**/usr/share/fcitx/**
> System-wide input method data and addon files.

# CAVEATS

Requires environment variables set correctly. May conflict with other input frameworks. Desktop integration depends on toolkit support.

# HISTORY

fcitx was created by **Yuking** in 2002 as a Chinese input method for Linux. It evolved into a general-purpose input method framework, with **fcitx5** being the modern rewrite with improved architecture.

# SEE ALSO

[fcitx5](/man/fcitx5)(1), [ibus](/man/ibus)(1), [fcitx-configtool](/man/fcitx-configtool)(1)
