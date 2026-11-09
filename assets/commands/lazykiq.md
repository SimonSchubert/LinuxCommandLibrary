# TAGLINE

TUI for inspecting Sidekiq activity in the terminal

# TLDR

**Launch the Sidekiq monitor**

```lazykiq```

**Connect to a specific Redis URL**

```lazykiq --redis [redis://localhost:6379/0]```

**Enable actions** that change Sidekiq state

```lazykiq --danger```

**Enable Sidekiq Enterprise** features

```lazykiq --enable=[ent]```

# SYNOPSIS

**lazykiq** [_options_]

# PARAMETERS

**--redis** _URL_
> Redis connection URL (default: redis://localhost:6379/0).

**--danger**
> Enable dangerous operations such as delete, retry now, kill, and add to queue.

**--enable** _FEATURES_
> Enable optional features: pro, ent. Accepts comma-separated values or repeated flags.

**--periodic-timezone** _ZONE_
> Server timezone for periodic jobs without an explicit zone (default: UTC).

**--development**
> Enable development diagnostics.

**--cpuprofile** _FILE_
> Write a CPU profile to file.

**-v**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**lazykiq** is a terminal UI for inspecting Sidekiq activity. It connects via Redis to display Sidekiq processes, running jobs, queue contents, job lists, and error backtraces.

Features include vim-style navigation, paging and list filtering, quick view switching between dashboards, queues, and metrics. Job details show payload, timestamps, retry counts, and exception traces. You can view retried, busy, scheduled, and dead jobs. A modern UTF-8 terminal font is recommended for its box-drawing and chart glyphs.

# CAVEATS

Requires access to the Redis instance used by Sidekiq. Read-only by default; **--danger** enables irreversible changes. Lazykiq talks directly to Redis and runs no Ruby code, so enqueue-like actions skip Sidekiq client middleware.

# HISTORY

**lazykiq** was created by **kpumuk** and is written in **Go**.

# SEE ALSO

[lazydocker](/man/lazydocker)(1), [lazygit](/man/lazygit)(1), [redis-cli](/man/redis-cli)(1)

# RESOURCES

```[Source code](https://github.com/kpumuk/lazykiq)```

```[Homepage](https://kpumuk.github.io/lazykiq/)```

<!-- verified: 2026-11-09 -->
