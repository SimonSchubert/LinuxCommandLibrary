# TAGLINE

next-generation OpenVPN client for Linux, providing a D-Bus based architecture

# TLDR

**Start** a new VPN session

```openvpn3 session-start -c [path/to/config.conf]```

**List** established sessions

```openvpn3 sessions-list```

**Disconnect** the currently established session

```openvpn3 session-manage -c [path/to/config.conf] -D```

**Import** VPN configuration

```openvpn3 config-import -c [path/to/config.conf]```

**List** imported configurations

```openvpn3 configs-list```

# SYNOPSIS

**openvpn3** _command_ [_options_]

# PARAMETERS

**session-start** **-c** _config_
> Start a new VPN session using the specified configuration

**session-manage** **-c** _config_ **-D**
> Manage (disconnect) an active session

**sessions-list**
> List all active VPN sessions

**config-import** **-c** _config_
> Import a VPN configuration file into the configuration manager

**configs-list**
> List all imported configurations

**config-manage** **-c** _config_
> Manage imported configurations (rename, remove)

**config-show** **-c** _config_
> Display configuration details

**log** **-c** _config_
> Show session log output

**-c**, **--config** _path_
> Path to OpenVPN configuration file

**-D**, **--disconnect**
> Disconnect the session

**-R**, **--restart**
> Restart the session

**-P**, **--pause**
> Pause the session

**--resume**
> Resume a paused session

# DESCRIPTION

**openvpn3** is the next-generation OpenVPN client for Linux, providing a D-Bus based architecture that allows non-root users to manage VPN connections. It separates the VPN configuration management from the session management, enabling better integration with desktop environments and system services.

The client supports importing and storing configurations persistently, managing multiple simultaneous VPN sessions, and provides granular access control through D-Bus policies. It is designed to integrate with NetworkManager and other Linux desktop components.

# CAVEATS

Requires the openvpn3-linux package and associated D-Bus services. Not all OpenVPN 2.x configuration directives are supported. Configuration import stores credentials in the configuration manager; review access policies for sensitive environments.

# HISTORY

Developed by **OpenVPN Inc.** as a modernized Linux client using the OpenVPN 3 Core library. Released to address limitations of the traditional OpenVPN 2.x client, particularly around privilege separation and desktop integration. The D-Bus architecture was introduced to allow unprivileged VPN management.

# SEE ALSO

[openvpn](/man/openvpn)(8), [nmcli](/man/nmcli)(1), [networkctl](/man/networkctl)(1)
