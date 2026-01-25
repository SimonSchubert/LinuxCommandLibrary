# TLDR

**Stop PPPoE connection**

```sudo pppoe-stop```

**Stop specific interface**

```sudo pppoe-stop -I [eth0]```

**Stop with config file**

```sudo pppoe-stop [/etc/ppp/pppoe.conf]```

# SYNOPSIS

**pppoe-stop** [_options_] [_config-file_]

# PARAMETERS

**-I** _interface_
> Network interface.

**config-file**
> Configuration file path.

# DESCRIPTION

**pppoe-stop** terminates an active PPPoE (Point-to-Point Protocol over Ethernet) connection. It's the counterpart to pppoe-start and is part of the rp-pppoe package.

# EXAMPLES

```bash
# Stop default connection
sudo pppoe-stop

# Stop specific interface
sudo pppoe-stop -I eth1

# Using custom config
sudo pppoe-stop /etc/ppp/pppoe-custom.conf

# Check status first
pppoe-status
sudo pppoe-stop
```

# RELATED COMMANDS

```bash
pppoe-start   - Start PPPoE connection
pppoe-status  - Check connection status
pppoe-connect - Manual connection
pppoe-setup   - Configure PPPoE
```

# CAVEATS

Requires root privileges. Part of rp-pppoe package. NetworkManager may manage PPPoE differently.

# HISTORY

pppoe-stop is part of **rp-pppoe** (Roaring Penguin PPPoE) by **David F. Skoll** for Linux PPPoE connections.

# SEE ALSO

[pppoe-start](/man/pppoe-start)(8), [pppoe-status](/man/pppoe-status)(8), [pppd](/man/pppd)(8), [pppoe](/man/pppoe)(8)
