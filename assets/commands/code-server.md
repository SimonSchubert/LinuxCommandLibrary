# TLDR

**Start code-server**

```code-server```

**Start on specific port**

```code-server --bind-addr [0.0.0.0:8080]```

**Start with specific directory**

```code-server [/path/to/project]```

**Disable authentication**

```code-server --auth none```

**Use specific config**

```code-server --config [~/.config/code-server/config.yaml]```

**Show password**

```cat ~/.config/code-server/config.yaml```

# SYNOPSIS

**code-server** [_options_] [_path_]

# DESCRIPTION

**code-server** runs VS Code on a remote server, accessible via web browser. Enables coding from any device with consistent development environment. By Coder.

# PARAMETERS

**--bind-addr** _host:port_
> Address to bind (default: 127.0.0.1:8080)

**--auth** _type_
> Authentication: password, none

**--password** _pass_
> Set password (or use PASSWORD env)

**--cert** _file_
> TLS certificate file

**--cert-key** _file_
> TLS key file

**--config** _file_
> Configuration file path

**--user-data-dir** _dir_
> User data directory

**--extensions-dir** _dir_
> Extensions directory

**--disable-telemetry**
> Disable telemetry

# CONFIGURATION

~/.config/code-server/config.yaml:
```yaml
bind-addr: 127.0.0.1:8080
auth: password
password: yourpassword
cert: false
```

# REQUIREMENTS

- 1 GB RAM minimum
- 2 vCPUs
- WebSockets enabled

# INSTALLATION

```
curl -fsSL https://code-server.dev/install.sh | sh
```

# CAVEATS

Default password in config file. Use TLS in production. Some extensions may not work in browser.

# SEE ALSO

[code](/man/code)(1), [vim](/man/vim)(1)
