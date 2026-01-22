# TLDR

Open the **home directory**

```caja```

Open **specific directories** in separate windows

```caja [path/to/directory1] [path/to/directory2] ...```

Open directories in **tabs**

```caja -t [path/to/directory1] [path/to/directory2] ...```

Open with a **specific window size**

```caja -g [600]x[400] [path/to/directory]```

**Close** all windows

```caja -q```

# SYNOPSIS

**caja** [_options_] [_directories_...]

# DESCRIPTION

**caja** is the default file manager for the MATE desktop environment. It provides a graphical interface for browsing files and directories, managing file operations, and accessing network locations.

Caja is a fork of GNOME's Nautilus file manager, maintaining a traditional desktop file management experience.

# PARAMETERS

**-t, --tabs**
> Open directories in tabs instead of windows

**-g, --geometry** _WxH_
> Set window size in pixels

**-q, --quit**
> Close all Caja windows

**-n, --no-default-window**
> Only create windows for explicitly specified paths

**--browser**
> Open browser window

# SEE ALSO

[nautilus](/man/nautilus)(1), [dolphin](/man/dolphin)(1), [thunar](/man/thunar)(1), [ranger](/man/ranger)(1)
