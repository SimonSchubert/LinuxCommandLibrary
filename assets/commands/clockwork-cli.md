# TAGLINE

command-line monitor for the Clockwork PHP profiler

# TLDR

**Monitor Clockwork logs for the current project**

```clockwork-cli```

**Monitor logs for multiple projects**

```clockwork-cli [/www/*]```

# SYNOPSIS

**clockwork-cli** [_path_...]

# DESCRIPTION

**clockwork-cli** is a command-line interface for Clockwork, a PHP debugging and profiling tool. It reads the JSON request data that the Clockwork server-side library writes for Laravel, Slim, and other PHP framework requests, and presents an updating, interactive list of recent HTTP requests directly in the terminal, without needing the browser extension.

Running it with no arguments monitors the Clockwork logs of the current project. Passing one or more paths (for example a glob like `/www/*`) monitors several projects at once. Each request is shown with a hotkey so you can drill into its database queries, log entries, timeline, and other recorded data.

# CONTROLS

**hotkey** (first character shown)
> View details of the corresponding HTTP request

**Backspace**
> Show requests from the last 10 minutes

**Escape**
> Exit the application

# CAVEATS

Requires the Clockwork server-side library installed and enabled in the PHP application being profiled, so that request metadata is written to the storage directory clockwork-cli reads.

# SEE ALSO

[php](/man/php)(1), [artisan](/man/artisan)(1)

# RESOURCES

```[Source code](https://github.com/ptrofimov/clockwork-cli)```

<!-- verified: 2026-06-22 -->
