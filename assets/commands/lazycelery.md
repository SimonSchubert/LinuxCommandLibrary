# TAGLINE

TUI for monitoring and managing Celery workers and tasks

# TLDR

**Launch the Celery monitor**

```lazycelery```

**Run initial setup**

```lazycelery setup```

**Update the broker URL**

```lazycelery config broker [url]```

# SYNOPSIS

**lazycelery** [_command_] [_options_]

# DESCRIPTION

**lazycelery** is a terminal UI for monitoring and managing Celery workers and tasks, inspired by lazydocker and lazygit. It provides a keyboard-driven interface to switch between worker, queue, and task views, showing how many tasks are in each queue and what each worker is doing.

Features include real-time worker monitoring, queue management with message counts, task listing with status tracking, search and filter capabilities, task retry and revoke functionality, and queue purge operations.

# CAVEATS

Currently supports Redis-based Celery brokers. Requires a running Celery infrastructure to connect to.

# HISTORY

**lazycelery** was created by **Fguedes90** and is written in **Rust**.

# SEE ALSO

[celery](/man/celery)(1), [lazydocker](/man/lazydocker)(1)
