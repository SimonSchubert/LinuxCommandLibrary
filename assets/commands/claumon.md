# TAGLINE

Local dashboard for Claude usage and rate limits

# TLDR

**Start the dashboard** (opens a local web UI)

```claumon```

# SYNOPSIS

**claumon** [_options_]

# DESCRIPTION

**claumon** is a local monitoring tool for Claude Pro and Max users. Started from the terminal as a single, zero-configuration Go binary, it launches a local web dashboard (by default at http://localhost:3131) that shows live API rate-limit gauges, forecasted usage with credible intervals, per-session token and cost breakdowns with multi-day trends, and a browser for Claude memory files with health scoring.

It reads rate-limit information from the Claude OAuth API and presents calibrated usage forecasts so heavy users can see how close they are to their limits and how their consumption is trending over time.

# CAVEATS

Intended for Claude Pro and Max accounts and depends on Claude's OAuth API, so the data it shows reflects that service and may break if the upstream API changes. The dashboard is served locally; it is not a hosted service.

# HISTORY

**claumon** is written in **Go** and distributed as a single self-contained binary, installable via Homebrew. The name is a contraction of "Claude monitor."

# SEE ALSO

[claude](/man/claude)(1), [top](/man/top)(1), [htop](/man/htop)(1)

# RESOURCES

```[Source code](https://github.com/fabioconcina/claumon)```

```[Homepage](https://claumon.fabioconcina.com)```

<!-- verified: 2026-06-14 -->
