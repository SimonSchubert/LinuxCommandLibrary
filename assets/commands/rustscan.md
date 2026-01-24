# TLDR

**Scan target**

```rustscan -a [target]```

**Scan with port range**

```rustscan -a [target] -r [1-1000]```

**Scan multiple targets**

```rustscan -a [target1],[target2]```

**Pipe to nmap**

```rustscan -a [target] -- -sV -sC```

**Set batch size**

```rustscan -a [target] -b [1000]```

**Scan specific ports**

```rustscan -a [target] -p [22,80,443]```

**Increase timeout**

```rustscan -a [target] --timeout [3000]```

# SYNOPSIS

**rustscan** [_-a targets_] [_-p ports_] [_-r range_] [_options_] [-- _nmap args_]

# PARAMETERS

**-a**, **--addresses** _TARGETS_
> Target addresses.

**-p**, **--ports** _PORTS_
> Specific ports.

**-r**, **--range** _RANGE_
> Port range.

**-b**, **--batch-size** _N_
> Concurrent connections.

**--timeout** _MS_
> Connection timeout.

**-u**, **--ulimit** _N_
> File descriptor limit.

**-- ** _ARGS_
> Pass to nmap.

**-g**, **--greppable**
> Greppable output.

# DESCRIPTION

**rustscan** is a fast port scanner written in Rust. It finds open ports quickly, then optionally passes to nmap.

Asynchronous scanning achieves high speed. All 65535 ports scanned in seconds.

Nmap integration provides deep analysis. RustScan finds ports, nmap analyzes services.

Batch size controls aggressiveness. Higher values faster but may miss ports.

Adaptive learning adjusts to network conditions. Avoids overwhelming targets.

# CAVEATS

High scan rates may trigger IDS. Adjust batch size for reliability. For authorized scanning only.

# HISTORY

**RustScan** was created by **bee-san** for faster port scanning. It combines Rust's performance with nmap's capabilities.

# SEE ALSO

[nmap](/man/nmap)(1), [masscan](/man/masscan)(1), [zmap](/man/zmap)(1)
