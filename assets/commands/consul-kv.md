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

# DESCRIPTION

**consul kv** manages Consul's key-value store, a distributed data store for configuration and service discovery. Values can be strings, JSON, or binary data.

Part of HashiCorp Consul, the KV store is commonly used for dynamic configuration, feature flags, and service coordination.

# SEE ALSO

[consul](/man/consul)(1), [etcdctl](/man/etcdctl)(1)
