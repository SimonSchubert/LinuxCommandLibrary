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
> View telemetry data.

**--help**
> Display help information.

# DESCRIPTION

**gotelemetry** manages Go toolchain telemetry settings. It controls whether usage statistics are collected and uploaded to help improve Go development tools.

Users can enable full telemetry, disable it entirely, or use local-only collection mode where data is gathered but never uploaded. The **view** command shows what data has been collected.

# CAVEATS

Telemetry is opt-in. Data is anonymized. Part of Go 1.21+.

# HISTORY

gotelemetry was introduced with **Go 1.21** to enable opt-in telemetry collection for improving the Go toolchain.

# SEE ALSO

[go](/man/go)(1)
