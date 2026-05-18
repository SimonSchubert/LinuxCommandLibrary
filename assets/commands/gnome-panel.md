# TAGLINE

traditional GNOME desktop panel and taskbar

# TLDR

**Start GNOME Panel**

```gnome-panel```

**Replace running panel**

```gnome-panel --replace```

# SYNOPSIS

**gnome-panel** [_options_]

# PARAMETERS

**--replace**
> Replace running panel.

**--version**
> Print version information and exit

**--help**
> Display help information

# DESCRIPTION

**gnome-panel** provides the classic GNOME 2-style panel used by the **GNOME Flashback** session. It hosts the application menu, window list, system tray, clock, notification area, workspace switcher, and any number of applets (PanelApplets), arranged across one or more screen-edge panels. Layouts, applets, and applet preferences are stored in **dconf** under **/org/gnome/gnome-panel/**.

The panel is launched automatically when a user logs into the GNOME Flashback session; **--replace** stops a running instance and starts a fresh one, useful after editing configuration or installing new applets.

# CAVEATS

Part of GNOME Flashback. Modern GNOME (3.x and later) uses **gnome-shell** instead, which does not load gnome-panel applets. Requires a working DBus session bus, **gnome-settings-daemon**, and the panel's GSettings schemas.

# HISTORY

gnome-panel was the main **GNOME 2** panel, now maintained as part of GNOME Flashback for users preferring the classic desktop paradigm.

# SEE ALSO

[gnome-calculator](/man/gnome-calculator)(1), [gnome-screenshot](/man/gnome-screenshot)(1), [gsettings](/man/gsettings)(1)
