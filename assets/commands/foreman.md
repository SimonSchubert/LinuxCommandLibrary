# TAGLINE

process manager for Procfile-based applications

# TLDR

Start every process in the Procfile

```foreman start```

Start **one process type**

```foreman start [web]```

Use a Procfile **somewhere else**

```foreman start --procfile [path/to/Procfile]```

Load the environment from a **specific file**

```foreman start --env [path/to/.env]```

Run from **another directory**

```foreman start --directory [path/to/app]```

**Scale** the process types

```foreman start --formation "[web=3,worker=2]"```

Run everything **except** the workers

```foreman start --formation "[all=1,worker=0]"```

Choose the **base port** the processes get

```foreman start --port [3000]```

Check that the **Procfile parses**

```foreman check```

Run a **one-off command** with the app's environment

```foreman run [command]```

**Export** the Procfile as systemd units

```foreman export systemd [path/to/output] --app [myapp]```

# SYNOPSIS

**foreman** _command_ [_options_]

# PARAMETERS

**start**
> Start all processes defined in the Procfile

**check**
> Validate Procfile format

**run**
> Run a one-off command using the app's environment

**export**
> Export processes to another format (systemd, upstart, etc.)

**-f**, **--procfile** _FILE_
> Specify an alternate Procfile

**-d**, **--root** _DIR_
> Specify an alternate application root

**-e**, **--env** _FILE_
> Specify environment file(s) to load

**-m**, **--formation** _SPEC_
> Specify process formation (e.g., web=2,worker=1)

**-p**, **--port** _PORT_
> Specify starting port number

**-t**, **--timeout** _SECONDS_
> Specify shutdown timeout

# CONFIGURATION

**Procfile**
> Defines process types as name:command lines (e.g., web: python app.py).

**.env**
> Environment variables loaded automatically by foreman.

# DESCRIPTION

**foreman** is a process manager for Procfile-based applications. It reads a Procfile that declares the processes that comprise your application and runs them in development, making it easy to manage multiple processes.

A Procfile defines process types as lines with format **name: command**. For example: **web: python app.py** and **worker: python worker.py**. Foreman starts all defined processes and forwards their output to the terminal.

Foreman also loads environment variables from **.env** files and can export process definitions to system init formats like systemd, upstart, or launchd for production deployment.

# CAVEATS

foreman is primarily designed for development environments. For production, export to a proper process manager. Port assignment is sequential starting from the **-p** value, which may conflict with existing services.

# HISTORY

foreman was created by David Dollar at Heroku in **2011** as a way to manage Procfile-based applications locally. The Procfile format became a standard for defining process types in twelve-factor applications and is used by many PaaS providers.

# INSTALL

```brew: brew install foreman```

```nix: nix profile install nixpkgs#foreman```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pm2](/man/pm2)(1)
