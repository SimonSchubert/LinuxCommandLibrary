# TAGLINE

subscribes to MQTT topics and prints received messages

# TLDR

**Subscribe to topic**

```mosquitto_sub -t [sensors/temperature]```

**Subscribe to all topics**

```mosquitto_sub -t '#'```

**Subscribe with wildcard**

```mosquitto_sub -t '[sensors/+/temperature]'```

**Connect to remote broker**

```mosquitto_sub -h [broker.example.com] -t [topic]```

**Subscribe with authentication**

```mosquitto_sub -h [broker] -u [username] -P [password] -t [topic]```

**Subscribe with TLS**

```mosquitto_sub -h [broker] --cafile [ca.crt] -t [topic]```

**Show verbose output**

```mosquitto_sub -v -t '[sensors/#]'```

**Read single message and exit**

```mosquitto_sub -t [topic] -C 1```

# SYNOPSIS

**mosquitto_sub** [_-h host_] [_-p port_] [_-t topic_] [_-u user_] [_-P pass_] [_options_]

# PARAMETERS

**-t** _TOPIC_
> Topic to subscribe to (can repeat).

**-h** _HOST_
> Broker hostname.

**-p** _PORT_
> Broker port (default 1883).

**-u** _USER_
> Username.

**-P** _PASSWORD_
> Password.

**-i** _ID_
> Client ID.

**-v**
> Verbose (print topic with message).

**-C** _COUNT_
> Exit after receiving count messages.

**-q** _QOS_
> Quality of service (0, 1, 2).

**--cafile** _FILE_
> CA certificate for TLS.

**--cert** _FILE_
> Client certificate.

**--key** _FILE_
> Client private key.

**-F** _FORMAT_
> Output format string.

**-N**
> Don't append newline to messages.

**--retained-only**
> Only show retained messages.

# DESCRIPTION

**mosquitto_sub** subscribes to MQTT topics and prints received messages. MQTT is a lightweight publish/subscribe messaging protocol for IoT and telemetry.

Topics use hierarchical naming with / separators. Wildcards expand subscriptions: + matches one level, # matches all remaining levels. For example, sensors/+/temperature matches any sensor's temperature.

Quality of Service levels control delivery guarantees: QoS 0 is fire-and-forget, QoS 1 ensures at-least-once delivery, QoS 2 guarantees exactly-once delivery.

Retained messages are stored by the broker and sent immediately on subscription. This provides last-known values to new subscribers.

TLS encryption protects communication. Client certificates enable mutual authentication. The broker must be configured to accept TLS connections.

# CAVEATS

Subscribing to # on busy brokers produces high volume. QoS 2 has significant overhead. Passwords on command line visible in process list.

# HISTORY

**mosquitto_sub** is part of the **Eclipse Mosquitto** project, an MQTT broker and client suite. Mosquitto was created by **Roger Light** starting around **2009** and joined the **Eclipse Foundation** in **2014**.

# SEE ALSO

[mosquitto_pub](/man/mosquitto_pub)(1), [mosquitto](/man/mosquitto)(8), [mosquitto_passwd](/man/mosquitto_passwd)(1)
