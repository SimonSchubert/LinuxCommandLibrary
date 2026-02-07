# TAGLINE

Terminate the running adb server process

# TLDR

**Stop** the adb server

```adb kill-server```

Kill server and **restart** immediately

```adb kill-server && adb start-server```

# SYNOPSIS

**adb kill-server**

# DESCRIPTION

**adb kill-server** terminates the running adb server process on your computer. The adb server is a background process that manages communication between adb clients and connected devices.

Killing the server is useful when troubleshooting connection issues, freeing up USB resources, or when the server becomes unresponsive. The server automatically restarts when you run any adb command.

# CAVEATS

All active adb connections are terminated when the server is killed. Any port forwards, reverse forwards, and wireless connections will be lost. Running adb commands after this will automatically start a new server.

# HISTORY

The client-server architecture of adb has been part of the Android SDK since its initial release in **2008**. The kill-server command provides a way to reset the server when troubleshooting issues.

# SEE ALSO

[adb](/man/adb)(1), [adb-start-server](/man/adb-start-server)(1), [adb-devices](/man/adb-devices)(1)
