# TLDR

**Edit deployment in editor**

```kubectl edit deployment [name]```

**Edit pod**

```kubectl edit pod [pod-name]```

**Edit with specific editor**

```EDITOR=nano kubectl edit deployment [name]```

**Edit resource in YAML format**

```kubectl edit deployment [name] -o yaml```

# SYNOPSIS

**kubectl** **edit** _type_/_name_ [_options_]

# PARAMETERS

**-o**, **--output** _format_
> Edit format (yaml, json).

**-n**, **--namespace** _name_
> Kubernetes namespace.

**--record**
> Record command in resource annotation.

# DESCRIPTION

**kubectl edit** opens a resource's configuration in your default editor. Changes are applied when you save and exit. The resource is validated before applying. Set EDITOR or KUBE_EDITOR environment variable to change the editor.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-patch](/man/kubectl-patch)(1)

