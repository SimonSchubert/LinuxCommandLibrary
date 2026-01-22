# TLDR

Check Pi-hole **status**

```pihole status```

**Update** Pi-hole

```sudo pihole -up```

**Enable** or **disable** blocking

```pihole enable```

```pihole disable```

**Update** gravity (block lists)

```pihole -g```

**Allow** or **deny** a domain

```pihole allow example.com```

```pihole deny example.com```

**Query** for a domain in lists

```pihole -q example.com```

View **real-time log**

```pihole -t```

**Reload** DNS without restart

```pihole reloaddns```

# SYNOPSIS

**pihole** [_command_] [_options_]

# DESCRIPTION

**pihole** is the command-line interface for managing Pi-hole, a network-level advertisement and tracker blocking application that acts as a DNS sinkhole.

# PARAMETERS

**status**
> Show current Pi-hole status

**enable**
> Enable Pi-hole blocking

**disable [TIME]**
> Disable Pi-hole blocking (optionally for specified time)

**-up, updatePihole**
> Update Pi-hole to the latest version

**-g, updateGravity**
> Update the gravity database (block lists)

**allow DOMAIN**
> Add domain to the allow list

**deny DOMAIN**
> Add domain to the deny list

**-q, query DOMAIN**
> Search lists for a domain

**-t, tail**
> View real-time log of DNS queries

**reloaddns**
> Reload DNS lists and flush cache without restart

**restartdns**
> Restart the DNS server

**-c, chronometer**
> Display real-time stats in console

**-a, admin**
> Admin console options (password reset, etc.)

**checkout**
> Switch Pi-hole branches (for development)

# CAVEATS

Most commands require root privileges or use of sudo. Pi-hole acts as a DNS server, so disabling it affects all devices using it for DNS. The web admin interface provides additional management options.

# HISTORY

**Pi-hole** was created as a network-wide ad blocker that runs on a Raspberry Pi (or other Linux system) to block advertisements and tracking at the DNS level.

# SEE ALSO

[dnsmasq](/man/dnsmasq)(8), [unbound](/man/unbound)(8)
