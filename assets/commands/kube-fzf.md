# TLDR

**Interactive pod selection**

```findpod```

**Tail pod logs**

```tailpod```

**Exec into pod**

```execpod```

**Describe pod**

```describepod```

**Port forward**

```pfpod```

# SYNOPSIS

Commands: **findpod**, **tailpod**, **execpod**, **describepod**, **pfpod**

# PARAMETERS

**findpod**
> Fuzzy find and select pod.

**tailpod**
> Tail logs with fuzzy selection.

**execpod**
> Exec into pod interactively.

**describepod**
> Describe selected pod.

**pfpod**
> Port forward to selected pod.

# DESCRIPTION

**kube-fzf** provides fuzzy-finding commands for Kubernetes. It wraps kubectl with fzf for interactive selection.

The tool enables quick pod selection without remembering names. It supports multiple kubectl operations.

kube-fzf adds fuzzy find to kubectl.

# CAVEATS

Requires fzf installed. Shell functions. kubectl must work.

# HISTORY

kube-fzf combines **fzf** fuzzy finder with kubectl for interactive Kubernetes resource selection.

# SEE ALSO

[kubectl](/man/kubectl)(1), [fzf](/man/fzf)(1), [k9s](/man/k9s)(1)
