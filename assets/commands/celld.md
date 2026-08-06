# TAGLINE

Self-hosted distributed Durable Objects runtime

# TLDR

**Install** the binary (releases with GitHub attestations)

```curl -fsSL https://celld.dev/install.sh | sh```

**Deploy** a Wrangler Worker project to the fleet bucket

```celld deploy . --bucket s3://[my-cells-bucket]```

**Start** a node against the same bucket

```celld --bucket s3://[my-cells-bucket] --listen 0.0.0.0:8080 --advertise [10.0.0.12:8080]```

**Run** with an S3-compatible endpoint (e.g. Cloudflare R2)

```celld --bucket s3://[bucket] --endpoint https://[account].r2.cloudflarestorage.com --region auto --listen 0.0.0.0:8080 --advertise [node-a.internal:8080]```

**Diagnose** fleet peers and node health

```celld diagnose --bucket s3://[my-cells-bucket]```

**Show** full CLI help

```celld --help```

# SYNOPSIS

**celld** [**--bucket** _s3://bucket_] [**--endpoint** _url_] [**--region** _name_] [**--listen** _addr_] [**--advertise** _addr_] [_options_]

**celld** **deploy** _path_ [**--bucket** _s3://bucket_] [_options_]

**celld** **diagnose** [**--bucket** _s3://bucket_] [**--peer** _NODE_ID_]...

# DESCRIPTION

**celld** is an open-source daemon that runs Cloudflare Workers and Durable Objects on your own machines. Each Durable Object is a **cell**: a named server with its own private SQLite database. Cells coordinate and replicate only through an S3-compatible bucket you own — there is no separate control plane or consensus service.

Every node embeds V8, executes Wrangler bundles, and shares deployments, cell state, and ownership records in the bucket. Object-storage compare-and-swap ensures exactly one node owns a cell at a time. Idle cells hibernate; inactive cells exist only as objects in the bucket and cost almost nothing. Acknowledged writes are replicated to the bucket first (RPO=0).

A fleet is formed by pointing nodes at the same bucket. Peers discover each other from leases in the bucket. Peer HTTP is HMAC-authenticated and does not terminate TLS — advertise addresses should stay on a private network or encrypted overlay (WireGuard, Tailscale). Worker projects need **esbuild** on `PATH` for `celld deploy`; asset-only projects do not.

# PARAMETERS

**--bucket** _s3://bucket_
> Fleet bucket holding deployments, SQLite replicas, ownership, and peer auth. Same as **CELLD_BUCKET**.

**--endpoint** _url_
> S3-compatible API endpoint (e.g. R2). Same as **S3_ENDPOINT**.

**--region** _name_
> Object-storage region (**auto** for R2). Uses the standard AWS region variables when unset.

**--listen** _addr_
> Local HTTP listener (default suitable for local development). Same as **CELLD_ADDR**.

**--advertise** _addr_
> Address other nodes and ingress can reach. Required for multi-node fleets. Same as **CELLD_ADVERTISE**.

**--unsafe-public-advertise**
> Allow a literal public IP as **--advertise** (rejected by default).

**deploy** _path_
> Bundle and write a Wrangler project (Workers, Durable Object bindings, static assets) to the bucket.

**diagnose**
> Enumerate node leases and probe live peers without taking ownership. Optional **--peer** _NODE_ID_ (repeatable).

**-h**, **--help**
> Show the full option list and advanced tuning switches.

**--version**
> Print the binary version.

# CONFIGURATION

**CELLD_BUCKET**
> Default fleet bucket URI.

**AWS_ACCESS_KEY_ID**, **AWS_SECRET_ACCESS_KEY**, **AWS_SESSION_TOKEN**
> Explicit credentials; the standard AWS credential chain is also used.

**S3_ENDPOINT**, **AWS_REGION**
> Endpoint and region for non-AWS or R2 storage.

**CELLD_WATCH**
> Local work directory for SQLite and replication state.

**CELLD_MAX_RESIDENT_CELLS**, **CELLD_RESIDENT_LOW_WATER**
> Optional pressure-shedding watermarks for resident cells.

**CELLD_MAX_RSS_MB**, **CELLD_MAX_CPU_PERCENT**
> Linux memory/CPU pressure triggers for shedding idle cells.

**CELLD_ESBUILD**
> Path to **esbuild** for Worker deploys.

**RUST_LOG**
> Runtime log filter.

# CAVEATS

The runtime and Cloudflare compatibility surface are still evolving. Bucket credentials are fleet-administrator access — protect them. Do not expose the peer port on the public internet; peer traffic is not TLS-terminated. Public advertise IPs need an explicit unsafe flag. Conformance against full Workers/Durable Objects reference behavior continues to expand.

# HISTORY

**celld** is an Apache-2.0 project from **Deno Land** (Ryan Dahl and collaborators), released as a self-hosted Durable Objects runtime that uses object storage as the sole coordinator instead of a managed control plane.

# SEE ALSO

[wrangler](/man/wrangler)(1), [esbuild](/man/esbuild)(1), [deno](/man/deno)(1)

# RESOURCES

```[Source code](https://github.com/denoland/celld)```

```[Homepage](https://celld.dev)```

```[Documentation](https://celld.dev/docs)```

<!-- verified: 2026-08-06 -->
