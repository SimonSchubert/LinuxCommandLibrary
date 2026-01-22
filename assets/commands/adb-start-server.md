# TLDR

**Start** the adb server

```adb start-server```

Start server with **specific port**

```ANDROID_ADB_SERVER_PORT=[5038] adb start-server```

# SYNOPSIS

**adb start-server**

# DESCRIPTION

**adb start-server** explicitly starts the adb server daemon if it's not already running. The server is a background process that manages communication between adb clients and connected Android devices.

Normally, the server starts automatically when you run any adb command. This command is useful when you want to ensure the server is running before connecting devices or in scripts where you want explicit control over server startup.

# CAVEATS

The server typically starts on port 5037. Only one adb server can run at a time on a given port. If another instance is running, this command has no effect. The server may fail to start if the port is in use by another process.

# HISTORY

The adb server architecture has been part of the Android SDK since its initial release in **2008**. The client-server model allows multiple adb clients to share device connections efficiently.

# SEE ALSO

[adb](/man/adb)(1), [adb-kill-server](/man/adb-kill-server)(1), [adb-devices](/man/adb-devices)(1)
