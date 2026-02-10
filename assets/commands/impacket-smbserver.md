# TAGLINE

creates an SMB server to share files

# TLDR

**Start SMB server sharing current directory**

```impacket-smbserver [sharename] .```

**Share specific directory**

```impacket-smbserver [sharename] [/path/to/share]```

**Use SMB2 protocol**

```impacket-smbserver -smb2support [sharename] [path]```

**Require authentication**

```impacket-smbserver -username [user] -password [pass] [sharename] [path]```

**Specify IP to bind**

```impacket-smbserver -ip [0.0.0.0] [sharename] [path]```

# SYNOPSIS

**impacket-smbserver** [_options_] _sharename_ _path_

# PARAMETERS

**-smb2support**
> Enable SMB2 protocol support.

**-username** _user_
> Require username for auth.

**-password** _pass_
> Require password for auth.

**-ip** _address_
> IP address to bind.

**-port** _port_
> Port to listen on (default 445).

# DESCRIPTION

**impacket-smbserver** creates an SMB server to share files. Part of the Impacket toolkit. Useful for transferring files to/from Windows systems during penetration testing. Supports SMB1 and SMB2 protocols and optional authentication.

# SEE ALSO

[samba](/man/samba)(1), [impacket-smbclient](/man/impacket-smbclient)(1)

