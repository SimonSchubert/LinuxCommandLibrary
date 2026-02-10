# TAGLINE

reconnaissance tool that determines whether a remote Windows system is running

# TLDR

**Detect the architecture** of a remote Windows system

```impacket-getarch -target [192.168.1.100]```

**Check architecture** of multiple targets from a file

```impacket-getarch -targets [targets.txt]```

**Detect architecture** specifying a port

```impacket-getarch -target [192.168.1.100] -port [445]```

# SYNOPSIS

**impacket-getarch** [_-h_] [_-target IP_] [_-targets FILE_] [_-port PORT_]

# PARAMETERS

**-target** _IP_
> IP address of the target system to probe

**-targets** _FILE_
> File containing a list of target IP addresses (one per line)

**-port** _PORT_
> Port to connect to (default: 445)

# DESCRIPTION

**impacket-getarch** is a reconnaissance tool that determines whether a remote Windows system is running a 32-bit or 64-bit operating system. It works by connecting to the target's SMB service and analyzing the response to identify the system architecture.

This information is valuable during penetration testing when preparing architecture-specific payloads or exploits. The tool requires no authentication and works against systems with SMB exposed.

# CAVEATS

Requires network access to the target's SMB port (typically 445). Results depend on SMB being accessible and not blocked by firewalls. Does not work against non-Windows systems.

# HISTORY

Part of the **Impacket** library by SecureAuth. The tool exploits differences in how 32-bit and 64-bit Windows systems respond to certain SMB requests to fingerprint the architecture without authentication.

# SEE ALSO

[impacket-getadusers](/man/impacket-getadusers)(1), [nmap](/man/nmap)(1), [smbclient](/man/smbclient)(1)
