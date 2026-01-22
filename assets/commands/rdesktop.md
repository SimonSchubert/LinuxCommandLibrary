# TLDR

**Connect** to remote computer

```rdesktop -u [username] -p [password] [host:3389]```

Connect in **fullscreen**

```rdesktop -u [username] -p [password] -f [host]```

Use custom **resolution**

```rdesktop -u [username] -p [password] -g [1920]x[1080] [host]```

Connect with **domain** account

```rdesktop -u [username] -p [password] -d [domain] [host]```

Use **16-bit color** (faster)

```rdesktop -u [username] -p [password] -a 16 [host]```

# SYNOPSIS

**rdesktop** [**-u** _user_] [**-p** _pass_] [**-d** _domain_] [**-f**] [**-g** _WxH_] [**-a** _bpp_] _host_[:_port_]

# PARAMETERS

**-u _username_**
> Username for authentication

**-p _password_**
> Password (use - for prompt)

**-d _domain_**
> Windows domain name

**-f**
> Fullscreen mode (Ctrl+Alt+Enter to exit)

**-g _WxH_**
> Desktop geometry (e.g., 1920x1080)

**-a _bpp_**
> Color depth (8, 15, 16, 24, 32)

**-k _layout_**
> Keyboard layout

**-r _device_**
> Device redirection

# DESCRIPTION

**rdesktop** is an open-source Remote Desktop Protocol (RDP) client for connecting to Windows machines. It allows Linux users to access Windows desktops and applications remotely.

The tool supports various RDP features including clipboard sharing, sound redirection, and disk/printer mapping.

# CAVEATS

Older tool, consider xfreerdp for newer RDP versions. Password on command line is insecure. Some modern RDP features unsupported. Network Level Authentication may require extra configuration.

# HISTORY

**rdesktop** was one of the first open-source RDP clients, created to allow Linux users to connect to Windows Terminal Services. It reverse-engineered the RDP protocol before Microsoft published specifications.

# SEE ALSO

[xfreerdp](/man/xfreerdp)(1), [vinagre](/man/vinagre)(1), [remmina](/man/remmina)(1)
