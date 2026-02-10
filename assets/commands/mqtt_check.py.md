# TAGLINE

nagios plugin for MQTT monitoring

# TLDR

**Check MQTT broker**

```mqtt_check.py -H [broker.example.com]```

**Check with authentication**

```mqtt_check.py -H [host] -u [user] -p [password]```

**Check specific port**

```mqtt_check.py -H [host] -P [1883]```

**Check with SSL**

```mqtt_check.py -H [host] --ssl```

**Set timeout**

```mqtt_check.py -H [host] -t [10]```

# SYNOPSIS

**mqtt_check.py** [_options_]

# PARAMETERS

**-H** _HOST_
> MQTT broker hostname.

**-P** _PORT_
> MQTT broker port.

**-u** _USER_
> Username for authentication.

**-p** _PASSWORD_
> Password for authentication.

**--ssl**
> Use SSL/TLS connection.

**-t** _SECONDS_
> Connection timeout.

**--help**
> Display help information.

# DESCRIPTION

**mqtt_check.py** is a Nagios plugin for MQTT monitoring. It checks MQTT broker availability.

The tool verifies broker connectivity. Returns status codes for monitoring systems.

# CAVEATS

Nagios plugin format. Requires paho-mqtt. Python script.

# HISTORY

mqtt_check.py was created for **Nagios/Icinga** monitoring to provide MQTT broker health checks.

# SEE ALSO

[mosquitto](/man/mosquitto)(1), [mosquitto_pub](/man/mosquitto_pub)(1), [nagios](/man/nagios)(1)

