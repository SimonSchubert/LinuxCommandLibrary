# TAGLINE

monitors disk I/O latency in real time, similar to how ping shows network

# TLDR

**Measure disk latency**

```ioping [path]```

**Run specific number of requests**

```ioping -c [10] [path]```

**Measure with specific size**

```ioping -s [1M] [path]```

**Measure disk seek rate**

```ioping -R [/dev/sda]```

**Measure sequential speed**

```ioping -RL [/dev/sda]```

**Use direct I/O**

```ioping -D [path]```

**Quiet mode with statistics**

```ioping -q -c [100] [path]```

# SYNOPSIS

**ioping** [_options_] _path_|_device_

# PARAMETERS

**-c** _count_
> Stop after count requests.

**-s** _size_
> Request size (default 4k).

**-R**
> Disk seek rate test.

**-L**
> Sequential operations (default random).

**-D**
> Use direct I/O (O_DIRECT).

**-W**
> Use writes (dangerous for devices).

**-C**
> Use cached I/O.

**-A**
> Use asynchronous I/O.

**-q**
> Quiet mode, show only summary.

**-w** _seconds_
> Stop after specified time.

# DESCRIPTION

**ioping** monitors disk I/O latency in real time, similar to how ping shows network latency. Generates I/O patterns and measures response time. SSDs should show sub-millisecond latency; HDDs typically show a few milliseconds. High latency spikes may indicate problems.

# SEE ALSO

[fio](/man/fio)(1), [iostat](/man/iostat)(1), [ping](/man/ping)(1)

