# TAGLINE

input method framework for Linux

# TLDR

**Start IBus daemon**

```ibus-daemon -drx```

**List available input engines**

```ibus list-engine```

**Show current input engine**

```ibus engine```

**Set the current input engine**

```ibus engine [engine_name]```

**Restart the IBus daemon**

```ibus restart```

**Show IBus version**

```ibus version```

**Print current configuration**

```ibus read-config```

# SYNOPSIS

**ibus** _command_ [_options_]

# PARAMETERS

_COMMAND_
> IBus subcommand to execute.

**list-engine**
> Show available input engines.

**engine** [_ENGINE_NAME_]
> Show current engine, or set engine to ENGINE_NAME.

**start**
> Start the IBus daemon.

**restart**
> Restart the IBus daemon.

**exit**
> Exit the IBus daemon.

**version**
> Show the IBus version.

**read-config**
> Print configuration values.

**reset-config**
> Reset configuration to defaults.

**read-cache**
> Show the registry cache.

**write-cache**
> Save the registry cache.

**emoji**
> Launch IBus Emojier.

**help**
> Show the commands list.

# DESCRIPTION

**IBus** (Intelligent Input Bus) is an input method framework for Linux. It enables typing in languages requiring complex input like CJK.

The framework manages input method engines and provides a unified interface. It supports many languages and input systems.

# CAVEATS

Desktop integration needed. Engine selection required. X11/Wayland support varies.

# HISTORY

IBus was created by **Peng Huang** as the next-generation input framework for Linux, replacing SCIM.

# SEE ALSO

[fcitx](/man/fcitx)(1), [fcitx5](/man/fcitx5)(1)
