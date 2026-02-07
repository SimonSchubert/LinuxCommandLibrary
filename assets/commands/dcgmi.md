# TAGLINE

NVIDIA data center GPU management interface

# TLDR

**Show GPU discovery** information

```dcgmi discovery -l```

**Display GPU health** status

```dcgmi health -g [group_id]```

**Run diagnostics** on GPUs

```dcgmi diag -r [1]```

**Show real-time stats**

```dcgmi dmon```

**Create a GPU group**

```dcgmi group -c [group_name]```

**Add GPU to group**

```dcgmi group -g [group_id] -a [gpu_id]```

**Show GPU topology**

```dcgmi topo -g [group_id]```

# SYNOPSIS

**dcgmi** _subsystem_ [_options_]

# PARAMETERS

_SUBSYSTEM_
> Management subsystem: discovery, health, diag, dmon, group, topo, etc.

**discovery** **-l**
> List discovered GPUs.

**health** **-g** _GROUP_
> Check health of GPU group.

**diag** **-r** _LEVEL_
> Run diagnostics (level 1-4).

**dmon**
> Real-time monitoring dashboard.

**group** **-c** _NAME_
> Create named GPU group.

**topo** **-g** _GROUP_
> Show interconnect topology.

**--help**
> Display help information.

# DESCRIPTION

**dcgmi** is the command-line interface for NVIDIA's Data Center GPU Manager (DCGM). It provides monitoring, management, and diagnostic capabilities for NVIDIA GPUs in data center and HPC environments.

The tool enables administrators to monitor GPU health, run diagnostics, track performance metrics, and manage GPU groups for policy enforcement. It integrates with job schedulers and cluster management systems for automated GPU management.

DCGM tracks hundreds of GPU metrics including temperature, power, memory usage, and error counts. The diagnostic subsystem can detect hardware issues before they cause failures, supporting proactive maintenance.

# CAVEATS

Requires NVIDIA DCGM service running on the host. Only works with supported NVIDIA data center GPUs. Some diagnostics require GPUs to be idle. Elevated privileges needed for certain operations.

# HISTORY

DCGM was developed by **NVIDIA** and released around **2016** for enterprise GPU deployments. dcgmi provides CLI access to DCGM functionality, complementing the API and GUI interfaces for data center GPU fleet management.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1), [nvtop](/man/nvtop)(1), [gpustat](/man/gpustat)(1)
