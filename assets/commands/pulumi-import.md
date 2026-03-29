# TAGLINE

Import existing cloud resources into Pulumi

# TLDR

**Import an existing resource by type, name, and cloud ID**

```pulumi import [aws:s3/bucket:Bucket] [my-bucket] [my-bucket-id]```

**Import from a JSON file**

```pulumi import -f [resources.json]```

**Import and write generated code to a file**

```pulumi import [type] [name] [id] -o [code.ts]```

**Import without deletion protection**

```pulumi import --protect=false [type] [name] [id]```

**Preview the import without performing it**

```pulumi import --preview-only [type] [name] [id]```

**Import and skip the confirmation prompt**

```pulumi import -y [type] [name] [id]```

**Import specific properties only**

```pulumi import --properties [prop1,prop2] [type] [name] [id]```

# SYNOPSIS

**pulumi** **import** [_options_] _type_ _name_ _id_

# PARAMETERS

**-f**, **--file** _file_
> Import resources from a JSON file containing resource definitions.

**-o**, **--out** _file_
> Write generated resource declaration code to the specified file.

**--protect**
> Import resources with deletion protection enabled (default: true).

**--generate-code**
> Generate resource declaration code for imported resources (default: true).

**--parent** _name=urn_
> Parent resource name and URN in the format `name=urn`.

**--provider** _name=urn_
> Provider resource name and URN in the format `name=urn`.

**--properties** _names_
> Comma-separated list of property names to use for the import.

**--preview-only**
> Only show a preview of the import without performing it.

**--skip-preview**
> Skip the preview calculation before performing the import.

**--diff**
> Display the operation as a rich diff showing the overall change.

**-s**, **--stack** _name_
> Target stack to operate on.

**-p**, **--parallel** _n_
> Allow N resource operations to run in parallel (default: 16).

**-y**, **--yes**
> Automatically approve the import after preview.

**-m**, **--message** _msg_
> Optional message for the update operation.

**--from** _converter_
> Invoke a converter to import resources (e.g., from Terraform state).

**--suppress-outputs**
> Suppress display of stack outputs (useful when they contain sensitive values).

**-d**, **--debug**
> Print detailed debugging output during the operation.

**-j**, **--json**
> Serialize output as JSON.

# DESCRIPTION

**pulumi import** imports existing cloud resources into Pulumi state and optionally generates the code needed to manage them. This is useful for adopting existing infrastructure under Pulumi management without recreating resources.

The command requires the resource type (in the format `provider:module/resource:Resource`), a logical name for the resource in Pulumi, and the cloud provider's resource ID. After import, the resource appears in the stack state and future `pulumi up` operations will manage it.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-up](/man/pulumi-up)(1), [pulumi-state](/man/pulumi-state)(1), [pulumi-preview](/man/pulumi-preview)(1), [pulumi-refresh](/man/pulumi-refresh)(1)

