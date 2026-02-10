# TAGLINE

input method framework for Linux

# TLDR

**Start IBus daemon**

```ibus-daemon -drx```

**List available engines**

```ibus list-engine```

**Restart daemon**

```ibus restart```

**Open preferences**

```ibus-setup```

**Read current engine**

```ibus read-config```

# SYNOPSIS

**ibus** _command_ [_options_]

# PARAMETERS

_COMMAND_
> IBus command.

**list-engine**
> List input engines.

**restart**
> Restart daemon.

**read-config**
> Show configuration.

**write-config**
> Write configuration.

**--help**
> Display help information.

# DESCRIPTION

**IBus** (Intelligent Input Bus) is an input method framework for Linux. It enables typing in languages requiring complex input like CJK.

The framework manages input method engines and provides a unified interface. It supports many languages and input systems.

# CAVEATS

Desktop integration needed. Engine selection required. X11/Wayland support varies.

# HISTORY

IBus was created by **Peng Huang** as the next-generation input framework for Linux, replacing SCIM.

# SEE ALSO

[ibus-daemon](/man/ibus-daemon)(1), [ibus-setup](/man/ibus-setup)(1), [fcitx](/man/fcitx)(1)
