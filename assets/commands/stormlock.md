# TAGLINE

simple centralized lock with lease expiration

# TLDR

**Acquire a lease** on a resource

```stormlock acquire [resource]```

**Acquire with explicit TTL**

```stormlock acquire --ttl "[30 minutes]" [resource]```

**Acquire and keep the lease id** in a shell variable

```lease=$(stormlock acquire [resource])```

**Release a lease** using its id

```stormlock release [resource] [lease-id]```

**Renew an existing lease**

```stormlock renew [resource] [lease-id]```

**Show the current lease** for a resource

```stormlock current [resource]```

**Print only the lease id**

```stormlock current --id-only [resource]```

**Show the current lease as JSON**

```stormlock current -f json [resource]```

**Check whether a lease is still held**

```stormlock is-held [resource] [lease-id]```

**Use a specific config file**

```stormlock -c [path/to/stormlock.cfg] acquire [resource]```

# SYNOPSIS

**stormlock** [**-c** _CONFIG_] _subcommand_ [_options_] _resource_ [_lease-id_]

# PARAMETERS

**acquire** [**-t** _TTL_] _RESOURCE_
> Attempt to acquire a lease. On success prints the lease id; if the lock is held, prints the holder's lease id and exits with status 2.

**release** _RESOURCE_ _LEASE_ID_
> Release the given lease on the given resource.

**renew** [**-t** _TTL_] _RESOURCE_ _LEASE_ID_
> Renew the lease with a new time to live. Exits with status 3 if the lease is no longer active.

**current** [**-f** _FORMAT_ | **--id-only**] _RESOURCE_
> Show the principal, creation time, and id of the current lease; exits 1 if no lease is active. _FORMAT_ is `rows` (default), `oneline`, `lines`, `cols`, `json`, or `id`; `--id-only` equals `--format=id`.

**is-held** _RESOURCE_ _LEASE_ID_
> Exit with status 0 if the given lease is still active, non-zero otherwise.

**-c**, **--config** _FILE_
> Path to the configuration file. Overrides `STORMLOCK_CONFIG`.

**-t**, **--ttl** _TTL_
> Override the time to live, written as `N unit` with unit `days`, `hours`, `minutes`, or `seconds` (prefixes like `30m` or `2h` also work). Defaults come from the config file.

**-h**, **--help**
> Show help.

# CONFIGURATION

**.stormlock.cfg**, **$XDG_CONFIG_HOME/stormlock.cfg**, **~/.stormlock.cfg**
> Searched in this order (`XDG_CONFIG_HOME` defaults to `~/.config`). INI-style file with a `[default]` section, optional per-resource sections, and `[backend.<name>]` sections. Common keys: `ttl` (e.g. `1 days`), `principal`, `backend`.

```
[default]
ttl = 1 days
principal = me@example.com
backend = etcd

[special]
ttl = 30 minutes
backend = redis

[backend.etcd]
host = etcd.example.com

[backend.redis]
url = redis://example.com:6379
```

**STORMLOCK_CONFIG**
> Overrides the configuration file path.

# BACKENDS

Supported storage backends:

- **etcd**: renewing always uses the same TTL as the original acquisition.
- **redis**
- **dynamodb**: AWS DynamoDB.
- **postgresql**
- **mysql**

Custom backends can be added by implementing the `stormlock.Backend` interface and registering the class in the `stormlock.backends` Python entry point.

# DESCRIPTION

**stormlock** is a simple centralized lock manager aimed primarily at human operators (and simple scripts) who need to coordinate infrequent operations across a distributed system, such as applying infrastructure-as-code changes or database patches. Each lock is associated with a principal (who holds it) and a lease with a TTL that auto-expires, so a crashed holder cannot deadlock the resource.

Typical flow: `stormlock acquire <resource>` prints a lease id; run the protected work; `stormlock release <resource> <lease-id>` when done. For long-running work, periodically call `stormlock renew` to extend the lease. Locks are designed to be held for hours or even days; TTL granularity is one second.

# CAVEATS

Upstream describes it as beta quality and not ready for production use. Lock availability depends on the availability of the backend. Locks are advisory: cooperating clients must all check the lock before acting. TTL must be tuned to be longer than the worst-case work unit (or renewed during it). The tool is written in Python; install via `pip install stormlock[etcd]` (or the `redis`, `dynamodb`, `postgresql`, `mysql` extras) for the backends you need. It is not intended as a general-purpose, high-frequency lock.

# HISTORY

**stormlock** is maintained by **Thayne McCombs** (tmccombs) on GitHub. It is released under the Apache 2.0 license.

# SEE ALSO

[flock](/man/flock)(1), [redis-cli](/man/redis-cli)(1), [etcdctl](/man/etcdctl)(1), [consul](/man/consul)(1)

# RESOURCES

```[Source code](https://github.com/tmccombs/stormlock)```

<!-- verified: 2026-11-23 -->
