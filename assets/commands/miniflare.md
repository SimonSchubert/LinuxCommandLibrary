# TAGLINE

simulator for Cloudflare Workers

# TLDR

**Start local worker**

```miniflare [worker.js]```

**Specify port**

```miniflare [worker.js] --port [8787]```

**With KV namespace**

```miniflare [worker.js] --kv [NAMESPACE]```

**With D1 database**

```miniflare [worker.js] --d1 [DB]```

**With environment variables**

```miniflare [worker.js] --env [.env]```

**Watch for changes**

```miniflare [worker.js] --watch```

# SYNOPSIS

**miniflare** [_options_] [_script_]

# PARAMETERS

**--port** _port_
> HTTP port.

**--host** _host_
> Bind address.

**--kv** _namespace_
> KV namespace.

**--d1** _database_
> D1 database.

**--r2** _bucket_
> R2 bucket.

**--env** _file_
> Environment file.

**--watch**
> Watch for changes.

**--wrangler-config** _file_
> Wrangler config.

# DESCRIPTION

**Miniflare** is a simulator for Cloudflare Workers. It runs Workers locally with full support for KV, Durable Objects, R2, D1, and other Cloudflare services.

Miniflare enables local development and testing without deploying to Cloudflare.

# FEATURES

```
- KV storage
- Durable Objects
- R2 buckets
- D1 databases
- Cache API
- Scheduled events
```

# CAVEATS

Behavior may differ from production. Storage is local/temporary. Some features require configuration. Now integrated into Wrangler.

# HISTORY

Miniflare was created by **Brendan Coll** in **2021** to enable local Cloudflare Workers development. It was later officially adopted by Cloudflare.

# SEE ALSO

[wrangler](/man/wrangler)(1), [workerd](/man/workerd)(1), [cloudflared](/man/cloudflared)(1)
