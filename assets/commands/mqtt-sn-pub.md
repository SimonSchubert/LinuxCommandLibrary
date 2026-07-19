# TAGLINE

Publish MQTT-SN messages from the command line

# TLDR

**Publish** a message to a topic

```mqtt-sn-pub -t [topic/name] -m ["hello"]```

**Publish** to a remote host and port

```mqtt-sn-pub -h [192.168.1.10] -p [1883] -t [sensors/temp] -m ["22.5"]```

**Publish** with QoS 1 and retain

```mqtt-sn-pub -t [topic] -m ["payload"] -q [1] -r```

**Publish** file contents as payload

```mqtt-sn-pub -t [topic] -f [payload.bin]```

**Publish** lines from stdin

```mqtt-sn-pub -t [topic] -l```

**Publish** one full stdin message

```mqtt-sn-pub -t [topic] -s```

**Null** (zero-length) message

```mqtt-sn-pub -t [topic] -n```

# SYNOPSIS

**mqtt-sn-pub** [*opts*] **-t** *topic* **-m** *message*

# DESCRIPTION

**mqtt-sn-pub** is part of **mqtt-sn-tools**, a set of small C utilities for the MQTT-SN (MQTT for Sensor Networks) protocol. It publishes a message to an MQTT-SN gateway or broker over UDP.

Build with **make** on a POSIX system from the upstream repository. Related tools: **mqtt-sn-sub**, **mqtt-sn-dump**, **mqtt-sn-serial-bridge**.

Supported features in the suite include QoS 0, 1, and -1, keepalives, retained and empty messages, clean/unclean sessions, and optional forwarder encapsulation (MQTT-SN v1.2). Packets must be 255 bytes or less; there is no QoS 2, LWT, or automatic gateway discovery.

# PARAMETERS

**-t** *topic*

> Topic name to publish to.

**-T** *topicid*

> Pre-defined topic ID instead of a name.

**-m** *message*

> Message payload string.

**-f** *file*

> Read payload from a file.

**-l**

> Read stdin, one message per line.

**-s**

> Read one whole message from stdin.

**-n**

> Send a null (zero length) message.

**-h** *host*

> Gateway/broker host (default **127.0.0.1**).

**-p** *port*

> UDP port (default **1883**).

**-q** *qos*

> Quality of Service: **0**, **1**, or **-1** (default 0).

**-r**

> Retained message.

**-k** *seconds*

> Keepalive interval (default 10).

**-i** *clientid*

> Client ID (default **mqtt-sn-tools-** plus process id).

**-d**

> Increase debug level (repeatable).

**--fe** / **--wlnid**

> Forwarder encapsulation and wireless node id options.

**--cport** *port*

> Source port for outgoing packets.

# CAVEATS

MQTT-SN is not MQTT over TCP; you need an MQTT-SN gateway. Packet size cap is 255 bytes. No automatic retry of lost packets. Default port 1883 matches many gateways but confirm your deployment.

# SEE ALSO

[mqtt-sn-sub](/man/mqtt-sn-sub)(1), [mqtt-sn-dump](/man/mqtt-sn-dump)(1), [mosquitto_pub](/man/mosquitto_pub)(1)

# RESOURCES

```[Source code](https://github.com/njh/mqtt-sn-tools)```

<!-- verified: 2026-07-19 -->
