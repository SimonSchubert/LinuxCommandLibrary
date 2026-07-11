# TAGLINE

GPU observability agent with Kubernetes and Slurm workload attribution

# TLDR

**Install** the Python package

```pip install l9gpu```

**Monitor NVIDIA GPUs** and emit OTLP telemetry

```l9gpu nvml_monitor --sink otel --cluster my-cluster```

**Quick test** without sending data

```l9gpu nvml_monitor --sink stdout --once```

**Monitor AMD GPUs**

```l9gpu amd_monitor --sink otel --cluster my-cluster```

**Monitor Intel Gaudi**

```l9gpu gaudi_monitor --sink otel --cluster my-cluster```

**Run via systemd** or Kubernetes DaemonSet (see Helm)

# SYNOPSIS

**l9gpu** _subcommand_ [options]

Common subcommands: nvml_monitor, amd_monitor, gaudi_monitor, slurm_monitor and others.

# DESCRIPTION

**l9gpu** is the core CLI for Last9 GPU Telemetry. It runs as a per-node agent that collects hardware metrics (NVML, amdsmi, hl-smi) from GPUs and enriches them with workload context from Kubernetes or Slurm before exporting standard OpenTelemetry (OTLP) metrics and logs.

This enables per-pod, per-job, per-user GPU accounting without building custom pipelines. It supports NVIDIA, AMD, and Intel Gaudi GPUs and integrates with any OTLP-compatible backend.

The package also provides related health check tooling.

# PARAMETERS

**--sink** _otel|stdout|file_

> Destination for telemetry (otel recommended for production).

**--cluster** _name_

> Cluster identifier attached to emitted data.

**--once**

> Run a single collection cycle and exit (useful for testing).

Other options and subcommands are listed via `l9gpu --help`.

Configuration can also be supplied via TOML files.

# CAVEATS

Requires appropriate vendor libraries or tools (NVML for NVIDIA, etc.) and Python 3.10+. Primarily intended for cluster operators; not a replacement for DCGM or full Prometheus exporters. Emits OTLP; a collector is typically used downstream for storage/visualization.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1)

# RESOURCES

```[Source code](https://github.com/last9/gpu-telemetry)```

```[Homepage](https://last9.io/gpu-observability/)```

```[Documentation](https://last9.io/docs/)```

<!-- verified: 2026-07-11 -->
