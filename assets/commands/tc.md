# TLDR

Add constant **delay**

```sudo tc qdisc add dev eth0 root netem delay 100ms```

Add **variable** delay

```sudo tc qdisc add dev eth0 root netem delay 100ms 20ms```

Add packet **loss**

```sudo tc qdisc add dev eth0 root netem loss 5%```

**Limit** bandwidth

```sudo tc qdisc add dev eth0 root tbf rate 10mbit burst 32kbit latency 400ms```

**Show** active policies

```tc qdisc show dev eth0```

**Delete** all rules

```sudo tc qdisc delete dev eth0```

**Change** rule

```sudo tc qdisc change dev eth0 root netem delay 50ms```

# SYNOPSIS

**tc** [_OPTIONS_] _OBJECT_ _COMMAND_

# DESCRIPTION

**tc** (traffic control) configures kernel packet scheduling, shaping, and filtering. It can simulate network conditions like latency, packet loss, and bandwidth limits for testing or quality of service management.

# PARAMETERS

**qdisc**
> Queuing discipline - manage packet queuing

**add**
> Add a new traffic control policy

**delete**
> Remove traffic control policy

**change**
> Modify existing policy

**show**
> Display current policies

**netem**
> Network emulation (delay, loss, corruption)

**tbf**
> Token bucket filter (bandwidth limiting)

**delay** _ms_
> Add latency to packets

**loss** _percent_
> Drop percentage of packets

**rate** _bandwidth_
> Maximum bandwidth rate

# CAVEATS

Affects outgoing traffic only. For bidirectional control, configure on both ends. Changes are immediate and can disrupt network connectivity. Not persistent across reboots.

# HISTORY

**tc** is part of **iproute2**, the Linux networking toolkit, providing advanced traffic shaping and network emulation.

# SEE ALSO

[ip](/man/ip)(8), [ethtool](/man/ethtool)(8)
