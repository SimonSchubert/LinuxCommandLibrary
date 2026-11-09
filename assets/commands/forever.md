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

**Start with log files**

```forever start -l [forever.log] -o [out.log] -e [err.log] [app.js]```

**Restart on file changes**

```forever start -w [app.js]```

**Run a non-Node script**

```forever start -c [python3] [app.py]```

# SYNOPSIS

**forever** [_action_] [_options_] _script_ [_script-options_]

# PARAMETERS

**start** _script_
> Start script as daemon.

**stop** _id|uid|pid|index|script_
> Stop running process.

**stopall**
> Stop all processes.

**restart** _script_
> Restart process.

**restartall**
> Restart all processes.

**list**
> List running processes.

**logs** [_script|index_]
> List log files, or tail the logs of a script.

**cleanlogs**
> Delete all historical forever log files.

**config**
> List forever user configuration.

**set** _key_ _value_
> Set a forever configuration key.

**clear** _key_
> Clear a forever configuration key.

**columns** _add|rm|set|reset_ [_col_]
> Change the columns shown by **forever list**.

**-m** _max_
> Only run the script MAX times.

**-l** _logfile_
> Log file for forever output.

**-o** _outfile_
> Stdout log file.

**-e** _errfile_
> Stderr log file.

**-p** _path_
> Base path for forever related files (pid files, etc.).

**-c** _command_
> Command to execute (default: node).

**-a**, **--append**
> Append to log files instead of overwriting.

**-f**, **--fifo**
> Stream logs to stdout.

**-n**, **--number** _lines_
> Number of log lines to print.

**--pidFile** _file_
> The pid file.

**--uid** _name_
> Process uid, usable as a namespace with **stop**.

**--sourceDir** _dir_
> Directory the script path is relative to.

**--workingDir** _dir_
> Working directory in which the script runs.

**--minUptime** _ms_
> Minimum uptime for a script not to be considered spinning (default: 1000).

**--spinSleepTime** _ms_
> Time to wait between launches of a spinning script.

**-w**, **--watch**
> Watch for file changes.

**--watchDirectory** _dir_
> Top-level directory to watch from.

**--watchIgnore** _pattern_
> Pattern to ignore when watching. Can be repeated.

**-s**, **--silent**
> Run script silencing stdout and stderr.

**-t**, **--killTree**
> Kill the entire child process tree on stop.

**--killSignal** _signal_
> Exit signal to use, for graceful restarts (default: SIGKILL).

**-d**, **--debug**
> Log debug output.

**-v**, **--verbose**
> Turn on verbose messages.

**--plain**
> Disable output coloring.

**--version**
> Print the current version.

**-h**, **--help**
> Display help.

# DESCRIPTION

**forever** runs scripts continuously, restarting them automatically when they exit. Without an action it runs in the foreground, printing logs; with **start** it runs as a daemon.

It is most commonly used for Node.js scripts, though **-c** allows running any other interpreter.

# CONFIGURATION

**~/.forever/config.json**
> User configuration, managed with the **config**, **set** and **clear** actions. The root directory can be changed with **FOREVER_ROOT**.

_app.json_
> Start options can be stored in a JSON file (fields such as **script**, **sourceDir**, **logFile**, **watch**) and passed to **forever start** in place of a script. A JSON array defines multiple applications.

# CAVEATS

The project now depends on the community for fixes and features; its README recommends **pm2** or **nodemon** for new installations. The last commit to the repository was in **2023**. Log files can grow large; use **cleanlogs** with care. Without **--killSignal**, stopping sends SIGKILL.

# HISTORY

forever was created by **Charlie Robbins** in **2010** and maintained by the **Nodejitsu** team as one of the first process managers for Node.js.

# SEE ALSO

[pm2](/man/pm2)(1), [nodemon](/man/nodemon)(1), [node](/man/node)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/foreversd/forever)```

<!-- verified: 2026-11-09 -->
