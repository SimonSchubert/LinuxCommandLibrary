# TAGLINE

flexible I/O tester and benchmark

# TLDR

**Sequential read test**

```fio --name=test --rw=read --size=[1G]```

**Random write test**

```fio --name=test --rw=randwrite --size=[1G]```

**Run job file**

```fio [jobfile.fio]```

**Mixed read/write**

```fio --name=test --rw=randrw --rwmixread=[70] --size=[1G]```

**Measure latency**

```fio --name=test --rw=randread --size=[1G] --lat_percentiles=1```

# SYNOPSIS

**fio** [_options_] [_jobfiles_...]

# PARAMETERS

_JOBFILES_
> Job definition files.

**--name** _NAME_
> Job name.

**--rw** _TYPE_
> I/O type: read, write, randread, randwrite, randrw.

**--size** _SIZE_
> Total I/O size.

**--bs** _SIZE_
> Block size.

**--iodepth** _N_
> I/O queue depth.

**--numjobs** _N_
> Number of parallel jobs.

**--runtime** _SEC_
> Test duration.

**--output** _FILE_
> Output file.

**--help**
> Display help information.

# CONFIGURATION

**~/.fio**
> Global job configuration file for default settings.

**/etc/fio/fio.conf**
> System-wide configuration file.

# DESCRIPTION

**fio** (Flexible I/O Tester) is a versatile I/O benchmark tool for testing storage performance. It simulates various workload patterns and measures throughput, IOPS, and latency.

The tool supports numerous I/O engines including sync, libaio, io_uring, and network protocols. Job files define complex test scenarios with multiple workloads.

fio is the standard tool for storage benchmarking, used for disk selection, filesystem tuning, and performance validation.

# CAVEATS

Results vary with test parameters. May fill disk with test files. Requires understanding of I/O patterns for meaningful results.

# HISTORY

fio was created by **Jens Axboe**, the Linux block layer maintainer. It's the most comprehensive open source storage benchmark, supporting virtually every I/O pattern and storage backend.

# SEE ALSO

[dd](/man/dd)(1), [hdparm](/man/hdparm)(1), [ioping](/man/ioping)(1)
