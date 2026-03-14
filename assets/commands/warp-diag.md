# TAGLINE

Cloudflare WARP diagnostic and troubleshooting tool

# TLDR

**Run full diagnostics** and create a zip report

```warp-diag```

**Run diagnostics and save** to a specific directory

```warp-diag --output [path/to/directory]```

**Run diagnostics** without browser-based feedback

```warp-diag --no-open```

# SYNOPSIS

**warp-diag** [_options_]

# PARAMETERS

**--output** _directory_
> Save diagnostic zip file to the specified directory.

**--no-open**
> Do not automatically open the feedback URL in a browser after collection.

# DESCRIPTION

**warp-diag** collects diagnostic information for the Cloudflare WARP client and packages it into a zip file. It gathers WARP client logs, system network configuration, DNS settings, connectivity test results, and client state to help troubleshoot connection issues.

The generated zip file can be shared with Cloudflare support for analysis. The tool may also open a browser to submit feedback directly to Cloudflare.

# CAVEATS

Requires the Cloudflare WARP client (warp-svc) to be installed. Some diagnostics may require root/administrator access. The zip file may contain sensitive network configuration details.

# SEE ALSO

[warp-cli](/man/warp-cli)(1)

