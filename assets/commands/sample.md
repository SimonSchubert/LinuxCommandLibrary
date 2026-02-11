# TAGLINE

Profile a running process by sampling call stacks

# TLDR

**Sample a process by PID** for 10 seconds

```sample [pid]```

**Sample a process by name** for a specific duration

```sample [Safari] [30]```

**Sample with custom interval** (in milliseconds)

```sample [pid] [10] [5]```

**Wait for a process to start** then sample it

```sample [MyApp] [10] -wait```

**Save sample output to a file**

```sample [pid] [10] -file [output.txt]```

**Sample a process that may exit** during sampling

```sample [pid] [10] -mayDie```

# SYNOPSIS

**sample** _pid|partial-name_ [_duration_] [_interval_] [_-wait_] [_-mayDie_] [_-fullPaths_] [_-file filename_]

# PARAMETERS

**pid | partial-name**
> Process ID or partial executable name to sample

**duration**
> Sampling duration in seconds (default: 10)

**interval**
> Sampling interval in milliseconds (default: 1)

**-wait**
> Wait for the specified process to launch, then begin sampling

**-mayDie**
> Immediately capture symbol locations in case the process exits during sampling

**-fullPaths**
> Show full paths to source files in the output

**-file** _filename_
> Write output to the specified file instead of stdout

**-e**
> Open the output file in TextEdit when sampling completes

# DESCRIPTION

**sample** is a macOS command-line profiler that captures the call stacks of all threads in a process at regular intervals. It suspends the process briefly during each sample, records the current stack trace, then resumes execution.

The resulting report shows a condensed call tree indicating which functions were executing and how often they appeared on the stack. This sampling approach efficiently identifies hot spots and performance bottlenecks without the overhead of full instrumentation.

Fast sampling rates (lower interval values) provide more data points and better coverage of short-lived function calls. The output can be analyzed as text or opened in Xcode Instruments for graphical visualization.

# CAVEATS

Sampling only captures functions executing at sample points, so very fast functions may be missed. The process is briefly suspended during each sample, which can affect timing-sensitive applications. Requires appropriate permissions to sample processes owned by other users.

# HISTORY

**sample** is part of Apple's developer tools suite for macOS, providing command-line access to the same sampling technology used by Instruments and Activity Monitor. It enables performance profiling without requiring the full Xcode IDE.

# SEE ALSO

[spindump](/man/spindump)(8), [leaks](/man/leaks)(1), [heap](/man/heap)(1), [instruments](/man/instruments)(1)
