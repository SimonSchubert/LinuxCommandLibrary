# TAGLINE

Local emulator of the AWS APIs

# TLDR

**Start** the emulator (HTTPS on 127.0.0.1:9297)

```aws-emulator```

Print **version** and build info

```aws-emulator -v```

Listen on a **different port**

```aws-emulator -p [9300]```

Let the OS pick a **free port**

```aws-emulator -p 0```

Turn **telemetry** off for this process

```aws-emulator --telemetry off```

Turn **request authentication** off

```aws-emulator --auth off```

Stop after **idle** seconds (for tests)

```aws-emulator --idle-timeout [60]```

Bind all interfaces (**containers**; publish the port on loopback)

```aws-emulator -b 0.0.0.0```

# SYNOPSIS

**aws-emulator** [_options_]

# PARAMETERS

**-b**, **--bind** _ip_
> Listen address. Must be an IP, not a host name. Default `127.0.0.1`. In a container, bind `0.0.0.0` and publish the port on `127.0.0.1`.

**-p**, **--port** _port_
> HTTPS port, 0 to 65535. Default **9297**. **0** lets the OS pick a port; read it from the startup log `endpoint_url` field.

**-a**, **--auth** **on**|**off**
> Request authentication. Default **on**. When **off**, every request is served and no credentials file is written.

**-t**, **--telemetry** **on**|**off**
> Telemetry for this run. **off** always disables it. **on** does not override an opt-out in the environment or `config.toml`.

**--idle-timeout** _seconds_
> Exit after this many seconds with no API call (1 to 31536000).

**-v**, **--version**
> Print version, release date, and commit, then exit.

**-h**, **--help**
> Print options and the health route, then exit.

# DESCRIPTION

**aws-emulator** is a local program that serves AWS APIs. It has no graphical interface. After it starts, point the AWS CLI or an SDK at its endpoint with environment variables. You do not need an AWS account. Requests stay on the emulator.

With no options it listens for HTTPS on `127.0.0.1:9297` (self-signed certificate) and runs in the foreground. Logs are JSON lines on standard output. When ready it writes a startup line whose `message` is `emulator server information`, with `endpoint_url`, `health_check_url`, `config_file`, `ca_file`, and `java_truststore_file`.

On Linux the package installs under `/opt/aws-emulator/` and puts **aws-emulator** on `PATH`. On Windows and macOS, AWS documents a container. Embedded mode is a Rust in-process client for tests, not this binary.

Health is `GET` on the admin health path printed at startup (HTTP 200, body `ok`). There is no reset-state route: all emulated resources live in memory and vanish when the process stops.

# CONFIGURATION

**~/.aws/emulator/config.toml**
> Machine-wide emulator settings. `[telemetry] enabled = false` turns telemetry off for every run. Override the path with the EMULATOR CONFIG environment variable.

**EMULATOR TELEMETRY**
> `off`, `false`, or `0` disables telemetry; `on`, `true`, or `1` enables it. Other values disable it and warn.

**~/.aws/emulator/<port>/**
> Per-run files: `emulator_credentials` (when auth is on), `config` (region us-east-1, endpoint and CA bundle), `ca.pem`, and `truststore.p12` for Java. Mode 0600. Deleted on a clean stop (Ctrl+C, SIGTERM, or idle timeout).

Point an SDK at a run by setting the AWS config file to that `config` and the AWS shared credentials file to `emulator_credentials`. Generated access keys start with `EMULATOR` and work only for that process. Each emulator is account `000000000000`.

# CAVEATS

For building and testing, not production and not security tests. Telemetry is on by default. Building from source needs a large `target/` directory and is documented for Linux only. If the port is in use, the process prints `Address already in use` and exits 1 without writing files. Idle memory is about 160 MiB and grows with resources. Fidelity varies by service; check release scores and the `issues/` tree in the repository.

# SEE ALSO

[aws-cli](/man/aws-cli)(1), [aws-configure](/man/aws-configure)(1), [docker](/man/docker)(1), [curl](/man/curl)(1)

# RESOURCES

```[Documentation](https://docs.aws.amazon.com/emulator/latest/userguide/what-is-service.html)```

```[Source code](https://github.com/aws/aws-emulator)```

<!-- verified: 2026-11-12 -->
