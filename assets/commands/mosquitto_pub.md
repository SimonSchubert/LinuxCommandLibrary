# TAGLINE

publishes messages to an MQTT broker

# TLDR

**Publish message to topic**

```mosquitto_pub -t [topic] -m "[message]"```

**Publish to remote broker**

```mosquitto_pub -h [broker.example.com] -t [topic] -m "[message]"```

**Publish with authentication**

```mosquitto_pub -h [host] -u [user] -P [password] -t [topic] -m "[message]"```

**Publish file contents**

```mosquitto_pub -t [topic] -f [file.txt]```

**Publish with QoS**

```mosquitto_pub -t [topic] -m "[message]" -q [1]```

**Publish retained message**

```mosquitto_pub -t [topic] -m "[message]" -r```

# SYNOPSIS

**mosquitto_pub** [_options_]

# PARAMETERS

**-h** _HOST_
> MQTT broker hostname.

**-t** _TOPIC_
> Topic to publish to.

**-m** _MESSAGE_
> Message payload.

**-u** _USER_
> Username.

**-P** _PASSWORD_
> Password.

**-q** _QOS_
> Quality of service (0, 1, 2).

**-r**
> Retain message.

**--help**
> Display help information.

# DESCRIPTION

**mosquitto_pub** publishes messages to an MQTT broker. It's part of the Mosquitto package.

The tool sends single messages. Supports authentication, TLS, and various QoS levels.

# CAVEATS

Part of mosquitto-clients. Requires broker access. Default QoS is 0.

# HISTORY

mosquitto_pub is the **publishing client** distributed with the Eclipse Mosquitto MQTT broker.

# SEE ALSO

[mosquitto_sub](/man/mosquitto_sub)(1), [mosquitto](/man/mosquitto)(1), [mqtt](/man/mqtt)(1)

