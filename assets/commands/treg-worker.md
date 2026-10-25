# TAGLINE

Scheduled maintenance for a Treg registry server

# TLDR

Collect vendor-account **capacity**

```treg-worker capacity sweep```

One provider, as **JSON**

```treg-worker capacity sweep --only [openai] --json```

Refresh overflow routes, including **live** catalogs

```treg-worker overflow sync --live```

Re-check enabled routes (this **spends** a small amount)

```treg-worker overflow verify --max-usd [0.02]```

Settle deferred tasks, then fold **audit** rows into the Arena aggregate

```treg-worker asynctasks settle --limit [50]```

```treg-worker arena insights --max-seconds [110]```

Fold new ledger rows into daily **spend**

```treg-worker spend rollup --max-rows [50000]```

# SYNOPSIS

**treg-worker** _group_ _command_ [_options_]

# PARAMETERS

**capacity sweep** [**--only** _providers_] [**--json**]
> Read balances and quotas into snapshots and the latest state. **--only** is a comma-separated provider list (default: all).

**overflow sync** [**--live**]
> Seed overflow routes from local data. **--live** also fetches aggregator catalogs and needs keys.

**overflow verify** [**--all**] [**--only** _providers_] [**--max-usd** _n_] [**--renew-max-usd** _n_] [**--budget-usd** _n_]
> Re-check routes with a cheap call. **--all** includes rows that are not enabled. **--max-usd** caps a never-verified route (default **0.02**). **--budget-usd** stops the run before estimated spend passes the budget.

**asynctasks settle** [**--limit** _n_]
> Poll due tasks and complete holds that the request path already opened. Default limit **50**.

**hub check** [**--only** _tool_] [**--json**]
> Run each live hub tool's check once, as its maker. **--only** is one tool id.

**arena insights** [**--max-seconds** _n_]
> Fold new audit rows into the rolling Arena aggregate. Default **110** seconds; the next run resumes.

**web-arena totals**
> Publish content-free Web provider totals.

**web-arena seed**
> Resume a bounded ten-day Web observation seed.

**catalog stats** [**--max-rows** _n_] [**--max-dirty-buckets** _n_] [**--max-repair-seconds** _n_] [**--bucket-timeout-seconds** _n_]
> Fold new audit rows into per-endpoint, per-day reliability stats. Default **500000** rows. Dirty-bucket repairs are capped (default **20** buckets, **60** seconds total, **10** seconds each).

**catalog requeue-async-stats** [**--apply**]
> Preview mutable async day buckets. **--apply** resets readiness and queues one full repair. Without it, the command only reads.

**catalog repair-status** **--manifest** _path_
> Check coverage of the JSON manifest saved from **requeue-async-stats --apply**.

**showcase activity**
> Add each approved app's new calls to its weekly activity rows.

**media sweep**
> Delete public pictures that no team, person, or app still uses.

**spend rollup** [**--max-rows** _n_] [**--max-recount-seconds** _n_]
> Fold new ledger settles into per-key, per-tool, per-day spend. Default **50000** rows and **60** seconds of recount; the next run resumes.

**jev xboost** [**--topic** _phrase_] [**--posts** _n_] [**--min-likes** _n_]
> Landing-page demo: recent posts on X, then forensics. **--topic** is repeatable. Defaults are **60** posts and **150** likes.

**admin purge-evidence** [**--batch-size** _n_]
> Blank expired error evidence past the 14-day window. Default batch **5000**.

**admin purge-ad-clicks**
> Delete email-to-click stash rows past 90 days.

**admin erase-archive** **--org** _id_
> Erase what an opted-out team stored in the archive.

**enterprise reconcile** [**--org** _id_]
> Repair missed directory-sync changes. Omit **--org** to walk every connected team.

**enterprise cleanup** [**--org** _id_]
> Remove single sign-on setup after paid SSO ends.

**enterprise purge-audit** [**--days** _n_]
> Delete expired enterprise access evidence. Default **400** days.

# DESCRIPTION

**treg-worker** is the server console script of the Treg registry (`treg.worker:main` in the **tools-registry** package). **treg** is the member-facing client. This binary is the scheduled maintainer: capacity, overflow routes, deferred-task settlement, hub checks, and the read models behind Arena, the catalog, showcase, spend, and the public site.

It expects the registry server's environment (database and platform keys) and is what upstream runs from cron. It is not part of the request path. Each analytics command is a bounded pass over the audit or ledger table; the web process reads only what these jobs published. A pass that stops on its time or row cap leaves a cursor for the next run.

The worker does not start a money movement. **asynctasks settle** may complete or release a hold the request path already opened. **overflow verify** and **hub check** do spend: verify places a cheap call, and a hub check runs as the tool's maker at step prices.

# CAVEATS

A base install has no database stack. The program then prints that it needs the server extra and exits **2**. Upstream's message is:

```
treg-worker needs the server extra: pip install 'treg[server]'
```

The published package name on the client page is **tools-registry**. Do not point this cron job at a laptop that only has the light **treg** client.

**overflow verify** and **hub check** call third parties and can spend balances. **catalog requeue-async-stats** without **--apply** does not write. **admin erase-archive** requires an org id.

# SEE ALSO

[treg](/man/treg)(1), [python](/man/python)(1), [uv](/man/uv)(1), [pip](/man/pip)(1), [cron](/man/cron)(1)

# RESOURCES

```[Source code](https://github.com/superdesigndev/treg)```

```[Homepage](https://treg.to)```

```[Documentation](https://github.com/superdesigndev/treg/blob/main/USAGE.md)```

<!-- verified: 2026-10-25 -->
