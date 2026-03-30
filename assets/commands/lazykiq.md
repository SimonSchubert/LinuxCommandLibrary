# TAGLINE

TUI for inspecting Sidekiq activity in the terminal

# TLDR

**Launch the Sidekiq monitor**

```lazykiq```

**Connect to a specific Redis URL**

```lazykiq --redis [redis://localhost:6379/0]```

# SYNOPSIS

**lazykiq** [_options_]

# PARAMETERS

**--redis** _URL_
> Redis connection URL (e.g., redis://localhost:6379/0).

# DESCRIPTION

**lazykiq** is a terminal UI for inspecting Sidekiq activity. It connects via Redis to display Sidekiq processes, running jobs, queue contents, job lists, and error backtraces.

Features include vim-style navigation, paging and list filtering, quick view switching between dashboards, queues, and metrics. Job details show payload, timestamps, retry counts, and exception traces. You can view retried, busy, scheduled, and dead jobs. Supports Nerd Fonts for enhanced display.

# CAVEATS

Requires access to the Redis instance used by Sidekiq. Read-only monitoring tool -- does not modify Sidekiq state.

# HISTORY

**lazykiq** was created by **kpumuk** and is written in **Go**.

# SEE ALSO

[lazydocker](/man/lazydocker)(1), [lazygit](/man/lazygit)(1), [redis-cli](/man/redis-cli)(1)
