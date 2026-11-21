# TAGLINE

Start the Grafana web server

# TLDR

Start the server from the Grafana **install directory**

```grafana server```

Start with a **config file**

```grafana server --config [/etc/grafana/grafana.ini]```

Set the **home path** when the working directory is not the install

```grafana server --homepath [/usr/share/grafana]```

Write the process id to a **pid file**

```grafana server --pidfile [/run/grafana/grafana-server.pid]```

Override one **config key** for this process

```grafana server --configOverrides cfg:default.paths.log=/dev/null```

Print the version, then the version **with dependencies**

```grafana server -v```

```grafana server --vv```

# SYNOPSIS

**grafana server** [_flags_]

# PARAMETERS

**--config** _file_
> Path to the configuration file. Packaged installs on Linux use **/etc/grafana/grafana.ini**.

**--homepath** _path_
> Grafana install directory. Defaults to the working directory. Defaults and bundled files are loaded from here.

**--pidfile** _file_
> Write the server process id to this file.

**--packaging** _name_
> How this build was installed (**deb**, **rpm**, and so on). Default **unknown**.

**--configOverrides** _cfg:section.key=value_
> Replace one default for this process. Example: **cfg:default.paths.log=/dev/null**.

**-v**, **--version**
> Print the version and exit.

**--vv**
> Print the version and dependency versions, then exit.

**--profile**
> Turn on pprof. **--profile-addr** defaults to **localhost** and **--profile-port** defaults to **6060**.

# DESCRIPTION

**grafana server** starts the Grafana HTTP server: dashboards, alerting, and the data-source proxies. It is a subcommand of the **grafana** binary, not a separate program in current packages. The web UI listens on port **3000** unless the config file says otherwise. The first login on a new database is **admin** / **admin**, and Grafana asks for a new password.

Debian and RPM packages run this command from systemd with **--homepath /usr/share/grafana**, a pid file, and **cfg:** path overrides for logs, data, plugins, and provisioning. Older installs shipped a binary named **grafana-server** that accepted the same flags.

If **--config** is set and Grafana cannot find **conf/defaults.ini**, set **--homepath** to the install directory as well.

# CONFIGURATION

**grafana.ini** (often **/etc/grafana/grafana.ini**)
> Server port, database, authentication, and paths. Do not edit **conf/defaults.ini**; that file is the built-in defaults.

**/etc/grafana/provisioning/**
> YAML that adds data sources, dashboards, and alerting without using the UI.

# CAVEATS

**--homepath** defaults to the current directory. Starting the binary from a home directory, without **--homepath**, looks for defaults there and fails.

**--vv** exits after printing versions. It does not start the server.

# INSTALL

```dnf: sudo dnf install grafana```

```pacman: sudo pacman -S grafana```

```apk: sudo apk add grafana```

```zypper: sudo zypper install grafana```

```brew: brew install grafana```

```nix: nix profile install nixpkgs#grafana```

<!-- packages: 2026-11-21 -->

# SEE ALSO

[grafana](/man/grafana)(1), [grafana-cli](/man/grafana-cli)(1), [prometheus](/man/prometheus)(1)

# RESOURCES

```[Source code](https://github.com/grafana/grafana)```

```[Homepage](https://grafana.com)```

```[Documentation](https://grafana.com/docs/grafana/latest/cli/)```

<!-- verified: 2026-11-21 -->
