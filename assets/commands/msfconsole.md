# TAGLINE

metasploit Framework console

# TLDR

**Start Metasploit console**

```msfconsole```

Start **without the banner**

```msfconsole -q```

**Execute resource script**

```msfconsole -r [script.rc]```

**Execute console commands** on startup (separated by ;)

```msfconsole -q -x "use exploit/multi/handler; set PAYLOAD [windows/x64/meterpreter/reverse_tcp]; set LHOST [ip]; run"```

Start **without database** support

```msfconsole -n```

**Log console output** to a file

```msfconsole -o [path/to/output.log]```

**Load a plugin** on startup

```msfconsole -p [plugin_name]```

Load an **additional module path**

```msfconsole -m [path/to/modules]```

**Show version**

```msfconsole -v```

# SYNOPSIS

**msfconsole** [_options_]

# PARAMETERS

**-q**, **--quiet**
> Do not print the banner on startup.

**-r**, **--resource** _FILE_
> Execute the specified resource file (- for stdin).

**-x**, **--execute-command** _COMMAND_
> Execute the specified console commands (use ; for multiples).

**-n**, **--no-database**
> Disable database support.

**-y**, **--yaml** _PATH_
> YAML file containing database settings.

**-o**, **--output** _FILE_
> Output to the specified file.

**-p**, **--plugin** _PLUGIN_
> Load a plugin on startup.

**-m**, **--module-path** _DIR_
> Load an additional module path.

**-H**, **--history-file** _FILE_
> Save command history to the specified file.

**-a**, **--ask**
> Ask before exiting Metasploit or accept 'exit -y'.

**-c** _FILE_
> Load the specified configuration file.

**-E**, **--environment** _ENV_
> Set the environment (development, production, test).

**--module-count**
> Print module counts and exit.

**--[no-]defer-module-loads**
> Defer module loading unless explicitly asked.

**-v**, **--version**
> Show version.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**msfconsole** is the main interactive interface to the Metasploit Framework. It gives access to exploits, payloads, auxiliary scanners and post-exploitation modules, with tab completion and a command history.

Common console commands include **search**, **use**, **show options**, **set**, **run**/**exploit**, **sessions** and **db_nmap**. Resource scripts (.rc) automate sequences of these commands. A PostgreSQL database, initialized with **msfdb init**, stores hosts, services and loot.

# CAVEATS

Only use against systems you are authorized to test. Startup is slow while modules load. Antivirus software often quarantines Metasploit files.

# HISTORY

msfconsole is part of the **Metasploit Framework**, created by H.D. Moore in 2003 in Perl and rewritten in Ruby in 2007. Rapid7 acquired the project in 2009.

# SEE ALSO

[metasploit](/man/metasploit)(1), [msfvenom](/man/msfvenom)(1), [searchsploit](/man/searchsploit)(1), [nmap](/man/nmap)(1), [msfpc](/man/msfpc)(1)

# RESOURCES

```[Source code](https://github.com/rapid7/metasploit-framework)```

```[Homepage](https://www.metasploit.com)```

```[Documentation](https://docs.metasploit.com)```

<!-- verified: 2026-09-29 -->
