# TAGLINE

command-line interface for FreePBX administration

# TLDR

**Reload** FreePBX configurations

```fwconsole reload```

**Start** Asterisk and other commands needed by FreePBX

```fwconsole start```

**Stop** Asterisk and other commands needed by FreePBX

```fwconsole stop```

View and **update settings**

```fwconsole setting [keyword] [new_value]```

List available **backups**

```fwconsole backup --list```

List available **FreePBX commands**

```fwconsole list```

Change **ownership** of all FreePBX files to the apache user

```fwconsole chown```

# SYNOPSIS

**fwconsole** _command_ [_options_]

# PARAMETERS

**reload**
> Apply configuration changes without restarting Asterisk

**start**
> Start FreePBX and Asterisk services

**stop**
> Stop FreePBX and Asterisk services

**restart**
> Restart FreePBX and Asterisk services

**setting**
> View or modify FreePBX settings

**backup**
> Manage FreePBX backups

**chown**
> Fix file ownership for web server access

**ma** (module admin)
> Manage FreePBX modules

**list**
> Display all available fwconsole commands

# DESCRIPTION

**fwconsole** is the command-line interface for managing FreePBX, an open-source web-based GUI for managing Asterisk PBX systems. It provides administrative control over the FreePBX configuration, modules, and underlying Asterisk server.

The tool handles configuration reloads, service management, module administration, backups, and system maintenance tasks. It's essential for automation, scripting, and troubleshooting FreePBX installations.

Configuration changes made through the web interface typically require **fwconsole reload** to apply to the running Asterisk instance.

# CAVEATS

Most commands require root privileges or appropriate sudo access. Running reload during active calls may cause brief service interruption. The chown command is necessary after manual file modifications to maintain proper web server permissions.

# HISTORY

fwconsole is part of FreePBX, which began as a web GUI for Asterisk in **2004**. Originally known as AMP (Asterisk Management Portal), it was renamed to FreePBX in 2006. The fwconsole command-line tool was introduced as part of FreePBX's modernization efforts.

# SEE ALSO

[asterisk](/man/asterisk)(8), [fs_cli](/man/fs_cli)(1)
