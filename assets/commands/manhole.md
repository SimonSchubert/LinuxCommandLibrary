# TAGLINE

provides remote debugging access to Python processes

# TLDR

**Connect** to the manhole of a running process

```manhole-cli [pid]```

Connect using the **socket path**

```manhole-cli [/tmp/manhole-1234]```

Send **SIGUSR2** first to activate a lazily installed manhole

```manhole-cli -2 [pid]```

Send a **custom signal** before connecting

```manhole-cli -s [SIGTTIN] [pid]```

Connect with a longer **timeout**

```manhole-cli -t [5] [pid]```

**Enable** the manhole in an app without code changes, activated by SIGUSR2

```PYTHONMANHOLE='oneshot_on="USR2"' python [app.py]```

# SYNOPSIS

**manhole-cli** [**-t** _seconds_] [**-1** | **-2** | **-s** _signal_] _pid_

# PARAMETERS

_PID_
> Process ID, or a socket path of the form **/tmp/manhole-**_pid_.

**-t**, **--timeout** _SECONDS_
> Connection timeout (default 1 second).

**-1**, **-USR1**
> Send SIGUSR1 to the process before connecting.

**-2**, **-USR2**
> Send SIGUSR2 to the process before connecting.

**-s**, **--signal** _SIGNAL_
> Send the given signal (name or number) to the process before connecting.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**manhole** is a Python library that opens a Unix domain socket (by default **/tmp/manhole-**_pid_) in a running process and serves an interactive Python REPL on it, with stack traces of all threads printed on connect. It is used to inspect live applications, including those using gevent or eventlet, without restarting them.

The application enables it by calling **manhole.install()** (or by setting the **PYTHONMANHOLE** environment variable), optionally with **oneshot_on** or **activate_on** set to a signal so the socket is only created on demand. The **manhole-cli** command connects to that socket; tools like **socat** or **nc -U** can be used as well.

# CAVEATS

The target process must have the manhole library installed and enabled; manhole-cli cannot inject it into an arbitrary process. Anyone who can connect gets full code execution in the process: only root or the same effective user may connect (checked via SO_PEERCRED), but it should still be used carefully in production. Unix-only.

# HISTORY

**python-manhole** was written by **Ionel Cristian Mărieș** and first released on PyPI in **2013**. The client command is installed as **manhole-cli**, not **manhole**.

# SEE ALSO

[py-spy](/man/py-spy)(1), [gdb](/man/gdb)(1), [python](/man/python)(1), [socat](/man/socat)(1)

# RESOURCES

```[Source code](https://github.com/ionelmc/python-manhole)```

```[Documentation](https://python-manhole.readthedocs.io/)```

<!-- verified: 2026-09-29 -->
