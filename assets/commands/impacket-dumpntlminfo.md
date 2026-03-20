# TAGLINE

Dump remote host NTLM authentication information

# TLDR

**Dump NTLM info** from a target host via SMB

```impacket-dumpntlminfo [192.168.1.100]```

**Dump NTLM info** using a specific port

```impacket-dumpntlminfo -port [139] [192.168.1.100]```

**Dump NTLM info** using RPC protocol instead of SMB

```impacket-dumpntlminfo -protocol RPC [192.168.1.100]```

**Dump NTLM info** with a specific target IP

```impacket-dumpntlminfo -target-ip [192.168.1.100] [hostname]```

**Enable debug output** for troubleshooting

```impacket-dumpntlminfo -debug [192.168.1.100]```

# SYNOPSIS

**impacket-dumpntlminfo** [_-debug_] [_-ts_] [_-target-ip IP_] [_-port PORT_] [_-protocol {SMB,RPC}_] _target_

# PARAMETERS

**-debug**
> Turn DEBUG output on.

**-ts**
> Add timestamp to every logging output.

**-target-ip** _IP_
> IP address of the target machine. Useful when target is a NetBIOS name that cannot be resolved.

**-port** _PORT_
> Destination port to connect to the SMB/RPC server. Default is 445.

**-protocol** {**SMB**, **RPC**}
> Protocol to use. Default is SMB. Port 135 normally uses RPC.

# DESCRIPTION

**impacket-dumpntlminfo** performs NTLM authentication against a remote host and extracts information from the NTLM challenge response, **without requiring any credentials**. By initiating an SMB or RPC connection, the tool triggers an NTLM authentication handshake and parses the server's response to reveal details such as the hostname, domain name, DNS information, OS version, and timestamp.

This is useful for reconnaissance during penetration testing, as it provides network and host information without authentication.

# CAVEATS

Only works against hosts with SMB or RPC services exposed. Firewalls or security policies may block unauthenticated NTLM negotiation. The amount of information returned depends on the target's SMB/RPC configuration and Windows version.

# HISTORY

Part of the **Impacket** library, originally developed by **SecureAuth** (now **Fortra**). Impacket is a collection of Python classes for working with network protocols, widely used in penetration testing and security research. The tool leverages the NTLM authentication handshake to extract server metadata without credentials.

# SEE ALSO

[impacket-psexec](/man/impacket-psexec)(1), [impacket-smbclient](/man/impacket-smbclient)(1), [impacket-rpcdump](/man/impacket-rpcdump)(1)
