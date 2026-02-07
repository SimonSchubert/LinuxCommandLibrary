# TAGLINE

Open-source PBX and telephony server

# TLDR

**Connect** to running server

```asterisk -r -vvv```

Run **single command**

```asterisk -r -x "command"```

Show **SIP peers**

```asterisk -r -x "sip show peers"```

Show **active calls**

```asterisk -r -x "core show channels"```

Show **voicemail** users

```asterisk -r -x "voicemail show users"```

**Hangup** a channel

```asterisk -r -x "hangup request channel_ID"```

**Reload** SIP config

```asterisk -r -x "sip reload"```

# SYNOPSIS

**asterisk** [_OPTIONS_]

# DESCRIPTION

**asterisk** runs and manages the Asterisk PBX (Private Branch Exchange) telephony server. It handles VoIP calls, traditional phone lines, and provides features like voicemail, conferencing, and interactive voice response (IVR).

# PARAMETERS

**-r**
> Reconnect to a running Asterisk instance

**-R**
> Same as -r but attempt reconnection if disconnected

**-x** _command_
> Execute a CLI command and exit

**-v**
> Increase verbosity (can be used multiple times)

**-c**
> Start Asterisk in console mode (foreground)

**-g**
> Dump core on crash

**-n**
> Disable ANSI color in console

# CONFIGURATION

**/etc/asterisk/asterisk.conf**
> Main configuration file controlling global settings, directory paths, and module loading.

**/etc/asterisk/extensions.conf**
> Dialplan configuration defining call routing, IVR menus, and application logic.

**/etc/asterisk/sip.conf**
> Legacy SIP channel driver configuration for peers, trunks, and registrations.

**/etc/asterisk/pjsip.conf**
> Modern PJSIP stack configuration for endpoints, transports, and authentication.

**/etc/asterisk/voicemail.conf**
> Voicemail system configuration including mailbox definitions and notification settings.

**/etc/asterisk/modules.conf**
> Controls which Asterisk modules are loaded at startup.

# CAVEATS

Requires proper configuration of SIP/PJSIP, dialplans, and extensions. Telephony requires understanding of VoIP protocols, codecs, and networking. Configuration is extensive and typically stored in /etc/asterisk/.

# HISTORY

**Asterisk** is an open-source PBX and telephony toolkit created by Digium (now Sangoma). It powers communication solutions from small offices to large call centers.

# SEE ALSO

[asterisk-cli](/man/asterisk-cli)(8), [sip.conf](/man/sip.conf)(5)
