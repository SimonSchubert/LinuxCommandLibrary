# TAGLINE

RADIUS authentication plugin for PPP daemon

# TLDR

**Start PPP with RADIUS authentication**

```pppd plugin radius.so```

**Use a custom RADIUS configuration file**

```pppd plugin radius.so radius-config-file [/etc/radiusclient/radiusclient.conf]```

**Add a RADIUS Attribute-Value pair**

```pppd plugin radius.so avpair "[attribute=value]"```

# SYNOPSIS

**pppd** plugin radius.so [_options_]

# PARAMETERS

**plugin** radius.so
> Load RADIUS plugin.

**radius-config-file** _filename_
> Use specified file as radiusclient configuration file [default=/etc/radiusclient/radiusclient.conf].

**avpair** _attribute=value_
> Add an Attribute-Value pair to be passed to the RADIUS server on each request.

**map-to-ifname**
> Set RADIUS NAS-Port attribute to number equal to interface name (default).

**map-to-ttyname**
> Set RADIUS NAS-Port attribute value via libradiusclient library.

# DESCRIPTION

**pppd-radius** is a plugin for the PPP daemon that enables RADIUS (Remote Authentication Dial-In User Service) authentication. It permits pppd to perform PAP, CHAP, MS-CHAP, and MS-CHAPv2 authentication against a RADIUS server instead of the usual /etc/ppp/pap-secrets and /etc/ppp/chap-secrets files.

The plugin is built on the **radiusclient** library, which has its own configuration files (usually in /etc/radiusclient). This is commonly used by ISPs and enterprise networks to centrally manage dial-up, DSL, and VPN user authentication.

# CAVEATS

Requires a RADIUS server and the radiusclient library. The plugin (radius.so) must be installed. Configuration is primarily done through the radiusclient configuration file rather than pppd options directly.

# HISTORY

pppd-radius was created for **RADIUS authentication** integration with PPP.

# SEE ALSO

[pppd](/man/pppd)(8), [radiusd](/man/radiusd)(8)

