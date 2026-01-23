# TLDR

**Connect to the running Asterisk** console

```asterisk -r```

**Connect with verbose output**

```asterisk -rvvv```

**Execute a CLI command** from shell

```asterisk -rx "sip show peers"```

**Reload the dialplan**

```asterisk -rx "dialplan reload"```

**Show active calls**

```asterisk -rx "core show channels"```

**Show SIP registrations**

```asterisk -rx "sip show registry"```

**Gracefully shutdown** Asterisk

```asterisk -rx "core stop gracefully"```

# SYNOPSIS

**asterisk** **-r** [**-v**...]

**asterisk** **-rx** "_command_"

# PARAMETERS

**-r**
> Connect to a running Asterisk instance via remote console

**-R**
> Same as -r, but attempt reconnection if disconnected

**-v**
> Increase verbosity (can be repeated: -vvv for more detail)

**-x** _command_
> Execute a CLI command and exit

**-c**
> Start Asterisk in console mode (foreground)

**-g**
> Dump core on crash (for debugging)

**-n**
> Disable ANSI color output

# CLI COMMANDS

**core show help** [_command_]
> Display help for CLI commands

**core show channels**
> List active channels and calls

**core show applications**
> List available dialplan applications

**dialplan reload**
> Reload the dialplan configuration

**sip show peers**
> Display configured SIP peers

**sip show registry**
> Show SIP registration status

**pjsip show endpoints**
> Display PJSIP endpoints (modern SIP stack)

**module reload** _module_
> Reload a specific module

**logger reload**
> Reload logging configuration

**core stop gracefully**
> Stop Asterisk after calls complete

**core stop now**
> Stop Asterisk immediately

**database show** [_family_]
> Display AstDB database contents

# DESCRIPTION

**Asterisk CLI** is the command-line interface for managing the Asterisk PBX (Private Branch Exchange) server. It provides real-time monitoring, configuration reloading, and administrative control over the telephony system.

Connect to a running Asterisk instance with **asterisk -r**. For scripts and automation, use **asterisk -rx "command"** to execute commands non-interactively. Tab completion is available for commands within the interactive console.

The CLI provides access to all Asterisk subsystems including SIP/PJSIP peers, active channels, dialplan, voicemail, queues, and the internal database. Verbosity levels (-v flags) control the amount of real-time event output displayed.

Configuration changes typically require module reloads rather than full restarts. Use **dialplan reload** for extensions.conf changes or **module reload** for specific modules.

# CAVEATS

The Asterisk daemon must be running before connecting with **-r**. Some commands require specific modules to be loaded. The legacy **chan_sip** module uses **sip** commands while modern deployments use **pjsip** commands. Heavy verbosity can impact performance on busy systems.

# HISTORY

**Asterisk** was created by **Mark Spencer** at Digium (now Sangoma) and first released in **1999**. It pioneered software-based PBX systems and VoIP telephony. The CLI has evolved alongside Asterisk, with the introduction of PJSIP in Asterisk 12 (2013) providing a modern SIP stack alongside the legacy chan_sip module.

# SEE ALSO

[asterisk](/man/asterisk)(8), [freeswitch](/man/freeswitch)(1), [kamailio](/man/kamailio)(8)
