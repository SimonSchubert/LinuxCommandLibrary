# TAGLINE

OpenTelemetry CLI for sending traces, metrics, and logs

# TLDR

**Send a span** for a command

```otel-cli exec --service [my-app] --name [build] -- [make]```

**Emit a server span** manually

```otel-cli span --service [api] --name [handle-request]```

**Status** / configuration check

```otel-cli status```

# SYNOPSIS

**otel-cli** *command* [*options*]

# DESCRIPTION

**otel-cli** is a command-line client for OpenTelemetry. Wrap processes with **otel-cli exec** to create spans around builds and scripts, or emit spans/events directly for shell-based observability pipelines. Configure the OTLP endpoint via environment variables (e.g. **OTEL_EXPORTER_OTLP_ENDPOINT**) or flags.

# PARAMETERS

**exec** **--** *command*...

> Run a command inside a span.

**span**

> Create/end spans with attributes.

**status**

> Show configuration / connectivity.

**--service** *name* / **--name** *span*

> Common identity attributes.

See **otel-cli --help** for vendor-specific exporters and W3C traceparent propagation helpers.

# CAVEATS

Requires a reachable OpenTelemetry collector or backend. Incorrect endpoints silently drop telemetry. Clock skew affects span timing.

# INSTALL

```brew: brew install otel-cli```

```nix: nix profile install nixpkgs#otel-cli```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[curl](/man/curl)(1), [time](/man/time)(1)

# RESOURCES

```[Source code](https://github.com/equinix-labs/otel-cli)```

<!-- verified: 2026-07-19 -->
