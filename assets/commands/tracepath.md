# TAGLINE

Trace network path with MTU discovery

# TLDR

**Trace** path to a host with MTU discovery

```tracepath -p 33434 [host]```

**Trace** with a specific destination port

```tracepath -p [port] [host]```

**Print** both hostnames and IP addresses

```tracepath -b [host]```

**Specify** maximum TTL (hops)

```tracepath -m [max_hops] [host]```

**Specify** initial packet length

```tracepath -l [packet_length] [host]```

**Use** only IPv6 addresses

```tracepath -6 [host]```

# SYNOPSIS

**tracepath** [_options_] _host_

# PARAMETERS

**-p _port_**
> Set initial destination port

**-b**
> Print both hostnames and numerical IP addresses

**-m _max_hops_**
> Set maximum number of hops (TTL)

**-l _length_**
> Set initial packet length

**-4**
> Use IPv4 only

**-6**
> Use IPv6 only

**-n**
> Print only numeric addresses

# DESCRIPTION

**tracepath** traces the path to a network host, discovering the MTU (Maximum Transmission Unit) along the path. Unlike traceroute, it does not require superuser privileges and can detect path MTU.

The output shows each hop with its RTT and MTU information.

# CAVEATS

May not work through firewalls that block UDP packets. Results can vary based on network conditions and firewall rules. Part of the iputils package.

# SEE ALSO

[traceroute](/man/traceroute)(8), [ping](/man/ping)(8), [mtr](/man/mtr)(8)
