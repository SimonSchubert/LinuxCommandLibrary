# TLDR

**Launch** Nautilus file manager

```nautilus```

Open a **specific directory**

```nautilus [path/to/directory]```

Open as **root user**

```nautilus admin:/```

Open with a **file or directory selected**

```nautilus --select [path/to/file_or_directory]```

Open in a **new window**

```nautilus --new-window```

**Close all** Nautilus instances

```nautilus --quit```

# SYNOPSIS

**nautilus** [**--new-window**] [**--select**] [**--quit**] [_URI_...]

# PARAMETERS

**--new-window**
> Open a new window instead of using existing instance

**--select**
> Select specified file or directory in parent folder

**--quit, -q**
> Close all Nautilus instances

**--version**
> Display version information

**--help, -h**
> Display help information

# URI SCHEMES

**file://**
> Local filesystem paths

**admin://**
> Browse filesystem as root (polkit authentication)

**trash://**
> View trash contents

**recent://**
> View recently accessed files

**sftp://**
> Browse remote SSH/SFTP servers

**smb://**
> Browse Windows/Samba shares

**ftp://**
> Browse FTP servers

# DESCRIPTION

**Nautilus** (GNOME Files) is the default file manager for the GNOME desktop environment. It provides graphical file browsing, management, and navigation with support for local and remote filesystems.

Features include tabbed browsing, bookmarks, file previews, search, and integration with GNOME services. The admin:// URI scheme allows privileged file operations with polkit authentication.

# CAVEATS

Running as root with admin:// requires polkit authentication. Remote filesystem support depends on GVFS backends being installed. Some features require GNOME desktop integration.

# HISTORY

**Nautilus** was originally developed by **Eazel** in 1999-2001 and named after the submarine in Jules Verne's "Twenty Thousand Leagues Under the Sea." After Eazel's closure, it became the standard GNOME file manager, now officially called GNOME Files.

# SEE ALSO

[dolphin](/man/dolphin)(1), [thunar](/man/thunar)(1), [caja](/man/caja)(1), [nemo](/man/nemo)(1)
