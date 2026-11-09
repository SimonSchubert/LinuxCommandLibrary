# TAGLINE

starts the configured input method framework and executes a session program

# TLDR

**Start the configured input method daemon and run a session program**

```im-launch [x-session-manager]```

**Start the input method daemon without running another program**

```im-launch```

# SYNOPSIS

**im-launch** [_session-program_ [_arguments_]]

# PARAMETERS

_SESSION-PROGRAM_
> Program to execute after the input method framework has been started, such as x-session-manager.

# DESCRIPTION

**im-launch** starts an input method framework server daemon such as ibus-daemon or fcitx, sets up the appropriate environment variables for client programs, and then executes the given session program.

It is normally not invoked by hand, but from **/etc/X11/Xsession.d/70im-config_launch** during X session startup. The framework used is the one selected with **im-config**, which is stored in **~/.xinputrc**.

# CAVEATS

Debian and Ubuntu specific, part of the **im-config** package. The script has no command-line options and depends on the **IM_CONFIG_LAUNCH** environment set by the Xsession caller; without it, no daemon is started. If startup fails, check the first part of **~/.xsession-errors**.

# SEE ALSO

[im-config](/man/im-config)(1), [ibus](/man/ibus)(1), [fcitx](/man/fcitx)(1), [fcitx5](/man/fcitx5)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/input-method-team/im-config)```

<!-- verified: 2026-11-09 -->
