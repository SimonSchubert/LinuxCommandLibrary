# TLDR

**Start OMAPI shell**

```omshell```

**Connect to server**

```omshell
> server [127.0.0.1]
> connect```

**Set key authentication**

```omshell
> key [keyname] [secret]```

**Create lease**

```omshell
> new lease
> set ip-address = [192.168.1.100]
> create```

# SYNOPSIS

**omshell**

# PARAMETERS

**server** _ADDRESS_
> DHCP server address.

**connect**
> Connect to server.

**key** _NAME_ _SECRET_
> Set authentication key.

**new** _OBJECT_
> Create new object.

**open** _OBJECT_
> Open existing object.

# DESCRIPTION

**omshell** provides OMAPI shell interface. Manages ISC DHCP server.

The tool interacts with dhcpd via OMAPI. Allows runtime modifications.

omshell controls DHCP server.

# CAVEATS

Requires OMAPI enabled. Part of ISC DHCP. Authentication recommended.

# HISTORY

omshell was created for **runtime DHCP management** via the OMAPI protocol.

# SEE ALSO

[dhcpd](/man/dhcpd)(1), [dhclient](/man/dhclient)(1)

