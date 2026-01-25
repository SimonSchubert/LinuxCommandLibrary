# TLDR

**Run speed test**

```fast```

**Run with upload test**

```fast --upload```

**Run single download test**

```fast --single```

**Show JSON output**

```fast --json```

# SYNOPSIS

**fast** [_options_]

# PARAMETERS

**--upload**
> Include upload speed test.

**--single**
> Run single download test (not parallel).

**--json**
> Output results in JSON.

**--save-data**
> Save test data to file.

# DESCRIPTION

**fast** is a command-line speed testing tool powered by Netflix's Fast.com service. It measures download speed and optionally upload speed using Netflix's servers worldwide.

The tool provides a quick bandwidth measurement without ads or complexity. It's useful for testing internet connection quality and ISP performance.

# OUTPUT

```
   $ fast

     Ping: 12ms
   Download: 95.2 Mbps
   (Upload test with --upload)
```

# CAVEATS

Requires internet connection to Netflix's servers. Results may vary by location and time. Netflix servers may be throttled by some ISPs. For more detailed tests, use speedtest-cli.

# HISTORY

fast-cli was created as a command-line interface to Netflix's Fast.com, which Netflix launched in **2016** as a simple, ad-free speed test. The service uses Netflix's content delivery network.

# SEE ALSO

[speedtest-cli](/man/speedtest-cli)(1), [iperf](/man/iperf)(1), [curl](/man/curl)(1)
