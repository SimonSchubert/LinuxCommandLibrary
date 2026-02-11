# TAGLINE

Wine graphical configuration tool

# TLDR

**Open Wine configuration**

```winecfg```

**Configure specific Wine prefix**

```WINEPREFIX=[~/.wine32] winecfg```

**Open configuration for 32-bit Wine**

```WINEARCH=win32 winecfg```

# SYNOPSIS

**winecfg** [_options_]

# ENVIRONMENT

**WINEPREFIX**: Directory containing Wine configuration (default: ~/.wine).

**WINEARCH**: Architecture: win32 or win64.

# TABS

**Applications**: Per-application settings and Windows version.

**Libraries**: DLL override settings (native vs builtin).

**Graphics**: Display settings, virtual desktop, screen resolution.

**Desktop Integration**: Theme and folder integration.

**Drives**: Configure virtual drive mappings.

**Audio**: Sound driver selection and configuration.

**Staging**: Wine Staging experimental features (if available).

# DESCRIPTION

**winecfg** is Wine's graphical configuration tool. It allows adjusting Wine settings without manually editing the registry, including Windows version emulation, DLL overrides, display options, and audio configuration.

The Applications tab lets you configure different Windows versions per application for compatibility. The Libraries tab is crucial for applications requiring specific DLL versions or overrides.

Each Wine prefix can have independent settings. Use WINEPREFIX to manage multiple isolated Wine environments for different applications.

# CAVEATS

Changes affect the entire Wine prefix unless application-specific rules are set. DLL overrides can break applications if misconfigured. Some settings require Wine restart to take effect.

# HISTORY

**winecfg** was created as part of Wine to provide a user-friendly configuration interface. Wine (Wine Is Not an Emulator) has been in development since 1993, providing a compatibility layer for running Windows applications on Unix-like systems.

# SEE ALSO

[wine](/man/wine)(1), [wineboot](/man/wineboot)(1), [regedit](/man/regedit)(1), [winetricks](/man/winetricks)(1)
