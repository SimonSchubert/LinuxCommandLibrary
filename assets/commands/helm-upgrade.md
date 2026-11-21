# TAGLINE

Upgrade a Helm release to a new chart version or a new set of values

# TLDR

Upgrade a release to the **latest** chart from a repository

```helm upgrade [release] [repo]/[chart]```

Upgrade from an **unpacked** chart directory

```helm upgrade [release] [path/to/chart]```

Upgrade, or **install** if the release does not exist yet

```helm upgrade -i [release] [repo]/[chart]```

Pin a **chart version**

```helm upgrade [release] [repo]/[chart] --version [1.2.3]```

Upgrade in a **namespace**

```helm upgrade [release] [repo]/[chart] -n [namespace]```

Pass a **values file**

```helm upgrade [release] [repo]/[chart] -f [values.yaml]```

Override one value on the **command line**

```helm upgrade [release] [repo]/[chart] --set [key]=[value]```

**Simulate** on the client, without talking to the cluster

```helm upgrade [release] [repo]/[chart] --dry-run=client```

# SYNOPSIS

**helm upgrade** [_RELEASE_] [_CHART_] [_flags_]

# PARAMETERS

**-i**, **--install**
> Install the release when no release of that name exists.

**--version** _constraint_
> Chart version to use. A tag such as **1.2.3**, or a range such as **^2.0.0**. Without this flag Helm uses the latest version.

**-n**, **--namespace** _namespace_
> Namespace of the release.

**--create-namespace**
> With **--install**, create the namespace if it is missing.

**-f**, **--values** _file_
> Values from a YAML file or a URL. Repeat the flag to merge several files. The right-most file wins on duplicate keys.

**--set** _key_=_value_
> Set a value from the command line. Repeat the flag, or separate pairs with commas. The right-most setting wins.

**--reuse-values**
> Keep the previous release's values and merge in **--set** and **-f**. Ignored when **--reset-values** is also set.

**--reset-values**
> Drop the previous values and use the chart defaults, plus any **--set** and **-f** overrides.

**--dry-run**=**none** | **client** | **server**
> **none** (the default) performs the upgrade. **client** renders manifests locally and does not contact the cluster. **server** renders on the cluster without persisting the release. A dry run prints Secrets. Add **--hide-secret** to omit them.

**--timeout** _duration_
> How long to wait for one Kubernetes operation. Default **5m0s**.

**--wait**[=**watcher** | **hookOnly** | **legacy**]
> Wait until resources are ready, up to **--timeout**. The flag alone means **watcher**. If the flag is omitted, the strategy is **hookOnly**.

**--rollback-on-failure**
> Roll back to the last successful release if the upgrade fails. This defaults **--wait** to **watcher**.

**--history-max** _count_
> How many revisions to keep. **0** means no limit. Default **10**.

# DESCRIPTION

**helm upgrade** replaces an existing release with a new revision of a chart, or with new values for the same chart. The chart argument is a **repo/name** reference, a directory, a packaged chart, or a URL.

This is a subcommand of **helm**, not a separate program. Helm keeps the old revision so **helm rollback** can return to it, up to **--history-max**.

Later **-f** and **--set** arguments override earlier ones when the same key is set twice.

# CAVEATS

On Helm 4, **--dry-run** is not a boolean. The default value **none** runs the upgrade for real. Pass **--dry-run=client** or **--dry-run=server** to simulate.

**--reuse-values** and **--reset-values** disagree with each other. **--reset-values** wins. **--reset-then-reuse-values** is a third mode: chart defaults, then the last release's values, then the flags on this command. It is ignored if either of the other two is set.

# INSTALL

```dnf: sudo dnf install helm```

```pacman: sudo pacman -S helm```

```apk: sudo apk add helm```

```zypper: sudo zypper install helm```

```brew: brew install helm```

```nix: nix profile install nixpkgs#helm```

<!-- packages: 2026-11-21 -->

# SEE ALSO

[helm](/man/helm)(1), [helm-install](/man/helm-install)(1), [kubectl](/man/kubectl)(1)

# RESOURCES

```[Source code](https://github.com/helm/helm)```

```[Homepage](https://helm.sh)```

```[Documentation](https://helm.sh/docs/helm/helm_upgrade/)```

<!-- verified: 2026-11-21 -->
