# TAGLINE

VS Code in the browser on a remote server

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

**code-server** runs Visual Studio Code on a remote server, making it accessible through any web browser. This enables development from Chromebooks, tablets, and other devices that cannot run VS Code natively, while maintaining a consistent development environment with full access to server resources.

The service provides nearly identical functionality to desktop VS Code, including extension support, terminal access, and file system integration. It's particularly useful for remote development, cloud workspaces, and teams needing standardized environments. All compute and storage occurs on the server, with only the interface rendered in the browser.

Authentication can be password-based or disabled for trusted networks. TLS certificates enable secure HTTPS connections. The tool is developed by Coder and runs as a long-lived service, typically behind a reverse proxy in production deployments.

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
