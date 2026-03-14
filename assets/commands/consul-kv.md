# TAGLINE

distributed key-value store management

# TLDR

**Get a key's value**

```consul kv get [key]```

**Put a value**

```consul kv put [key] [value]```

**Delete a key**

```consul kv delete [key]```

**List keys** with a prefix

```consul kv get -keys [prefix/]```

**Get with recurse**

```consul kv get -recurse [prefix/]```

**Export all keys**

```consul kv export [prefix/] > [backup.json]```

**Import keys**

```consul kv import @[backup.json]```

# SYNOPSIS

**consul** **kv** _subcommand_ [_options_]

# SUBCOMMANDS

**get**
> Retrieve a value from the KV store.

**put**
> Set a value in the KV store.

**delete**
> Remove a key from the KV store.

**export**
> Export KV pairs in JSON format.

**import**
> Import KV pairs from JSON.

# PARAMETERS

**-keys**
> List only keys, not values.

**-recurse**
> Retrieve all keys with the prefix.

**-base64**
> Encode/decode values as base64.

**-detailed**
> Provide additional metadata about the key.

**-separator** _STRING_
> String to use as separator for key listing (default: "/").

**-cas**
> Perform a Check-And-Set operation (requires -modify-index).

**-http-addr** _ADDRESS_
> Address of the Consul agent (default: "http://127.0.0.1:8500").

# DESCRIPTION

**consul kv** manages Consul's key-value store, a distributed data store for configuration and service discovery. Values can be strings, JSON, or binary data.

Part of HashiCorp Consul, the KV store is commonly used for dynamic configuration, feature flags, and service coordination. Keys are organized hierarchically using `/` as a separator, similar to a filesystem path structure. Values can be up to 512 KB in size.

# CAVEATS

The KV store is not designed for bulk data storage; there is a 512 KB limit per value. Recursive deletes (`consul kv delete -recurse`) are irreversible. Export/import uses JSON format and includes metadata. ACL tokens may be required depending on Consul configuration.

# SEE ALSO

[consul](/man/consul)(1), [etcdctl](/man/etcdctl)(1)
