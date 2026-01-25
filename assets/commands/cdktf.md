# TLDR

**Initialize a new CDKTF project**

```cdktf init --template=[typescript] --local```

**Generate provider bindings**

```cdktf get```

**Synthesize Terraform configuration**

```cdktf synth```

**Plan infrastructure changes**

```cdktf diff```

**Apply infrastructure changes**

```cdktf deploy```

**Destroy infrastructure**

```cdktf destroy```

**Convert HCL to CDKTF**

```cdktf convert < [main.tf]```

**List stacks**

```cdktf list```

# SYNOPSIS

**cdktf** _command_ [_options_]

# PARAMETERS

**init**
> Initialize a new CDKTF project.

**get**
> Generate provider bindings from cdktf.json.

**synth**
> Synthesize Terraform JSON configuration.

**diff**
> Show planned changes (terraform plan).

**deploy** [_stacks_]
> Deploy infrastructure (terraform apply).

**destroy** [_stacks_]
> Destroy infrastructure.

**convert**
> Convert HCL Terraform code to CDKTF.

**list**
> List all stacks in the application.

**output** [_stacks_]
> Show outputs from deployed stacks.

**--template** _name_
> Project template: typescript, python, java, csharp, go.

**--local**
> Use local Terraform state.

**--auto-approve**
> Skip interactive approval.

**-o**, **--output** _directory_
> Output directory for synthesized files.

# DESCRIPTION

**CDK for Terraform (CDKTF)** enables defining infrastructure using familiar programming languages instead of HCL. It generates Terraform JSON configuration, leveraging the full Terraform ecosystem while writing infrastructure code in TypeScript, Python, Java, C#, or Go.

CDKTF projects define **constructs** that represent infrastructure resources. The **synth** command compiles code to Terraform JSON in **cdktf.out/**, which can be inspected or applied manually. The **deploy** command handles synthesis and application in one step.

Provider bindings are generated from Terraform providers, providing type safety and IDE autocompletion. Complex logic, loops, and conditionals use native language features rather than HCL limitations.

# CAVEATS

Requires Terraform CLI installed separately. Provider binding generation can be slow for providers with many resources. State management follows Terraform patterns; understand Terraform state before using CDKTF. Breaking changes may occur between CDKTF versions.

# HISTORY

CDK for Terraform was announced by **HashiCorp** in partnership with **AWS** in **July 2020**, bringing the CDK (Cloud Development Kit) approach from AWS CDK to Terraform. It reached general availability in **2022**. The project aims to make infrastructure code more accessible to developers familiar with application programming languages.

# SEE ALSO

[terraform](/man/terraform)(1), [pulumi](/man/pulumi)(1), [aws-cdk](/man/aws-cdk)(1)
