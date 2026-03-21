# TAGLINE

KDE file manager with integrated features

# TLDR

**Launch** the file manager

```dolphin```

Open **specific directories**

```dolphin [path/to/directory1] [path/to/directory2]```

Open with files/directories **selected**

```dolphin --select [path/to/file1] [path/to/file2]```

Open a **new window**

```dolphin --new-window```

Open in **split view**

```dolphin --split [path/to/directory1] [path/to/directory2]```

Launch the **daemon** for faster startup

```dolphin --daemon```

# SYNOPSIS

**dolphin** [_options_] [_urls_]

# DESCRIPTION

**dolphin** is KDE's file manager. It provides a graphical interface for managing files and directories with features like tabs, split view, integrated terminal, and file previews.

Part of the KDE Plasma desktop environment but can be used in other desktop environments with the KDE/Qt libraries installed.

# PARAMETERS

**--select** _files_
> Open with specified files or directories selected in their parent folder.

**--new-window**
> Force opening a new window instead of reusing an existing one.

**--split** _dir1_ _dir2_
> Open two directories side by side in split view.

**--daemon**
> Start Dolphin as a D-Bus service in the background for faster subsequent launches.

**-h**, **--help**
> Display help information.

**--author**
> Show author information.

**--version**
> Show version information.

# CAVEATS

KDE application, requires Qt/KDE libraries. Full functionality requires KDE desktop environment. For GNOME, see Nautilus; for XFCE, see Thunar. The --daemon flag keeps Dolphin running in the background which uses memory even when no windows are open.

# SEE ALSO

[nautilus](/man/nautilus)(1), [thunar](/man/thunar)(1), [ranger](/man/ranger)(1), [nemo](/man/nemo)(1), [mc](/man/mc)(1)
