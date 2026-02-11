# TAGLINE

Create a new Pulumi project from template

# TLDR

**Create new project interactively**

```pulumi new```

**Create from template**

```pulumi new [template]```

**Create TypeScript project**

```pulumi new typescript```

**Create AWS Python project**

```pulumi new aws-python```

**Create with project name**

```pulumi new [template] --name [project_name]```

# SYNOPSIS

**pulumi** **new** [_options_] [_template_]

# PARAMETERS

**--name** _name_
> Project name.

**--description** _desc_
> Project description.

**-s**, **--stack** _name_
> Initial stack name.

**-d**, **--dir** _dir_
> Target directory.

**-y**, **--yes**
> Skip prompts with defaults.

**--force**
> Overwrite existing files.

**-g**, **--generate-only**
> Generate without creating stack.

# DESCRIPTION

**pulumi new** creates a new Pulumi project from a template. Templates include language runtimes (typescript, python, go, csharp) and cloud providers (aws, azure, gcp). Initializes project structure and dependencies.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-up](/man/pulumi-up)(1), [pulumi-stack](/man/pulumi-stack)(1)

