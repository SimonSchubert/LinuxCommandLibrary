# TAGLINE

Wayland kiosk compositor for single applications

# TLDR

**Run** an application in kiosk mode

```cage application```

Run with **arguments**

```cage -- application arguments```

**Hide** window decorations

```cage -d application```

Allow **terminal switching**

```cage -s application```

Display **help**

```cage -h```

# SYNOPSIS

**cage** [_options_] [**--**] _application_ [_arguments_]

# DESCRIPTION

**cage** is a Wayland kiosk compositor that runs a single application in fullscreen mode. It is designed for kiosk deployments, digital signage, or any situation where you want to run a single application without a full desktop environment.

# PARAMETERS

**-d**
> Disable window decorations (can lock you out of terminal)

**-s**
> Allow switching virtual terminals with Ctrl+Alt+F2, etc.

**-r**
> Rotate the output (0, 90, 180, 270 degrees)

**-h**
> Display help information

**-v**
> Display version information

**--**
> Separator for application arguments

# CAVEATS

Without the -s option, you cannot switch to other virtual terminals. Using -d without a way to exit the application can lock you out. Cage requires a working Wayland environment.

# HISTORY

**cage** was developed as a lightweight kiosk compositor for Wayland, named after the caged display concept in kiosk mode deployments.

# SEE ALSO

[weston](/man/weston)(1), [sway](/man/sway)(1), [gamescope](/man/gamescope)(1)
