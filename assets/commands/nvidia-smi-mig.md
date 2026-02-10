# TAGLINE

manages Multi-Instance GPU configurations on supported NVIDIA GPUs

# TLDR

**List MIG devices**

```nvidia-smi mig -lgip```

**Create GPU instance**

```nvidia-smi mig -cgi [profile_id] -C```

**Delete GPU instance**

```nvidia-smi mig -dci -gi [instance_id]```

**List GPU instances**

```nvidia-smi mig -lgi```

# SYNOPSIS

**nvidia-smi mig** [_options_]

# PARAMETERS

**-lgip**
> List GPU instance profiles.

**-lcip**
> List compute instance profiles.

**-lgi**
> List GPU instances.

**-lci**
> List compute instances.

**-cgi** _profile_
> Create GPU instance.

**-cci** _profile_
> Create compute instance.

**-dgi**
> Delete GPU instances.

**-dci**
> Delete compute instances.

**-gi** _id_
> GPU instance ID.

**-C**
> Create default compute instance.

# DESCRIPTION

**nvidia-smi mig** manages Multi-Instance GPU (MIG) configurations on supported NVIDIA GPUs. MIG partitions a single GPU into multiple isolated instances for sharing among multiple users or workloads.

# CAVEATS

Only supported on NVIDIA A100, A30, and H100 GPUs with MIG capability enabled.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1)

