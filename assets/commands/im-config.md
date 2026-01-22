# TLDR

**Configure input method**

```im-config```

**List available methods**

```im-config -l```

**Set input method**

```im-config -n [ibus]```

**Show current method**

```im-config -c```

**Reset to auto**

```im-config -a```

# SYNOPSIS

**im-config** [_options_]

# PARAMETERS

**-l**
> List available methods.

**-n** _METHOD_
> Set input method.

**-c**
> Show current setting.

**-a**
> Auto-detect method.

**-x**
> X mode (GUI).

**--help**
> Display help information.

# DESCRIPTION

**im-config** configures input method framework for Linux desktops. It selects between IBus, Fcitx, SCIM, and other input systems.

The tool manages X startup scripts for input method activation. It's used for setting up multilingual input.

im-config selects input method framework.

# CAVEATS

Debian/Ubuntu tool. Session restart needed. Desktop-specific behavior.

# HISTORY

im-config is a Debian tool for managing input method configuration.

# SEE ALSO

[ibus](/man/ibus)(1), [fcitx](/man/fcitx)(1), [im-launch](/man/im-launch)(1)
