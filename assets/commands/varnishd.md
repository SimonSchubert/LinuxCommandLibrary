# TLDR

**Start with default backend**

```varnishd -a :80 -b localhost:8080```

**Start with VCL configuration**

```varnishd -a :80 -f /etc/varnish/default.vcl```

**Run in foreground**

```varnishd -F -a :80 -b localhost:8080```

**Set cache storage size**

```varnishd -a :80 -b localhost:8080 -s malloc,[256m]```

**Enable management interface**

```varnishd -a :80 -b localhost:8080 -T localhost:6082```

**Set default TTL**

```varnishd -a :80 -b localhost:8080 -t [120]```

**Set runtime parameters**

```varnishd -a :80 -b localhost:8080 -p thread_pools=[2]```

# SYNOPSIS

**varnishd** [_options_]

# PARAMETERS

**-a** _address[:port]_
> Listen for client requests (default port: 80).

**-b** _host[:port]_
> Backend server (default port: 8080).

**-f** _config_
> VCL configuration file.

**-F**
> Run in foreground (don't fork).

**-s** _[name=]type[,options]_
> Storage backend: malloc, file, persistent.

**-t** _ttl_
> Default TTL for cached objects in seconds.

**-T** _address[:port]_
> Management interface address.

**-S** _secret-file_
> Authentication secret for management.

**-n** _name_
> Instance name and working directory.

**-p** _param=value_
> Set runtime parameter.

**-r** _param[,param...]_
> Make parameters read-only.

**-i** _identity_
> Server identity string.

**-I** _clifile_
> Execute CLI commands from file on start.

# DESCRIPTION

**varnishd** is the Varnish HTTP accelerator daemon. It acts as a reverse proxy cache, accepting HTTP requests, forwarding them to backend servers, and caching responses to serve future requests faster.

The daemon uses VCL (Varnish Configuration Language) to define caching policies, request routing, and response handling. VCL is compiled to C and loaded dynamically.

Storage backends include malloc (memory), file (disk), and persistent (survives restarts). Multiple storage backends and listening addresses can be configured.

The management interface allows runtime configuration changes, VCL loading, and statistics access via varnishadm.

# CAVEATS

Requires either -b or -f option. VCL changes require reload through management interface. Memory storage is lost on restart. Running on port 80 requires root or capabilities.

# HISTORY

**Varnish** was created by Poul-Henning Kamp and released in 2006. It was designed from scratch for modern hardware and operating systems, using techniques like memory-mapped files and kernel-level optimizations. It has become one of the most widely deployed HTTP accelerators.

# SEE ALSO

[varnishadm](/man/varnishadm)(1), [varnishlog](/man/varnishlog)(1), [varnishstat](/man/varnishstat)(1), [nginx](/man/nginx)(8)
