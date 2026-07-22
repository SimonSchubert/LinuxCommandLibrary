# TAGLINE

open source MQTT message broker

# TLDR

**Start MQTT broker**

```mosquitto```

**Start with config file**

```mosquitto -c [/etc/mosquitto/mosquitto.conf]```

**Start in verbose mode**

```mosquitto -v```

**Specify port**

```mosquitto -p [1883]```

**Run as daemon**

```mosquitto -d```

**Specify log file**

```mosquitto -c [mosquitto.conf] --log-dest file [/var/log/mosquitto.log]```

# SYNOPSIS

**mosquitto** [_options_]

# PARAMETERS

**-c** _FILE_
> Configuration file.

**-p** _PORT_
> Listening port.

**-v**
> Verbose mode.

**-d**
> Run as daemon.

**--log-dest** _TYPE_
> Log destination.

**--help**
> Display help information.

# DESCRIPTION

**mosquitto** is an open source MQTT message broker. It implements MQTT protocol versions 5.0, 3.1.1, and 3.1.

The tool handles publish/subscribe messaging. Lightweight and suitable for IoT applications.

# CAVEATS

Requires proper security config. Default no authentication. Consider TLS for production.

# HISTORY

mosquitto was created by **Roger Light** around **2009** and later joined the **Eclipse Foundation** in **2014**. It provides a lightweight, open source MQTT broker suitable for embedded and IoT applications.

# INSTALL

```apt: sudo apt install mosquitto```

```dnf: sudo dnf install mosquitto```

```pacman: sudo pacman -S mosquitto```

```apk: sudo apk add mosquitto```

```zypper: sudo zypper install mosquitto```

```brew: brew install mosquitto```

```nix: nix profile install nixpkgs#mosquitto```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[mosquitto_pub](/man/mosquitto_pub)(1), [mosquitto_sub](/man/mosquitto_sub)(1)

