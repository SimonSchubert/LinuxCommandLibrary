# TAGLINE

TUI for monitoring and managing Celery workers and tasks

# TLDR

**Launch the Celery monitor**

```lazycelery```

**Run interactive setup**

```lazycelery init```

**Override the broker URL**

```lazycelery --broker [redis://localhost:6379/0]```

**Show current configuration**

```lazycelery config```

**Update the broker URL**

```lazycelery set-broker [redis://localhost:6379/0]```

**Set refresh interval** in milliseconds

```lazycelery set-refresh [1000]```

**Use custom config file**

```lazycelery --config [~/.config/lazycelery/config.toml]```

# SYNOPSIS

**lazycelery** [_command_] [_options_]

# PARAMETERS

**--broker** _URL_
> Override the broker URL for this session.

**--config** _FILE_
> Use a custom configuration file.

# DESCRIPTION

**lazycelery** is a terminal UI for monitoring and managing Celery workers and tasks, inspired by lazydocker and lazygit. It provides a keyboard-driven interface to switch between worker, queue, and task views, showing how many tasks are in each queue and what each worker is doing.

Features include real-time worker monitoring, queue management with message counts, task listing with status tracking, search and filter capabilities, task retry and revoke functionality, and queue purge operations.

# CAVEATS

Currently supports Redis-based Celery brokers. Requires a running Celery infrastructure to connect to. Install via `cargo install lazycelery` or Homebrew.

# HISTORY

**lazycelery** was created by **Fguedes90** and is written in **Rust**.

# SEE ALSO

[lazydocker](/man/lazydocker)(1)
