# TAGLINE

Add programs to SteamOS library

# TLDR

Add a **program** to Steam library

```steamos-add-to-steam [path/to/file]```

Add an **application** to Steam

```steamos-add-to-steam [path/to/application.desktop]```

# SYNOPSIS

**steamos-add-to-steam** _path/to/file_

# DESCRIPTION

**steamos-add-to-steam** adds non-Steam programs to the Steam library on SteamOS (Steam Deck). This allows launching games or applications from other sources through Steam's interface, including Big Picture mode and Game Mode.

The command creates a Steam shortcut for the specified executable or desktop file, making it accessible alongside Steam games. This is useful for running emulators, native Linux games, or other applications through Steam's unified interface.

# CAVEATS

Specific to SteamOS/Steam Deck. The target file must be executable. Proton/Wine compatibility layer may need configuration for Windows executables. Controller configuration is managed through Steam after adding.

# HISTORY

**steamos-add-to-steam** is a utility developed by **Valve** for SteamOS 3.0, which powers the **Steam Deck** handheld gaming device released in **February 2022**. The command simplifies the process of adding non-Steam content to the library, previously requiring manual shortcut creation.

# SEE ALSO

[steam](/man/steam)(1), [steamos-devmode](/man/steamos-devmode)(1), [flatpak](/man/flatpak)(1)
