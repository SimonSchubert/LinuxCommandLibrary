# TAGLINE

open-source VPN client for Fortinet's proprietary PPP+TLS VPN

# TLDR

Connect to a VPN with a **username and password**

```openfortivpn -u [username] -p [password]```

Connect to a VPN using a specific **configuration file**

```sudo openfortivpn -c [path/to/config]```

Connect by specifying the **host and port**

```openfortivpn [host]:[port]```

Trust a gateway by its **certificate SHA256 sum**

```openfortivpn --trusted-cert [sha256_sum]```

# SYNOPSIS

**openfortivpn** [_host_:_port_] [**-u** _user_] [**-p** _pass_] [**-c** _config_] [_options_]

# PARAMETERS

**-c**, **--config=**_file_
> Configuration file (default: /etc/openfortivpn/config)

**-u**, **--username=**_user_
> VPN account username

**-p**, **--password=**_pass_
> VPN account password

**--trusted-cert=**_sha256_
> Trust gateway certificate with this SHA256 fingerprint

**--realm=**_realm_
> Specify authentication realm

**-o**, **--otp=**_otp_
> One-time password for two-factor authentication

**--otp-prompt=**_prompt_
> Search for OTP prompt string

**--otp-delay=**_delay_
> Delay in seconds before sending OTP

**--no-routes**
> Do not add VPN routes to routing table

**--half-internet-routes**
> Add two /1 routes instead of default route

**--pppd-log=**_file_
> Log file for pppd

**-v**, **--verbose**
> Increase verbosity (use multiple times)

**--pppd-ifname=**_name_
> Set ppp interface name

# DESCRIPTION

**openfortivpn** is an open-source VPN client for Fortinet's proprietary PPP+TLS VPN solution, commonly known as FortiClient SSL VPN. It establishes a secure tunnel using PPP over TLS/SSL to connect to FortiGate appliances and FortiClient VPN servers.

The client handles authentication (including two-factor), certificate verification, and route configuration. It creates a PPP interface for the VPN connection and can manage routing to direct traffic through the VPN tunnel.

# CAVEATS

Requires root privileges to create network interfaces and modify routing tables. Password provided on command line may be visible in process listings; prefer configuration file for credentials. Some Fortinet servers may require specific trusted certificate fingerprints or realm settings.

# HISTORY

Created as an open-source alternative to the proprietary FortiClient for Linux. Developed to provide command-line VPN connectivity for FortiGate SSL VPN servers, which are widely used in enterprise environments. The project emerged from the need for a lightweight, scriptable VPN client compatible with Fortinet infrastructure.

# SEE ALSO

[openvpn](/man/openvpn)(8), [pppd](/man/pppd)(8), [ip](/man/ip)(8)
