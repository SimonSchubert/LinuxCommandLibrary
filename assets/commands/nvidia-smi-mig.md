# TAGLINE

manages Multi-Instance GPU configurations on supported NVIDIA GPUs

# TLDR

**Enable MIG mode on GPU 0** (requires root and a GPU reset or reboot)

```sudo nvidia-smi -i [0] -mig 1```

**List available GPU instance profiles**

```nvidia-smi mig -lgip```

**Create GPU instances from profiles and their default compute instances**

```sudo nvidia-smi mig -cgi [9,3g.20gb] -C```

**List GPU instances**

```nvidia-smi mig -lgi```

**List compute instances**

```nvidia-smi mig -lci```

**Delete all compute instances, then all GPU instances**

```sudo nvidia-smi mig -dci && sudo nvidia-smi mig -dgi```

**List MIG devices with their UUIDs**

```nvidia-smi -L```

# SYNOPSIS

**nvidia-smi mig** [_options_]

# PARAMETERS

**-i** _gpu_
> Target a specific GPU by index, PCI bus ID or UUID.

**-gi** _ids_
> Target specific GPU instance IDs.

**-ci** _ids_
> Target specific compute instance IDs.

**-lgip**
> List GPU instance profiles.

**-lgipp**
> List possible placements for GPU instance profiles.

**-lcip**
> List compute instance profiles.

**-lgi**
> List GPU instances.

**-lci**
> List compute instances.

**-cgi** _profiles_
> Create GPU instances from a comma-separated list of profile IDs or names (e.g. **9** or **3g.20gb**).

**-C**
> With **-cgi**, also create the default compute instance inside each new GPU instance.

**-cci** [_profiles_]
> Create compute instances inside a GPU instance (use with **-gi**).

**-dgi**
> Destroy GPU instances.

**-dci**
> Destroy compute instances.

# DESCRIPTION

**nvidia-smi mig** manages Multi-Instance GPU (MIG) partitions. MIG splits one physical GPU into up to seven GPU instances, each with dedicated memory, cache and compute slices, so several users or workloads can share the GPU with hardware isolation.

MIG must first be enabled per GPU with **nvidia-smi -mig 1**. GPU instances (GIs) are then created from profiles, and compute instances (CIs) are created inside each GI. Workloads select a MIG device by UUID via **CUDA_VISIBLE_DEVICES**.

# CAVEATS

Only data-center GPUs from the Ampere generation onward support MIG (A100, A30, H100, H200, Blackwell B200/GB200 and similar). Creating and destroying instances requires root and no running processes on the affected instances. Compute instances must be destroyed before their GPU instance. MIG configuration does not persist across reboots unless reapplied (for example with NVIDIA's **mig-parted**).

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1), [nvtop](/man/nvtop)(1)

# RESOURCES

```[Homepage](https://developer.nvidia.com/system-management-interface)```

```[Documentation](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/index.html)```

<!-- verified: 2026-11-07 -->
