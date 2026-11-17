# TAGLINE

Override runtime permissions of Flatpak applications

# TLDR

**Show** the overrides of one application

```flatpak override --show [com.example.app]```

Grant access to a **filesystem** location

```flatpak override --filesystem [home] [com.example.app]```

Grant **read-only** access to a directory

```flatpak override --filesystem [path/to/directory]:ro [com.example.app]```

**Stop sharing** the network

```flatpak override --unshare network [com.example.app]```

Set an **environment variable** for one application

```flatpak override --env [NAME]=[value] [com.example.app]```

Override for the **current user** only, and drop a socket

```flatpak override -u --nosocket [wayland] [com.example.app]```

**Remove** every override of one application

```flatpak override --reset [com.example.app]```

# SYNOPSIS

**flatpak override** [_OPTIONS_] [_APP_]

# PARAMETERS

**--show**
> Print the overrides instead of changing them.

**--filesystem**=_PATH_
> Grant filesystem access. Well-known values include `home`, `host`, and `xdg-download`. Append `:ro` for read-only access.

**--unshare**=_SUBSYSTEM_
> Remove a share granted by the runtime. `network` is one subsystem.

**--env**=_VAR=VALUE_
> Set an environment variable inside the sandbox.

**--nosocket**=_SOCKET_
> Remove access to a socket such as `wayland` or `x11`.

**--reset**
> Delete overrides. With an application id, only that application. Without one, the global overrides.

**-u**, **--user**
> Change the per-user installation. Without this option the system installation is changed.

**-h**, **--help**
> Show help and exit.

# DESCRIPTION

**flatpak override** stores permission changes on top of the finish-args that an application shipped with. It is a subcommand of [flatpak](/man/flatpak)(1), not a separate program.

Without an application id, the override applies to every application. Without **--user**, the default system-wide installation is changed.

# CAVEATS

A filesystem override of `host` or a home directory gives the application access outside the sandbox. Reset with **--reset** when the extra permission is no longer wanted.

# INSTALL

```apt: sudo apt install flatpak```

```dnf: sudo dnf install flatpak```

```pacman: sudo pacman -S flatpak```

```apk: sudo apk add flatpak```

```zypper: sudo zypper install flatpak```

```nix: nix profile install nixpkgs#flatpak```

<!-- packages: 2026-11-17 -->

# SEE ALSO

[flatpak](/man/flatpak)(1), [flatpak-run](/man/flatpak-run)(1), [flatpak-info](/man/flatpak-info)(1), [flatpak-config](/man/flatpak-config)(1)

# RESOURCES

```[Source code](https://github.com/flatpak/flatpak)```

```[Homepage](https://flatpak.org)```

```[Documentation](https://docs.flatpak.org/en/latest/flatpak-command-reference.html#flatpak-override)```

<!-- verified: 2026-11-17 -->
