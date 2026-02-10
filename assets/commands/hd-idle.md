# TAGLINE

utility that spins down external hard disks after a period of idle time

# TLDR

**Start** the hd-idle service with default settings (10 minute idle time)

```systemctl start hd-idle```

**Spin down** a disk immediately

```hd-idle -t [/dev/sdX]```

Set **per-disk idle times** in seconds

```hd-idle -i 0 -a /dev/sda -i [300] -a /dev/sdb -i [1200]```

Disable spin-down globally, enable for **specific disks** only

```hd-idle -i 0 -a [/dev/sda] -i [600]```

# SYNOPSIS

**hd-idle** [_options_]

# PARAMETERS

**-a** _DEVICE_
> Apply the following idle time to the specified device

**-i** _SECONDS_
> Set idle time in seconds (0 disables spin-down)

**-t** _DEVICE_
> Spin down the specified disk immediately

**-l** _LOGFILE_
> Log spin-down events to specified file

**-d**
> Run in debug mode, do not daemonize

# DESCRIPTION

**hd-idle** is a utility that spins down external hard disks after a period of idle time. It is particularly useful for USB or eSATA drives that don't support the hdparm -S command for automatic spin-down.

The daemon monitors disk activity and issues spin-down commands when disks have been idle for the configured time. Different idle times can be set for different disks, allowing fine-grained control over power management.

# CAVEATS

Works best with external drives that don't support native APM. Some drives may not respond to software spin-down commands. Frequent spin-down/spin-up cycles can reduce drive lifespan.

# HISTORY

hd-idle was created as a solution for external drives that lack proper power management support. It fills a gap where hdparm's spin-down feature doesn't work, common with USB enclosures that don't pass through ATA commands.

# SEE ALSO

[hdparm](/man/hdparm)(8), [sdparm](/man/sdparm)(8), [smartctl](/man/smartctl)(8)
