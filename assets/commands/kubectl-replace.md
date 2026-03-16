# TAGLINE

Replace a resource by filename or stdin

# TLDR

**Replace resource from file**

```kubectl replace -f [manifest.yaml]```

**Force replace (delete and recreate)**

```kubectl replace --force -f [manifest.yaml]```

**Replace from stdin**

```cat [manifest.yaml] | kubectl replace -f -```

**Dry run without applying changes**

```kubectl replace -f [manifest.yaml] --dry-run=client```

**Replace and process a kustomization directory**

```kubectl replace -k [directory/]```

**Replace resources from multiple files**

```kubectl replace -f [file1.yaml] -f [file2.yaml]```

# SYNOPSIS

**kubectl** **replace** **-f** _FILENAME_ [_options_]

# PARAMETERS

**-f**, **--filename** _file_
> Filename, directory, or URL to file to use to replace the resource.

**-k**, **--kustomize** _dir_
> Process a kustomization directory. Cannot be used with -f or -R.

**-R**, **--recursive**
> Process the directory used in -f recursively.

**--force**
> If true, immediately remove resources from API and bypass graceful deletion.

**--cascade** _mode_
> Cascade deletion strategy for dependents: "background", "orphan", or "foreground". Default: "background".

**--grace-period** _seconds_
> Period of time in seconds given to the resource to terminate gracefully. Ignored if negative. Default: -1.

**--dry-run** _strategy_
> Must be "none", "server", or "client". Default: "none".

**--validate** _mode_
> Validation mode: "strict", "warn", or "ignore". Default: "strict".

**-o**, **--output** _format_
> Output format: json, yaml, name, go-template, jsonpath, etc.

**--save-config**
> Save the configuration of the current object in its annotation for future use with kubectl apply.

**--field-manager** _name_
> Name of the manager used to track field ownership. Default: "kubectl-replace".

**--subresource** _name_
> If specified, replace will operate on the subresource of the requested object.

**--timeout** _duration_
> Length of time to wait before giving up on a delete.

**--wait**
> If true, wait for resources to be gone before returning.

**--raw** _URI_
> Raw URI to PUT to the server.

# DESCRIPTION

**kubectl replace** replaces a resource by filename or stdin. JSON and YAML formats are accepted. The resource must already exist. Unlike apply, replace requires the complete resource specification, which can be obtained with `kubectl get TYPE NAME -o yaml`. Use --force to delete and recreate the resource.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-apply](/man/kubectl-apply)(1), [kubectl-create](/man/kubectl-create)(1), [kubectl-delete](/man/kubectl-delete)(1), [kubectl-edit](/man/kubectl-edit)(1), [kubectl-patch](/man/kubectl-patch)(1)

