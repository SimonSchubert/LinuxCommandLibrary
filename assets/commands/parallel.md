# TAGLINE

runs jobs in parallel, utilizing multiple CPU cores

# TLDR

**Run command on multiple inputs**

```parallel [gzip] ::: [*.txt]```

**Pipe input to parallel jobs**

```cat [urls.txt] | parallel [curl -O]```

**Run with specific number of jobs**

```parallel -j [4] [command] ::: [args]```

**Use input as argument placeholder**

```parallel [wget {}] ::: [url1] [url2]```

**Multiple input sources**

```parallel [convert {1} {2}] ::: [*.jpg] ::: [--resize 50%]```

**Run on remote hosts**

```parallel -S [host1,host2] [command] ::: [args]```

**Show progress bar**

```parallel --bar [command] ::: [args]```

**Dry run** (show commands without executing)

```parallel --dry-run [command] ::: [args]```

# SYNOPSIS

**parallel** [_-j jobs_] [_-S hosts_] [_--bar_] [_options_] _command_ **:::** _arguments_

# PARAMETERS

**-j**, **--jobs** _N_
> Number of parallel jobs (N, N%, +N, -N).

**-S**, **--sshlogin** _HOSTS_
> Remote hosts for distributed execution.

**-a**, **--arg-file** _FILE_
> Read arguments from file.

**:::**, **:::::**
> Argument separators (inline or from file).

**{}**
> Replacement string for argument.

**{#}**
> Job number.

**{%}**
> Job slot number.

**{.}**
> Argument without extension.

**{/}**
> Basename of argument.

**{//}**
> Directory of argument.

**--bar**
> Show progress bar.

**--eta**
> Show estimated time of arrival.

**--dry-run**
> Show commands without executing.

**--keep-order**, **-k**
> Preserve output order.

**--halt** _MODE_
> When to halt: never, soon, now.

**--results** _DIR_
> Save output to files in directory.

**--delay** _TIME_
> Delay between job starts.

**--retries** _N_
> Retry failed jobs.

**--timeout** _TIME_
> Maximum runtime per job.

# DESCRIPTION

**GNU Parallel** runs jobs in parallel, utilizing multiple CPU cores. It's a more powerful replacement for xargs -P, designed for parallel processing of command-line tasks.

Arguments can come from the command line (:::), files (::::), or stdin. The {} placeholder is replaced with each argument. Variants like {.} (no extension), {/} (basename), and {//} (dirname) enable flexible filename manipulation.

Job control includes limiting parallelism (-j), distributing across SSH hosts (-S), and handling failures (--halt). Output can be kept in order (--keep-order) or saved to separate files (--results).

For distributed computing, parallel copies necessary files to remote hosts, runs jobs, and retrieves output. This enables clusters without complex job schedulers.

Progress tracking with --bar or --eta helps monitor long-running batch jobs. Logging options record what ran and what failed for later analysis.

# CAVEATS

Shell quoting can be tricky with complex commands. Different from moreutils parallel (simpler tool). Progress bar requires terminal. Distributed mode needs SSH key setup. Memory usage grows with job count. Command output interleaving without -k.

# HISTORY

**GNU Parallel** was written by **Ole Tange** starting around **2007**. It was designed to be a general parallelization tool, more flexible than xargs. The tool has grown to include distributed computing features and sophisticated job control. It's released under GPL and requests citation in academic work.

# SEE ALSO

[xargs](/man/xargs)(1), [make](/man/make)(1), [sem](/man/sem)(1), [nohup](/man/nohup)(1)
