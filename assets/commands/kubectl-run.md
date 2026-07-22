# TAGLINE

creates and runs pods

# TLDR

**Run pod**

```kubectl run [pod-name] --image=[nginx]```

**Run interactive pod**

```kubectl run [pod-name] --image=[busybox] -it --rm -- [/bin/sh]```

**Run with port**

```kubectl run [pod-name] --image=[nginx] --port=[80]```

**Run with env vars**

```kubectl run [pod-name] --image=[nginx] --env="[KEY=value]"```

**Dry run output**

```kubectl run [pod-name] --image=[nginx] --dry-run=client -o yaml```

**Run with command**

```kubectl run [pod-name] --image=[busybox] -- [echo hello]```

# SYNOPSIS

**kubectl run** [_options_] _name_ **--image=**_image_

# PARAMETERS

_NAME_
> Pod name.

**--image** _IMAGE_
> Container image.

**-it**
> Interactive TTY.

**--rm**
> Delete pod on exit.

**--port** _PORT_
> Container port.

**--env** _VAR=VALUE_
> Environment variable.

**--dry-run** _MODE_
> `none`, `client`, or `server` — `client` prints the manifest without contacting the API; `server` validates against the cluster.

**--restart** _POLICY_
> `Always` (default), `OnFailure`, or `Never`. `Never` produces a bare Pod; the others adjust the generated PodSpec accordingly.

**--command**
> Treat extra args after `--` as the container's `command` (entrypoint) instead of arguments to the image entrypoint.

**--labels**, **-l** _KEY=VALUE,..._
> Comma-separated labels to set on the pod.

**-o** _FORMAT_
> Output format: yaml, json, name, jsonpath, etc. Combine with `--dry-run=client -o yaml` to template manifests.

**--image-pull-policy** _POLICY_
> `Always`, `IfNotPresent`, or `Never`.

**--overrides** _JSON_
> JSON merge patch applied to the generated PodSpec for fields not exposed as flags.

**--help**
> Display help information.

# DESCRIPTION

**kubectl run** creates and starts a single pod in the cluster from a specified container image. It is designed for quick, ad-hoc pod creation and is commonly used for debugging, running one-off tasks, and testing container images without writing a full manifest file.

The command supports interactive mode with `-it` for attaching a terminal session directly to the container, which is useful for launching temporary troubleshooting pods with tools like busybox or curl. Combined with `--rm`, the pod is automatically deleted when the session ends. The `--dry-run=client -o yaml` pattern is frequently used to generate a pod manifest template that can be customized and applied separately.

In earlier Kubernetes versions, `kubectl run` could create deployments and other resource types, but it now exclusively creates standalone pods. For production workloads, use deployments, statefulsets, or jobs instead to get replication, rolling updates, and self-healing capabilities.

# CAVEATS

Subcommand of kubectl. Creates only pods now. Use deployments for production.

# HISTORY

kubectl run provides quick pod creation for **Kubernetes** testing and debugging.

# INSTALL

```apt: sudo apt install kubectl```

```pacman: sudo pacman -S kubectl```

```apk: sudo apk add kubectl```

```brew: brew install kubectl```

```nix: nix profile install nixpkgs#kubectl```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-create](/man/kubectl-create)(1), [kubectl-exec](/man/kubectl-exec)(1)
