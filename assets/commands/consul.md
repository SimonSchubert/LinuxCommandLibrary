# TAGLINE

service discovery and configuration tool

# TLDR

**Start agent in development mode**

```consul agent -dev```

**List datacenter members**

```consul members```

**Register service**

```consul services register [service.json]```

**Deregister service**

```consul services deregister -id=[service-id]```

**List services in catalog**

```consul catalog services```

**DNS lookup for service**

```dig @127.0.0.1 -p 8600 [web.service.consul]```

**Store key-value pair**

```consul kv put [key] [value]```

**Get key-value**

```consul kv get [key]```

**Join cluster**

```consul join [192.168.1.100]```

**Validate configuration files**

```consul validate [/etc/consul.d/]```

**Reload agent configuration**

```consul reload```

# SYNOPSIS

**consul** [_options_] _command_ [_arguments_]

# DESCRIPTION

**consul** is HashiCorp's service discovery and configuration tool. It provides service mesh, health checking, key/value storage, multi-datacenter support, and secure service-to-service communication.

# COMMANDS

**agent**
> Run a Consul agent

**members**
> List cluster members

**join**
> Join cluster via agent address

**leave**
> Gracefully leave cluster

**catalog**
> Interact with service catalog

**services**
> Register/deregister services

**kv**
> Key/value store operations

**connect**
> Service mesh functionality

**acl**
> Access control list management

**watch**
> Watch for changes in data views and invoke a process

**event**
> Fire a custom user event

**exec**
> Remote execution on cluster nodes

**operator**
> Cluster-level operator tools

**snapshot**
> Save/restore cluster state

**reload**
> Reload agent configuration files

**validate**
> Validate configuration files

**monitor**
> Stream logs from a running agent

**debug**
> Create debugging archive

# PARAMETERS

**-dev**
> Development mode (single node, no persistence)

**-server**
> Run agent in server mode

**-bind** _addr_
> Address for internal cluster communications (default: 0.0.0.0)

**-token** _token_
> ACL token for authentication

**-token-file** _file_
> File containing the ACL token

**-datacenter** _dc_
> Target datacenter

**-http-addr** _addr_
> Consul HTTP API address

**-auto-reload-config**
> Automatically reload configuration when files change

# CONFIGURATION

**/etc/consul.d/**
> Configuration directory for Consul agent settings, services, and checks in HCL or JSON format.

# ENVIRONMENT

**CONSUL_HTTP_ADDR**
> HTTP API address

**CONSUL_HTTP_TOKEN**
> ACL token

**CONSUL_CACERT**
> CA certificate path

**CONSUL_HTTP_SSL**
> Use HTTPS when communicating with Consul

# DNS INTERFACE

Default DNS port: 8600

```dig @127.0.0.1 -p 8600 web.service.consul```

# CAVEATS

ACL system requires token for most operations when enabled. Development mode stores everything in memory. Production requires proper clustering configuration.

# SEE ALSO

[vault](/man/vault)(1), [nomad](/man/nomad)(1), [terraform](/man/terraform)(1)
