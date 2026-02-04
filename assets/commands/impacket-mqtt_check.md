# TLDR

**Check MQTT broker** for anonymous access

```impacket-mqtt_check [192.168.1.100]```

**Check MQTT on a specific port**

```impacket-mqtt_check [192.168.1.100] -port [1883]```

**Check MQTT with credentials**

```impacket-mqtt_check [192.168.1.100] -user [username] -password [password]```

# SYNOPSIS

**impacket-mqtt_check** [_-h_] [_-port PORT_] [_-user USERNAME_] [_-password PASSWORD_] _target_

# PARAMETERS

**-port** _PORT_
> MQTT broker port (default: 1883)

**-user** _USERNAME_
> Username for MQTT authentication

**-password** _PASSWORD_
> Password for MQTT authentication

# DESCRIPTION

**impacket-mqtt_check** is a simple tool that checks if an MQTT (Message Queuing Telemetry Transport) broker allows connections, optionally testing for anonymous access. MQTT is a lightweight messaging protocol commonly used in IoT devices and applications.

The tool attempts to connect to the specified broker and reports whether the connection succeeds, helping identify misconfigured brokers that allow unauthenticated access.

# CAVEATS

Only tests connection capability, does not enumerate topics or messages. MQTT over TLS (port 8883) may require additional configuration. Some brokers may allow connection but restrict actions based on ACLs.

# HISTORY

Part of the **Impacket** library by SecureAuth. Added to address the growing security concerns around IoT protocols, particularly MQTT brokers exposed to the internet without proper authentication.

# SEE ALSO

[mosquitto_sub](/man/mosquitto_sub)(1), [mosquitto_pub](/man/mosquitto_pub)(1), [nmap](/man/nmap)(1)
