# TAGLINE

Git server that stores repositories in an object bucket

# TLDR

**Serve** repositories from a bucket

```walgit serve --config [walgit.toml]```

The same server with **no subcommand**

```walgit --config [walgit.toml]```

**Create** an empty repository

```walgit repo create [acme/app]```

**List** repositories in the bucket

```walgit repo list```

**Import** an existing repository

```walgit import --from [path/to/repo] [acme/app]```

Upload packs **straight into the bucket**

```walgit import --direct --from [path/to/repo] [acme/app]```

**Mirror** one branch from another host, once

```walgit mirror --once --from [https://github.com/acme/app.git] --to [https://git.example.com/acme/app.git] --dir [path/to/buffer] --ref [main]```

**Repack** one repository and exit

```walgit compact --once [acme/app]```

Rebuild the **base pack** (the whole pack set must fit on local disk)

```walgit compact --base [acme/app]```

**Show** which bundle-uri slots exist

```walgit bundle plan [acme/app]```

**Validate** the configuration

```walgit --config [walgit.toml] config check```

Print the **effective configuration**

```walgit config dump```

**List** write-ahead log entries

```walgit wal ls [acme/app]```

# SYNOPSIS

**walgit** [**--config** _PATH_] [_command_] [_args_]

# PARAMETERS

**--config** _PATH_

> Configuration file. Default `walgit.toml`. The environment variable **WALGIT_CONFIG** sets the same path. The flag is global and applies to every subcommand.

**serve**

> Run the HTTP server: Git smart HTTP (protocol v0 and v2), Git LFS, bundle-uri, the JSON API, and the web UI. Checkpoints, compaction, bundle builds, and the webhook bridge run in this process only when `server.roles` includes them. With no subcommand, **walgit** does this.

**repo create** _owner/name_

> Create an empty repository. **--object-format** is `sha1` (the default) or `sha256`.

**repo list**

> List repositories in the bucket.

**repo info** _owner/name_

> Show one repository.

**repo policy get** _owner/name_

> Print `policy.json` (protected refs, fast-forward rules). An empty document means allow-all.

**repo policy set --file** _PATH_ _owner/name_

> Replace the push policy from a JSON file.

**repo policy clear** _owner/name_

> Delete the policy.

**repo settings show** _owner/name_

> Print the per-repository settings document stored in the log. **--effective** prints the host config merged with those overrides.

**repo settings set --file** _PATH_ _owner/name_

> Replace settings (bundle, maintenance, and compaction overrides). `-` reads stdin. **--message** records a reason. An invalid document is not published.

**repo settings clear** _owner/name_

> Drop per-repository settings and return to the host config.

**repo settings history** _owner/name_

> List settings changes from the log.

**import --from** _PATH_ _owner/name_

> Copy an existing Git repository into the bucket. **--refs** _GLOB_ (repeatable) chooses refs; the default is `refs/heads/*` and `refs/tags/*`, and the target of HEAD is always kept. **--reuse-packs** copies the source packfiles instead of repacking. **--direct** uploads into the bucket without a local walgit checkout. With **--direct**, **--replace** supersedes a non-empty repository and **--force** restarts an interrupted import after the target manifest has moved.

**mirror --from** _URL_ **--to** _URL_ **--dir** _PATH_

> Keep selected refs on a walgit host equal to the same refs on another Git host, through a local bare buffer in _PATH_. **--ref** (repeatable) defaults to `refs/heads/main`. **--interval** defaults to 30s between fetch-and-push ticks. **--once** does a single tick and exits non-zero if the push failed. **--force** updates the destination even when that is not a fast-forward. **--identity** is `token` (the default, from `$WALGIT_TOKEN`), `gcloud`, or `gce`.

**compact** [_owner/name_]

> Geometric repack. **--all** selects every repository. **--once** runs one pass and exits. **--base** rebuilds the tier-2 base pack with `git repack` and needs the whole pack set on local disk.

**bundle run**

> Build bundle-uri slots that are due. **--repo** and **--strategy** restrict the work.

**bundle plan** _owner/name_

> Print each strategy's slots: built, missing, unavailable, or assigned to another host.

**bundle compose** _owner/name_

> Publish a full bundle by composing a header with the tier-2 base pack inside the bucket, so the bytes do not pass through this machine. Run it after **compact --base**.

**bundle rm** _owner/name_ _id_ ...

> Remove bundle ids (`strategy-token`, as printed by **bundle plan**) from the list and delete their objects.

**wal ls** _owner/name_

> List log entries. **--from** and **--to** bound the sequence numbers.

**wal show** _owner/name_ _seq_

> Print one log entry.

