# TLDR

**Create PPTP tunnel**

```pptpsetup --create [tunnel] --server [host] --username [user] --password [pass]```

**Delete tunnel**

```pptpsetup --delete [tunnel]```

**Create with encryption**

```pptpsetup --create [tunnel] --server [host] --username [user] --password [pass] --encrypt```

# SYNOPSIS

**pptpsetup** [_options_]

# PARAMETERS

**--create** _NAME_
> Create tunnel.

**--delete** _NAME_
> Delete tunnel.

**--server** _HOST_
> Server address.

**--username** _USER_
> Authentication username.

**--password** _PASS_
> Authentication password.

**--encrypt**
> Enable encryption.

# DESCRIPTION

**pptpsetup** configures PPTP VPN tunnels. Setup helper script.

The tool creates peer configuration files. Manages credentials.

pptpsetup creates tunnels.

# CAVEATS

PPTP is deprecated. Creates files in /etc/ppp/.

# HISTORY

pptpsetup provides **PPTP tunnel configuration** management.

# SEE ALSO

[pptp](/man/pptp)(8), [pppd](/man/pppd)(8), [pon](/man/pon)(1)

