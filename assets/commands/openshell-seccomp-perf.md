# TAGLINE

Measure native and seccomp-filtered TCP sockets

# TLDR

Compare **native and filtered** TCP connect and stream

```openshell-seccomp-perf```

Measure only the **filtered** TCP stream path

```openshell-seccomp-perf --layer filtered --protocol tcp-stream```

Use a **larger payload** and more iterations

```openshell-seccomp-perf --iterations 20000 --payload-bytes 1024```

# SYNOPSIS

**openshell-seccomp-perf** [**--layer** _native_|_filtered_|_all_] [**--protocol** _tcp-connect_|_tcp-stream_|_all_] [**--iterations** _N_] [**--warmup** _N_] [**--concurrency** _N_] [**--payload-bytes** _N_]

# DESCRIPTION

**openshell-seccomp-perf** is a Linux microbenchmark for the production seccomp network broker in **openshell-sandbox**. It is not part of the default sandbox binary. The **openshell-sandbox** crate compiles it only when the **perf-harness** feature is enabled.

Each run prints one JSON object per selected layer and protocol. A report names the layer and protocol, how many operations were counted, concurrency, payload size, a short capability-scope sentence, elapsed time in milliseconds, operations per second, throughput in megabits per second, and the 50th, 95th, and 99th percentile latency in nanoseconds.

**--layer all** (the default) measures **native** sockets and the same operations inside the seccomp-filtered broker. **--protocol all** (the default) runs **tcp-connect** and **tcp-stream**. Connect opens a TCP connection to a local listener and transfers no application payload, so its throughput is zero. Stream writes one payload and reads the echo, and throughput counts both directions.

The harness starts a localhost fixture, then re-executes itself as a hidden **worker** to collect samples. That subcommand is not an operator entry point. The filtered layer starts the production network broker before the worker runs.

# PARAMETERS

**--layer** _native_|_filtered_|_all_

> Which path to measure. Default **all**.

**--protocol** _tcp-connect_|_tcp-stream_|_all_

> Which local TCP operation to measure. Default **all**. **tcp-connect** is connection setup. **tcp-stream** is a write of the payload and a read of the echo on an already connected socket.

**--iterations** _N_

> Measured operations per worker thread. Default **10000**. Must be greater than zero. The report's operation count is this value multiplied by **--concurrency**.

**--warmup** _N_

> Unmeasured operations per worker before the timer starts. Default **1000**.

**--concurrency** _N_

> Worker threads. Default **1**. Must be greater than zero.

**--payload-bytes** _N_

> Application payload size. Default **64**. Must be from **1** to **65507**.

# CAVEATS

Linux only. On any other platform the process exits with an error that the seccomp performance harness requires Linux.

The binary is absent from a default **openshell-sandbox** build and from the guest files the VM driver embeds. Build the **openshell-sandbox** crate with feature **perf-harness** to produce it.

An iteration count or concurrency of zero is an error. A payload outside **1** through **65507** is an error. Warmup that exceeds the 30-second preparation deadline fails the run. Each socket operation times out after 10 seconds.

The **worker** subcommand is hidden. The parent process starts it. Do not invoke it by hand.

Filtered mode uses the same seccomp network broker as the sandbox boundary. A host that cannot start that broker cannot finish **--layer filtered** or **all**.

# HISTORY

**openshell-seccomp-perf** is part of NVIDIA **OpenShell** (Apache License 2.0), in the **openshell-sandbox** crate. OpenShell was first published in **March 2026**.

# SEE ALSO

[openshell-sandbox](/man/openshell-sandbox)(1), [openshell](/man/openshell)(1), [openshell-supervisor](/man/openshell-supervisor)(1), [openshell-vm-init](/man/openshell-vm-init)(1)

# RESOURCES

```[Source code](https://github.com/NVIDIA/OpenShell)```

```[Homepage](https://www.nvidia.com/en-us/ai/openshell/)```

```[Documentation](https://github.com/NVIDIA/OpenShell/blob/main/crates/openshell-sandbox/README.md)```

<!-- verified: 2026-10-29 -->
