# TAGLINE

KDE-based RDP server that allows remote connections to a KDE Plasma

# TLDR

Start RDP server with **username and password**

```krdpserver -u [username] -p [password]```

Share a **specific monitor**

```krdpserver -u [username] -p [password] --monitor [n]```

# SYNOPSIS

**krdpserver** [_options_]

# PARAMETERS

**-u**, **--username** _USER_
> Username for RDP authentication

**-p**, **--password** _PASS_
> Password for RDP authentication

**--monitor** _N_
> Share specific monitor by index number

**--port** _PORT_
> Listen on specified port

# DESCRIPTION

**krdpserver** is a KDE-based RDP (Remote Desktop Protocol) server that allows remote connections to a KDE Plasma desktop. It enables users to access their Plasma session remotely using standard RDP clients.

The server integrates with KDE's portal system and can share the entire desktop or specific monitors. It uses the RDP protocol for compatibility with Windows Remote Desktop and other RDP clients.

# CAVEATS

Requires KDE Plasma desktop environment. Security depends on strong password selection. Firewall rules may need to be configured for remote access.

# HISTORY

krdpserver is part of the KRDP project developed by KDE for native RDP server support in Plasma. It provides an alternative to VNC for remote desktop access on Linux.

# SEE ALSO

[krdc](/man/krdc)(1), [xrdp](/man/xrdp)(8), [vncserver](/man/vncserver)(1)
