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

**init**
> Run interactive configuration setup.

**config**
> Show the current configuration.

**set-broker** _URL_
> Set the broker URL in the configuration.

**set-refresh** _MS_
> Set the UI refresh interval in milliseconds.

**-b**, **--broker** _URL_
> Override the broker URL for this session.

**--result-backend** _URL_
> Set the result backend URL.

**-c**, **--config** _FILE_
> Use a custom configuration file.

# DESCRIPTION

**lazycelery** is a terminal UI for monitoring and managing Celery workers and tasks, inspired by lazydocker and lazygit. It provides a keyboard-driven interface to switch between worker, queue, and task views, showing how many tasks are in each queue and what each worker is doing.

Features include real-time worker monitoring, queue management with message counts, task listing with status tracking, search and filter capabilities, task retry and revoke functionality, and queue purge operations.

# KEYBINDINGS

**Tab**
> Switch between Workers/Queues/Tasks

**↑/↓**, **j/k**
> Navigate items

**/**
> Search

**Enter**, **d**
> Show task details

**r**
> Retry task

**x**
> Revoke task

**p**
> Purge queue

**?**
> Show help

**q**
> Quit

# CAVEATS

Accepts **redis://**, **amqp://**, and **rabbitmq://** broker URLs; other schemes are rejected. Requires a running Celery infrastructure to connect to.

# HISTORY

**lazycelery** was created by **Fguedes90** and is written in **Rust**.

# SEE ALSO

[lazydocker](/man/lazydocker)(1), [lazygit](/man/lazygit)(1)

# RESOURCES

```[Source code](https://github.com/Fguedes90/lazycelery)```

<!-- verified: 2026-11-09 -->
