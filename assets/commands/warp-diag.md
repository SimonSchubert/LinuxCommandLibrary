# TAGLINE

Cloudflare WARP diagnostic and troubleshooting tool

# TLDR

**Run full diagnostics** and create a zip report

```warp-diag```

**Run diagnostics with a timestamp** in the output filename

```warp-diag --add-ts```

**Run diagnostics and save** to a specific directory

```warp-diag --output [path/to/directory]```

**Submit feedback** to Cloudflare interactively

```warp-diag feedback```

# SYNOPSIS

**warp-diag** [_options_] [_subcommand_]

# PARAMETERS

**--output** _directory_
> Save diagnostic zip file to the specified directory.

**--add-ts**
> Add a timestamp to the output filename.

**feedback**
> Submit feedback to Cloudflare interactively.

# DESCRIPTION

**warp-diag** collects diagnostic information for the Cloudflare WARP client and packages it into a zip file. It gathers WARP client logs, system network configuration, DNS settings, connectivity test results, and client state to help troubleshoot connection issues.

The generated zip file can be shared with Cloudflare support for analysis.

# CAVEATS

Requires the Cloudflare WARP client (warp-svc) to be installed. Some diagnostics may require root/administrator access. The zip file may contain sensitive network configuration details.

# SEE ALSO

[warp-cli](/man/warp-cli)(1)

