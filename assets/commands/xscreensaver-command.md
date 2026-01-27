# TLDR

**Activate screensaver immediately**

```xscreensaver-command -activate```

**Lock screen**

```xscreensaver-command -lock```

**Deactivate screensaver**

```xscreensaver-command -deactivate```

**Restart screensaver daemon**

```xscreensaver-command -restart```

**Exit screensaver daemon**

```xscreensaver-command -exit```

**Show current status**

```xscreensaver-command -time```

**Watch for state changes**

```xscreensaver-command -watch```

# SYNOPSIS

**xscreensaver-command** [_options_]

# PARAMETERS

**-activate**
> Blank screen immediately.

**-deactivate**
> Simulate user activity; unblank screen.

**-lock**
> Lock screen immediately.

**-cycle**
> Switch to next screensaver hack.

**-next** / **-prev**
> Switch to next/previous hack.

**-select** _n_
> Switch to hack number n.

**-restart**
> Restart the daemon with same arguments.

**-exit**
> Exit daemon (fails if locked).

**-time**
> Show last activation/deactivation time.

**-watch**
> Print state changes continuously.

# DESCRIPTION

**xscreensaver-command** controls a running xscreensaver daemon by sending client messages. It can activate, deactivate, or lock the screen, cycle through display modes, and query status.

The -watch option streams state changes, useful for scripts that need to react to screensaver events. The -deactivate option can be called periodically to prevent screen blanking during video playback.

Configuration is done through xscreensaver-settings, which writes preferences to ~/.xscreensaver.

# CAVEATS

Requires xscreensaver daemon running. Never use kill -9 while screensaver is active. The -exit command fails if screen is locked. X11 only.

# HISTORY

**xscreensaver** was created by Jamie Zawinski in 1992 and has been the most popular X11 screensaver framework for decades. The modular design separates the daemon, display hacks, and control interface, allowing extensive customization and third-party hack development.

# SEE ALSO

[xscreensaver](/man/xscreensaver)(1), [xscreensaver-settings](/man/xscreensaver-settings)(1), [xlock](/man/xlock)(1)
