# TLDR

**Acquire lock**

```stormlock acquire [lock-name]```

**Release lock**

```stormlock release [lock-name] [lease-id]```

**Check lock**

```stormlock check [lock-name]```

**With TTL**

```stormlock acquire --ttl [60s] [lock-name]```

**List locks**

```stormlock list```

# SYNOPSIS

**stormlock** _command_ [_--ttl duration_] [_options_] [_name_]

# PARAMETERS

**acquire**
> Get lock.

**release**
> Free lock.

**check**
> Check status.

**list**
> Show all locks.

**--ttl** _DUR_
> Lock timeout.

**--backend** _TYPE_
> Storage backend.

# DESCRIPTION

**stormlock** provides distributed locks. It coordinates processes.

Lease-based locking. Auto-expiration.

Multiple backends. Redis, etcd, etc.

Distributed coordination. Across services.

Simple interface. Acquire and release.

# CAVEATS

Backend required. Network dependent. Lease management needed.

# HISTORY

**stormlock** provides distributed locking primitives for coordinating access to shared resources across processes.

# SEE ALSO

[flock](/man/flock)(1), [redis-cli](/man/redis-cli)(1), [etcdctl](/man/etcdctl)(1)
