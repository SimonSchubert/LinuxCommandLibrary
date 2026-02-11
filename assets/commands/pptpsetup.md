# TAGLINE

Configure and manage PPTP VPN tunnels

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

**pptpsetup** is a helper script that simplifies creating and managing PPTP VPN tunnel configurations. It generates the necessary peer configuration files in **/etc/ppp/peers/** and stores authentication credentials in the appropriate secrets files.

The **--encrypt** option enables MPPE encryption for the tunnel. Tunnels can be started with **pon** and stopped with **poff** using the tunnel name created by pptpsetup.

# CAVEATS

PPTP is deprecated. Creates files in /etc/ppp/.

# HISTORY

pptpsetup provides **PPTP tunnel configuration** management.

# SEE ALSO

[pptp](/man/pptp)(8), [pppd](/man/pppd)(8), [pon](/man/pon)(1)

