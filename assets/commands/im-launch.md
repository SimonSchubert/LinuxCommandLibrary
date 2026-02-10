# TAGLINE

starts applications with input method support

# TLDR

**Launch with input method**

```im-launch [application]```

**Launch specific IM**

```im-launch -n [ibus] [application]```

**Show what would run**

```im-launch -v [application]```

# SYNOPSIS

**im-launch** [_options_] _command_

# PARAMETERS

_COMMAND_
> Application to launch.

**-n** _METHOD_
> Specify input method.

**-v**
> Verbose mode.

**--help**
> Display help information.

# DESCRIPTION

**im-launch** starts applications with input method support. It sets up environment variables for the selected input framework.

The tool ensures applications can use IBus, Fcitx, or other input methods. It's useful for launching apps needing international input.

# CAVEATS

Part of im-config package. Environment variable setup. Debian/Ubuntu specific.

# HISTORY

im-launch is part of **im-config** for launching applications with input method support.

# SEE ALSO

[im-config](/man/im-config)(1), [ibus](/man/ibus)(1), [fcitx](/man/fcitx)(1)
