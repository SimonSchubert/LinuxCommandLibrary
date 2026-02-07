# TAGLINE

Node.js process daemon and monitor

# TLDR

**Start script as daemon**

```forever start [app.js]```

**Stop daemon**

```forever stop [app.js]```

**Stop all daemons**

```forever stopall```

**List running processes**

```forever list```

**Restart script**

```forever restart [app.js]```

**Start with log file**

```forever start -l [forever.log] -o [out.log] -e [err.log] [app.js]```

# SYNOPSIS

**forever** [_options_] _command_ [_script_] [_args_]

# PARAMETERS

**start** _script_
> Start script as daemon.

**stop** _script|pid|index_
> Stop running process.

**stopall**
> Stop all processes.

**restart** _script|pid|index_
> Restart process.

**restartall**
> Restart all processes.

**list**
> List running processes.

**logs** _script|pid|index_
> Show log files.

**-l** _logfile_
> Log file for forever output.

**-o** _outfile_
> Stdout log file.

**-e** _errfile_
> Stderr log file.

**-w**, **--watch**
> Watch for file changes.

**-m** _max_
> Maximum restarts.

# CONFIGURATION

**~/.forever/config.json**
> Global configuration for forever settings and defaults.

# DESCRIPTION

**forever** runs Node.js scripts continuously, restarting them automatically if they crash. It's designed for production deployment of Node.js applications, ensuring applications stay running.

The tool monitors processes and restarts them on exit. It supports logging, multiple instances, and can watch files for development auto-restart.

# CAVEATS

Node.js only. Consider PM2 for production use (more features). Log files can grow large. Watch mode may miss some changes. Process management is basic compared to alternatives.

# HISTORY

forever was created by **Charlie Robbins** and the **Nodejitsu** team in the early **2010s** as one of the first process managers for Node.js. While PM2 has largely replaced it for production use, forever remains simple and functional.

# SEE ALSO

[pm2](/man/pm2)(1), [nodemon](/man/nodemon)(1), [node](/man/node)(1), [systemd](/man/systemd)(1)
