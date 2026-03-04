# TAGLINE

TUI monitor and debugger for Celery tasks

# TLDR

**Launch celerator** with a Redis broker

```celerator --broker=redis://localhost:6379/0```

**Launch celerator** with a RabbitMQ broker

```celerator --broker=amqp://guest:guest@localhost:5672//```

# SYNOPSIS

**celerator** **--broker=**_URI_

# PARAMETERS

**--broker** _URI_
> Celery broker URI (required). Supports Redis, RabbitMQ, and other Celery-compatible brokers.

# DESCRIPTION

**celerator** is a TUI application for real-time debugging and monitoring of Celery tasks. It connects to a Celery broker, listens to task lifecycle events via Celery's built-in event system, and presents them in an interactive terminal interface built with the Textual framework.

Features include live event monitoring with real-time task data capture, one-key task retry with original or custom arguments, detailed debug panels for viewing args, kwargs, exceptions and tracebacks, and full keyboard navigation for efficient task inspection.

Celery workers **must** be started with the **--events** flag for celerator to receive task data.

# KEY BINDINGS

```
r        Retry selected task
Ctrl+r   Retry with custom arguments
c        Clear task table
q        Quit application
Enter    Display traceback/task details
Up/Down  Navigate task list
```

# CAVEATS

Celery workers must be started with the **--events** flag, otherwise celerator will not receive any task data. Requires Python with **celery>=5.5.2**, **textual>=3.2.0**, and **redis>=6.0.0**. No code changes are required in the monitored application.

# HISTORY

**celerator** was created by **Fardin Allahverdi** and first released as v0.1.0 in **May 2025**. The name is a portmanteau of "Celery" and "accelerator." It was built to provide a lightweight, terminal-native alternative to web-based Celery monitoring tools like Flower, leveraging the Textual framework for its TUI.

# SEE ALSO

[celery](/man/celery)(1), [flower](/man/flower)(1), [redis-cli](/man/redis-cli)(1)
