# TAGLINE

NVIDIA data center GPU management interface

# TLDR

**Show GPU discovery** information

```dcgmi discovery -l```

**Enable all health watches** on a group

```dcgmi health -g [group_id] -s a```

**Check the health** of a group

```dcgmi health -g [group_id] -c```

**Run diagnostics** on GPUs

```dcgmi diag -r [1]```

**Monitor** temperature, power and utilization for 10 samples

```dcgmi dmon -e 150,155,203 -c [10]```

**List the field IDs** usable with dmon

```dcgmi dmon -l```

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

**health** **-g** _GROUP_ **-s** _WATCHES_ | **-c**
> Set health watches for a GPU group (**a** for all, or p, m, i, t, n, d, x), or check its health.

**diag** **-r** _LEVEL_
> Run diagnostics: level 1 (quick) to 4 (extended, can take hours), or comma-separated test names.

**dmon** **-e** _FIELDS_ | **-l**
> Print the given field IDs continuously (**-d** sets the delay in ms, **-c** the sample count), or list the available fields.

**group** **-c** _NAME_
> Create named GPU group. **-l** lists groups, **-g** _ID_ **-a** _GPUS_ adds GPUs.

**topo** **-g** _GROUP_
> Show interconnect topology.

**fieldgroup** **-c** _NAME_ **-f** _FIELDS_
> Create a named field group for metric collection.

**modules** **-l**
> List available DCGM modules and their status.

**policy** **-g** _GROUP_ **--get** | **--set** _ACTION_,_VALIDATION_
> View or set GPU policy conditions.

**stats** **-j** _JOB_ID_ **-v**
> Display job-level GPU statistics. Enable collection first with **-g** _GROUP_ **--enable**, and bracket jobs with **-s** and **-x**.

**config**, **nvlink**, **profile**, **introspect**, **set**, **test**
> Further subsystems: GPU configuration, NVLink status, profiling metrics, DCGM self-inspection, hostengine settings, and test tooling.

**--host** _HOST_:_PORT_
> Connect to a remote DCGM host daemon (default: localhost:5555).

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

# RESOURCES

```[Source code](https://github.com/NVIDIA/DCGM)```

```[Homepage](https://developer.nvidia.com/dcgm)```

```[Documentation](https://docs.nvidia.com/datacenter/dcgm/latest/)```

<!-- verified: 2026-11-09 -->
