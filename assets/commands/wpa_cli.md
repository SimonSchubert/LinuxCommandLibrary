# TAGLINE

Interactive frontend for wpa_supplicant

# TLDR

**Scan** for available networks

```sudo wpa_cli scan```

Show **scan results**

```sudo wpa_cli scan_results```

**Add** a new network

```sudo wpa_cli add_network```

Set network **SSID**

```sudo wpa_cli set_network 0 ssid "MyNetwork"```

Set network **password**

```sudo wpa_cli set_network 0 psk "password"```

**Enable** a network

```sudo wpa_cli enable_network 0```

**Save** configuration

```sudo wpa_cli save_config```

Show connection **status**

```sudo wpa_cli status```

# SYNOPSIS

**wpa_cli** [**-p** _path_] [**-g** _socket_] [**-i** _ifname_] [**-hvB**] [**-a** _file_] [_command_]

# DESCRIPTION

**wpa_cli** is a text-based frontend for interacting with wpa_supplicant. It can query network status, modify configuration, and handle authentication requests. It operates in interactive mode with a prompt or command-line mode with arguments.

# PARAMETERS

**-p PATH**
> Specify path to control sockets

**-i IFNAME**
> Select network interface

**-a FILE**
> Run in daemon mode with action file for events

**-B**
> Run as background daemon

**-G INTERVAL**
> Set ping interval in seconds

**status**
> Show current connection status

**scan**
> Initiate a network scan

**scan_results**
> Display scan results

**list_networks**
> List configured networks

**add_network**
> Add a new network (returns network ID)

**set_network ID PARAM VALUE**
> Set network parameter

**enable_network ID**
> Enable a network

**disable_network ID**
> Disable a network

**select_network ID**
> Select and enable a network, disabling others

**save_config**
> Save current configuration to file

**reconfigure**
> Reload configuration file

**reassociate**
> Force reconnection

**terminate**
> Stop wpa_supplicant

# CAVEATS

Requires root privileges or proper group membership for the control interface. The control interface can be configured to allow non-root access through the ctrl_interface GROUP parameter in wpa_supplicant.conf.

# HISTORY

**wpa_cli** is part of **wpa_supplicant**, a WPA and WPA2 supplicant for Linux, BSD, and Windows, commonly used for wireless network authentication.

# SEE ALSO

[wpa_supplicant](/man/wpa_supplicant)(8), [wpa_supplicant.conf](/man/wpa_supplicant.conf)(5), [iwconfig](/man/iwconfig)(8)
