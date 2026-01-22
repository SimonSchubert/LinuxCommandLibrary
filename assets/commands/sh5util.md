# TLDR

**Merge** HDF5 files for a job

```sh5util -j [job_id]```

Merge HDF5 files for a specific **job step**

```sh5util -j [job_id.step_id]```

**Extract** data series from a merged job file

```sh5util -j [job_id] -E -i [path/to/file.h5] -s [Energy|Filesystem|Network|Task]```

Extract a **specific data item** from all nodes

```sh5util -j [job_id] -I -s [series] -d [data_item]```

**List** available data items in a series

```sh5util -j [job_id] -I -s [series] -L```

Keep node files after **merging**

```sh5util -j [job_id] -S```

# SYNOPSIS

**sh5util** [**-j** _job[.step]_] [**-E**|**-I**] [_OPTIONS_]

# PARAMETERS

**-j, --jobs** _job[.step]_
> Merge HDF5 files for the specified job or job step

**-p, --profiledir** _dir_
> Directory containing node-step HDF5 files

**-o, --output** _path_
> Output file path (default: ./job_$jobid.h5)

**-S, --savefiles**
> Keep node-step files after merging

**--user** _user_
> User who ran the profiled job

**-E, --extract**
> Extract data series to CSV format

**-i, --input** _path_
> Input merged HDF5 file for extraction

**-N, --node** _nodename_
> Extract data for specific node only

**-l, --level** _level_
> Data level: Node:Totals or Node:TimeSeries

**-s, --series** _series_
> Data series: Energy, Filesystem, Network, Task, or Task_#

**-I, --item-extract**
> Extract single data item from all samples

**-d, --data** _item_
> Specific data item name to extract

**-L, --list**
> List available data items in a series

**-h, --help**
> Display usage information

# DESCRIPTION

**sh5util** merges HDF5 profiling files produced by Slurm's **acct_gather_profile** plugin across compute nodes into a single consolidated file for analysis. It supports three modes: merging node files, extracting data series to CSV, and extracting specific metrics from time series.

The tool works with Slurm job profiling data that tracks energy consumption, filesystem I/O, network activity, and task-level metrics. Output files can be analyzed with HDF5 tools or converted to CSV for use with standard data analysis applications.

# CAVEATS

Requires HDF5 profiling to be enabled in Slurm configuration. Node files must exist in the profile directory. Large jobs with many nodes and long runtimes can produce substantial HDF5 files. The **acct_gather_profile** plugin must be configured on the cluster.

# HISTORY

**sh5util** is part of the **Slurm** (Simple Linux Utility for Resource Management) workload manager, developed at **Lawrence Livermore National Laboratory**. Slurm was first released in **2002** and has become one of the most widely used HPC job schedulers. HDF5 profiling support was added to provide detailed job performance analysis capabilities.

# SEE ALSO

[sacct](/man/sacct)(1), [sstat](/man/sstat)(1), [srun](/man/srun)(1), [sbatch](/man/sbatch)(1)
