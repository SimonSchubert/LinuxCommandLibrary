# TAGLINE

Determine the OS architecture of a remote Windows system

# TLDR

**Detect the architecture** of a remote Windows system

```impacket-getarch -target [192.168.1.100]```

**Check architecture** of multiple targets from a file

```impacket-getarch -targets [targets.txt]```

**Detect architecture** with custom timeout

```impacket-getarch -target [192.168.1.100] -timeout [5]```

**Detect architecture** with debug output

```impacket-getarch -target [192.168.1.100] -debug```

# SYNOPSIS

**impacket-getarch** [_-h_] [_-target IP_] [_-targets FILE_] [_-timeout SECONDS_] [_-debug_] [_-ts_]

# PARAMETERS

**-target** _IP_
> IP address of the target system to probe

**-targets** _FILE_
> File containing a list of target IP addresses (one per line)

**-timeout** _SECONDS_
> Socket timeout when connecting to the target (default: 2)

**-debug**
> Enable debug output

**-ts**
> Add timestamp to every logging output

# DESCRIPTION

**impacket-getarch** is a reconnaissance tool that determines whether a remote Windows system is running a 32-bit or 64-bit operating system. It works by connecting to the target's SMB service and analyzing differences in how 32-bit and 64-bit Windows respond to certain SMB requests. This technique is documented by Microsoft and requires no authentication.

This information is valuable during penetration testing when preparing architecture-specific payloads or exploits.

# CAVEATS

Requires network access to the target's SMB port (typically 445). Results depend on SMB being accessible and not blocked by firewalls. Does not work against non-Windows systems or systems running Samba.

# HISTORY

Part of the **Impacket** library, originally by SecureAuth and now maintained by Fortra.

# SEE ALSO

[impacket-psexec](/man/impacket-psexec)(1), [impacket-smbclient](/man/impacket-smbclient)(1), [nmap](/man/nmap)(1), [smbclient](/man/smbclient)(1)
