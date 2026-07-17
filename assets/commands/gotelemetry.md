# TAGLINE

Go toolchain telemetry management

# TLDR

**View telemetry config**

```gotelemetry```

**Enable telemetry**

```gotelemetry on```

**Disable telemetry**

```gotelemetry off```

**Set to local mode**

```gotelemetry local```

**View collected data**

```gotelemetry view```

# SYNOPSIS

**gotelemetry** [_command_]

# PARAMETERS

**on**
> Enable telemetry uploads.

**off**
> Disable telemetry.

**local**
> Collect locally only.

**view**
> Start a local web viewer showing charts of collected telemetry data.

**env**
> Print the current telemetry environment (mode and data directory).

**clean**
> Remove all local telemetry data.

**--help**
> Display help information.

# DESCRIPTION

**gotelemetry** manages Go toolchain telemetry settings. It controls whether usage statistics and crash reports are collected and, optionally, uploaded to help the Go team prioritize improvements to the toolchain.

Running the command with no arguments shows the current mode. Three modes are supported: **local** (default) collects counters and reports on disk but never uploads them, **on** additionally uploads approved counters to telemetry.go.dev, and **off** disables collection entirely. The **view** command renders the locally stored reports as charts in a browser.

Since Go 1.23, the same functionality is also exposed via **go telemetry** [_on|off|local_] as a subcommand of the go tool, without needing the separate gotelemetry binary.

# CAVEATS

Telemetry is opt-in for uploading; only counters approved through a public proposal process are ever uploaded, and stack traces or other sensitive data are excluded. Introduced with Go 1.21 (local-only), with upload support added in Go 1.23.

# HISTORY

gotelemetry was introduced with **Go 1.21** to enable opt-in telemetry collection for improving the Go toolchain, with the **go telemetry** subcommand and upload capability landing in **Go 1.23**.

# SEE ALSO

[go](/man/go)(1)

# RESOURCES

```[Source code](https://go.googlesource.com/telemetry)```

```[Documentation](https://go.dev/doc/telemetry)```

<!-- verified: 2026-07-17 -->
