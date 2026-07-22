# TAGLINE

tails logs from multiple pods simultaneously

# TLDR

**Tail pods matching a name pattern**

```kubetail [pod-name-prefix]```

**Tail pods by label selector**

```kubetail -l [app=myapp]```

**Tail in a specific namespace**

```kubetail [pattern] -n [namespace]```

**Tail a specific container** (repeatable)

```kubetail [pattern] -c [container]```

**Show only the last N minutes of logs**

```kubetail [pattern] -s [10m]```

**Show timestamps**

```kubetail [pattern] --timestamps```

**Tail with regex matching**

```kubetail "[^app1|.*demo.*]" --regex```

**Dry-run: list matching pods without tailing**

```kubetail [pattern] -d```

# SYNOPSIS

**kubetail** [_pod-pattern_] [_options_]

# PARAMETERS

_PATTERN_
> Pod name pattern (prefix match by default, regex with --regex).

**-c**, **--container** _NAME_
> Container name (repeatable for multiple containers).

**-t**, **--context** _CONTEXT_
> Kubernetes context to use.

**-l**, **--selector** _SELECTOR_
> Label selector (e.g., app=myapp).

**-n**, **--namespace** _NAMESPACE_
> Target namespace.

**-e**, **--regex** _MODE_
> Match mode: regex or substring.

**-s**, **--since** _DURATION_
> Show logs since relative duration (e.g., 10m, 1h).

**-p**, **--previous** _BOOL_
> Retrieve logs from previous pod instances.

**-f**, **--follow** _BOOL_
> Follow log stream (default true).

**-d**, **--dry-run**
> Print matching pods/containers without tailing.

**-k**, **--colored-output** _MODE_
> Coloring mode: pod, line (default), loglevel, or false.

**-z**, **--skip-colors** _LIST_
> Comma-separated color indices to skip.

**-P**, **--prefix** _BOOL_
> Toggle pod name prefix on each line.

**-b**, **--line-buffered** _BOOL_
> Control line buffering.

**-j**, **--jq** _SELECTOR_
> Apply jq selector to JSON log lines.

**-r**, **--cluster** _NAME_
> Kubeconfig cluster name.

**--tail** _LINES_
> Limit number of recent lines per pod.

**--timestamps**
> Display timestamps on log lines.

**-i**, **--show-color-index** _BOOL_
> Display color index with pod prefix.

**-v**, **--version**
> Show version.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**kubetail** is a Bash script that aggregates and tails log output from multiple Kubernetes pods simultaneously. It matches pods by name prefix, regex, or label selector and streams their logs in a single terminal, using color-coded output to distinguish lines from different pods.

The tool is useful when debugging distributed applications or microservices where related log entries are spread across several pod replicas. Under the hood, kubetail spawns multiple `kubectl logs --follow` processes and merges their output, optionally filtering by namespace, container, or duration.

Defaults for most flags can be set via environment variables such as KUBETAIL_NAMESPACE, KUBETAIL_SINCE, KUBETAIL_TAIL, and KUBETAIL_COLORED_OUTPUT.

# CAVEATS

Third-party Bash script (not part of kubectl). Requires `kubectl` configured with cluster access. For Go-based alternatives with similar functionality, see stern.

# HISTORY

kubetail was created by Johan Haleby to simplify tailing logs from multiple Kubernetes pods with a single command.

# INSTALL

```brew: brew install kubetail```

```nix: nix profile install nixpkgs#kubetail```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[kubectl](/man/kubectl)(1), [stern](/man/stern)(1), [k9s](/man/k9s)(1)
