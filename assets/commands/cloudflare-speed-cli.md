# TAGLINE

Cloudflare-powered internet speed test CLI

# TLDR

**Run** a speed test

```speed-cloudflare-cli```

**Run** without installing via npx

```npx speed-cloudflare-cli```

**Output** results in JSON format

```speed-cloudflare-cli --json```

# SYNOPSIS

**speed-cloudflare-cli** [**--json**]

# PARAMETERS

**--json**
> Output results in JSON format instead of human-readable colored console output.

# DESCRIPTION

**speed-cloudflare-cli** is a Node.js command-line tool that measures the speed and consistency of your internet connection using Cloudflare's speed test infrastructure at **speed.cloudflare.com**. It tests download speed, upload speed, and latency, reporting metrics including jitter.

The tool performs 20 latency measurements, then tests download speed across 5 payload sizes (100kB to 100MB) and upload speed across 3 payload sizes (11kB to 1MB). Results report the 90th percentile speed in Mbps. Output includes server location (city and IATA code), your IP address, latency statistics (min, max, average, median, jitter), download speed, and upload speed.

# CAVEATS

Requires Node.js and npm. Tests against Cloudflare's nearest edge server; server selection is automatic and cannot be overridden. Results reflect connection quality to Cloudflare's network specifically, which may differ from other speed test services. The package has not been updated since approximately 2021 and may have compatibility issues with newer Node.js versions.

# HISTORY

**speed-cloudflare-cli** was created by **KNawm** as a community-built CLI for Cloudflare's speed test service. Cloudflare launched its browser-based speed test in **September 2020**. The CLI uses the same API endpoints to perform measurements from the terminal. Written in JavaScript under the MIT license. The latest version is 2.0.3.

# SEE ALSO

[speedtest-cli](/man/speedtest-cli)(1), [fast](/man/fast)(1), [iperf](/man/iperf)(1), [speed-test](/man/speed-test)(1)
