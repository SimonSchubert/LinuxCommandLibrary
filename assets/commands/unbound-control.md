# TAGLINE

Remote control interface for Unbound DNS resolver

# TLDR

**Check server status**

```unbound-control status```

**View statistics**

```unbound-control stats```

**Reload configuration**

```unbound-control reload```

**Flush entire cache**

```unbound-control flush_zone [.]```

**Flush specific domain**

```unbound-control flush [example.com]```

**Add local zone**

```unbound-control local_zone [example.com] [static]```

**Add local data**

```unbound-control local_data "[example.com. A 192.168.1.1]"```

**List forward zones**

```unbound-control list_forwards```

# SYNOPSIS

**unbound-control** [_options_] _command_

# COMMANDS

**start**: Start the server.

**stop**: Stop the server.

**reload**: Reload configuration.

**status**: Show server status.

**stats**: Display statistics.

**stats_noreset**: Stats without resetting counters.

**flush** _name_: Flush name from cache.

**flush_type** _name_ _type_: Flush specific RR type.

**flush_zone** _name_: Flush entire zone.

**local_zone** _name_ _type_: Add local zone.

**local_data** _RR_: Add local data.

**local_data_remove** _name_: Remove local data.

**forward_add** _zone_ _addr_: Add forward zone.

**forward_remove** _zone_: Remove forward zone.

**list_forwards**: List forward zones.

**list_stubs**: List stub zones.

**dump_cache**: Dump cache to stdout.

**load_cache**: Load cache from stdin.

# PARAMETERS

**-c** _file_
> Configuration file path.

**-s** _server_
> Server address to connect to.

**-q**
> Quiet mode.

**-h**
> Display help.

# DESCRIPTION

**unbound-control** is a utility for managing the Unbound DNS resolver daemon. It communicates with a running unbound server over a secure channel using TLS certificates.

Before use, run **unbound-control-setup** to generate the required certificates and keys. The remote-control section must be enabled in unbound.conf.

The tool enables runtime configuration changes including cache management, adding local zones and data, and modifying forwarding without restarting the server.

# CAVEATS

Requires unbound-control-setup for initial certificate generation. Server must have remote-control enabled. Changes made via unbound-control are not persistent across restarts unless also in config file.

# HISTORY

**unbound-control** is part of the Unbound DNS resolver developed by NLnet Labs. Unbound is a validating, recursive, caching DNS resolver designed for high performance and security with DNSSEC support.

# SEE ALSO

[unbound](/man/unbound)(8), [unbound-checkconf](/man/unbound-checkconf)(8), [unbound-host](/man/unbound-host)(1)
