# TLDR

**Create a Redis cache**

```az redis create --name [MyCache] --resource-group [MyResourceGroup] --location [eastus] --sku [Basic] --vm-size [c0]```

**List all Redis caches** in a resource group

```az redis list --resource-group [MyResourceGroup]```

**Show details** of a Redis cache

```az redis show --name [MyCache] --resource-group [MyResourceGroup]```

**List access keys**

```az redis list-keys --name [MyCache] --resource-group [MyResourceGroup]```

**Regenerate access keys**

```az redis regenerate-keys --name [MyCache] --resource-group [MyResourceGroup] --key-type [Primary]```

**Update cache settings**

```az redis update --name [MyCache] --resource-group [MyResourceGroup] --set redisConfiguration.maxmemory-policy=allkeys-lru```

**Delete a Redis cache**

```az redis delete --name [MyCache] --resource-group [MyResourceGroup] --yes```

# SYNOPSIS

**az** **redis** _subcommand_ [_options_]

# SUBCOMMANDS

**create**
> Create a Redis cache.

**delete**
> Delete a Redis cache.

**list**
> List Redis caches.

**show**
> Get details of a Redis cache.

**update**
> Update a Redis cache.

**list-keys**
> Retrieve access keys.

**regenerate-keys**
> Regenerate access keys.

**force-reboot**
> Reboot a Redis cache.

**import**
> Import data into a Redis cache.

**export**
> Export data from a Redis cache.

**firewall-rules**
> Manage firewall rules.

**patch-schedule**
> Manage patch schedules.

# PARAMETERS

**--name** **-n**
> Name of the Redis cache.

**--resource-group** **-g**
> Name of resource group.

**--sku**
> SKU tier: Basic, Standard, or Premium.

**--vm-size**
> Size of the cache: c0, c1, c2, c3, c4, c5, c6 (or p1-p5 for Premium).

**--location** **-l**
> Location of the cache.

# DESCRIPTION

**az redis** manages Azure Cache for Redis, a fully managed in-memory data store based on Redis. It provides low-latency, high-throughput caching for applications.

Available SKUs are Basic (single node), Standard (replicated), and Premium (clustering, persistence, virtual network support).

# CAVEATS

Requires Azure CLI to be installed and authenticated. Cache creation can take several minutes. Premium features like clustering and geo-replication require Premium SKU.

# SEE ALSO

[az](/man/az)(1), [redis-cli](/man/redis-cli)(1)
