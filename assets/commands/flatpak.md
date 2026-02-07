# TAGLINE

sandboxed application distribution for Linux

# TLDR

**Run** an installed application

```flatpak run com.example.app```

**Install** an application from remote

```flatpak install flathub com.example.app```

**List** installed applications

```flatpak list --app```

**Update** all applications and runtimes

```flatpak update```

**Add** a remote repository

```flatpak remote-add --if-not-exists flathub https://flathub.org/repo/flathub.flatpakrepo```

**Remove** an application

```flatpak remove com.example.app```

**Remove** unused applications and runtimes

```flatpak remove --unused```

Show **info** about an application

```flatpak info com.example.app```

# SYNOPSIS

**flatpak** [_OPTION_...] {_COMMAND_}

# DESCRIPTION

**flatpak** is a tool for managing applications and their associated runtimes. It enables building and distributing applications independently from the host system while providing sandbox isolation at runtime. The system supports both system-wide and per-user installation modes.

# PARAMETERS

**-h, --help**
> Show help options and exit

**-v, --verbose**
> Show debug information (use -vv for more detail)

**--version**
> Print version information and exit

**--default-arch**
> Print the default architecture and exit

**--supported-arches**
> Print supported architectures in order of priority

**--gl-drivers**
> Print the list of active GL drivers

**--installations**
> Print paths of system installations

**--print-updated-env**
> Print environment variables needed to use flatpak

# CAVEATS

System-wide data is stored in $prefix/var/lib/flatpak/, while per-user data is in $HOME/.local/share/flatpak/. Flatpak uses OSTree repositories internally which can be manipulated directly using the **ostree** utility.

# HISTORY

**flatpak** was originally developed as xdg-app by Alexander Larsson at Red Hat and was renamed to Flatpak in 2016. It provides a distribution-agnostic packaging format for Linux desktop applications.

# SEE ALSO

[flatpak-install](/man/flatpak-install)(1), [flatpak-run](/man/flatpak-run)(1), [flatpak-remote-add](/man/flatpak-remote-add)(1), [ostree](/man/ostree)(1)
