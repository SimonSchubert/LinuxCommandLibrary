# TAGLINE

smart meter security testing framework

# TLDR

**Start an interactive session**

```termineter```

**Start with a specific resource file**

```termineter -r [script.rc]```

**Start with debug logging**

```termineter -L DEBUG```

# SYNOPSIS

**termineter** [_options_]

# PARAMETERS

**-h**, **--help**
> Show help message and exit.

**-v**, **--version**
> Show version number and exit.

**-L** _LEVEL_, **--log** _LEVEL_
> Set the logging level (DEBUG, INFO, WARNING, ERROR, CRITICAL).

**-r** _FILE_, **--rc-file** _FILE_
> Execute a resource file on startup.

# DESCRIPTION

**termineter** is a Python framework for security testing of smart meters. It implements the C1218 and C1219 protocols for communication over an optical interface using ANSI type-2 optical probes with serial connections.

The tool provides an interactive shell similar to Metasploit, with modules for reading meter tables, brute-forcing credentials, and testing meter security. Commands include **connect**, **disconnect**, **use**, **run**, **set**, and **show**.

# CAVEATS

Requires physical access to the smart meter via an optical probe and serial adapter. Available in Kali Linux repositories and via pip.

# SEE ALSO

[msfconsole](/man/msfconsole)(1), [setoolkit](/man/setoolkit)(1)

