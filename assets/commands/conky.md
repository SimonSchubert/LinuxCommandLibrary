# TAGLINE

lightweight system monitor

# TLDR

Start with **default** configuration

```conky```

Print default **config** to file

```conky -C > ~/.conkyrc```

Use specific **configuration file**

```conky -c path/to/config```

Run as **daemon** in background

```conky -d```

Set **alignment** on desktop

```conky -a top_right```

**Pause** before startup

```conky -p 5```

# SYNOPSIS

**conky** [_options_]

# DESCRIPTION

**conky** is a lightweight system monitor for X11 that displays system information on the desktop root window or in its own window. It provides over 250 built-in monitoring objects and supports extensive customization including fonts, colors, and Lua scripting.

# PARAMETERS

**-c, --config FILE**
> Load specified configuration file

**-C, --print-config**
> Print default configuration to stdout

**-d, --daemonize**
> Run as daemon in background

**-o, --own-window**
> Create a separate window

**-p, --pause SECONDS**
> Pause before startup

**-t, --text TEXT**
> Specify text to render

**-u, --interval SECONDS**
> Set update interval

**-a, --alignment ALIGNMENT**
> Set window alignment (top_left, top_right, bottom_left, bottom_right, etc.)

**-x X**
> Set X position

**-y Y**
> Set Y position

**-v, --version**
> Display version information

# CONFIGURATION

**~/.config/conky/conky.conf**
> User-level configuration file with conky.config and conky.text sections.

**/etc/conky/conky.conf**
> System-wide default configuration.

# CAVEATS

Send SIGUSR1 to reload configuration without restarting. Configuration uses two main sections: conky.config for settings and conky.text for display content.

# HISTORY

**conky** is a fork of Torsmo and has become one of the most popular system monitors for Linux desktop environments. It supports monitoring CPU, memory, disk, network, and many other system metrics.

# SEE ALSO

[top](/man/top)(1), [htop](/man/htop)(1), [nmon](/man/nmon)(1)
