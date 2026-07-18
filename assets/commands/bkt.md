# TAGLINE

Subprocess cache for expensive command output

# TLDR

**Cache** a command for 1 minute

```bkt --ttl=1m -- [expensive-command]```

**Include cwd** in the cache key

```bkt --ttl=5m --cwd -- [command]```

**Force refresh**

```bkt --ttl=1m --force -- [command]```

**Discard stale cache and run**

```bkt --ttl=30s -- [command]```

# SYNOPSIS

**bkt** [*options*] **--** *command* [*args*...]

# DESCRIPTION

**bkt** runs a command and caches its stdout/stderr/exit status for a time-to-live (**--ttl**). Later invocations with the same key reuse the cached result instead of re-running the process—useful for slow tests, network lookups, or prompt segments. Cache keys can incorporate working directory, environment subsets, and other scopes.

# PARAMETERS

**--ttl** *duration*

> How long to keep a successful result (e.g. **30s**, **5m**, **1h**).

**--** *command*...

> Command and arguments to execute/cache (required separator).

**--force**

> Ignore existing cache and refresh.

**--cwd**

> Include current working directory in the cache key.

**--env** *name*

> Include named environment variable(s) in the key.

**--stale** *duration* / **--discard-failures** / related flags

> Control stale-while-revalidate and failure caching (see **bkt --help**).

# CAVEATS

Cached output can be wrong if external state changes within the TTL. Do not cache commands with required side effects unless you understand the implications. Cache location is under the user's cache directory.

# SEE ALSO

[time](/man/time)(1), [chronic](/man/chronic)(1), [memoize](/man/memoize)(1)

# RESOURCES

```[Source code](https://github.com/dimo414/bkt)```

<!-- verified: 2026-07-19 -->
