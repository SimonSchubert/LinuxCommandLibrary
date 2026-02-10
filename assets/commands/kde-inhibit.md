# TAGLINE

temporarily inhibits various KDE Plasma desktop functions while a specified

# TLDR

Inhibit **power management** while command runs

```kde-inhibit --power [command] [arguments]```

Inhibit **screen saver**

```kde-inhibit --screenSaver [command] [arguments]```

Inhibit **color correction** (night mode)

```kde-inhibit --colorCorrect [command]```

# SYNOPSIS

**kde-inhibit** [_options_] _command_ [_arguments_]

# PARAMETERS

**--power**
> Inhibit power management (prevent sleep/suspend)

**--screenSaver**
> Inhibit screen saver activation

**--colorCorrect**
> Inhibit color correction (night light/night mode)

# DESCRIPTION

**kde-inhibit** temporarily inhibits various KDE Plasma desktop functions while a specified command is running. This prevents the desktop from interfering with long-running tasks or media playback.

The inhibition automatically ends when the command exits. Multiple inhibition types can be combined by specifying multiple options.

# CAVEATS

Only works in KDE Plasma desktop environment. Requires the command to keep running; inhibition ends when it exits. Does not work with commands that immediately background themselves.

# HISTORY

kde-inhibit is part of KDE's command-line tools, providing a way to control desktop behavior from scripts and applications without requiring direct DBus interaction.

# SEE ALSO

[systemd-inhibit](/man/systemd-inhibit)(1), [xdg-screensaver](/man/xdg-screensaver)(1), [caffeine](/man/caffeine)(1)
