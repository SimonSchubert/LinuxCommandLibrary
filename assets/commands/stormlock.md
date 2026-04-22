# TAGLINE

simple centralized lock with lease expiration

# TLDR

**Acquire a lease** on a resource

```stormlock acquire [resource]```

**Acquire with explicit TTL**

```stormlock acquire --ttl [60s] [resource]```

**Release a lease** using its id

```stormlock release [resource] [lease-id]```

**Renew an existing lease**

```stormlock renew [resource] [lease-id]```

**Show the current lease** for a resource

```stormlock current [resource]```

**Print only the lease id**

```stormlock current --id-only [resource]```

**Check whether a lease is still held**

```stormlock is-held [resource] [lease-id]```

# SYNOPSIS

**stormlock** _subcommand_ [_options_] _resource_ [_lease-id_]

# PARAMETERS

**acquire** _RESOURCE_ [**--ttl** _DUR_]
> Attempt to acquire a lease. On success prints the lease id.

**release** _RESOURCE_ _LEASE_ID_
> Release the given lease on the given resource.

**renew** _RESOURCE_ _LEASE_ID_ [**--ttl** _DUR_]
> Extend the lease duration.

**current** _RESOURCE_ [**--id-only**]
> Show the current lease holder and id. `--id-only` prints only the id.

**is-held** _RESOURCE_ _LEASE_ID_
> Exit with status 0 if the given lease is still active, non-zero otherwise.

**-c**, **--config** _FILE_
> Path to the configuration file. Overrides `STORMLOCK_CONFIG`.

**--ttl** _DURATION_
> Time-to-live for the lease (e.g. `30s`, `5m`, `1h`). Defaults come from the config file.

**--help**
> Show help.

# CONFIGURATION

**~/.config/stormlock/config.toml**
> Default configuration location. Uses INI/TOML syntax with `[default]`, per-resource, and `[backend.<name>]` sections. Common keys: `ttl`, `principal`, `backend`.

**STORMLOCK_CONFIG**
> Overrides the configuration file path.

# BACKENDS

Supported storage backends:

- **etcd** — uses etcd leases.
- **redis** — uses Redis keys with TTL.
- **dynamodb** — AWS DynamoDB table with conditional writes.
- **postgresql** — PostgreSQL row with expiry column.

Custom backends can be added by implementing the `stormlock.Backend` interface and registering it via Python entry points.

# DESCRIPTION

**stormlock** is a simple centralized lock manager aimed at human operators and scripts that need occasional coordination (deployments, migrations, cron runs). Each lock is associated with a principal (who holds it) and a lease with a TTL that auto-expires, so a crashed holder cannot deadlock the resource.

Typical flow: `stormlock acquire <resource>` prints a lease id; run the protected work; `stormlock release <resource> <lease-id>` when done. For long-running work, periodically call `stormlock renew` to extend the lease.

# CAVEATS

Requires a reachable backend. Locks are advisory — cooperating clients must all check the lock before acting. TTL must be tuned to be longer than the worst-case work unit (or renewed during it). The tool is written in Python; install via `pip install stormlock[etcd,redis,...]` with the backend extras you need.

# HISTORY

**stormlock** is maintained by **Thayne McCombs** (tmccombs) on GitHub. It is released under the Apache 2.0 license.

# SEE ALSO

[flock](/man/flock)(1), [redis-cli](/man/redis-cli)(1), [etcdctl](/man/etcdctl)(1), [consul](/man/consul)(1)
