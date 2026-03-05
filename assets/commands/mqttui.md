# TAGLINE

TUI for subscribing to and publishing MQTT messages

# TLDR

**Subscribe to all topics** on a broker

```mqttui```

**Connect to a specific broker**

```mqttui mqtt://[host]:[port]```

**Subscribe to a specific topic**

```mqttui "[topic]"```

**Publish a message**

```mqttui publish "[topic]" "[message]"```

# SYNOPSIS

**mqttui** [_options_] [_topic_]

# PARAMETERS

**publish** _TOPIC_ _MESSAGE_
> Publish a message to a topic.

**clean-retained** _TOPIC_
> Clean retained messages for a topic.

# DESCRIPTION

**mqttui** is a TUI tool for subscribing to MQTT topics and publishing messages from the terminal. It displays a topic tree with live message updates and supports retained message management.

The default broker can be configured via the **MQTTUI_BROKER** environment variable to avoid specifying it each time.

# CAVEATS

Requires access to an MQTT broker. Subscribing to broad topics on busy brokers may generate high message volume.

# HISTORY

**mqttui** was created by **EdJoPaTo** and is written in **Rust**.

# SEE ALSO

[mosquitto_sub](/man/mosquitto_sub)(1), [mosquitto_pub](/man/mosquitto_pub)(1)
