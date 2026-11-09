# TAGLINE

TUI to explore Crossplane traces like k9s

# TLDR

**Explore the trace of a composite resource**

```xpdig trace [XObject/hello-world]```

**Explore the trace of a namespaced claim**

```xpdig trace -n [namespace] [Object/hello-world]```

**Use another Kubernetes context**

```xpdig trace --context [context] [Object/hello-world]```

**Load a trace from stdin**

```crossplane resource trace -o json [Object/hello-world] | xpdig trace --stdin```

**Use the older Crossplane CLI command**

```xpdig trace --cmd "crossplane beta trace -o json" [Object/hello-world]```

**Log debug events to a file**

```xpdig --log [/tmp/xpdig.json] --log-level debug trace [Object/hello-world]```

# SYNOPSIS

**xpdig** [_global-options_] **trace** [_options_] _Kind/name_

**xpdig** **version**

# PARAMETERS

**trace**, **t**
> Explore the trace of a Crossplane object.

**-n**, **--ns**, **--namespace** _NAMESPACE_
> Kubernetes namespace to use.

**--ctx**, **--context** _CONTEXT_
> Kubernetes context to use.

**--in**, **--stdin**
> Read a JSON trace piped into stdin.

**--cmd** _COMMAND_
> Command that generates the JSON trace (default: crossplane resource trace -o json).

**--short**
> Show short result columns for small screens.

**--nw**, **--no-watch**
> Disable the automatic resource watcher.

**--wi**, **--watch-interval** _DURATION_
> Refresh interval for the watcher (default: 5s).

**-l**, **--log** _FILE_
> Global option: log destination.

**--ll**, **--log-level** _LEVEL_
> Global option: log level: DEBUG, INFO (default), WARN, or ERROR.

# KEY BINDINGS

**j/k**, arrow keys
> Move the cursor up or down.

**enter**, **d**
> Run kubectl describe on the resource.

**y**, **e**
> Run kubectl get or edit on the resource.

**ctrl+d**
> Run kubectl delete on the resource.

**ctrl+x**
> Remove all finalizers from the resource.

**p**, **u**
> Pause or unpause the resource.

**c**
> Copy the fully qualified name to the clipboard.

**/**, **n**, **N**
> Search and move between results.

**h**, **?**
> Show help.

**q**, **ctrl+c**
> Quit.

# DESCRIPTION

**xpdig** provides a terminal UI similar to k9s for interactively exploring Crossplane resource traces. It supports expanded details with issue highlighting, the ability to get, describe, edit, and delete objects, and automatic watching for resource changes. It renders the object tree from the output of **crossplane resource trace**.

# CAVEATS

**crossplane**, **kubectl** and a pager must be installed, since xpdig runs them internally. The pager is taken from **PAGER** and defaults to less. Debug logs contain full Crossplane traces, which may include sensitive metadata.

# HISTORY

**xpdig** was created by **Bruno Luiz Silva** (brunoluiz) and is written in **Go**.

# SEE ALSO

[k9s](/man/k9s)(1), [kubectl](/man/kubectl)(1)

# RESOURCES

```[Source code](https://github.com/brunoluiz/xpdig)```

<!-- verified: 2026-11-09 -->
