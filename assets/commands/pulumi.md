# TLDR

**Create new project**

```pulumi new [template]```

**Preview changes**

```pulumi preview```

**Deploy stack**

```pulumi up```

**Destroy resources**

```pulumi destroy```

**List stacks**

```pulumi stack ls```

**Select stack**

```pulumi stack select [stack-name]```

**Show stack outputs**

```pulumi stack output```

# SYNOPSIS

**pulumi** [_options_] _command_ [_args_]

# DESCRIPTION

**pulumi** is an infrastructure as code tool supporting multiple programming languages. It manages cloud resources using TypeScript, Python, Go, C#, Java, and YAML.

The tool provisions resources across AWS, Azure, GCP, Kubernetes, and many other providers using familiar programming constructs.

# PARAMETERS

**new**
> Create new project.

**up**
> Deploy changes.

**preview**
> Preview changes.

**destroy**
> Delete resources.

**stack**
> Manage stacks.

**config**
> Manage configuration.

**logs**
> View logs.

**-s** _stack_
> Target stack.

**-y**, **--yes**
> Skip confirmations.

**--diff**
> Show detailed diff.

# CAVEATS

Requires Pulumi account or self-hosted backend. State management important. Provider plugins downloaded on first use. Learning curve for programming approach.

# HISTORY

**Pulumi** was founded by **Joe Duffy** and **Eric Rudder** in **2017**. It brought general-purpose programming languages to infrastructure management, differentiating from domain-specific languages like Terraform's HCL.

# SEE ALSO

[terraform](/man/terraform)(1), [aws](/man/aws)(1), [kubectl](/man/kubectl)(1), [cdktf](/man/cdktf)(1)
