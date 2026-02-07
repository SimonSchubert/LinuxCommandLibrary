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

Launch the **daemon**

```dolphin --daemon```

# SYNOPSIS

**dolphin** [_options_] [_urls_]

# DESCRIPTION

**dolphin** is KDE's file manager. It provides a graphical interface for managing files and directories with features like tabs, split view, and integrated terminal.

Part of the KDE Plasma desktop environment but can be used in other desktops.

# PARAMETERS

**--select** _files_
> Open with specified files selected

**--new-window**
> Open in new window

**--split** _dir1_ _dir2_
> Open directories in split view

**--daemon**
> Start D-Bus service

**-h, --help**
> Display help

# CAVEATS

KDE application, requires Qt/KDE libraries. Full functionality requires KDE desktop environment. For GNOME, see Nautilus; for XFCE, see Thunar.

# SEE ALSO

[nautilus](/man/nautilus)(1), [thunar](/man/thunar)(1), [ranger](/man/ranger)(1)
