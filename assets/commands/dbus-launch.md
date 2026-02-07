# TAGLINE

utility to start a D-Bus session bus instance

# TLDR

**Start a D-Bus session** bus

```dbus-launch```

**Start session and export** environment variables

```eval $(dbus-launch --sh-syntax)```

**Start with auto-launch** option

```dbus-launch --autolaunch=[machine-id]```

**Start a specific program** with D-Bus

```dbus-launch [program] [arguments]```

**Exit when program terminates**

```dbus-launch --exit-with-session [program]```

**Close bus when X session** ends

```dbus-launch --exit-with-x11```

# SYNOPSIS

**dbus-launch** [_options_] [_program_] [_args_]

# PARAMETERS

_PROGRAM_
> Program to run with the D-Bus session.

**--sh-syntax**
> Output Bourne shell compatible syntax.

**--csh-syntax**
> Output C shell compatible syntax.

**--autolaunch** _MACHINEID_
> Enable autolaunch with specified machine ID.

**--exit-with-session**
> Exit when launched program terminates.

**--exit-with-x11**
> Exit when X11 connection closes.

**--config-file** _FILE_
> Use specified configuration file.

**--help**
> Display help information.

# DESCRIPTION

**dbus-launch** starts a session instance of the D-Bus message bus daemon and provides the connection address to client applications. It's typically used to ensure a D-Bus session is available for desktop applications.

When invoked without arguments, it prints environment variables (DBUS_SESSION_BUS_ADDRESS and DBUS_SESSION_BUS_PID) that clients need to connect. With shell syntax options, the output can be directly evaluated to set these variables.

When a program is specified, dbus-launch starts the D-Bus daemon, sets up the environment, and then executes the program. The --exit-with-session flag ensures the daemon terminates when the program exits.

# CAVEATS

Multiple invocations without proper session management can start multiple daemons. The daemon must be properly terminated to avoid resource leaks. X11 integration requires an active display connection.

# HISTORY

dbus-launch is part of the **D-Bus** reference implementation, created by **Red Hat** and the freedesktop.org project around **2003**. It became essential infrastructure for Linux desktop environments requiring inter-process communication.

# SEE ALSO

[dbus-daemon](/man/dbus-daemon)(1), [dbus-send](/man/dbus-send)(1), [dbus-cleanup-sockets](/man/dbus-cleanup-sockets)(1)
