# TLDR

**Start beanstalkd** on the default port

```beanstalkd```

**Start on a specific address** and port

```beanstalkd -l [127.0.0.1] -p [11300]```

**Run with persistent storage** (binlog)

```beanstalkd -b [/var/lib/beanstalkd]```

**Run as a specific user** (drop privileges)

```beanstalkd -u [beanstalkd]```

**Set maximum job size**

```beanstalkd -z [65535]```

**Start in verbose mode**

```beanstalkd -V```

# SYNOPSIS

**beanstalkd** [_-l addr_] [_-p port_] [_-u user_] [_-z bytes_] [_-b path_] [_-V_] [_-h_]

# DESCRIPTION

**beanstalkd** is a simple, fast work queue server. It provides a generic interface for managing job queues, originally designed for reducing latency in high-volume web applications by running time-consuming tasks asynchronously.

Jobs are pushed to the queue by producers and reserved by workers (consumers) for processing. The protocol supports job priorities, delays, time-to-run limits, and multiple named tubes (queues).

# PARAMETERS

**-l** _addr_
> Listen on address (IP or 0.0.0.0 for all interfaces). Default: 0.0.0.0

**-p** _port_
> Listen on TCP port. Default: 11300

**-u** _user_
> Drop privileges and run as specified user after binding to port

**-z** _bytes_
> Maximum job size in bytes. Default: 65535 (64KB)

**-b** _path_
> Enable binlog for job persistence in the specified directory

**-V**
> Print version and exit

**-h**
> Print help message with available options

# CAVEATS

By default, beanstalkd stores all jobs in memory; a restart loses all queued jobs unless **-b** binlog is enabled. There is no authentication mechanism built-in; secure access through firewall rules or bind to localhost only. Jobs exceeding the maximum size (**-z**) are rejected.

# HISTORY

Beanstalkd was created by **Keith Rarick** in **2007** at Causes.com to handle background job processing. It gained popularity as a lightweight alternative to heavier message queue systems, known for its simplicity and sub-millisecond latency.

# SEE ALSO

[redis](/man/redis)(1), [rabbitmq-server](/man/rabbitmq-server)(1)
