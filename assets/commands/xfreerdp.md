# TLDR

**Connect** to server

```xfreerdp /u:[username] /p:[password] /v:[ip_address]```

Connect with **audio**

```xfreerdp /u:[username] /p:[password] /v:[ip_address] /sound:sys:alsa```

Connect with **dynamic** resolution

```xfreerdp /v:[ip_address] /u:[username] /p:[password] /dynamic-resolution```

Connect with **clipboard**

```xfreerdp /v:[ip_address] /u:[username] /p:[password] +clipboard```

**Ignore** certificate

```xfreerdp /v:[ip_address] /u:[username] /p:[password] /cert:ignore```

Connect with **shared** directory

```xfreerdp /v:[ip_address] /u:[username] /p:[password] /drive:[path/to/directory],[share_name]```

# SYNOPSIS

**xfreerdp** [_OPTIONS_]

# PARAMETERS

**/v:** _HOST_
> Server hostname or IP address

**/u:** _USERNAME_
> Username for authentication

**/p:** _PASSWORD_
> Password for authentication

**/sound:** _DEVICE_
> Enable audio redirection

**/dynamic-resolution**
> Enable dynamic resolution updates

**+clipboard**
> Enable clipboard redirection

**/cert:ignore**
> Ignore certificate warnings

**/drive:** _PATH_,_NAME_
> Share local directory

**/f**
> Fullscreen mode

# DESCRIPTION

**xfreerdp** is a free Remote Desktop Protocol (RDP) client. It connects to Windows Remote Desktop servers and other RDP-compatible systems.

Part of the FreeRDP project providing open-source RDP implementation.

# CAVEATS

Certificate warnings should not be ignored in production environments. Password visible in process list if specified on command line.

# SEE ALSO

[rdesktop](/man/rdesktop)(1), [vinagre](/man/vinagre)(1), [vncviewer](/man/vncviewer)(1)
