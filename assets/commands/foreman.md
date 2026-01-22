# TLDR

**Start** an application with the Procfile in the current directory

```foreman start```

Start an application with a **specified Procfile**

```foreman start -f [Procfile]```

Start a **specific** application

```foreman start [process]```

**Validate** Procfile format

```foreman check```

Run **one-off commands** with the process's environment

```foreman run [command]```

Start all processes **except** the one named "worker"

```foreman start -m all=1,worker=0```

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

# DESCRIPTION

**foreman** is a process manager for Procfile-based applications. It reads a Procfile that declares the processes that comprise your application and runs them in development, making it easy to manage multiple processes.

A Procfile defines process types as lines with format **name: command**. For example: **web: python app.py** and **worker: python worker.py**. Foreman starts all defined processes and forwards their output to the terminal.

Foreman also loads environment variables from **.env** files and can export process definitions to system init formats like systemd, upstart, or launchd for production deployment.

# CAVEATS

foreman is primarily designed for development environments. For production, export to a proper process manager. Port assignment is sequential starting from the **-p** value, which may conflict with existing services.

# HISTORY

foreman was created by David Dollar at Heroku in **2011** as a way to manage Procfile-based applications locally. The Procfile format became a standard for defining process types in twelve-factor applications and is used by many PaaS providers.

# SEE ALSO

[systemd](/man/systemd)(1), [supervisor](/man/supervisor)(1), [pm2](/man/pm2)(1)
