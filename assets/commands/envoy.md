# TLDR

**Start with configuration file**

```envoy -c [/path/to/config.yaml]```

**Validate configuration** without running

```envoy -c [config.yaml] --mode validate```

**Start with service cluster name**

```envoy -c [config.yaml] --service-cluster [my-cluster]```

**Start with custom node ID**

```envoy -c [config.yaml] --service-node [node-1]```

**Run with specific base ID** for hot restart

```envoy -c [config.yaml] --base-id [1]```

**Start with inline YAML config**

```envoy --config-yaml "[yaml-string]"```

**Enable debug logging**

```envoy -c [config.yaml] -l debug```

# SYNOPSIS

**envoy** [_options_]

# PARAMETERS

**-c**, **--config-path** _path_
> Path to bootstrap configuration file (.json, .yaml, .pb, .pb_text).

**--config-yaml** _yaml_
> Inline YAML configuration string. Merges with --config-path.

**--mode** _mode_
> Run mode: serve (default) or validate.

**--service-cluster** _name_
> Local service cluster name.

**--service-node** _id_
> Local service node identifier.

**--service-zone** _zone_
> Local service zone for locality.

**--local-address-ip-version** _version_
> IP version for local address: v4 or v6.

**-l**, **--log-level** _level_
> Log level: trace, debug, info, warning, error, critical, off.

**--log-path** _path_
> Path to log file.

**--log-format** _format_
> Log message format string.

**--component-log-level** _config_
> Per-component log levels.

**--base-id** _id_
> Base ID for shared memory (hot restart).

**--use-dynamic-base-id**
> Automatically select unused base ID.

**--restart-epoch** _epoch_
> Hot restart epoch number.

**--concurrency** _num_
> Number of worker threads.

**--file-flush-interval-msec** _ms_
> File buffer flush interval in milliseconds.

**--drain-time-s** _seconds_
> Time to drain connections during hot restart.

**--parent-shutdown-time-s** _seconds_
> Time before parent shuts down during hot restart.

**--version**, **-v**
> Show version information.

**--help**, **-h**
> Show help message.

# DESCRIPTION

**envoy** is a high-performance L4/L7 proxy and communication bus designed for large modern service-oriented architectures. It handles load balancing, service discovery, observability, and provides advanced traffic management features.

Configuration is provided via YAML, JSON, or protobuf files specified with **-c**. The configuration defines listeners (ports), clusters (upstreams), routes, and filters. Dynamic configuration can be fetched from xDS APIs.

Hot restart allows upgrading Envoy without dropping connections. The **--base-id** identifies shared memory regions between parent and child processes. Use **--restart-epoch** to coordinate restarts.

The **validate** mode checks configuration syntax and semantics without starting the proxy, useful for CI/CD pipelines.

Envoy is commonly deployed as a sidecar proxy in service meshes (Istio, Consul Connect) or as an edge/ingress proxy. It supports HTTP/1.1, HTTP/2, gRPC, TCP, and UDP protocols.

# CAVEATS

Configuration complexity can be high for advanced use cases. Hot restart requires proper base-id coordination. Memory usage scales with number of connections and clusters. Some features require specific filter configurations.

# HISTORY

Envoy was created at **Lyft** by Matt Klein and open-sourced in **September 2016**. It was designed to handle Lyft's microservices traffic with focus on observability and debuggability. Envoy joined the CNCF in **2017** and graduated in **2018**. It became the foundation for service meshes like Istio and is widely used as a data plane proxy.

# SEE ALSO

[nginx](/man/nginx)(1), [haproxy](/man/haproxy)(1), [istioctl](/man/istioctl)(1), [traefik](/man/traefik)(1)
