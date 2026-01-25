# TLDR

**Install an application** from configured remotes

```flatpak install [application_id]```

**Install from a specific remote**

```flatpak install [flathub] [org.gnome.gedit]```

**Install for current user** only

```flatpak install --user [application_id]```

**Install from a .flatpakref** file

```flatpak install --from [https://example.com/app.flatpakref]```

**Install from a local bundle** file

```flatpak install --bundle [path/to/app.flatpak]```

**Install or update** if already installed

```flatpak install --or-update [application_id]```

**Install without confirmation** prompts

```flatpak install -y [application_id]```

# SYNOPSIS

**flatpak install** [_OPTIONS_] [_REMOTE_] _REF_...

**flatpak install** [_OPTIONS_] [**--from**|**--bundle**] _LOCATION_

# PARAMETERS

**-u**, **--user**
> Install in per-user installation directory.

**--system**
> Install in default system-wide installation.

**--installation**=_NAME_
> Install in a specific system-wide installation.

**--reinstall**
> Uninstall first if already installed.

**--or-update**
> Update silently if already installed.

**--bundle**
> Treat location as a single-bundle .flatpak file.

**--from**
> Treat location as a .flatpakref application description.

**-y**, **--assumeyes**
> Automatically answer yes to all prompts.

**--no-deploy**
> Download but do not deploy.

**--no-pull**
> Deploy from local cache without downloading.

**-v**, **--verbose**
> Print debug information.

**-h**, **--help**
> Show help and exit.

# DESCRIPTION

**flatpak install** installs applications or runtimes from Flatpak repositories. The REF argument specifies what to install using the format **(app|runtime)/ID/ARCH/BRANCH**. Typically only the application ID is needed; other parts are matched automatically or prompt for selection when ambiguous.

Installation sources include configured remotes (like Flathub), .flatpakref files (application description URLs), .flatpak bundle files, or OCI images. By default, applications install system-wide; use **--user** for per-user installation.

Dependencies (runtimes, extensions) are automatically resolved and installed. The command prompts for confirmation showing what will be downloaded and installed.

# CAVEATS

System-wide installation requires root privileges or polkit authentication. Per-user installations are stored in ~/.local/share/flatpak/. Some applications require specific runtimes that will be installed automatically. Repository remotes must be configured before installing from them.

# HISTORY

Flatpak was developed by Red Hat's Alexander Larsson, with the first stable release in **2015** (originally called xdg-app). It provides sandboxed application distribution independent of Linux distributions. Flathub, the primary Flatpak repository, launched in **2017** and has become the largest source of Flatpak applications.

# SEE ALSO

[flatpak](/man/flatpak)(1), [flatpak-uninstall](/man/flatpak-uninstall)(1), [flatpak-update](/man/flatpak-update)(1), [flatpak-list](/man/flatpak-list)(1), [flatpak-run](/man/flatpak-run)(1)
