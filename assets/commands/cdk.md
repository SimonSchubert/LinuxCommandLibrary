# TAGLINE

AWS Cloud Development Kit CLI

# TLDR

**Initialize new CDK project**

```cdk init app --language [typescript]```

**List stacks in app**

```cdk list```

**Synthesize CloudFormation template**

```cdk synth```

**Deploy stack**

```cdk deploy [StackName]```

**Deploy all stacks**

```cdk deploy --all```

**Show diff with deployed stack**

```cdk diff [StackName]```

**Destroy stack**

```cdk destroy [StackName]```

# SYNOPSIS

**cdk** [_global_options_] _command_ [_arguments_] [_command_options_]

# DESCRIPTION

**cdk** is the AWS Cloud Development Kit CLI for defining cloud infrastructure as code using familiar programming languages. It synthesizes CloudFormation templates from TypeScript, Python, Java, C#, or Go code and deploys them to AWS.

Instead of writing CloudFormation YAML or JSON by hand, developers define infrastructure using constructs -- reusable, composable classes that represent AWS resources. The CDK synthesizes these constructs into CloudFormation templates, which are then deployed to create and manage the actual AWS resources.

The workflow typically involves initializing a project with `cdk init`, writing infrastructure code, previewing changes with `cdk diff`, and deploying with `cdk deploy`. The `cdk watch` command enables hot-reloading during development.

# COMMANDS

**init**
> Create new CDK project from template

**list** (ls)
> List stacks in CDK app

**synth**
> Synthesize CloudFormation template

**deploy**
> Deploy stacks to AWS

**destroy**
> Delete stacks from AWS

**diff**
> Show differences between stacks

**bootstrap**
> Deploy CDK bootstrap stack

**watch**
> Watch for changes and deploy

**context**
> Manage cached context values

**docs**
> Open CDK documentation

# PARAMETERS

**--all**
> Deploy/destroy all stacks

**--hotswap**
> Fast deployment when possible

**--require-approval** _level_
> Approval level: never, any-change, broadening

**--profile** _name_
> AWS profile to use

**--region** _region_
> AWS region

**--output** _dir_
> Output directory for synthesized templates

**--verbose**, **-v**
> Verbose output

# CONFIGURATION

**cdk.json**
> Project configuration including app entry point, context values, and feature flags.

# CAVEATS

Requires Node.js and AWS credentials configured. Run `cdk bootstrap` once per account/region before first deploy.

# SEE ALSO

[aws](/man/aws)(1), [terraform](/man/terraform)(1), [pulumi](/man/pulumi)(1)
