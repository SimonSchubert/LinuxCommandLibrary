# TAGLINE

Manage Azure Cache for Redis instances

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

**Force reboot** specified Redis node(s)

```az redis force-reboot --name [MyCache] --resource-group [MyResourceGroup] --reboot-type [AllNodes]```

**Flush all keys** in a Redis cache

```az redis flush --name [MyCache] --resource-group [MyResourceGroup] --yes```

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

**flush**
> Delete all keys in a Redis cache.

**force-reboot**
> Reboot specified Redis node(s).

**import**
> Import data into a Redis cache.

**export**
> Export data from a Redis cache.

**firewall-rules**
> Manage firewall rules.

**patch-schedule**
> Manage patch schedules.

**server-link**
> Manage Redis server links (requires Premium SKU).

**identity**
> Manage identity assigned to Azure Cache for Redis.

**access-policy**
> Manage access policies for Redis cache.

**access-policy-assignment**
> Manage access policy assignments (Redis users).

# PARAMETERS

**--name** **-n**
> Name of the Redis cache.

**--resource-group** **-g**
> Name of resource group.

**--sku**
> SKU tier: Basic, Standard, or Premium.

**--vm-size**
> Size of the Redis cache to deploy. Basic and Standard sizes start with c (c0-c6). Premium sizes start with p (p1-p5).

**--location** **-l**
> Location of the cache.

**--minimum-tls-version**
> Specifies the TLS version required by clients to connect to cache (1.0, 1.1, 1.2).

**--redis-version**
> Redis version in the form 'major[.minor]' or 'latest'. Default value is 'latest'.

**--yes** **-y**
> Do not prompt for confirmation (used with delete and flush).

# DESCRIPTION

**az redis** manages Azure Cache for Redis, a fully managed in-memory data store based on Redis. It provides low-latency, high-throughput caching for applications.

Available SKUs are Basic (single node), Standard (replicated), and Premium (clustering, persistence, virtual network support).

# CAVEATS

Requires Azure CLI to be installed and authenticated. Cache creation can take several minutes. Premium features like clustering and geo-replication require Premium SKU.

# SEE ALSO

[az](/man/az)(1), [redis-cli](/man/redis-cli)(1)
