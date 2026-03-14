# TAGLINE

Open-source Remote Desktop Protocol (RDP) client

# TLDR

**Connect to a remote computer**

```rdesktop -u [username] -p [password] [host:3389]```

**Connect in fullscreen mode**

```rdesktop -u [username] -p [password] -f [host]```

**Use a custom resolution**

```rdesktop -u [username] -p [password] -g [1920]x[1080] [host]```

**Connect with a domain account**

```rdesktop -u [username] -p [password] -d [domain] [host]```

**Use 16-bit color for faster performance with compression**

```rdesktop -u [username] -a 16 -z [host]```

**Redirect clipboard and sound**

```rdesktop -u [username] -r clipboard:PRIMARYCLIPBOARD -r sound:local [host]```

# SYNOPSIS

**rdesktop** [**-u** _user_] [**-p** _pass_] [**-d** _domain_] [**-f**] [**-g** _WxH_] [**-a** _bpp_] _host_[:_port_]

# PARAMETERS

**-u** _username_
> Username for authentication.

**-p** _password_
> Password (use `-` to prompt interactively).

**-d** _domain_
> Windows domain name.

**-f**
> Fullscreen mode (Ctrl+Alt+Enter to toggle).

**-g** _WxH_
> Desktop geometry (e.g., 1920x1080).

**-a** _bpp_
> Color depth (8, 15, 16, 24, 32).

**-k** _layout_
> Keyboard layout.

**-r** _device_
> Device redirection (clipboard, sound, disk, printer).

**-z**
> Enable compression of the RDP datastream.

**-x** _experience_
> Bandwidth performance: b[roadband], m[odem], or l[an].

**-0**
> Attach to the console session of the server.

**-T** _title_
> Set the window title.

# DESCRIPTION

**rdesktop** is an open-source Remote Desktop Protocol (RDP) client for connecting to Windows machines. It allows Linux users to access Windows desktops and applications remotely.

The tool supports various RDP features including clipboard sharing, sound redirection, and disk/printer mapping.

# CAVEATS

Older tool, consider xfreerdp for newer RDP versions. Password on command line is insecure. Some modern RDP features unsupported. Network Level Authentication may require extra configuration.

# HISTORY

**rdesktop** was one of the first open-source RDP clients, created to allow Linux users to connect to Windows Terminal Services. It reverse-engineered the RDP protocol before Microsoft published specifications.

# SEE ALSO

[xfreerdp](/man/xfreerdp)(1), [vinagre](/man/vinagre)(1), [remmina](/man/remmina)(1)
