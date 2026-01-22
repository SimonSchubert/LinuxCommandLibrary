# TLDR

Create a **fullscreen screenshot**

```flameshot full```

Create a screenshot **interactively** (select region and annotate)

```flameshot gui```

Create a screenshot and **save to a specific path**

```flameshot gui -p [path/to/directory]```

Create a screenshot and **copy to clipboard**

```flameshot gui -c```

Create a screenshot and **print to stdout** (raw PNG)

```flameshot gui -r```

Create a screenshot from a **specific monitor**

```flameshot screen -n [monitor_number]```

Create a screenshot with a **delay** in milliseconds

```flameshot full -d [5000]```

Open the **launcher dialog** for advanced options

```flameshot launcher```

# SYNOPSIS

**flameshot** [_subcommand_] [_options_]

# PARAMETERS

**gui**
> Interactive mode to select region and annotate

**full**
> Capture all monitors simultaneously

**screen**
> Capture a specific monitor

**launcher**
> Open dialog for advanced screenshot options

**config**
> Configure application settings

**-c, --clipboard**
> Copy capture to clipboard

**-d, --delay** _ms_
> Wait specified milliseconds before capture

**-p, --path** _directory_
> Save screenshot to specified directory

**-r, --raw**
> Output PNG data to stdout

**-u, --upload**
> Upload screenshot to external service

**--region** _WxH+X+Y_
> Capture specific region dimensions

**-n, --number** _monitor_
> Select monitor by number (for screen subcommand)

# DESCRIPTION

**Flameshot** is a powerful yet simple screenshot tool for Linux featuring an intuitive GUI for region selection and built-in annotation capabilities. It supports drawing shapes, adding text, arrows, and markers directly on screenshots before saving.

The tool integrates with the system tray for quick access and supports both X11 and Wayland display servers. Screenshots can be saved to files, copied to clipboard, or uploaded to image hosting services. A D-Bus interface enables scripting and integration with other applications.

# CAVEATS

On Wayland, some features may require additional permissions or compositor-specific configurations. The **gui** mode may behave differently depending on the compositor used. When using **--raw** output, ensure the receiving application can handle binary PNG data via stdin.

# HISTORY

Flameshot was created by **lupoDharkael** and first released in **2017**. It was designed as a modern alternative to older screenshot tools, drawing inspiration from Greenshot (Windows). The project is written in **C++** using the Qt framework and has become one of the most popular screenshot utilities in the Linux ecosystem.

# SEE ALSO

[gnome-screenshot](/man/gnome-screenshot)(1), [scrot](/man/scrot)(1), [maim](/man/maim)(1), [spectacle](/man/spectacle)(1), [shutter](/man/shutter)(1)
