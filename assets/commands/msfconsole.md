# TLDR

**Start Metasploit console**

```msfconsole```

**Execute resource script**

```msfconsole -r [script.rc]```

**Execute single command**

```msfconsole -x "[use exploit/multi/handler; run]"```

**Quiet mode**

```msfconsole -q```

**Connect to database**

```msfconsole -d```

**Show version**

```msfconsole -v```

# SYNOPSIS

**msfconsole** [_options_]

# PARAMETERS

**-r** _FILE_
> Execute resource script.

**-x** _CMD_
> Execute command string.

**-q**
> Quiet mode, no banner.

**-d**
> Connect to database.

**-v**
> Show version.

**--help**
> Display help information.

# DESCRIPTION

**msfconsole** is the Metasploit Framework console. It provides access to exploits and security tools.

The tool is the primary Metasploit interface. Used for penetration testing and security research.

msfconsole is Metasploit Framework CLI.

# CAVEATS

Authorized testing only. Requires proper setup. Resource intensive.

# HISTORY

msfconsole is part of **Metasploit Framework**, created by H.D. Moore in 2003 for penetration testing.

# SEE ALSO

[msfvenom](/man/msfvenom)(1), [nmap](/man/nmap)(1), [msfpc](/man/msfpc)(1)

