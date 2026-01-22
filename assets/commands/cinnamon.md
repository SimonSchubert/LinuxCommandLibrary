# TLDR

**Start Cinnamon desktop (typically via display manager)**

```cinnamon```

**Replace the current window manager with Cinnamon**

```cinnamon --replace```

**Display version information**

```cinnamon --version```

# SYNOPSIS

**cinnamon** [**--replace**] [**--display** _DISPLAY_]

# DESCRIPTION

**Cinnamon** is a desktop environment for Linux that provides a traditional user experience with modern features. It includes the Muffin window manager, panel, application menu, desktop icons, and a comprehensive settings framework.

The cinnamon command is typically invoked by **cinnamon-session** during login via a display manager. Running it directly in an existing session can cause conflicts.

Cinnamon supports extensive customization through applets (panel widgets), desklets (desktop widgets), extensions, and themes.

# PARAMETERS

**--replace**
> Replace the currently running window manager

**--display** _DISPLAY_
> X display to use

**--version**
> Display version information

# CAVEATS

Do not run cinnamon directly within an existing Cinnamon session, as this creates conflicts with the running desktop. The desktop is normally started by **cinnamon-session** through a display manager.

Cinnamon does not support using a different window manager; Muffin is integral to its operation.

# HISTORY

**Cinnamon** was developed by the **Linux Mint** team starting in **2011** as a fork of GNOME 3's GNOME Shell. It was created to provide a more traditional desktop experience after GNOME 3 moved to a significantly different interface paradigm. The window manager Muffin was forked from GNOME's Mutter in version 1.2 (January 2012).

# SEE ALSO

[cinnamon-session](/man/cinnamon-session)(1), [cinnamon-settings](/man/cinnamon-settings)(1), [muffin](/man/muffin)(1)