**wal materialize --at-seq** _N_ **--out** _PATH_ _owner/name_

> Write the repository as it was at sequence _N_ into a new directory.

**config check**

> Parse the config and print OK or the error. **--env-file** _PATH_ (repeatable) also applies `WALGIT__` overrides from a `KEY=VALUE` file. **--strict** exits 3 when this build ignores an override.

**config dump**

> Print the effective configuration as TOML.

**synth --out** _PATH_ **--size** _PRESET_

> Generate a deterministic synthetic repository with `git fast-import`. _PRESET_ is `s`, `m`, or `l`. **--seed**, **--commits**, and **--files** override the preset. _PATH_ must be missing or empty.

# DESCRIPTION

**walgit** hosts Git repositories as one binary in front of an S3-compatible bucket or Google Cloud Storage. The bucket is a write-ahead log. A push is stored as immutable pack objects and becomes visible only when a small manifest is replaced with a compare-and-swap. That swap is the only commit point, so any instance pointed at the same bucket serves the same history. There is no database and no elected primary. Local disk is a cache.

Upstream `git` still runs upload-pack, repack, and bundle creation. walgit implements receive-pack, the log, and the storage plumbing. Fresh clones can download bundle-uri bundles as static objects from the bucket or a CDN and ask the server only for the remainder. Repositories larger than the machine are served with HTTP range reads: refs and the web UI do not need every pack on local disk.

Clients authenticate with a bearer token, or with OpenID Connect (browser sign-in, then a walgit access token for Git). A push to a new name creates the repository when `auto_create_on_push` is set.

The **walgit-server** binary is **walgit serve** under the name a standalone deployment expects. It accepts **--config** and nothing else.

Every key in the config file can also be set from the environment as `WALGIT__SECTION__KEY` using TOML value syntax. A missing config file exits 2. **--config /dev/null** is the explicit way to run on built-in defaults plus `WALGIT__` variables, so a typo in the path does not silently open whatever bucket the ambient credentials can see.

The layout follows the write-ahead-log-on-object-storage design Cursor published as Continuity. The repository keeps that write-up in `docs/reference/cursor-git-at-any-scale.md`.

# CONFIGURATION

`walgit.toml` is TOML. `walgit.example.toml` documents every key. `walgit.standalone.toml` is a one-machine setup with its own TLS certificate and a local S3-compatible store.

```
[server]
listen = "0.0.0.0:8080"
public_url = "https://git.example.com"
auto_create_on_push = true
[server.auth]
mode = "token"
anonymous_read = false
tokens = [{ principal = "me", token_env = "WALGIT_TOKEN_ME", write = true }]
[store]
backend = "s3"
bucket = "my-walgit"
[store.s3]
endpoint = "https://s3.us-east-1.amazonaws.com"
region = "us-east-1"
```

**[server]** sets the listen address, the public URL used in clone and LFS links, and roles: `serve`, `maintain`, and `events`. An empty role list means all three. **[server.auth]** is `none`, `token`, or `oidc`. **[server.tls]** is `off`, `self_signed`, or `files`. **[store]** is `s3`, `gcs`, or `memory`. **[cache]** is the on-disk cache. **[placement]** globs choose which repositories this host does object work for; refs-level reads stay available everywhere. **[bundles]** and **[[bundles.strategy]]** schedule bundle-uri full and incremental bundles. **[git]** names the `git` binary. Git 2.47 or newer is what the project recommends (`pack.writeReverseIndex` and bundle-uri).

# CAVEATS

`server.auth.mode = "none"` treats every caller as an anonymous writer and is refused unless the listen address is loopback. The optional GitHub Enterprise facade (`[github] enabled = true`) is auth-free on purpose and is for local development: turning it on requires `mode = "none"` and then allows that mode to bind beyond loopback. The network is the trust boundary.

`accel_redirect` answers bundle and LFS downloads with `X-Accel-Redirect` so nginx streams the bytes from the bucket. Enable it only behind that edge. The response carries a store credential.

Two instances can accept pushes to the same repository at once. Only one manifest swap wins; the other re-reads and retries. The client is told `ok` only after the bucket accepts the swap.

Base-pack rebuilds and some bundle builds need a host that can hold the packs. A machine that only has a small cache can still advertise refs and serve objects by range.

# SEE ALSO

[git](/man/git)(1), [git-lfs](/man/git-lfs)(1), [gitea](/man/gitea)(1)

# RESOURCES

```[Source code](https://github.com/rgodha24/walgithub)```

```[Documentation](https://github.com/rgodha24/walgithub/tree/main/docs)```

<!-- verified: 2026-09-27 -->
