# TLDR

**Run** an installed flatpak application

```flatpak run [com.example.app]```

Run an application from a **specific branch**

```flatpak run --branch=[stable|beta|master] [com.example.app]```

Run an **interactive shell** inside a flatpak

```flatpak run --command=sh [com.example.app]```

Run with a **specific runtime version**

```flatpak run --runtime-version=[24.08] [com.example.app]```

Run with a **different runtime**

```flatpak run --runtime=[org.freedesktop.Sdk] [com.example.app]```

Run with **additional filesystem access**

```flatpak run --filesystem=[home] [com.example.app]```

Run in **strict sandbox mode** (strip extra permissions)

```flatpak run --sandbox [com.example.app]```

# SYNOPSIS

**flatpak run** [_options_] _ref_ [_args..._]

# PARAMETERS

**--user**
> Use per-user installation

**--system**
> Use system-wide installation

**--arch** _arch_
> Target specific architecture

**--branch** _branch_
> Use specific branch (stable, beta, master)

**--command** _command_
> Run specified command instead of default

**--runtime** _runtime_
> Use a different runtime

**--runtime-version** _version_
> Use specific runtime version

**--sandbox**
> Run with minimal permissions (strip extras)

**--share** _subsystem_
> Share subsystem with host (network, ipc)

**--unshare** _subsystem_
> Unshare subsystem from host

**--socket** _socket_
> Expose well-known socket (x11, wayland, pulseaudio)

**--nosocket** _socket_
> Don't expose socket

**--filesystem** _path_
> Grant filesystem access (home, host, /path)

**--nofilesystem** _path_
> Revoke filesystem access

**--env** _var=value_
> Set environment variable

# DESCRIPTION

**Flatpak run** executes applications or opens shells within Flatpak's sandboxed environment. The sandbox provides isolation with the runtime mounted at **/usr**, application at **/app**, and a writable **/var** directory for persistent data.

When running an application, extra arguments pass through to the application. For runtimes, the command opens a shell for development and testing purposes.

The sandbox automatically adjusts environment variables including **PATH**, **LD_LIBRARY_PATH**, and graphics-related variables to ensure proper isolation and prevent interference with sandbox functioning.

# CAVEATS

Sandbox permissions are controlled by the application's manifest and can be overridden at runtime using **--share**, **--socket**, and **--filesystem** options. Using **--sandbox** provides maximum isolation but may break applications requiring specific permissions. Some applications may not function correctly with modified runtimes.

# HISTORY

Part of the **Flatpak** project developed by Alexander Larsson at Red Hat. Flatpak evolved from the xdg-app project around **2015**, providing sandboxed application execution on Linux with strong isolation guarantees.

# SEE ALSO

[flatpak](/man/flatpak)(1), [flatpak-install](/man/flatpak-install)(1), [flatpak-override](/man/flatpak-override)(1)
