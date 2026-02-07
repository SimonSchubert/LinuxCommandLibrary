# TAGLINE

voice, video, and text communication platform

# TLDR

**Launch Discord**

```discord```

**Start minimized** to system tray

```discord --start-minimized```

**Ignore GPU blocklist**

```discord --ignore-gpu-blocklist```

**Disable hardware** acceleration

```discord --disable-gpu```

**Enable verbose logging**

```discord --enable-logging```

# SYNOPSIS

**discord** [_options_]

# PARAMETERS

**--start-minimized**
> Start minimized to system tray.

**--ignore-gpu-blocklist**
> Ignore GPU hardware blocklist.

**--disable-gpu**
> Disable hardware acceleration.

**--enable-logging**
> Enable verbose logging.

**--no-sandbox**
> Disable sandbox (not recommended).

**--proxy-server** _URL_
> Use specified proxy server.

**--help**
> Display help information.

# DESCRIPTION

**Discord** is a voice, video, and text communication platform popular among gaming communities and increasingly used for general collaboration. The Linux client provides access to servers, direct messages, voice channels, and screen sharing.

The Electron-based application supports all core Discord features including rich presence, push-to-talk, noise suppression, and server management. It integrates with the system tray for background operation.

Discord on Linux can be installed through official packages, Flatpak, Snap, or distribution repositories. Some features like game detection may have limited functionality compared to Windows.

# CAVEATS

Electron-based with higher resource usage. Screen sharing on Wayland may have limitations. Some game integrations unavailable on Linux. Requires systemd for some features.

# HISTORY

Discord was founded by **Jason Citron** and released in **2015**. Originally targeting gamers, it expanded to general communities. The Linux client was added in **2017**, providing cross-platform support alongside Windows, macOS, iOS, and Android.

# SEE ALSO

[slack](/man/slack)(1), [teams](/man/teams)(1), [mumble](/man/mumble)(1)
