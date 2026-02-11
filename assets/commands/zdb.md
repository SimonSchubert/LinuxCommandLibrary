# TAGLINE

ZFS pool debugging and diagnostics tool

# TLDR

**Display pool configuration**

```sudo zdb -C [pool]```

**Display detailed vdev information**

```sudo zdb -l [/dev/disk]```

**Dump pool metadata**

```sudo zdb -d [pool]```

**Display object set contents**

```sudo zdb -dd [pool/dataset]```

**Check pool integrity without modifying**

```sudo zdb -c [pool]```

**Display block statistics**

```sudo zdb -b [pool]```

# SYNOPSIS

**zdb** [**-AbcdDFGhiLMPsvXY**] [**-e** [**-V**] [**-p** _path_]...] [**-I** _inflight_] [**-x** _dumpdir_] [**-t** _txg_] [**-U** _cache_] [**-K** _key_] [_poolname_|_dataset_|_objset_...]

# PARAMETERS

**-b**
> Display block allocation statistics

**-c**
> Verify pool integrity (checksum all data)

**-C**
> Display pool configuration from cachefile

**-d**
> Dump metadata from specified dataset

**-D**
> Display deduplication statistics

**-e**
> Operate on exported pool (specify devices with -p)

**-l**
> Read and display vdev label contents

**-L**
> Disable leak tracking

**-m**
> Display metaslab information

**-p** _path_
> Path to vdev (use with -e)

**-R**
> Read and display raw data

**-s**
> Display space map histograms

**-v**
> Verbose output

# DESCRIPTION

**zdb** is the ZFS debugger, used to display detailed internal information about ZFS pools, datasets, and vdevs. It's primarily a diagnostic and debugging tool for ZFS administrators and developers.

The tool can examine pool structure, display block allocation maps, verify data checksums, and dump raw ZFS metadata. It operates read-only and doesn't modify pool data.

Common uses include diagnosing pool corruption, examining vdev labels after disk failures, and understanding ZFS internals.

# CAVEATS

zdb requires root privileges to access raw disk devices and ZFS internal structures.

This is a debugging tool meant for experts. Misinterpreting output can lead to incorrect conclusions about pool health.

Output format may change between ZFS versions as internal structures evolve.

For routine pool diagnostics, use **zpool status** instead.

# SEE ALSO

[zfs](/man/zfs)(8), [zpool](/man/zpool)(8), [zpool-status](/man/zpool-status)(8)
