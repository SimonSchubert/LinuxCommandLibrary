# TAGLINE

WebSocket client and server for the terminal

# TLDR

**Connect to a WebSocket server**

```websocat ws://[example.com]/socket```

**Connect with secure WebSocket**

```websocat wss://[example.com]/socket```

**Create a WebSocket server**

```websocat -s [8080]```

**Pipe stdin to WebSocket**

```echo "hello" | websocat ws://[example.com]/socket```

**Connect with custom headers**

```websocat -H "Authorization: Bearer [token]" wss://[example.com]/socket```

**Binary mode** for raw data

```websocat -b ws://[example.com]/socket```

**One message per line** mode

```websocat -n ws://[example.com]/socket```

**Forward TCP to WebSocket**

```websocat --binary tcp-l:127.0.0.1:[8080] ws://[example.com]/socket```

# SYNOPSIS

**websocat** [_options_] _address1_ [_address2_]

# PARAMETERS

**-s**, **--server**
> Simple WebSocket server mode on specified port.

**-b**, **--binary**
> Send and receive binary frames instead of text.

**-n**, **--no-close**
> Don't send close frame, disconnect abruptly.

**-1**, **--one-message**
> Send one message and exit.

**-u**, **--unidirectional**
> Only copy from address1 to address2.

**-U**, **--unidirectional-reverse**
> Only copy from address2 to address1.

**-H** _header_
> Add custom HTTP header.

**-E**, **--exit-on-eof**
> Exit when stdin reaches EOF.

**-t**, **--text**
> Force text frame mode.

**--ping-interval** _secs_
> Send WebSocket pings at interval.

**--ping-timeout** _secs_
> Close connection if pong not received.

**-k**, **--insecure**
> Accept invalid TLS certificates.

**--origin** _url_
> Set Origin header.

**-q**, **--quiet**
> Suppress informational messages.

**-v**, **--verbose**
> Increase verbosity level.

# ADDRESS TYPES

**ws://** / **wss://**
> WebSocket client connection.

**tcp:** / **tcp-l:**
> TCP client/listener.

**unix:** / **unix-l:**
> Unix socket client/listener.

**exec:**
> Execute program and connect to its stdio.

**sh-c:**
> Execute shell command.

**stdio:**
> Standard input/output.

**mirror:**
> Echo back received messages.

**autoreconnect:**
> Wrapper for automatic reconnection.

# DESCRIPTION

**websocat** is a command-line WebSocket client and server, similar to netcat but for WebSocket connections. It enables bidirectional communication between various endpoints including WebSocket, TCP, Unix sockets, and stdio.

Basic usage connects stdin/stdout to a WebSocket URL. Input lines become WebSocket messages; received messages print to stdout. Use **-b** for binary data or **-n** for line-based text.

The server mode (**-s**) creates a simple WebSocket server useful for testing. For production, combine address specifiers like **tcp-l:** with **ws://** for protocol conversion.

Address chaining enables complex setups like WebSocket tunnels, TCP-over-WebSocket, and command execution. The **autoreconnect:** wrapper handles connection drops automatically.

websocat supports both secure (wss://) and insecure (ws://) connections, custom headers for authentication, and ping/pong for connection keepalive.

# CAVEATS

Large messages may require increased buffer sizes. Some features require specific address type combinations. The --insecure flag should not be used in production. Complex address specifiers have steep learning curve.

# HISTORY

websocat was created by **Vitaly Shukela** (vi) and first released around **2017**. Written in Rust, it was designed as a Swiss Army knife for WebSocket operations. The tool has become popular for debugging WebSocket services, creating tunnels, and testing real-time applications. It continues active development with features for various networking scenarios.

# SEE ALSO

[nc](/man/nc)(1), [curl](/man/curl)(1), [socat](/man/socat)(1), [wscat](/man/wscat)(1)
