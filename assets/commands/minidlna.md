# TAGLINE

DLNA/UPnP media server

# TLDR

**Start server**

```minidlnad```

**Specify config**

```minidlnad -f [/etc/minidlna.conf]```

**Foreground mode**

```minidlnad -d```

**Rescan media**

```minidlnad -R```

**Specify port**

```minidlnad -p [8200]```

**Rebuild database**

```minidlnad -R -f [config.conf]```

# SYNOPSIS

**minidlnad** [_options_]

# PARAMETERS

**-f** _FILE_
> Configuration file.

**-d**
> Debug/foreground mode.

**-R**
> Rescan media files.

**-p** _PORT_
> HTTP port.

**-r**
> Force rescan.

**--help**
> Display help information.

# DESCRIPTION

**minidlna** is a DLNA/UPnP media server. It streams media to TVs and devices.

The tool serves audio, video, and images. Compatible with most DLNA-capable devices.

# CAVEATS

Configuration file required. Transcoding limited. Database in /var/cache.

# HISTORY

MiniDLNA (ReadyMedia) was created as a lightweight **DLNA** server for embedded systems.

# SEE ALSO

[plex](/man/plex)(1), [jellyfin](/man/jellyfin)(1), [kodi](/man/kodi)(1)

