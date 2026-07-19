# TAGLINE

Subscribe to MQTT-SN topics from the command line

# TLDR

**Subscribe** to a topic

```mqtt-sn-sub -t [topic/name]```

**Subscribe** with verbose topic names

```mqtt-sn-sub -t [sensors/#] -v```

**Subscribe** and exit after one message

```mqtt-sn-sub -t [topic] -1```

**Remote gateway**

```mqtt-sn-sub -h [192.168.1.10] -p [1883] -t [topic]```

**QoS 1** subscription

```mqtt-sn-sub -t [topic] -q [1]```

**Verbose with timestamps**

```mqtt-sn-sub -t [topic] -V```

# SYNOPSIS

**mqtt-sn-sub** [*opts*] **-t** *topic*

# DESCRIPTION

**mqtt-sn-sub** is the subscriber from **mqtt-sn-tools**, a C toolkit for MQTT-SN (MQTT for Sensor Networks). It connects to an MQTT-SN gateway over UDP and prints received messages. Topic arguments may be repeated; pre-defined topic IDs are supported with **-T**.

Build with **make** from the upstream repository. Companion tools include **mqtt-sn-pub**, **mqtt-sn-dump**, and **mqtt-sn-serial-bridge**.

# PARAMETERS

**-t** *topic*

> Topic to subscribe to (repeatable). May include MQTT-SN wildcards where supported by the gateway.

**-T** *topicid*

> Pre-defined topic ID to subscribe to (repeatable).

**-1**

> Exit after receiving a single message.

**-c**

> Disable clean session (store subscription/pending messages across disconnect).

**-h** *host* / **-p** *port*

> Gateway host (default **127.0.0.1**) and port (default **1883**).

**-q** *qos*

> Subscribe QoS **0** or **1** (default 0).

**-k** *seconds*

> Keepalive (default 10).

**-i** *clientid*

> Client ID (default **mqtt-sn-tools-** plus pid).

**-v** / **-V**

> Verbose output: topic name, or time plus topic name.

**-d**

> Increase debug level (repeatable).

**--fe** / **--wlnid** / **--cport**

> Forwarder encapsulation, wireless node id, and source port options.

# CAVEATS

Requires an MQTT-SN gateway, not a plain MQTT broker. Packet size limit 255 bytes; no QoS 2. Wildcard behaviour depends on gateway support.

# SEE ALSO

[mqtt-sn-pub](/man/mqtt-sn-pub)(1), [mqtt-sn-dump](/man/mqtt-sn-dump)(1), [mosquitto_sub](/man/mosquitto_sub)(1)

# RESOURCES

```[Source code](https://github.com/njh/mqtt-sn-tools)```

<!-- verified: 2026-07-19 -->
