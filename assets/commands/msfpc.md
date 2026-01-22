# TLDR

**Generate Windows payload**

```msfpc windows [192.168.1.10]```

**Generate Linux payload**

```msfpc linux [192.168.1.10]```

**Generate with specific port**

```msfpc windows [192.168.1.10] [4444]```

**Generate meterpreter payload**

```msfpc windows meterpreter [192.168.1.10]```

**Generate staged payload**

```msfpc windows staged [192.168.1.10]```

**Generate Python payload**

```msfpc python [192.168.1.10]```

# SYNOPSIS

**msfpc** [_type_] [_options_] _lhost_ [_lport_]

# PARAMETERS

_TYPE_
> Payload type (windows, linux, python, etc.).

_LHOST_
> Local host IP address.

_LPORT_
> Local port (default 443).

**meterpreter**
> Generate meterpreter payload.

**staged**
> Generate staged payload.

**--help**
> Display help information.

# DESCRIPTION

**msfpc** (MSFvenom Payload Creator) simplifies payload generation. It wraps msfvenom functionality.

The tool creates common payloads quickly. Generates handlers and multi-format outputs.

msfpc is MSFvenom payload helper.

# CAVEATS

Authorized testing only. Requires Metasploit. Detection likely without encoding.

# HISTORY

msfpc was created to simplify **msfvenom payload** generation for penetration testers.

# SEE ALSO

[msfvenom](/man/msfvenom)(1), [msfconsole](/man/msfconsole)(1), [nmap](/man/nmap)(1)

